/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tac;


import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author acer
 */
public class tic extends javax.swing.JFrame {

    private static int xo = 0, compt = 0;
    private ImageIcon x = new ImageIcon(getClass().getResource("x.png"));
    private ImageIcon o = new ImageIcon(getClass().getResource("o.png"));
   

    public tic() {
        initComponents();

        this.setTitle("Tic Tac Toe");
        labelXO.setIcon(x);

        Third.hide();
        Second.hide();
        First.show();
    
    }

   
  
//------Takes X and O one after another----------//
    
    private void setIconXO(JButton bn) {

        if (xo == 0) {
            bn.setIcon(x);
            xo = 1;
            compt++;
            labelXO.setIcon(o);

            player.setText(player2.getText());
        } else {
            bn.setIcon(o);
            xo = 0;
            compt++;
            labelXO.setIcon(x);

            player.setText(player1.getText());
        }

    }

 //------Refreshes the game table------//
   
    private void refresh() {
        xo = 0;
        compt = 0;
        cas1.setIcon(null);

        cas2.setIcon(null);

        cas3.setIcon(null);
  
        cas4.setIcon(null);

        cas5.setIcon(null);

        cas6.setIcon(null);

        cas7.setIcon(null);
    
        cas8.setIcon(null);

        cas9.setIcon(null);

        labelXO.setIcon(x);
        Third.show();
        Second.hide();
        player.setText(player1.getText());
    }

    
   //---------Calculates the winner--------//
    
    private void CasClick(JButton bn, JButton a1, JButton a2, JButton b1, JButton b2, JButton c1, JButton c2) {

        if (bn.getIcon().equals(a1.getIcon()) && bn.getIcon().equals(a2.getIcon())
                || bn.getIcon().equals(b1.getIcon()) && bn.getIcon().equals(b2.getIcon())
                || bn.getIcon().equals(c1.getIcon()) && bn.getIcon().equals(c2.getIcon())) {

            if (bn.getIcon().equals(x)) {
                draw.setText(player1.getText() + " Wins");
            } else {
                draw.setText(player2.getText() + " Wins");
            }
            refresh();
        }
        Draw();
    }

 //----Draw functon----//
    
