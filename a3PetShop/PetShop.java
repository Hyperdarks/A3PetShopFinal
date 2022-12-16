package a3PetShop;

import javax.swing.JOptionPane;

public class PetShop extends javax.swing.JFrame {

    public int count = 0;
    Cadastro[] cadastro = new Cadastro[5];

    public static Cadastro[] Expandir(Cadastro[] velhoarray) {
        Cadastro[] novo = new Cadastro[velhoarray.length + 1];
        for (int i = 0; i < velhoarray.length; i++) {
            novo[i] = velhoarray[i];
        }
        return novo;
    }

    public void removerId(int id, Cadastro[] velhoarray) {
        Cadastro[] newArray = new Cadastro[velhoarray.length - 1];
        for (int i = 0; i < velhoarray.length - 1; i++) {
            velhoarray[id] = newArray[i];
        }

    }

    public PetShop() {
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

        ID1 = new javax.swing.JTextField();
        nome1 = new javax.swing.JLabel();
        nomeField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PetShop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        especie = new javax.swing.JLabel();
        banho = new javax.swing.JLabel();
        tosa = new javax.swing.JLabel();
        vacina = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        banhoOption = new javax.swing.JComboBox<>();
        tosaOption = new javax.swing.JComboBox<>();
        vacinaOption = new javax.swing.JComboBox<>();
        precoLabel = new javax.swing.JLabel();
        especieField = new javax.swing.JTextField();
        raca = new javax.swing.JLabel();
        racaField = new javax.swing.JTextField();
        cadastroButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTextArea();
        idField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Adicionar = new javax.swing.JButton();
        Deletar = new javax.swing.JButton();
        exibir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        nome1.setText("Nome");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PetShop.setBackground(new java.awt.Color(255, 255, 255));
        PetShop.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ID");

        nome.setText("Nome");

        especie.setText("Especie");

        banho.setText("Banho");

        tosa.setText("Tosa");

        vacina.setText("Vacina");

        preco.setText("Preço");

        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        banhoOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....", "Banho Simples (R$70)", "Banho com Hidratação (R$110)" }));
        banhoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banhoOptionActionPerformed(evt);
            }
        });

        tosaOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....", "Tosa Simples (R$80)", "Tosa com tesoura (145)" }));
        tosaOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tosaOptionActionPerformed(evt);
            }
        });

        vacinaOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Vacina antirrábica (R$80)", "Vacina contra gripe (R$130)" }));
        vacinaOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinaOptionActionPerformed(evt);
            }
        });

        precoLabel.setText("R$");

        raca.setText("Raça");

        racaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racaFieldActionPerformed(evt);
            }
        });

        cadastroButton.setText("Pedidos Cadastrados");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        tabela.setColumns(20);
        tabela.setRows(5);
        jScrollPane3.setViewportView(tabela);

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        Deletar.setText("Deletar");
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });

        exibir.setText("Exibir");
        exibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Adicionar))
                    .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Adicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exibir)
                .addGap(8, 8, 8)
                .addComponent(Deletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3PetShop/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        PetShop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(especie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(banho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(tosa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(vacina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(preco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(nomeField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(banhoOption, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(tosaOption, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(vacinaOption, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(precoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(especieField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(raca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(racaField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(cadastroButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(idField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(Limpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PetShop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PetShopLayout = new javax.swing.GroupLayout(PetShop);
        PetShop.setLayout(PetShopLayout);
        PetShopLayout.setHorizontalGroup(
            PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetShopLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PetShopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroButton)
                        .addGap(110, 110, 110))
                    .addGroup(PetShopLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PetShopLayout.createSequentialGroup()
                                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(especie))
                                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PetShopLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(Limpar))
                                    .addGroup(PetShopLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(especieField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                            .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                            .addComponent(racaField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(banhoOption, 0, 247, Short.MAX_VALUE)
                                            .addComponent(precoLabel)
                                            .addComponent(vacinaOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tosaOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(59, 59, 59))
                            .addGroup(PetShopLayout.createSequentialGroup()
                                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome)
                                    .addComponent(raca)
                                    .addComponent(banho)
                                    .addComponent(tosa)
                                    .addComponent(vacina)
                                    .addComponent(preco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        PetShopLayout.setVerticalGroup(
            PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetShopLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3)
                .addGap(18, 18, 18)
                .addComponent(cadastroButton)
                .addGap(139, 139, 139))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PetShopLayout.createSequentialGroup()
                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PetShopLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(especieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especie))
                        .addGap(18, 18, 18)
                        .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PetShopLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Limpar)))
                .addGap(18, 18, 18)
                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raca)
                    .addComponent(racaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banho)
                    .addComponent(banhoOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tosa)
                    .addComponent(tosaOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vacina)
                    .addComponent(vacinaOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preco)
                    .addComponent(precoLabel))
                .addGap(194, 245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PetShop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PetShop)
        );

        PetShop.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        idField.setText("");
        especieField.setText("");
        nomeField.setText("");
        precoLabel.setText("");
        racaField.setText("");
        banhoOption.setSelectedIndex(0);
        tosaOption.setSelectedIndex(0);
        vacinaOption.setSelectedIndex(0);
        tabela.setText("");
        idField.requestFocus();
    }//GEN-LAST:event_LimparActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed

        try {
            int id3 = Integer.parseInt(idField.getText());
            int banho2 = 0;
            String nome = nomeField.getText();
            cadastro[id3].setPreco(0);
            if (nome == "") {
                nome = cadastro[id3].getNome();
            } else {
                cadastro[id3].setNome(nome);
            }
            String especie = especieField.getText();
            if (especie == "") {
                especie = cadastro[id3].getEspecie();
            } else {
                cadastro[id3].setEspecie(especie);
            }
            String raca = racaField.getText();
            if (raca == cadastro[id3].getRaca() || raca == "") {
                raca = cadastro[id3].getRaca();
            } else {
                cadastro[id3].setRaca(raca);
            }
            banho2 = (int) banhoOption.getSelectedIndex();

            switch (banho2) {
                case 1:
                    cadastro[id3].setBanho(70);
                    break;
                case 2:
                    cadastro[id3].setBanho(110);
                    break;
                default:
                    cadastro[id3].setBanho(0);
                    break;
            }

            int tosa2 = 0;
            tosa2 = (int) tosaOption.getSelectedIndex();
            switch (tosa2) {
                case 1:
                    cadastro[id3].setTosa(80);
                    break;
                case 2:
                    cadastro[id3].setTosa(145);
                    break;
                default:
                    cadastro[id3].setTosa(0);
                    break;
            }
            int vacina2 = 0;
            vacina2 = (int) vacinaOption.getSelectedIndex();
            switch (vacina2) {
                case 1:
                    cadastro[id3].setVacina(80);
                    break;
                case 2:
                    cadastro[id3].setVacina(130);
                    break;
                default:
                    cadastro[id3].setVacina(0);
                    break;
            }
            Integer preco3 = cadastro[id3].getPreco();
            precoLabel.setText("R$" + preco3);
        } catch (NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Cadastro não encontrado no sistema", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_EditarActionPerformed

    private void exibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirActionPerformed
        try {
            int id3 = Integer.parseInt(idField.getText());
            especieField.setText(cadastro[id3].getEspecie());
            nomeField.setText(cadastro[id3].getNome());
            racaField.setText(cadastro[id3].getRaca());
            int banho3 = cadastro[id3].getBanho();
            System.out.println("");
            if (banho3 == 70) {
                banhoOption.setSelectedIndex(1);
            } else if (banho3 == 110) {
                banhoOption.setSelectedIndex(2);
            } else if (banho3 != 70 || banho3 != 110) {
                banhoOption.setSelectedIndex(0);
            }
            int tosa3 = cadastro[id3].getTosa();
            if (tosa3 == 80) {
                tosaOption.setSelectedIndex(1);
            } else if (tosa3 == 145) {
                tosaOption.setSelectedIndex(2);
            } else if (tosa3 != 80 || tosa3 != 145) {
                tosaOption.setSelectedIndex(0);
            }
            int vacina3 = cadastro[id3].getVacina();
            if (vacina3 == 80) {
                vacinaOption.setSelectedIndex(1);
            } else if (vacina3 == 130) {
                vacinaOption.setSelectedIndex(2);
            } else if (vacina3 != 80 || vacina3 != 130) {
                vacinaOption.setSelectedIndex(0);
            }
            Integer preco2 = cadastro[id3].getPreco();
            precoLabel.setText(preco2.toString());
        } catch (NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Cadastro não encontrado no sistema", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_exibirActionPerformed

    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
        try {
            int id3 = Integer.parseInt(idField.getText());
            removerId(id3, cadastro);
        } catch (NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Cadastro não encontrado no sistema", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_DeletarActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        count++;
        if (count == cadastro.length) {
            cadastro = Expandir(cadastro);
        }
        String especie2 = especieField.getText();
        String nome2 = nomeField.getText();
        String raca2 = racaField.getText();
        int banho2 = 0;
        banho2 = (int) banhoOption.getSelectedIndex();
        Integer preco = 0;
        switch (banho2) {
            case 1:
                banho2 = 70;
                preco = preco + 70;
                break;
            case 2:
                banho2 = 110;
                preco = preco + 110;
                break;
            default:
                banho2 = 0;
                preco = preco + 0;
                break;
        }
        int tosa2 = 0;
        tosa2 = (int) tosaOption.getSelectedIndex();
        switch (tosa2) {
            case 1:
                tosa2 = 80;
                preco = preco + 80;
                break;
            case 2:
                tosa2 = 145;
                preco = preco + 145;
                break;
            default:
                tosa2 = 0;
                preco = preco + 0;
                break;
        }
        int vacina2 = 0;
        vacina2 = (int) vacinaOption.getSelectedIndex();
        switch (vacina2) {
            case 1:
                vacina2 = 80;
                preco = preco + 80;
                break;
            case 2:
                vacina2 = 130;
                preco = preco + 130;
                break;
            default:
                vacina2 = 0;
                preco = preco + 0;
                break;
        }
        precoLabel.setText("R$" + preco);
        cadastro[count] = new Cadastro(nome2, especie2, raca2, banho2, tosa2, vacina2, preco);
        Integer count2 = count;
        cadastro[count].setId(count);

    }//GEN-LAST:event_AdicionarActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // TODO add your handling code here:
        String textoT = "";
        for (int i = 0; i < cadastro.length; i++) {
            if (cadastro[i] != null) {
                textoT = textoT + "\nId: " +cadastro[i].getId()+ "\nEspecie: " + cadastro[i].getEspecie()+ "\nNome: " + cadastro[i].getNome() + "\nRaca: " + cadastro[i].getRaca() + "\nBanho: R$"
                        + cadastro[i].getBanho() + "\nTosa: R$" + cadastro[i].getTosa() + "\nVacina: R$" +cadastro[i].getVacina()+  "\nPreco: R$" + cadastro[i].getPreco() + "\n";
            } else {

            }

        }
        tabela.setText(textoT);
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void racaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_racaFieldActionPerformed

    private void vacinaOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinaOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacinaOptionActionPerformed

    private void tosaOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tosaOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tosaOptionActionPerformed

    private void banhoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banhoOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banhoOptionActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton Deletar;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField ID1;
    private javax.swing.JButton Limpar;
    private javax.swing.JDesktopPane PetShop;
    private javax.swing.JLabel banho;
    private javax.swing.JComboBox<String> banhoOption;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JLabel especie;
    private javax.swing.JTextField especieField;
    private javax.swing.JButton exibir;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField nomeField2;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JLabel raca;
    private javax.swing.JTextField racaField;
    private javax.swing.JTextArea tabela;
    private javax.swing.JLabel tosa;
    private javax.swing.JComboBox<String> tosaOption;
    private javax.swing.JLabel vacina;
    private javax.swing.JComboBox<String> vacinaOption;
    // End of variables declaration//GEN-END:variables
}
