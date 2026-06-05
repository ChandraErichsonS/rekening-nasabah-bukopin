package My.Spring.Application.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "nasabah_bukopin")
public class NasabahBukopin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nasabah")
    private Long idNasabah;

    @Column(name = "nomor_rekening", unique = true, nullable = false, length = 15)
    private String nomorRekening;

    @Column(name = "nama_lengkap", nullable = false, length = 100)
    private String namaLengkap;

    @Column(name = "nik", unique = true, nullable = false, length = 16)
    private String nik;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "nomor_telepon", length = 15)
    private String nomorTelepon;

    @Column(name = "saldo", precision = 15, scale = 2)
    private BigDecimal saldo;

    @Column(name = "status_rekening", length = 10)
    private String statusRekening = "AKTIF";

    @Column(name = "tanggal_buka")
    private LocalDateTime tanggalBuka;

    @PrePersist
    protected void onCreate() {
        this.tanggalBuka = LocalDateTime.now();
    }

    
    public Long getIdNasabah() { return idNasabah; }
    public void setIdNasabah(Long idNasabah) { this.idNasabah = idNasabah; }

    public String getNomorRekening() { return nomorRekening; }
    public void setNomorRekening(String nomorRekening) { this.nomorRekening = nomorRekening; }

    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }

    public String getNik() { return nik; }
    public void setNik(String nik) { this.nik = nik; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNomorTelepon() { return nomorTelepon; }
    public void setNomorTelepon(String nomorTelepon) { this.nomorTelepon = nomorTelepon; }

    public BigDecimal getSaldo() { return saldo; }
    public void setSaldo(BigDecimal saldo) { this.saldo = saldo; }

    public String getStatusRekening() { return statusRekening; }
    public void setStatusRekening(String statusRekening) { this.statusRekening = statusRekening; }

    public LocalDateTime getTanggalBuka() { return tanggalBuka; }
    public void setTanggalBuka(LocalDateTime tanggalBuka) { this.tanggalBuka = tanggalBuka; }
}