    private void Draw() {
        if (compt == 9) {
            refresh();
            draw.setText("Draw");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Second = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cas1 = new javax.swing.JButton();
        cas2 = new javax.swing.JButton();
        cas4 = new javax.swing.JButton();
        cas5 = new javax.swing.JButton();
        cas9 = new javax.swing.JButton();
        cas3 = new javax.swing.JButton();
        cas8 = new javax.swing.JButton();
        cas6 = new javax.swing.JButton();
        cas7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelXO = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        restart22 = new javax.swing.JButton();
        exit22 = new javax.swing.JButton();
        reply22 = new javax.swing.JButton();
        Third = new javax.swing.JPanel();
        draw = new javax.swing.JTextField();
        reply = new javax.swing.JButton();
        Restart3 = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        First = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        player1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        player2 = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tic tac toe");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Second.setBackground(new java.awt.Color(0, 204, 102));
        Second.setPreferredSize(new java.awt.Dimension(400, 500));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        cas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas1ActionPerformed(evt);
            }
        });

        cas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas2ActionPerformed(evt);
            }
        });

        cas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas4ActionPerformed(evt);
            }
        });

        cas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas5ActionPerformed(evt);
            }
        });

        cas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas9ActionPerformed(evt);
            }
        });

        cas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas3ActionPerformed(evt);
            }
        });

        cas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas8ActionPerformed(evt);
            }
        });

        cas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas6ActionPerformed(evt);
            }
        });

        cas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cas2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cas3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cas4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cas5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cas6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cas7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cas8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cas9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cas2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cas3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cas4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cas5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cas6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cas7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cas8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cas9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Choice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 3, 18), new java.awt.Color(204, 0, 51))); // NOI18N

        player.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        player.setForeground(new java.awt.Color(153, 255, 0));
        player.setText("First person");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelXO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(labelXO, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player)
                .addContainerGap())
        );

        restart22.setText("Restart");
        restart22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart22ActionPerformed(evt);
            }
        });

        exit22.setText("Exit");
        exit22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit22ActionPerformed(evt);
            }
        });

        reply22.setText("Replay");
        reply22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reply22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(reply22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restart22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reply22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restart22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout SecondLayout = new javax.swing.GroupLayout(Second);
        Second.setLayout(SecondLayout);
        SecondLayout.setHorizontalGroup(
            SecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(SecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SecondLayout.setVerticalGroup(
            SecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(Second, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Third.setBackground(new java.awt.Color(255, 255, 0));
        Third.setPreferredSize(new java.awt.Dimension(400, 500));

        draw.setFont(new java.awt.Font("Tekton Pro Cond", 3, 36)); // NOI18N
        draw.setForeground(new java.awt.Color(0, 102, 102));
        draw.setEnabled(false);

        reply.setText("Replay");
        reply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replyActionPerformed(evt);
            }
        });

        Restart3.setText("Restart");
        Restart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Restart3ActionPerformed(evt);
            }
        });

        exit3.setText("Exit");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tac/logo.png"))); // NOI18N

        javax.swing.GroupLayout ThirdLayout = new javax.swing.GroupLayout(Third);
        Third.setLayout(ThirdLayout);
        ThirdLayout.setHorizontalGroup(
            ThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThirdLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(ThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThirdLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(ThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(draw)
                            .addComponent(reply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Restart3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        ThirdLayout.setVerticalGroup(
            ThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThirdLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(reply, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Restart3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(Third, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        First.setBackground(new java.awt.Color(204, 0, 51));
        First.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tac/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Player 1 :");

        player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ActionPerformed(evt);
            }
        });
        player1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                player1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Player 2 :");

        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });
        player2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                player2KeyReleased(evt);
            }
        });

        start.setText("Start");
        start.setEnabled(false);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FirstLayout = new javax.swing.GroupLayout(First);
        First.setLayout(FirstLayout);
        FirstLayout.setHorizontalGroup(
            FirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(FirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FirstLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(FirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(player2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(player1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(start, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        FirstLayout.setVerticalGroup(
            FirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(First, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas1ActionPerformed
        setIconXO(cas1);
        CasClick(cas1, cas2, cas3, cas5, cas9, cas4, cas7);
    }//GEN-LAST:event_cas1ActionPerformed

    private void cas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas2ActionPerformed
        setIconXO(cas2);
        CasClick(cas2, cas1, cas3, cas3, cas1, cas5, cas8);
    }//GEN-LAST:event_cas2ActionPerformed

    private void cas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas3ActionPerformed
        setIconXO(cas3);
        CasClick(cas3, cas6, cas9, cas5, cas7, cas2, cas1);
    }//GEN-LAST:event_cas3ActionPerformed

    private void cas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas4ActionPerformed
        setIconXO(cas4);
        CasClick(cas4, cas1, cas7, cas7, cas1, cas5, cas6);
    }//GEN-LAST:event_cas4ActionPerformed

    private void cas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas5ActionPerformed
        setIconXO(cas5);
        CasClick(cas5, cas2, cas6, cas1, cas9, cas4, cas6);
        CasClick(cas5, cas2, cas6, cas1, cas9, cas7, cas3);
    }//GEN-LAST:event_cas5ActionPerformed

    private void cas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas6ActionPerformed
        setIconXO(cas6);
        CasClick(cas6, cas3, cas9, cas4, cas5, cas9, cas3);
    }//GEN-LAST:event_cas6ActionPerformed

    private void cas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas7ActionPerformed
        setIconXO(cas7);
        CasClick(cas7, cas4, cas1, cas5, cas3, cas8, cas9);
    }//GEN-LAST:event_cas7ActionPerformed

    private void cas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas8ActionPerformed
        setIconXO(cas8);
        CasClick(cas8, cas7, cas9, cas9, cas7, cas5, cas2);
    }//GEN-LAST:event_cas8ActionPerformed

    private void cas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas9ActionPerformed
        setIconXO(cas9);
        CasClick(cas9, cas8, cas7, cas5, cas1, cas3, cas6);
    }//GEN-LAST:event_cas9ActionPerformed

    private void replyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replyActionPerformed
        Third.hide();
        Second.show();
    }//GEN-LAST:event_replyActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        First.hide();
        Second.show();
        player.setText(player1.getText());
    }//GEN-LAST:event_startActionPerformed

    private void player1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_player1KeyReleased
        if (player1.getText().equals("") || player2.getText().equals("")) {
            start.setEnabled(false);
        } else {
            start.setEnabled(true);
        }
    }//GEN-LAST:event_player1KeyReleased

    private void player2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_player2KeyReleased
        if (player1.getText().equals("") || player2.getText().equals("")) {
            start.setEnabled(false);
        } else {
            start.setEnabled(true);
        }
    }//GEN-LAST:event_player2KeyReleased

    private void Restart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Restart3ActionPerformed
        First.show();
        Third.hide();
        player1.setText("");
        player2.setText("");
        start.setEnabled(false);
    }//GEN-LAST:event_Restart3ActionPerformed

    private void reply22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reply22ActionPerformed
        refresh();
        Second.show();
        Third.hide();
    }//GEN-LAST:event_reply22ActionPerformed

    private void restart22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart22ActionPerformed
        refresh();
        Third.hide();
        First.show();
        Second.hide();

        player1.setText("");
        player2.setText("");
        start.setEnabled(false);
    }//GEN-LAST:event_restart22ActionPerformed

    private void exit22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit22ActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit22ActionPerformed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit3ActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit1ActionPerformed

    private void player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player1ActionPerformed

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2ActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
   
    }//GEN-LAST:event_aboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel First;
    private javax.swing.JButton Restart3;
    private javax.swing.JPanel Second;
    private javax.swing.JPanel Third;
    private javax.swing.JButton about;
    private javax.swing.JButton cas1;
    private javax.swing.JButton cas2;
    private javax.swing.JButton cas3;
    private javax.swing.JButton cas4;
    private javax.swing.JButton cas5;
    private javax.swing.JButton cas6;
    private javax.swing.JButton cas7;
    private javax.swing.JButton cas8;
    private javax.swing.JButton cas9;
    private javax.swing.JTextField draw;
    private javax.swing.JButton exit1;
    private javax.swing.JButton exit22;
    private javax.swing.JButton exit3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelXO;
    private javax.swing.JLabel player;
    private javax.swing.JTextField player1;
    private javax.swing.JTextField player2;
    private javax.swing.JButton reply;
    private javax.swing.JButton reply22;
    private javax.swing.JButton restart22;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
