
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame{

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }

   
    public static void main(String[] args) {
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        
        ekran.setResizable(false);
        ekran.setFocusable(false);//tuşa basıldığında focus panelde
        
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        
        oyun.requestFocus();//odağı direkt panele verdik
        
        oyun.addKeyListener(oyun);//burada klavyeden işlemlerimiz alıyoruz
        
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);// klavye işlemi gerekli bir metod.
        
        ekran.add(oyun);
        ekran.setVisible(true);
        
        
    }
    
}
