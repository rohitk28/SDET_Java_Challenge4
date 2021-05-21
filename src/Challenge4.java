import java.sql.SQLOutput;

public class Challenge4 {
// this program convert temperatures from and to Celsius/Fahrenheit/Kelvin

    public static void main(String[] args) {
        // we print the output here in main class by calling the method and passing the value to the parameter

        System.out.println(convertCtoK(32)+ " k");
        // expected output 305.15 k

    }
    private static double convertCtoF(double degreesCelsius) {
        //calculate and returns  Celsius to Fahrenheit
        return degreesCelsius / 5.0 * 9.0 + 32.0;
    }
     private static double convertFtoC(double degreesFahrenheit) {
        //calculate and returns Fahrenheit to Celsius
            return (degreesFahrenheit - 32.0)/ 9.0 * 5.0;
        }
    private static double convertCtoK(double degreesCelsius) {
        //calculate and returns  Celsius to kelvin
            return degreesCelsius + 273.15;
        }
    private static double convertKtoC(double kelvin) {
        //calculate and returns  Kelvin to Celsius
            return kelvin - 273.15;
        }
    private static double convertFtoK(double degreesFahrenheit) {
        //calculate and returns Fahrenheit to Kelvin
            return (degreesFahrenheit + 459.7) / 9.0 * 5.0;
        }
    private static double convertKtoF(double kelvin) {
        //calculate and returns Kelvin to Fahrenheit
        return kelvin / 5.0 * 9.0 - 459.7;
        }

    }

