package parkinglot.DTOs;

public class IssueTicketDTO {
    
    String parkingLotId;
    String customerId; 
    String vehicleId;
    String vehicleNo;
    String vehicleType;
    String gateId; // entryGateId
    
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleNo() {
        return vehicleNo;
    }
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
    public String getGateId() {
        return gateId;
    }
    public void setGateId(String gateId) {
        this.gateId = gateId;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getParkingLotId() {
        return parkingLotId;
    }
    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }


    

}
