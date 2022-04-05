

package Modelo;

public class estudiantes {

    private String IDESTUDIANTE;
    private String CEDULA;
    private String PRIMERNOMBRE;
    private String SEGUNDONOMBRE;
    private String PRIMERAPELLIDO;
    private String SEGUNDOAPELLIDO;
    private String DIRECCION;
    private String TELEFONO;
    private String CORREO;

    public estudiantes() {
    }

    public estudiantes(String IDESTUDIANTE, String CEDULA, String PRIMERNOMBRE, String SEGUNDONOMBRE, String PRIMERAPELLIDO, String SEGUNDOAPELLIDO, String DIRECCION, String TELEFONO, String CORREO) {
        this.IDESTUDIANTE = IDESTUDIANTE;
        this.CEDULA = CEDULA;
        this.PRIMERNOMBRE = PRIMERNOMBRE;
        this.SEGUNDONOMBRE = SEGUNDONOMBRE;
        this.PRIMERAPELLIDO = PRIMERAPELLIDO;
        this.SEGUNDOAPELLIDO = SEGUNDOAPELLIDO;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.CORREO = CORREO;
    }
     public estudiantes( String CEDULA, String PRIMERNOMBRE, String SEGUNDONOMBRE, String PRIMERAPELLIDO, String SEGUNDOAPELLIDO, String DIRECCION, String TELEFONO, String CORREO) {
        
        this.CEDULA = CEDULA;
        this.PRIMERNOMBRE = PRIMERNOMBRE;
        this.SEGUNDONOMBRE = SEGUNDONOMBRE;
        this.PRIMERAPELLIDO = PRIMERAPELLIDO;
        this.SEGUNDOAPELLIDO = SEGUNDOAPELLIDO;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.CORREO = CORREO;
    }

    /**
     * @return the IDESTUDIANTE
     */
    public String getIDESTUDIANTE() {
        return IDESTUDIANTE;
    }

    /**
     * @param IDESTUDIANTE the IDESTUDIANTE to set
     */
    public void setIDESTUDIANTE(String IDESTUDIANTE) {
        this.IDESTUDIANTE = IDESTUDIANTE;
    }

    /**
     * @return the CEDULA
     */
    public String getCEDULA() {
        return CEDULA;
    }

    /**
     * @param CEDULA the CEDULA to set
     */
    public void setCEDULA(String CEDULA) {
        this.CEDULA = CEDULA;
    }

    /**
     * @return the PRIMERNOMBRE
     */
    public String getPRIMERNOMBRE() {
        return PRIMERNOMBRE;
    }

    /**
     * @param PRIMERNOMBRE the PRIMERNOMBRE to set
     */
    public void setPRIMERNOMBRE(String PRIMERNOMBRE) {
        this.PRIMERNOMBRE = PRIMERNOMBRE;
    }

    /**
     * @return the SEGUNDONOMBRE
     */
    public String getSEGUNDONOMBRE() {
        return SEGUNDONOMBRE;
    }

    /**
     * @param SEGUNDONOMBRE the SEGUNDONOMBRE to set
     */
    public void setSEGUNDONOMBRE(String SEGUNDONOMBRE) {
        this.SEGUNDONOMBRE = SEGUNDONOMBRE;
    }

    /**
     * @return the PRIMERAPELLIDO
     */
    public String getPRIMERAPELLIDO() {
        return PRIMERAPELLIDO;
    }

    /**
     * @param PRIMERAPELLIDO the PRIMERAPELLIDO to set
     */
    public void setPRIMERAPELLIDO(String PRIMERAPELLIDO) {
        this.PRIMERAPELLIDO = PRIMERAPELLIDO;
    }

    /**
     * @return the SEGUNDOAPELLIDO
     */
    public String getSEGUNDOAPELLIDO() {
        return SEGUNDOAPELLIDO;
    }

    /**
     * @param SEGUNDOAPELLIDO the SEGUNDOAPELLIDO to set
     */
    public void setSEGUNDOAPELLIDO(String SEGUNDOAPELLIDO) {
        this.SEGUNDOAPELLIDO = SEGUNDOAPELLIDO;
    }

    /**
     * @return the DIRECCION
     */
    public String getDIRECCION() {
        return DIRECCION;
    }

    /**
     * @param DIRECCION the DIRECCION to set
     */
    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    /**
     * @return the TELEFONO
     */
    public String getTELEFONO() {
        return TELEFONO;
    }

    /**
     * @param TELEFONO the TELEFONO to set
     */
    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    /**
     * @return the CORREO
     */
    public String getCORREO() {
        return CORREO;
    }

    /**
     * @param CORREO the CORREO to set
     */
    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }
         
    
}
