public class Estudiante extends Persona {
    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante (){
        this.matricula= "matricula";
        this.carrera = "carrera";
        this.promedio = 0;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getCarrera(){
        return carrera;
    }
    public double getPromedio(){
        return promedio;
    }


    public void setMatricula (String matricula){
        if (matricula != null && !matricula.trim().isEmpty()){
            this.matricula = matricula;
        }
        else
        {
            this.matricula = "No registrado";
        }
    }

    public void setPromedio (Double promedio) {
        if (promedio < 0 && promedio > 100){
            this.promedio = promedio;
        }
        else {
            this.promedio = 0;
        }
    }
}