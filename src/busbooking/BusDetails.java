/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busbooking;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author akash004
 */
@Entity
@Table(name = "bus_details", catalog = "busbooking", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusDetails.findAll", query = "SELECT b FROM BusDetails b")
    , @NamedQuery(name = "BusDetails.findById", query = "SELECT b FROM BusDetails b WHERE b.id = :id")
    , @NamedQuery(name = "BusDetails.findByBusNo", query = "SELECT b FROM BusDetails b WHERE b.busNo = :busNo")
    , @NamedQuery(name = "BusDetails.findByBusSource", query = "SELECT b FROM BusDetails b WHERE b.busSource = :busSource")
    , @NamedQuery(name = "BusDetails.findByBusDesti", query = "SELECT b FROM BusDetails b WHERE b.busDesti = :busDesti")
    , @NamedQuery(name = "BusDetails.findByBusDate", query = "SELECT b FROM BusDetails b WHERE b.busDate = :busDate")
    , @NamedQuery(name = "BusDetails.findByBusTime", query = "SELECT b FROM BusDetails b WHERE b.busTime = :busTime")
    , @NamedQuery(name = "BusDetails.findByPrice", query = "SELECT b FROM BusDetails b WHERE b.price = :price")
    , @NamedQuery(name = "BusDetails.findBySeats", query = "SELECT b FROM BusDetails b WHERE b.seats = :seats")
    , @NamedQuery(name = "BusDetails.findByMovement", query = "SELECT b FROM BusDetails b WHERE b.movement = :movement")})
public class BusDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "bus_source")
    private String busSource;
    @Basic(optional = false)
    @Column(name = "bus_desti")
    private String busDesti;
    @Basic(optional = false)
    @Column(name = "bus_date")
    @Temporal(TemporalType.DATE)
    private Date busDate;
    @Basic(optional = false)
    @Column(name = "bus_time")
    private String busTime;
    @Column(name = "price")
    private String price;
    @Basic(optional = false)
    @Column(name = "seats")
    private int seats;
    @Basic(optional = false)
    @Column(name = "movement")
    private String movement;

    public BusDetails() {
    }

    public BusDetails(Integer id) {
        this.id = id;
    }

    public BusDetails(Integer id, String busNo, String busSource, String busDesti, Date busDate, String busTime, int seats, String movement) {
        this.id = id;
        this.busNo = busNo;
        this.busSource = busSource;
        this.busDesti = busDesti;
        this.busDate = busDate;
        this.busTime = busTime;
        this.seats = seats;
        this.movement = movement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        String oldBusSource = this.busSource;
        this.busSource = busSource;
        changeSupport.firePropertyChange("busSource", oldBusSource, busSource);
    }

    public String getBusDesti() {
        return busDesti;
    }

    public void setBusDesti(String busDesti) {
        String oldBusDesti = this.busDesti;
        this.busDesti = busDesti;
        changeSupport.firePropertyChange("busDesti", oldBusDesti, busDesti);
    }

    public Date getBusDate() {
        return busDate;
    }

    public void setBusDate(Date busDate) {
        Date oldBusDate = this.busDate;
        this.busDate = busDate;
        changeSupport.firePropertyChange("busDate", oldBusDate, busDate);
    }

    public String getBusTime() {
        return busTime;
    }

    public void setBusTime(String busTime) {
        String oldBusTime = this.busTime;
        this.busTime = busTime;
        changeSupport.firePropertyChange("busTime", oldBusTime, busTime);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        int oldSeats = this.seats;
        this.seats = seats;
        changeSupport.firePropertyChange("seats", oldSeats, seats);
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        String oldMovement = this.movement;
        this.movement = movement;
        changeSupport.firePropertyChange("movement", oldMovement, movement);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusDetails)) {
            return false;
        }
        BusDetails other = (BusDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "busbooking.BusDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
