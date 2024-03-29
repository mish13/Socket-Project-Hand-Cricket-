
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        myInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opponentInput = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comment = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scoreField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scoreField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        scoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Score");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("0");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("6");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        myInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        myInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("You Gave");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Opponent Gave");

        opponentInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        opponentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opponentInputActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label5.setText("Commentary");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Target");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        comment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hand Cricket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(69, 69, 69)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scoreField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(myInput)
                                .addComponent(opponentInput, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton7))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(84, 84, 84)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comment, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(jTextField2))))
                            .addGap(3, 3, 3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scoreField)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opponentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comment, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int shot;
    
    
    private void scoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreFieldActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //String num1=jTextField1.getText();
        String num=jButton7.getText();
        //jTextField1.setText(num);
        shot=Integer.parseInt(num);
        //res+=shot;
        //jTextField2.setText(Integer.toString(res));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String num=jButton1.getText();
        //jTextField1.setText(num);
        shot=Integer.parseInt(num);
        //res+=shot;
        //jTextField2.setText(Integer.toString(res));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String num=jButton2.getText();
        //jTextField1.setText(num);
        shot=Integer.parseInt(num);
        //res+=shot;
        //jTextField2.setText(Integer.toString(res));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String num=jButton3.getText();
        //jTextField1.setText(num);
        shot=Integer.parseInt(num);
        //res+=shot;
        //jTextField2.setText(Integer.toString(res));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String num=jButton4.getText();
        //jTextField1.setText(num);
        shot=Integer.parseInt(num);
        //res+=shot;
        //jTextField2.setText(Integer.toString(res));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //String num1=jTextField1.getText();
        String num=jButton5.getText();
        //jTextField1.setText(num);
        shot=Integer.parseInt(num);
        //res+=shot;
        //jTextField2.setText(Integer.toString(res));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //String num1=jTextField1.getText();
        String num=jButton6.getText();
        //jTextField1.setText(num);
        shot=Integer.parseInt(num);
        //res+=shot;
        //jTextField2.setText(Integer.toString(res));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void myInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myInputActionPerformed

    private void opponentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opponentInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opponentInputActionPerformed

    private void commentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentActionPerformed
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
            
        public void mainmain(String[] args) throws IOException, ClassNotFoundException {
        int portNum = 4444;
        ServerSocket listener = new ServerSocket(portNum);
        //ServerSocket listener2 =new ServerSocket(portNum);
//        System.out.println("Server is now running at port: " + portNum);
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int innings=1;
        int target=0;
      
        int Score=0;
        scoreField.setText(Integer.toString(Score));
        while (true)
      {
            try {
                Socket clientSocket = listener.accept();
                //Socket clientSocket1= listener.accept();
	    //outputstream first #avi
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
               
             //  ObjectOutputStream out1 = new ObjectOutputStream(clientSocket1.getOutputStream());
               // ObjectInputStream in1 = new ObjectInputStream(clientSocket1.getInputStream());

                // Reading in Integer Object from input stream.
                int shot1 = (Integer) in.readObject();
                //int shot2=(Integer) in1.readObject();
                int shot2=Test.shot;
                System.out.println(shot1+" "+shot2);
                System.out.println(shot2);
                out.writeObject(Integer.toString(TestClient.shot));
                System.out.println("You gave "+Integer.toString(shot2));
                System.out.println("Your opponent gave "+Integer.toString(shot1));
                String response="" ;
	     if(shot1==shot2)
		 { 
			 System.out.println("Wicket");
                         String s="Wicket. ";
//                         comment.setText("Wicket");
                         innings++;
                         if(innings==3)
                         {
                             response="Wicket. ";
                             response+="Match Over!!!\n";
                             if(Score<target)
                             {
                                 response+="His score is "+Integer.toString(Score)+". You won the match by "+Integer.toString(target-1-Score)+" runs";
                                 s+="Match Over!!!"+" Your score is "+Integer.toString(Score)+". You lost by "+Integer.toString(target-1-Score)+" runs.";
                             }
//                             try{
//                                     out.close();
//                                     in.close();
//                                     listener.close();
//                                 }catch(IOException e)
//                                 {
//                                     e.printStackTrace();
//                                 }
                         }
                         else
                         {
                             response="You are Out ! Your Score is "+Integer.toString(Score)+"\n";
                             target=Score+1;
                             jTextField2.setText(Integer.toString(target));
                             s+="\nTarget is "+Integer.toString(target);
                             response+="Target is "+Integer.toString(target)+"\n";
                             
                         }
			 Score=0;
                         scoreField.setText(Integer.toString(Score));
			 comment.setText(s);
		 }
		 else  {
                         if(innings==1)
                         {
                             Score+=shot1;
                             myInput.setText(Integer.toString(shot2));
                             opponentInput.setText(Integer.toString(shot1));
                             System.out.println("You gave "+Integer.toString(shot2)+"\nOpponent gave "+Integer.toString(shot1));
                             System.out.println("Opponent's score is "+Integer.toString(Score)+"\n");
                             scoreField.setText(Integer.toString(Score));
                             response="You gave "+Integer.toString(shot1)+"\nOpponent gave "+Integer.toString(shot2)+"\nYour Score is "+Integer.toString(Score)+"\n";
                             comment.setText(Integer.toString(shot1)+" is scored!");
                         }
                         else if(innings==2)
                         {
                             Score+=shot2;
                             if(Score>=target)
                             {
                                 System.out.println("You gave "+Integer.toString(shot2)+"\nOpponent gave "+Integer.toString(shot1)+"\nYour Score is "+Integer.toString(Score)+"\n");
                                 System.out.println("You won the match\n");
                                 myInput.setText(Integer.toString(shot2));
                                 opponentInput.setText(Integer.toString(shot1));
                                 comment.setText("Match Over!!! You won the match");
                                 response="Match Over!!!";
                                 response+="\nYou gave "+Integer.toString(shot1)+"Your opponent gave "+Integer.toString(shot2)+"Opponent's score is "+Integer.toString(Score)+"\nYou lost the match\n";
//                                 try{
//                                     out.close();
//                                     in.close();
//                                     listener.close();
//                                 }catch(IOException e)
//                                 {
//                                     e.printStackTrace();
//                                 }
                             }
                             else
                             {
                                 System.out.println("You gave "+Integer.toString(shot2)+"\nOpponent gave "+Integer.toString(shot1)+"\nYour Score is "+Integer.toString(Score)+"\n");
                                 myInput.setText(Integer.toString(shot2));
                                 opponentInput.setText(Integer.toString(shot1));
                                 response="You gave "+Integer.toString(shot1)+"\nOpponent gave "+Integer.toString(shot2);
                                 response+="\nOpponent's score is "+Integer.toString(Score)+"\n";
                                 comment.setText(Integer.toString(shot2)+" is scored!");
                             }
                         }
		 };
                //Sending response back to client
              
                out.writeObject(response);
             in.close();
	 out.close();
	  //clientSocket.close();
     
            } finally {
                                     
               
            }
            
             
                
        }
    }
        });
        
        
    }

    static javax.swing.JTextField comment;
    static javax.swing.JButton jButton1;
    static javax.swing.JButton jButton2;
    static javax.swing.JButton jButton3;
    static javax.swing.JButton jButton4;
    static javax.swing.JButton jButton5;
    static javax.swing.JButton jButton6;
    static javax.swing.JButton jButton7;
    static javax.swing.JLabel jLabel1;
    static javax.swing.JLabel jLabel2;
    static javax.swing.JLabel jLabel3;
    static javax.swing.JLabel jLabel4;
    static javax.swing.JLabel jLabel5;
    static javax.swing.JLabel jLabel6;
    static javax.swing.JLabel jLabel7;
    static javax.swing.JTextField jTextField2;
    static javax.swing.JLabel label5;
    static javax.swing.JTextField myInput;
    static javax.swing.JTextField opponentInput;
    static javax.swing.JTextField scoreField;
    
}
