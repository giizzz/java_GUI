import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI1 {
    public static void main(String[] args) {
        JFrame cerceve =new JFrame("BU ILK FRAMEDİR");

        Font f1=new Font("CAMBRİA",Font.PLAIN,20);//türkçe karakteri olmayabilir
        Color c1=new Color(210,120,130);//kendimiz rgb ile renk oluşturabiliriz
        cerceve.setBounds(400,150,600,500);
        cerceve.setResizable(false);//çerçevenin boyutunu korumak için yapılır
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//3 de yazılabilir yerine
        ImageIcon i1=new ImageIcon("ikon.png");
        cerceve.setIconImage(i1.getImage());
        JButton buton1=new JButton("TIKLAYINIZ");
        buton1.setBounds(100,100,100,50);
        cerceve.getContentPane().add(buton1);//cerceve.add(buton1); ile aynı işlemi yapar
        cerceve.getContentPane().setBackground(Color.red);//new Color(r:,g:,b:)değerleri verilerek yeni bir renk yapılabilir 255 e kadar

        JTextArea txtarea=new JTextArea();
        txtarea.setBounds(200,200,200,200);
        txtarea.setBackground(Color.LIGHT_GRAY);//arka plan rengi
        txtarea.setFont(f1);//iki türlü kullanılır yukarıda bir obje oluşturulursa başka yerlerde kullanılabilir ama burda içine de new font diyerek yazabiliriz tek burda kullanılacaksa
        txtarea.setLineWrap(true);//bunu yazmazsan alt satıra enter tuşuna basmadan inmez
        cerceve.getContentPane().add(txtarea);
        txtarea.setForeground(c1);//yazının rengini oluşturabiliriz



        buton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int w= buton1.getWidth();//genişliğini döndürür
                int h=buton1.getHeight();
                w+=10;
                h+=10;
                buton1.setSize(w,h);
            }
        });

        cerceve.setLayout(null);
        cerceve.setVisible(true);
    }
}// textfield tek satır için textarea birden fazla satır için kullanılır
