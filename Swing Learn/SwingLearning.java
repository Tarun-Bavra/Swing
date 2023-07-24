import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingLearning extends JFrame implements ActionListener{
         JButton button;
    Boolean change=false;
    SwingLearning()
    {
        button = new JButton("Button");
        button.setSize(100,50);
        setLayout(null);
        button.setLocation(250,175);

        add(button);

        button.addActionListener(this);

        setTitle("This is my first Window");
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        getContentPane().setBackground(Color.red);

    }


    public static void main(String[] args)
    {
        SwingLearning obj = new SwingLearning();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        String e = actionEvent.getActionCommand();
        if(e.equals("Button") && !change)
        {
            getContentPane().setBackground(Color.black);
            change=true;
        }
        else
        {
            getContentPane().setBackground(Color.red);
            change=false;
        }
    }
  



    }






