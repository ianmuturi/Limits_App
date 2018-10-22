/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author imuturi
 */
@Entity
@Table(name = "VILLAGER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Villager.findAll", query = "SELECT v FROM Villager v")
    , @NamedQuery(name = "Villager.findByVillagerid", query = "SELECT v FROM Villager v WHERE v.villagerid = :villagerid")
    , @NamedQuery(name = "Villager.findByName", query = "SELECT v FROM Villager v WHERE v.name = :name")
    , @NamedQuery(name = "Villager.findByLandregno", query = "SELECT v FROM Villager v WHERE v.landregno = :landregno")
    , @NamedQuery(name = "Villager.findByAddress", query = "SELECT v FROM Villager v WHERE v.address = :address")
    , @NamedQuery(name = "Villager.findByVillage", query = "SELECT v FROM Villager v WHERE v.village = :village")
    , @NamedQuery(name = "Villager.findByCreateddate", query = "SELECT v FROM Villager v WHERE v.createddate = :createddate")})
public class Villager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VILLAGERID")
    private Integer villagerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "NAME")
    private String name;
    @Size(max = 24)
    @Column(name = "LANDREGNO")
    private String landregno;
    @Size(max = 24)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 24)
    @Column(name = "VILLAGE")
    private String village;
    @Column(name = "CREATEDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;

    public Villager() {
    }

    public Villager(Integer villagerid) {
        this.villagerid = villagerid;
    }

    public Villager(Integer villagerid, String name) {
        this.villagerid = villagerid;
        this.name = name;
    }

    public Integer getVillagerid() {
        return villagerid;
    }

    public void setVillagerid(Integer villagerid) {
        this.villagerid = villagerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLandregno() {
        return landregno;
    }

    public void setLandregno(String landregno) {
        this.landregno = landregno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (villagerid != null ? villagerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Villager)) {
            return false;
        }
        Villager other = (Villager) object;
        if ((this.villagerid == null && other.villagerid != null) || (this.villagerid != null && !this.villagerid.equals(other.villagerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Villager[ villagerid=" + villagerid + " ]";
    }
    
}
