/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Producto {
    
    private String nombre;
    private int cantidad;
    private double precio;
    private ArrayList<Producto> ListaProducto= new ArrayList();
    Venta venta = new Venta();
      

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Producto() {

    }
    
    //Getter and Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getProductos() {
        return this.ListaProducto;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.ListaProducto = productos;
    }
    
    
    
    DefaultTableModel modelo = new DefaultTableModel();
        
     public void CebeceraProductos(JTable tablaProductos){
       String[] cabecera = new String[]{"NOMBRE","CANTIDAD DISPONIBLE","PRECIO"};
        modelo.setColumnIdentifiers(cabecera);
        tablaProductos.setModel(modelo);
    }
    
       public void AgregarProducto(JTextField nombre, JTextField cantidad, JTextField precio){
       if(nombre.getText().length()==0 && cantidad.getText().length()==0 && precio.getText().length()==0){
          JOptionPane.showMessageDialog(null, "Llene los campos del producto");
       }
       else{
       this.nombre=nombre.getText();
       this.cantidad=Integer.parseInt(cantidad.getText());
       this.precio= Double.parseDouble(precio.getText());
        modelo.addRow(new Object[]{this.nombre,this.cantidad,this.precio});
        Producto producto = new Producto(this.nombre, this.cantidad, this.precio);

        ListaProducto.add(producto);
        JOptionPane.showMessageDialog(null, "Producto agregado");
           
       }
       
        
    }
     
    public void LimpiarDatosProductos(JTextField nombre, JTextField cantidad, JTextField precio){
        nombre.setText("");
        cantidad.setText("");
        precio.setText("");
    }
    
    
    public void eliminarfilaProducto(JTable tablaProductos){
        int fila=tablaProductos.getSelectedRow();
        if(tablaProductos.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
        else{
           modelo.removeRow(fila); 
        }
        
    }
    

}
