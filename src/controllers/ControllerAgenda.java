
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelAgenda;
import views.ViewAgenda;

/**
 * 
 * @author Familia Hernández
 */
public class ControllerAgenda {

    ModelAgenda modelAgenda;
    ViewAgenda viewAgenda;

    /**
     * Objeto de tipo ActionListener para atrapar los eventos actionPerformed y
     * llamar a los metodos para ver los registros almacenados en la bd.
     */
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewAgenda.jbtn_primero) {
                jbtn_primero_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jbtn_anterior) {
                jbtn_anterior_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jbtn_siguiente) {
                jbtn_siguiente_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jbtn_ultimo) {
                jbtn_ultimo_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jbtn_nuevo) {
                jbtn_nuevo_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jbtn_insertar) {
                jbtn_insertar_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jbtn_modificar) {
                jbtn_modificar_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jbtn_eliminar) {
                jbtn_eliminar_actionPerformed();
            }
        }

    };


    public ControllerAgenda(ModelAgenda modelAgenda, ViewAgenda viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        initComponents();
        setActionListener();
        initDB();
    }

   
    public void initDB(){
        modelAgenda.conectarDB();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
    }

    public void initComponents() {
        viewAgenda.setLocationRelativeTo(null);
        viewAgenda.setTitle("Agenda MVC");
        viewAgenda.setVisible(true);
    }

    public void setActionListener() {
        viewAgenda.jbtn_primero.addActionListener(actionListener);
        viewAgenda.jbtn_anterior.addActionListener(actionListener);
        viewAgenda.jbtn_siguiente.addActionListener(actionListener);
        viewAgenda.jbtn_ultimo.addActionListener(actionListener);
        viewAgenda.jbtn_nuevo.addActionListener(actionListener);
        viewAgenda.jbtn_insertar.addActionListener(actionListener);
        viewAgenda.jbtn_modificar.addActionListener(actionListener);
        viewAgenda.jbtn_eliminar.addActionListener(actionListener);
    }

    //Creacion de Metodos
  
    private void jbtn_primero_actionPerformed() {
        modelAgenda.moverPrimerRegistro(); 
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre()); 
        viewAgenda.jtf_email.setText(modelAgenda.getEmail()); 
    }


    private void jbtn_anterior_actionPerformed() {
        modelAgenda.moverAnteriorRegistro(); 
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail()); 
    }


    private void jbtn_siguiente_actionPerformed() {
        modelAgenda.moverSiguienteRegistro(); 
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre()); 
        viewAgenda.jtf_email.setText(modelAgenda.getEmail()); 
    }
    

    private void jbtn_ultimo_actionPerformed() {
        modelAgenda.moverUltimoRegistro(); 
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre()); 
        viewAgenda.jtf_email.setText(modelAgenda.getEmail()); 
    }
    
  
    public void jbtn_nuevo_actionPerformed() {
        viewAgenda.jtf_nombre.setText(""); 
        viewAgenda.jtf_email.setText("");
    }
    

    public void jbtn_insertar_actionPerformed() {
        modelAgenda.setNombre(viewAgenda.jtf_nombre.getText()); 
        modelAgenda.setEmail(viewAgenda.jtf_email.getText()); 
        modelAgenda.insertarRegistro(); 
    }
    
  
    public void jbtn_modificar_actionPerformed() {
        modelAgenda.setNombre(viewAgenda.jtf_nombre.getText());
        modelAgenda.setEmail(viewAgenda.jtf_email.getText()); 
        modelAgenda.modificarRegistro();
    }
    
    public void jbtn_eliminar_actionPerformed() {
        modelAgenda.eliminarRegistro(); 
    }
    
}
