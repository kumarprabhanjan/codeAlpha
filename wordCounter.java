package CodeAlph;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class wordCounter  extends JFrame{


        private JTextArea textArea;
        private JLabel wordCountLabel;
        private JButton countButton;

        public wordCounter() {
            setTitle("Count Word Counter");
            setSize(600, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            textArea = new JTextArea();
            wordCountLabel = new JLabel("Word count: write your paragraph");
            countButton = new JButton("Count total number of  Words");

            countButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    countWords();
                }
            });

            add(textArea, BorderLayout.CENTER);
            add(countButton, BorderLayout.SOUTH);
            add(wordCountLabel, BorderLayout.NORTH);
        }

        private void countWords() {
            String text = textArea.getText();
            String[] words = text.split("\\s+");
            int wordCount = words.length;
            wordCountLabel.setText("Word count: " + wordCount);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    wordCounter app = new wordCounter();
                    app.setVisible(true);
                }
            });
        }
    }

