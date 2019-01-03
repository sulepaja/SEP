package koncentratorPlacanja.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Klijent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 70)
    private String imeKompanije;

    @Column(nullable = false, length = 70)
    private String email;

    @Column(nullable = false, length = 70)
    private String password;

    @Column(length = 30)
    private String bankId;

    @Column(length = 100)
    private String bankPass;

    @Column(nullable = false, length = 200)
    private String successUrl;

    @Column(nullable = false, length = 200)
    private String failedUrl;

    @Column(nullable = false, length = 200)
    private String errorUrl;

    @Column(length = 80)
    private String paypalSecret;

    @Column(length = 80)
    private String bitcoinSecret;

    @OneToMany(mappedBy = "klijent", cascade = CascadeType.ALL)
    private List<Transakcija> transakcije = new ArrayList<Transakcija>();

    public Klijent(String imeKompanije, String email, String password, String bankId, String bankPass, String successUrl,
                   String failedUrl, String errorUrl, String paypalSecret, String bitcoinSecret) {
        this.imeKompanije = imeKompanije;
        this.email = email;
        this.password = password;
        this.bankId = bankId;
        this.bankPass = bankPass;
        this.successUrl = successUrl;
        this.failedUrl = failedUrl;
        this.errorUrl = errorUrl;
        this.paypalSecret = paypalSecret;
        this.bitcoinSecret = bitcoinSecret;
    }

    public Klijent() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return imeKompanije;
    }

    public void setCompanyName(String imeKompanije) {
        this.imeKompanije = imeKompanije;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankPass() {
        return bankPass;
    }

    public void setBankPass(String bankPass) {
        this.bankPass = bankPass;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getFailedUrl() {
        return failedUrl;
    }

    public void setFailedUrl(String failedUrl) {
        this.failedUrl = failedUrl;
    }

    public String getErrorUrl() {
        return errorUrl;
    }

    public void setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
    }

    public String getPaypalSecret() {
        return paypalSecret;
    }

    public void setPaypalSecret(String paypalSecret) {
        this.paypalSecret = paypalSecret;
    }

    public String getBitcoinSecret() {
        return bitcoinSecret;
    }

    public void setBitcoinSecret(String bitcoinSecret) {
        this.bitcoinSecret = bitcoinSecret;
    }

    public List<Transakcija> getTransakcije() {
        return transakcije;
    }

    public void setTransakcije(List<Transakcija> transakcije) {
        this.transakcije = transakcije;
    }
}