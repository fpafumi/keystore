package francescopafumi.keystore.Model;

public class CA {
    String compagnia, certificato;

    public CA(String compagnia, String certificato) {
        this.compagnia = compagnia;
        this.certificato = certificato;
    }

    public String getCompagnia() {
        return compagnia;
    }

    public void setCompagnia(String compagnia) {
        this.compagnia = compagnia;
    }

    public String getCertificato() {
        return certificato;
    }

    public void setCertificato(String certificato) {
        this.certificato = certificato;
    }
}
