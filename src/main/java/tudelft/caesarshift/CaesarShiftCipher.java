package tudelft.caesarshift;
 //EJERCICIO 3 - ANDRE HUAROC CORRECCION DEL APPEND
public class CaesarShiftCipher {
     public static String CaesarShiftCipher(String message, int shift) {
         if (message == null) return "invalid";

         StringBuilder result = new StringBuilder();
         shift = shift % 26;

         for (int i = 0; i < message.length(); i++) {
             char c = message.charAt(i);

             if (c == ' ') {
                 result.append(' ');
             } else if (c >= 'a' && c <= 'z') {
                 int originalAlphabetPos = c - 'a';
                 int newAlphabetPos = (originalAlphabetPos + shift) % 26;
                 if (newAlphabetPos < 0) {
                     newAlphabetPos += 26;
                 }
                 char newChar = (char) ('a' + newAlphabetPos);
                 result.append(newChar);
             } else {
                 return "invalid";
             }
         }
         return result.toString();
     }
}