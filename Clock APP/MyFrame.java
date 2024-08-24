
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;


    JLabel timeLable;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("my clock");
        this.setLayout(new FlowLayout());
        this.setSize(450, 260);
        this.setResizable(false);
        this.setVisible(true);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");



        timeLable =new JLabel();
        timeLable.setFont(new Font("verdana",Font.PLAIN,65));
        timeLable.setForeground(Color.DARK_GRAY);
        timeLable.setBackground(Color.pink);
        timeLable.setOpaque(true);

        dayLabel =new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,50));
        dayLabel.setBackground(Color.PINK);
        dayLabel.setOpaque(true);

        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,45));
        dateLabel.setBackground(Color.MAGENTA);
        dateLabel.setOpaque(true);

        

        this.add(timeLable);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();


    }

    public void setTime(){
        while(true){
        time =timeFormat.format(Calendar.getInstance().getTime());
        timeLable.setText(time);

        day =dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);

        date =dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
    }
}
}
