/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalExam.uasws;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author AISYAH SUHERMAN
 */
@Entity
@Table(name = "surat")
@NamedQueries({
    @NamedQuery(name = "Surat.findAll", query = "SELECT s FROM Surat s"),
    @NamedQuery(name = "Surat.findByNoSurat", query = "SELECT s FROM Surat s WHERE s.noSurat = :noSurat"),
    @NamedQuery(name = "Surat.findByJudul", query = "SELECT s FROM Surat s WHERE s.judul = :judul"),
    @NamedQuery(name = "Surat.findByTembusan", query = "SELECT s FROM Surat s WHERE s.tembusan = :tembusan"),
    @NamedQuery(name = "Surat.findByTime", query = "SELECT s FROM Surat s WHERE s.time = :time")})
public class Surat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "No_Surat")
    private Integer noSurat;
    @Column(name = "Judul")
    private String judul;
    @Column(name = "Tembusan")
    private String tembusan;
    @Lob
    @Column(name = "File")
    private byte[] file;
    @Column(name = "Time")
    @Temporal(TemporalType.DATE)
    private Date time;

    public Surat() {
    }

    public Surat(Integer noSurat) {
        this.noSurat = noSurat;
    }

    public Integer getNoSurat() {
        return noSurat;
    }

    public void setNoSurat(Integer noSurat) {
        this.noSurat = noSurat;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTembusan() {
        return tembusan;
    }

    public void setTembusan(String tembusan) {
        this.tembusan = tembusan;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noSurat != null ? noSurat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Surat)) {
            return false;
        }
        Surat other = (Surat) object;
        if ((this.noSurat == null && other.noSurat != null) || (this.noSurat != null && !this.noSurat.equals(other.noSurat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FinalExam.uasws.Surat[ noSurat=" + noSurat + " ]";
    }
    
}
