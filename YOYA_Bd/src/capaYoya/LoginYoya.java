/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capaYoya;

/**
 *
 * @author ACER
 */
import capaLogica.usuario;
import javax.swing.JOptionPane;
public class LoginYoya extends javax.swing.JFrame {
    usuario objusuario =new usuario();
    indexYOYA objetoIndexYOYA=new indexYOYA();
    
    /**
     * Creates new form LoginYoya
     */
  
    public LoginYoya() {
        initComponents();
        setTitle("INICIAR SESION");
        setLocationRelativeTo(this);
        quitar_Mensaje.setVisible(false);
      

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        quitar_Mensaje = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        asterico1 = new javax.swing.JLabel();
        asterisco2 = new javax.swing.JLabel();
        label_vacio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/login_icon_176905 (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");

        btn_ingresar.setBackground(new java.awt.Color(255, 153, 153));
        btn_ingresar.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/iniciar-sesion.png"))); // NOI18N
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_ingresar.setIconTextGap(30);
        btn_ingresar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("NOMBRE USUARIO:");

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        quitar_Mensaje.setBackground(new java.awt.Color(204, 0, 0));
        quitar_Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        quitar_Mensaje.setText("QUTAR MENSAJES DE ERROR");
        quitar_Mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitar_MensajeActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salida (2).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addComponent(quitar_Mensaje)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addComponent(label_vacio, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(asterisco2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(asterico1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(asterico1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_ingresar))
                    .addComponent(asterisco2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_vacio, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quitar_Mensaje)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitar_MensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitar_MensajeActionPerformed
        quitar_Mensaje.setVisible(false);
        label_vacio.setText("");
        asterico1.setText("");
        asterisco2.setText("");
        
    }//GEN-LAST:event_quitar_MensajeActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed

    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (txt_usuario.getText().isEmpty() && txt_password.getText().isEmpty()) {

            label_vacio.setText("TODOS LOS CAMPOS NO PUEDEN ESTA VACÍOS");
            asterico1.setText("*");
            asterisco2.setText("*");

            quitar_Mensaje.setVisible(true);
        } else {
            if(txt_usuario.getText().isEmpty()){
                label_vacio.setText("EL CAMPO USUARIO DEBE ESTAR LLENO ");
                asterisco2.setText("*");
                quitar_Mensaje.setVisible(true);
            }
            else if(txt_password.getText().isEmpty()){
                label_vacio.setText("EL CAMPO CONTRASEÑA DEBE ESTAR LLENO");
                asterico1.setText("*");
                quitar_Mensaje.setVisible(true);

            }
            String Usuario =txt_usuario.getText();
            String contrasena=txt_password.getText();
            try{
                boolean resultado=objusuario.validarPermiso(Usuario);
                if(resultado== true){
                    String nombre_completo=objusuario.iniciarSesion(Usuario, contrasena);
                    String cargo=objusuario.buscarCargo(Usuario, contrasena);
                    String a=cargo;
                    if(nombre_completo!=null){
                        if(cargo!=null){
                            if(a.endsWith("1")){
                                JOptionPane.showMessageDialog(this, "BIENVENIDO AL SISTEMA YOYA: "+nombre_completo+" QUE GUSTO VERTE");
                                JOptionPane.showMessageDialog(this,  nombre_completo+" ENTRARAS COMO MODO ADMINISTRADOR");
                                indexYOYA abrirAdmin= new indexYOYA();
                                abrirAdmin.setDatos(Usuario, nombre_completo);
                                abrirAdmin.setVisible(true);
                                this.dispose();
                            }else if(a.endsWith("2")) {
                                JOptionPane.showMessageDialog(this, "BIENVENIDO AL SISTEMA YOYA: "+nombre_completo+" QUE GUSTO VERTE");
                                JOptionPane.showMessageDialog(this,  nombre_completo+" ENTRARAS COMO MODO MODISTA");
                            }
                        }
                         label_vacio.setText("CONTRASEÑA INCORRECTA ");
                         quitar_Mensaje.setVisible(true);
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "CREDENCIALES INCORRECTAS");
                    }
                }
                else{
                    label_vacio.setText("El usuario: "+Usuario+" No esta registrado O NO TIENE ACCESO PERMITIDO ");
                    quitar_Mensaje.setVisible(true);
                    
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"error: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JLabel asterico1;
    private javax.swing.JLabel asterisco2;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_vacio;
    private javax.swing.JButton quitar_Mensaje;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
