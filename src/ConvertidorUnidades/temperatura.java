package ConvertidorUnidades;

public class temperatura {
    public static double convertir(double valor, String unidadInicial, String unidadFinal){
        double valCelsius = 0.0;
        double totFinal = 0.0;
        
        switch(unidadInicial){
            case "Celsius": 
                valCelsius = valor; // Usamos 'valor' en lugar de 'val'
                break;    
            case "Fahrenheit": 
                valCelsius = (valor - 32) / 1.8;
                break;
            case "Kelvin": 
                valCelsius = valor - 273.15;
                break;
            case "Rankine": 
                valCelsius = (valor - 491.67) / 1.8;
                break;
        }
        
        switch(unidadFinal){
            case "Celsius": 
                totFinal = valCelsius;
                break;
            case "Fahrenheit": 
                totFinal = (valCelsius * 1.8) + 32;
                break;
            case "Kelvin": 
                totFinal = valCelsius + 273.15;
                break;
            case "Rankine": 
                totFinal = (valCelsius + 273.15) * 1.8;
                break;
        }
        
        return totFinal;
    }
}