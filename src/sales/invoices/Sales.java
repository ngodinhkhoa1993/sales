
package sales.invoices;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Sales extends javax.swing.JFrame {

    
    DefaultTableModel model;
    private HashMap hashMap;  
     private JTable tbl;
     
    public Sales() {
        initComponents();    
        setLocation(350, 100);
        setVisible(true);
        model =(DefaultTableModel) tblhd.getModel();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abcd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbonam = new javax.swing.JComboBox<>();
        cbothang = new javax.swing.JComboBox<>();
        cbongay = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txttkh = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtmhd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhd = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtgg = new javax.swing.JTextField();
        txttt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txttbc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnihd = new javax.swing.JButton();
        btnlm = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        abcd.setText("CÔNG TY CỔ PHẦN TƯ VẤN QUẢN TRỊ HKT");

        jLabel2.setText("A1-901, Tầng 9, Nhà A1, Tòa nhà OCT1, KĐT Resco");

        jLabel3.setText("Tel: 043 7925 191");

        jLabel4.setText("Fax: 043 7925 191");

        jLabel5.setText("Website: www.hktconsultant.vn");

        jLabel6.setText("Email: hktconsultant@yahoo.com.vn");

        jLabel7.setText("MST: 0105149688");

        jLabel8.setText("HÓA ĐƠN BÁN HÀNG");

        jLabel9.setText("Ngày");

        jLabel10.setText("tháng");

        jLabel11.setText("năm");

        cbonam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        cbonam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonamActionPerformed(evt);
            }
        });

        cbothang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbothang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbothangActionPerformed(evt);
            }
        });

        cbongay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbongay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbongayActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Tên khách hàng :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Địa chỉ                  :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Số điện thoại      :");

        txttkh.setText(" ");

        txtdc.setText(" ");

        txtsdt.setText(" ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Mã hóa đơn:");

        txtmhd.setText(" ");

        tblhd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblhd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên sản phẩm", "Đơn vị tiền", "Số lượng", "Đơn giá", "CK(%)", "Tiền sau thuế(VNĐ)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblhd.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tblhdAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(tblhd);

        jLabel16.setText("Tiền trước thuế = SL * Đơn giá * (1-CK%) Tiền sau thuế = Tiền trước thuế * (1 + Thuế%)");

        jLabel17.setText("Tổng cộng:");

        txttc.setText(" ");
        txttc.setEnabled(false);

        jLabel18.setText("VND");

        jLabel19.setText("VND");

        jLabel20.setText("VND");

        txtgg.setText(" ");
        txtgg.setEnabled(false);

        txttt.setText(" ");
        txttt.setEnabled(false);

        jLabel21.setText("Chiết khấu:");

        jLabel22.setText("0%");

        jLabel23.setText("Giảm giá:");

        jLabel24.setText("Tổng tiền thanh toán:");

        jLabel25.setText("Số tiền bằng chữ:");

        txttbc.setText(" ");

        jLabel26.setText("Giá trên chưa bao gồm thuế VAT 10%");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("KHÁCH HÀNG");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("BÊN BÁN");

        jLabel29.setText("(Ký, ghi rõ họ tên)");

        jLabel30.setText("(Ký, ghi rõ họ tên)");

        btnihd.setText("In hóa đơn");
        btnihd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnihdActionPerformed(evt);
            }
        });

        btnlm.setText("Làm mới");
        btnlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlmActionPerformed(evt);
            }
        });

        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abcd)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel9)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbongay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttkh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmhd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel22)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel23))
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtgg, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel18))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttbc, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnihd)
                            .addComponent(jLabel26))
                        .addGap(154, 154, 154)
                        .addComponent(btnlm)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(btnthoat))
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(abcd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbongay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtmhd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txttt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txttbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnihd)
                    .addComponent(btnlm)
                    .addComponent(btnthoat))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbonamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonamActionPerformed
        
    }//GEN-LAST:event_cbonamActionPerformed

    private void cbothangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbothangActionPerformed
        
    }//GEN-LAST:event_cbothangActionPerformed

    private void btnlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlmActionPerformed
int click = JOptionPane.showConfirmDialog
        (null,"Bạn có chắc muốn làm mới ?","Cảnh báo",JOptionPane.YES_NO_OPTION);

        if ( click == JOptionPane.YES_OPTION){
            txttkh.setText("");
            txtdc.setText("");
            txtsdt.setText("");
            txtmhd.setText("");
            txttbc.setText("");
        
        }

    }//GEN-LAST:event_btnlmActionPerformed

    private void btnihdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnihdActionPerformed
                String str[] = new String[15];
                hashMap = new HashMap();
        DefaultTableModel tableModel = new DefaultTableModel(str, 1);
        tbl = new JTable(tableModel);
        String[] values ;
        values = new String[15];
