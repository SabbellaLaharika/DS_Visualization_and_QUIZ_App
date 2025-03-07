package linearDataStructures.queue.doubleEndedQueues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class DequeueAtRear extends CommonCodes implements ActionListener {
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public DequeueAtRear(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Dequeue at Rear Operation", 300, 10, 500, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear/1.png",
                        "Images/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear/2.png",
                        "Images/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear/3.png",
                        "Images/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear/4.png",
                        "Images/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear/5.png",
                        "Images/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear/6.png"};
        cancelTask();
        label = imageSlider(path, 150,60, 650,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear/Algorithm.png", 150, 250, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("DQDequeueRear");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new DoubleEndedQueues("Data Structures/Linear Data Structures/Queues/Double Ended Queues");
        }  
        dispose();
    }
}
