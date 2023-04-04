/*
    Roman_Numerals_Decoder.java
    
    Violeta Solorio
    
    The program takes a roman numeral as its argument and returns its value as a numeric decimal integer. 
*/
class Roman_Numerals_Decoder {
     public static int decode(String roman) {
         int romanNumber = 0;
         for( int i =0; i< roman.length();i++){
         //Checks which roman number the char corresponds to
         //Checks for cases where ascending roman numbers appear(ex. CM) & if the char is the last char
             switch(roman.charAt(i)){
                 case 'M': romanNumber += 1000;
                    break;
                 case 'D': romanNumber += 500;
                    break;
                 case 'C': 
                    if(roman.charAt(i) == roman.charAt(roman.length()-1)){
                        romanNumber +=100;
                    }else if(roman.charAt(i+1) == 'D'){
                         romanNumber +=400;
                         i++;
                    }else if (roman.charAt(i+1) == 'M'){
                        romanNumber += 900;
                        i++;
                    }else{
                        romanNumber +=100;
                    }
                    break;
                 case 'L': romanNumber += 50;
                    break;
                 case 'X': 
                     if(roman.charAt(i) == roman.charAt(roman.length()-1)){
                        romanNumber +=10;
                     }else if(roman.charAt(i+1) == 'L'){
                        romanNumber +=40;
                         i++;
                     }else if (roman.charAt(i+1) == 'C'){
                        romanNumber += 90;
                         i++;
                     }else{
                        romanNumber +=10;
                     }
                    break;
                 case 'V': romanNumber += 5;
                    break;
                 case 'I': 
                     if(roman.charAt(i) == roman.charAt(roman.length()-1)){
                        romanNumber +=1;
                     }else if(roman.charAt(i+1) == 'X'){
                         romanNumber +=9;
                         i++;
                     }else if (roman.charAt(i+1) == 'V'){
                         romanNumber += 4;
                         i++;
                     }else{
                        romanNumber +=1;
                     }
                     break;
                 }
         }
         return romanNumber;
     }
}