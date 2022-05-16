public class Car {
    private String carMark;
    private String carModel;
    private double motorVolume;

    public Car(String carMark, String carModel, double motorVolume) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.motorVolume = motorVolume;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(double motorVolume) {
        this.motorVolume = motorVolume;
    }
}