//        Scanner nhap = new Scanner(System.in);

            System.out.print(txttkh.getText());
            values[0] = txttkh.getText();
            Object put0=hashMap.put("tkh",values[0]);
          
            System.out.print(txtdc.getText());
            values[1] = txtdc.getText();
            Object put1=hashMap.put("dc",values[1]);
            
            System.out.print(txtsdt.getText());
            values[2] = txtsdt.getText();
            Object put2=hashMap.put("sdt",values[2]);
                     
            System.out.print(txtmhd.getText());
            values[3] = txtmhd.getText();
            Object put3 = hashMap.put("mhd", values[3]);
            
            System.out.print(txttbc.getText());
            values[4] = txttbc.getText();
            Object put4 = hashMap.put("tbc", values[4]); 
             
            //ngay -thang-nam
           int [] values1;
           values1= new int[10];     
           
            System.out.println(cbongay.getSelectedItem());
            values1[0]=Integer.parseInt(cbongay.getSelectedItem().toString()) ;
            Object put5 = hashMap.put("ngay", values1[0]);
           
           System.out.println(cbothang.getSelectedItem());
           values1[1] = Integer.parseInt(cbothang.getSelectedItem().toString());
           Object put6 = hashMap.put("thang",values1[1]);
           
           System.out.println(cbonam.getSelectedItem());;
           values1[2] = Integer.parseInt(cbonam.getSelectedItem().toString());
           Object put7 = hashMap.put("nam",values1[2]);          
           
           
        
//           Table
           System.out.println(model.getValueAt(tblhd.getSelectedRow(),0));
           values1[3] =Integer.parseInt( model.getValueAt(tblhd.getSelectedRow(),0).toString());
           Object put8 = hashMap.put("stt",values1[3]);
           
           System.out.println(model.getValueAt(tblhd.getSelectedRow(),1));
           values[5]=(String)model.getValueAt(tblhd.getSelectedRow(),1).toString();
           Object put9 = hashMap.put("tsp",values[5]);
           
           System.out.println(model.getValueAt(tblhd.getSelectedRow(),2));
           values[6] = (String)model.getValueAt(tblhd.getSelectedRow(),2).toString(); 
           Object put10 = hashMap.put("dvt",values[6]);
           
           long [] values2;
           values2 = new long[10];
           
           System.out.println(model.getValueAt(tblhd.getSelectedRow(),3));
           values2[0]= Long.parseLong( model.getValueAt(tblhd.getSelectedRow(),3).toString());
           Object put11 = hashMap.put("sl",values2[0]);
           
           System.out.println(model.getValueAt(tblhd.getSelectedRow(),4));
           values2[1] = Long.parseLong(model.getValueAt(tblhd.getSelectedRow(),4).toString());
           Object put12 = hashMap.put("dg",values2[1]);
           
           System.out.println(model.getValueAt(tblhd.getSelectedRow(),5));
           values2[2] = Long.parseLong(model.getValueAt(tblhd.getSelectedRow(),5).toString());
           Object put13 = hashMap.put("ck",values2[2]);
           
           long tongc = values2[0]*values2[1];
           values2[3] = (tongc/100)*values2[2];
           values2[4] = tongc-values2[3];
           
           Object put14 = hashMap.put("tc", tongc);
           Object put15 = hashMap.put("gg", values2[3]);
           Object put16 = hashMap.put("tt",values2[4]);
           Object put17 = hashMap.put("tst", values2[4]);
           
                                           
            print();
    }//GEN-LAST:event_btnihdActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
System.exit(0);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void cbongayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbongayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbongayActionPerformed

    private void tblhdAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblhdAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tblhdAncestorRemoved

   
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }
  public void print() {
         System.err.println(" HKT Consultant ");
        //  reportExport("/home/longnt/testA4.jasper", hashMap,tbl.getModel(),true);
        reportExport("Sales invoices.jasper", hashMap, tbl.getModel(), false);        
    }
 private void reportExport(String filePathResource, HashMap hashMap, TableModel model, boolean flag) {
        ReportManager.getInstance().viewReport(filePathResource, hashMap, model, flag);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abcd;
    private javax.swing.JButton btnihd;
    private javax.swing.JButton btnlm;
    private javax.swing.JButton btnthoat;
    private javax.swing.JComboBox<String> cbonam;
    private javax.swing.JComboBox<String> cbongay;
    private javax.swing.JComboBox<String> cbothang;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblhd;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtgg;
    private javax.swing.JTextField txtmhd;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttbc;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttkh;
    private javax.swing.JTextField txttt;
    // End of variables declaration//GEN-END:variables

public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}