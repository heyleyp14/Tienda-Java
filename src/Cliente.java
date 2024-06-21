
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String id;

    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id= id;
        
    }
    
    public Cliente(){

    }
    
    
    //Getter y Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
       DefaultTableModel modelo = new DefaultTableModel();
    public void CabeceraClientes(JTable tablaClientes){
        String[] cabecera = new String[]{"NOMBRE","APELLIDO","ID"};
        modelo.setColumnIdentifiers(cabecera);
        tablaClientes.setModel(modelo);
    }
    
    public void AgregarCliente(JTextField nombre, JTextField apellido, JTextField id){
       
       this.nombre=nombre.getText();
       this.apellido=apellido.getText();
       this.id=id.getText();
       modelo.addRow(new Object[]{this.nombre,this.apellido,this.id});
    }

    public void LimpiarDatosClientes(JTextField nombre, JTextField apellido, JTextField id){
        nombre.setText("");
        apellido.setText("");
        id.setText("");
    }
    
    public void eliminarfilaCliente(JTable tablaClientes){
        int fila=tablaClientes.getSelectedRow();
        if(tablaClientes.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
        else{
           modelo.removeRow(fila); 
        }
        
    }
    
}
