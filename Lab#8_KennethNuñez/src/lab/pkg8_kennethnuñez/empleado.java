package lab.pkg8_kennethnuñez;

public class empleado {
    private String name;
    private String id;
    private String contraseña;
    private String jefe = "";
    private String salario;
    private String puesto;

    public empleado(String name, String id, String contraseña, String jefe, String salario, String puesto) {
        this.name = name;
        this.id = id;
        this.contraseña = contraseña;
        this.jefe = jefe;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    

   

    @Override
    public String toString() {
        return name;
    }

    
    
    
    
    
}
