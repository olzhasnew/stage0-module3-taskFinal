package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        temperatureCelsius = temperatureCelsius*9/5 + 32;
        float fahrenheit = (float)temperatureCelsius;
        System.out.println(fahrenheit);
    }
}
