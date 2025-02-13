
public class StringCharacteres {
    public static void main(String[] args) {
        String text = "Este autobús va muy lento, si no acelera llegaré muy tarde a clases y" 
        + "no podré presentar el examen, el profesor no va a creerme, reprobaré" 
        + " y ¿Qué será de mí? Ni siquiera es mi culpa, pero todos actuarán como " 
        + " or to take arms against a sea of troubles," 
        + " así fuera.";

        int spaces = 0,
        vowels = 0,
        letters = 0;

        String listOfVowels = "aeiouáéíóú";

        for(char c :  text.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                letters++;
            }
            else if(Character.isWhitespace(c)){
                spaces++;
            }
            for(char v : listOfVowels.toCharArray()){
                if(c == v){
                        vowels++;
                }
            }
            
        }
        System.out.println("The text contain " + vowels + " vowels, " + (letters - vowels) + " consonants and " + spaces + " spaces.");

    }
}