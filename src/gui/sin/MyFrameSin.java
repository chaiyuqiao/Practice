package gui.sin;

import gui.MyFrame;
import gui.sin.GraphicPanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrameSin extends MyFrame {
    GraphicPanel graphicPanel=new GraphicPanel();
    JSpinner grainField = new JSpinner(new SpinnerNumberModel(10, 3, 100, 5));
    JSpinner freqField = new JSpinner(new SpinnerNumberModel(20, 4, 50, 2));
    JSpinner rangeField = new JSpinner(new SpinnerNumberModel(30, 2, 200,1));
    JSpinner shiftField=new JSpinner(new SpinnerNumberModel(10,2,100,2));

    public MyFrameSin(String title) {
        super(title);
        add(graphicPanel);
        graphicPanel.add(new JLabel("力度"));
        graphicPanel.add(grainField);
        graphicPanel.add(new JLabel("幅度"));
        graphicPanel.add(rangeField);
        graphicPanel.add(new JLabel("频率"));
        graphicPanel.add(freqField);
        graphicPanel.add(new JLabel("位移"));
        graphicPanel.add(shiftField);

        //添加监听器
        ChangeListener listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateUI();
            }
        };
        rangeField.addChangeListener(listener);
        grainField.addChangeListener(listener);
        freqField.addChangeListener(listener);
        shiftField.addChangeListener(listener);
    }

    void updateUI() {
        graphicPanel.grain = (Integer) grainField.getValue();
        graphicPanel.range = (Integer) rangeField.getValue();
        graphicPanel.freq = (Integer) freqField.getValue();
        graphicPanel.shift = (Integer) shiftField.getValue();
        graphicPanel.repaint();
    }
}
