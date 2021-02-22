public class Factura {
    
    private Integer NumeroFactura;
    private String NombreHotel;
    private String NombreCliente;
    private Integer edulaCliente;
    private Double ValorPagar;

    public Integer getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        NumeroFactura = numeroFactura;
    }

    public String getNombreHotel() {
        return NombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        NombreHotel = nombreHotel;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public Integer getEdulaCliente() {
        return edulaCliente;
    }

    public void setEdulaCliente(Integer edulaCliente) {
        this.edulaCliente = edulaCliente;
    }

    public Double getValorPagar() {
        return ValorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        ValorPagar = valorPagar;
    }




}
