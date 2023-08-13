
package Vista;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import org.edisoncor.gui.button.ButtonAero;


public class frmConvocatoria extends javax.swing.JFrame  implements Runnable{

    private Thread thr;
    
    
    
    public frmConvocatoria(String nombre) {
        initComponents();
        thr = new Thread(this,nombre);
        thr.start();
    }

    private frmConvocatoria() {
         
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnFactorial = new org.edisoncor.gui.button.ButtonAero();
        Num2 = new javax.swing.JToggleButton();
        Num1 = new javax.swing.JToggleButton();
        Num4 = new javax.swing.JToggleButton();
        Num3 = new javax.swing.JToggleButton();
        Num5 = new javax.swing.JToggleButton();
        Num6 = new javax.swing.JToggleButton();
        btnPlay = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnFactorial.setText("Factorial");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        Num2.setText("0");

        Num1.setText("0");

        Num4.setText("0");

        Num3.setText("0");

        Num5.setText("0");

        Num6.setText("0");

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(403, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num2)
                    .addComponent(Num3)
                    .addComponent(Num4)
                    .addComponent(Num5)
                    .addComponent(Num6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnPlay)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(Num1)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
    
                  random1();
                  random2();
                  random3();
                  random4();
                  random5();
                  random6();
      
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
                factorial();
    }//GEN-LAST:event_btnFactorialActionPerformed

        @Override
    public void run() {
       
               if (btnPlay.isSelected()) {
                  
                  random1();
                  random2();
                  random3();
                  random4();
                  random5();
                  random6();
                  
            } else {
                   if (btnFactorial.isSelected()) {
                      factorial();
                   } else {
                   }
                
            }
   
    
   
    }
   
        public void random1(){
    for(int i=1; i<=30;i++){
      int aleatorio =0;
      aleatorio= (int)(Math.random()*100);
      
      String Texto= String.valueOf(aleatorio);
      
      Num1.setText(Texto);
    
} 
}
public void random2(){
    for(int i=1; i<=30;i++){
      int aleatorio =0;
      aleatorio= (int)(Math.random()*100);
      
       String Texto= String.valueOf(aleatorio);
      Num2.setText(Texto);
    
} 
}
public void random3(){
    for(int i=1; i<=30;i++){
    int aleatorio =0;
      aleatorio= (int)(Math.random()*100);
      
      String Texto= String.valueOf(aleatorio);
       Num3.setText(Texto);
    
} 
}
public void random4(){
    for(int i=1; i<=30;i++){
      int aleatorio =0;
      aleatorio= (int)(Math.random()*100);
      
      String Texto= String.valueOf(aleatorio);
       Num4.setText(Texto);
    
} 
}
public void random5(){
    for(int i=1; i<=30;i++){
     int aleatorio =0;
      aleatorio= (int)(Math.random()*100);
     
      String Texto= String.valueOf(aleatorio);
     Num5.setText(Texto);
    
} 
}
public void random6(){
    for(int i=1; i<=30;i++){
      int aleatorio =0;
      aleatorio= (int)(Math.random()*100);
    
      String Texto= String.valueOf(aleatorio);
      Num6.setText(Texto);
    
} 
}
           private void factorial() {
        long facto= 1;
        
        for (int i = 1; i <= 10; i++) {
            facto = facto*i;
            txtArea.append(facto+"\n");
               
            try {
                  Thread.sleep(100);
                  
            } catch (InterruptedException e) {
                System.out.println("Error"+e);
            }
                  
        }
    }

    public JToggleButton getNum1() {
        return Num1;
    }

    public void setNum1(JToggleButton Num1) {
        this.Num1 = Num1;
    }

    public JToggleButton getNum2() {
        return Num2;
    }

    public void setNum2(JToggleButton Num2) {
        this.Num2 = Num2;
    }

    public JToggleButton getNum3() {
        return Num3;
    }

    public void setNum3(JToggleButton Num3) {
        this.Num3 = Num3;
    }

    public JToggleButton getNum4() {
        return Num4;
    }

    public void setNum4(JToggleButton Num4) {
        this.Num4 = Num4;
    }

    public JToggleButton getNum5() {
        return Num5;
    }

    public void setNum5(JToggleButton Num5) {
        this.Num5 = Num5;
    }

    public JToggleButton getNum6() {
        return Num6;
    }

    public void setNum6(JToggleButton Num6) {
        this.Num6 = Num6;
    }

    public ButtonAero getBtnFactorial() {
        return btnFactorial;
    }

    public JToggleButton getBtnPlay() {
        return btnPlay;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Num1;
    private javax.swing.JToggleButton Num2;
    private javax.swing.JToggleButton Num3;
    private javax.swing.JToggleButton Num4;
    private javax.swing.JToggleButton Num5;
    private javax.swing.JToggleButton Num6;
    private org.edisoncor.gui.button.ButtonAero btnFactorial;
    private javax.swing.JToggleButton btnPlay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables



 


}
