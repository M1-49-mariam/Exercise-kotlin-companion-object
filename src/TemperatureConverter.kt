class TemperatureConverter {
    companion object {
        var temperature: Double = 0.0
        fun convertCelsiusToFahrenheit(temperature: Double): Double {
            return temperature * 1.8 + 32
        }
        fun convertFahrenheitToCelsius(temperature: Double): Double {
            return (temperature - 32) / 1.8
        }
    }

   //3. **Using the Companion Object**
    //    - Create a main function or similar entry point.
    //    - Use the methods from the companion object to convert temperatures.
    //4. **Enhancing the Companion Object**
    //    - Add more utility methods as needed (e.g., Kelvin conversions).
    //5. **Testing the Conversions**

}