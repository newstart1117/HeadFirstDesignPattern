package MyInterface.MyInterfaceImp;

import MyInterface.DisplayElement;
import MyInterface.Observer;
import MyInterface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.2fF degrees, %.2f%% humidity and Pressure: %.2f  %n",
                temperature, humidity, pressure);
    }

}
