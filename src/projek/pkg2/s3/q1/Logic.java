/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.pkg2.s3.q1;


import static projek.pkg2.s3.q1.Loading.loadBar;
import static projek.pkg2.s3.q1.Loading.loadText;

/**
 *
 * @author Muhammad Ammar Fadhlan, umar abdullah Azzam
 */
public class Logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Loading load = new Loading();
        load.setVisible (true);
        try {
                for(int i = 0; i <= 100;i++){
            Thread.sleep(50);
            loadText.setText(Integer.toString(i)+"%");
            loadBar.setValue(i);
            
            if (i==100){
                load.setVisible(false);
                new Page().setVisible(true);
            }
        }

            }catch (Exception e){
                
            }
    
    }
    
    
    
}
