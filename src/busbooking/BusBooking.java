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
@Table(name = "bus_booking", catalog = "busbooking", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusBooking.findAll", query = "SELECT b FROM BusBooking b")
    , @NamedQuery(name = "BusBooking.findById", query = "SELECT b FROM BusBooking b WHERE b.id = :id")
    , @NamedQuery(name = "BusBooking.findByBookingId", query = "SELECT b FROM BusBooking b WHERE b.bookingId = :bookingId")
    , @NamedQuery(name = "BusBooking.findByBookingUser", query = "SELECT b FROM BusBooking b WHERE b.bookingUser = :bookingUser")
    , @NamedQuery(name = "BusBooking.findByJourneyDate", query = "SELECT b FROM BusBooking b WHERE b.journeyDate = :journeyDate")
    , @NamedQuery(name = "BusBooking.findByBusNo", query = "SELECT b FROM BusBooking b WHERE b.busNo = :busNo")
    , @NamedQuery(name = "BusBooking.findBySeatno", query = "SELECT b FROM BusBooking b WHERE b.seatno = :seatno")
    , @NamedQuery(name = "BusBooking.findByIdNo", query = "SELECT b FROM BusBooking b WHERE b.idNo = :idNo")
    , @NamedQuery(name = "BusBooking.findByFirstTname", query = "SELECT b FROM BusBooking b WHERE b.firstTname = :firstTname")
    , @NamedQuery(name = "BusBooking.findByLastName", query = "SELECT b FROM BusBooking b WHERE b.lastName = :lastName")})
public class BusBooking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "booking_id")
    private String bookingId;
    @Basic(optional = false)
    @Column(name = "booking_user")
    private String bookingUser;
    @Basic(optional = false)
    @Column(name = "journey_date")
    @Temporal(TemporalType.DATE)
    private Date journeyDate;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "seatno")
    private int seatno;
    @Basic(optional = false)
    @Column(name = "id_no")
    private int idNo;
    @Basic(optional = false)
    @Column(name = "first_tname")
    private String firstTname;
    @Column(name = "last_name")
    private String lastName;

    public BusBooking() {
    }

    public BusBooking(Integer id) {
        this.id = id;
    }

    public BusBooking(Integer id, String bookingUser, Date journeyDate, String busNo, int seatno, int idNo, String firstTname) {
        this.id = id;
        this.bookingUser = bookingUser;
        this.journeyDate = journeyDate;
        this.busNo = busNo;
        this.seatno = seatno;
        this.idNo = idNo;
        this.firstTname = firstTname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        String oldBookingId = this.bookingId;
        this.bookingId = bookingId;
        changeSupport.firePropertyChange("bookingId", oldBookingId, bookingId);
    }

    public String getBookingUser() {
        return bookingUser;
    }

    public void setBookingUser(String bookingUser) {
        String oldBookingUser = this.bookingUser;
        this.bookingUser = bookingUser;
        changeSupport.firePropertyChange("bookingUser", oldBookingUser, bookingUser);
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate) {
        Date oldJourneyDate = this.journeyDate;
        this.journeyDate = journeyDate;
        changeSupport.firePropertyChange("journeyDate", oldJourneyDate, journeyDate);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public int getSeatno() {
        return seatno;
    }

    public void setSeatno(int seatno) {
        int oldSeatno = this.seatno;
        this.seatno = seatno;
        changeSupport.firePropertyChange("seatno", oldSeatno, seatno);
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        int oldIdNo = this.idNo;
        this.idNo = idNo;
        changeSupport.firePropertyChange("idNo", oldIdNo, idNo);
    }

    public String getFirstTname() {
        return firstTname;
    }

    public void setFirstTname(String firstTname) {
        String oldFirstTname = this.firstTname;
        this.firstTname = firstTname;
        changeSupport.firePropertyChange("firstTname", oldFirstTname, firstTname);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
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
        if (!(object instanceof BusBooking)) {
            return false;
        }
        BusBooking other = (BusBooking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "busbooking.BusBooking[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
