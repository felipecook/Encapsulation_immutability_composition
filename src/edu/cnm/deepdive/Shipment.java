package edu.cnm.deepdive;

import java.util.Date;
import java.util.List;

public class Shipment {

  private Date initiation;

  private List<ShippingInfo> tracking;

  public Shipment(Date initiation, List<ShippingInfo> tracking) {
    this.initiation = initiation;
    this.tracking = tracking;
  }

  public Date getInitiation() {
    return initiation;
  }

  public void setInitiation(Date initiation) {
    this.initiation = initiation;
  }

  public List<TrackingInfo> getTracking() {
    return tracking;
  }

  public void addTracking(List<TrackingInfo> info) {

  }

}
