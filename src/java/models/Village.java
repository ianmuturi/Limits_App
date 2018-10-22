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
@Table(name = "VILLAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Village.findAll", query = "SELECT v FROM Village v")
    , @NamedQuery(name = "Village.findByVillageid", query = "SELECT v FROM Village v WHERE v.villageid = :villageid")
    , @NamedQuery(name = "Village.findByName", query = "SELECT v FROM Village v WHERE v.name = :name")
    , @NamedQuery(name = "Village.findByLocation", query = "SELECT v FROM Village v WHERE v.location = :location")
    , @NamedQuery(name = "Village.findByCreateddate", query = "SELECT v FROM Village v WHERE v.createddate = :createddate")
    , @NamedQuery(name = "Village.findByNoofresidents", query = "SELECT v FROM Village v WHERE v.noofresidents = :noofresidents")})
public class Village implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VILLAGEID")
    private Integer villageid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "NAME")
    private String name;
    @Size(max = 24)
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "CREATEDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;
    @Column(name = "NOOFRESIDENTS")
    private Integer noofresidents;

    public Village() {
    }

    public Village(Integer villageid) {
        this.villageid = villageid;
    }

    public Village(Integer villageid, String name) {
        this.villageid = villageid;
        this.name = name;
    }

    public Integer getVillageid() {
        return villageid;
    }

    public void setVillageid(Integer villageid) {
        this.villageid = villageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getNoofresidents() {
        return noofresidents;
    }

    public void setNoofresidents(Integer noofresidents) {
        this.noofresidents = noofresidents;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (villageid != null ? villageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Village)) {
            return false;
        }
        Village other = (Village) object;
        if ((this.villageid == null && other.villageid != null) || (this.villageid != null && !this.villageid.equals(other.villageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Village[ villageid=" + villageid + " ]";
    }
    
}
