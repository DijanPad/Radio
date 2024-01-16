public class Radio implements Radio_30 {

    private boolean encendido;
    private String marca;
    private int banda;
    private float estacion;
    private int volume;


    public void setEncendido(Boolean encendido){
        encendido = this.encendido;
    }
    public void setVolume(int volume){
        volume = this.volume;
    }
    public void setEstacion(float emorisora, int banda){
        emorisora = this.estacion;
        banda = this.banda;
    }
    public void setBanda(int banda) {
        this.banda = banda;
    }

    public Boolean getEncendido(){
        return encendido;
    }
    public float getEstacion(){
        return estacion;
    }
    public int getBanda(){
        return banda;
    }
    public int getVolume(){
        return volume;
    }

    public void guardarEstacion(float emorisora, int banda, int indx);
    public void recuperarEstacion(int indx);

    

}
