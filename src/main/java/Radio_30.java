public interface Radio_30 {

    void setEncendido(Boolean encendido);
    void setVolume(int volume);
    void setEstacion(float emorisora, int banda);

    public static final int AM = 0;
    public static final int FM = 1;

    Boolean getEncendido();
    float getEstacion();
    int getBanda();
    int getVolume();

    void guardarEstacion(float emorisora, int banda, int indx);
    void recuperarEstacion(int indx);
}
