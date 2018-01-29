import sun.security.krb5.internal.Krb5;

import javax.swing.*;
import javax.swing.text.Keymap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class display extends JFrame{

    JButton topla,cikar,carp,bol,b;
    JTextField bsayi, isayi;
    JLabel label1, sonuc;


    public display(int width,int height){;

        //Frame
        this.setTitle("İki sayıyı toplama");
        this.setSize(width,height);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Buttons
        topla = new JButton("+");
        this.add(topla);
        topla.setBounds(230,20,120,33);
        topla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                int bs = Integer.parseInt(bsayi.getText());
                int is = Integer.parseInt(isayi.getText());
                sonuc.setText("Sonuç: " + (bs+is));
            }
        });

        cikar = new JButton("-");
        this.add(cikar);
        cikar.setBounds(350,20,120,33);
        cikar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int bs = Integer.parseInt(bsayi.getText());
                int is = Integer.parseInt(isayi.getText());
                sonuc.setText("Sonuç: " + (bs-is));
            }
        });

        carp = new JButton("*");
        this.add(carp);
        carp.setBounds(230,53,120,33);
        carp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int bs = Integer.parseInt(bsayi.getText());
                int is = Integer.parseInt(isayi.getText());
                sonuc.setText("Sonuç: " + (bs*is));
            }
        });

        bol = new JButton("/");
        this.add(bol);
        bol.setBounds(350,53,120,33);
        bol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double bs = Double.parseDouble(bsayi.getText());
                double is = Double.parseDouble(isayi.getText());
                sonuc.setText("Sonuç: " + (bs/is));
            }
        });


        //texts
        label1 = new JLabel("Birinci sayi:");
        this.add(label1);
        label1.setBounds(20,20,100,20);

        bsayi = new JTextField();
        this.add(bsayi);
        bsayi.setBounds(110,20,100,25);

        label1 = new JLabel("İkinci sayi:");
        this.add(label1);
        label1.setBounds(20,65,100,20);

        isayi = new JTextField();
        this.add(isayi);
        isayi.setBounds(110,65,100,25);

        sonuc = new JLabel("Sonuç:");
        this.add(sonuc);
        sonuc.setBounds(20,130,200,20);
    }
}
