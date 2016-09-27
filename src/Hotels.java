public class Hotels extends javax.swing.JFrame {

    public Hotels() {
        initComponents();
    }
                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Hotels and Resturants");

        jLabel5.setText("Feature");

        jLabel6.setText("Contact");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel Apollo", "The Cindrella Hotel", "Sinclairs Siliguri", "Hotel Heritage", "Saluja Residency", "Hotel Central Plaza", "Royal Sarovar Portico"}));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Browse");

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Rating");

        jLabel7.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton2)
                        .addGap(68, 68, 68)
                        .addComponent(jButton3)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TouristGuide tg = new TouristGuide();
        tg.setVisible(true);
        this.setVisible(false);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String hotel_name = jComboBox1.getSelectedItem().toString();
        
        if (hotel_name == "Hotel Apollo"){
    		jTextField1.setText("Hotel Apollo");
    		jTextField2.setText("3.7");
    		jTextField3.setText("Featuring free Wi-Fi, the simple rooms also have cable TV.\n Upgraded rooms and suites add air-conditioning and minifridges.\n Room service is also available.");
    		jTextField4.setText("NH 31, Mallaguri, P. O. Pradhannagar., Siliguri, Darjeeling, West Bengal 734003");
    		jTextField5.setText("0353 251 0317");
        }
        if (hotel_name == "The Cindrella Hotel"){
    		jTextField1.setText("The Cindrella Hotel");
    		jTextField2.setText("4.0");
    		jTextField3.setText("Featuring wood floors and colourful artwork, the understated rooms come with flat-screen TVs.");
    		jTextField4.setText("3rd Mile, Sevok Road, Siliguri, West Bengal 734008");
    		jTextField5.setText("0353 254 4130");
        }
        if (hotel_name == "Hotel Heritage"){
    		jTextField1.setText("Hotel Heritage");
    		jTextField2.setText("3.2");
    		jTextField3.setText("Breakfast and parking are complimentary. There's a vegetarian restaurant and a casual, wood-panelled bar, plus a rooftop bistro and a nightclub for private events.");
    		jTextField4.setText("Hill Cart Road, Pradhan Nagar, Janta Nagar, Siliguri, West Bengal 734 403");
    		jTextField5.setText("0353 251 0317");
        }
        if (hotel_name == "Sinclairs Siliguri"){
    		jTextField1.setText("Sinclairs Siliguri");
    		jTextField2.setText("4.0");
    		jTextField3.setText("An outdoor pool and a kids' pool with a water slide, as well as a playground, a fitness room and a game room.");
    		jTextField4.setText("NH 31, Pradhan Nagar, Siliguri, WB 734003");
    		jTextField5.setText("0353 251 2440");
        }
        if (hotel_name == "Saluja Residency"){
    		jTextField1.setText("Saluja Residency");
    		jTextField2.setText("4.1");
    		jTextField3.setText("Free Wi-Fi, the simple rooms also have cable TV.");
    		jTextField4.setText(" Opp. Hukumchand & Sons, Hill Cart Road, Siliguri, West Bengal 734001");
    		jTextField5.setText("0353 243 1683");
        }
        if (hotel_name == "Hotel Central Plaza"){
    		jTextField1.setText("Hotel Central Plaza");
    		jTextField2.setText("4.1");
    		jTextField3.setText("Complimentary breakfast, Free Wifi, LED tv");
    		jTextField4.setText(" H / NO-765, Hill Cart Rd, Pradhan Nagar, Siliguri, West Bengal 734003");
    		jTextField5.setText("0353 251 6119");
        }
        if (hotel_name == "Royal Sarovar Portico"){
    		jTextField1.setText("Royal Sarovar Portico");
    		jTextField2.setText("4.0");
    		jTextField3.setText("Complimentary breakfast, Parking, Free Wifi");
    		jTextField4.setText("3rd Mile,, Sevoke Rd, Siliguri, West Bengal 734008");
    		jTextField5.setText("0353 221 6999");
        }
    } 
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotels().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
}
