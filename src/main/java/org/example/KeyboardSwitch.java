package org.example;

public class KeyboardSwitch {
    KeyboardSwitch(String str8) {
        char[] strArray = str8.toCharArray();
        char[] letterRu = {'й', 'ц', 'у', 'к', 'е', 'н', 'г', 'ш', 'щ', 'з', 'х', 'ф', 'ы', 'в', 'а', 'п', 'р', 'о', 'л', 'д', 'ж', 'э', 'я', 'ч', 'с', 'м', 'и', 'т', 'ь', 'б', 'ю', 'ъ', 'ё', 'Й', 'Ц', 'У', 'К', 'Е', 'Н', 'Г', 'Ш', 'Щ', 'З', 'Х', 'Ф', 'Ы', 'В', 'А', 'П', 'Р', 'О', 'Л', 'Д', 'Ж', 'Э', 'Я', 'Ч', 'С', 'М', 'И', 'Т', 'Ь', 'Б', 'Ю', 'Ъ', 'Ё'};
        char[] letterEn = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        boolean ru = true;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == letterRu[i]) {
                ru = true;
                System.out.println("Русский");
            } else if (strArray[i] == letterEn[i]) {
                ru = false;
                System.out.println("Английский");
            }
        }
        char result = 'b';
        for (int i = 0; i < strArray.length; i++) {
            result = enToRu(strArray[i]);
            System.out.print( result );
        }
    }

    private static char enToRu(char c) {
        char letter = switch (Character.toLowerCase(c)) {
            case 'f' -> 'а';
            case ',' -> 'б';
            case 'd' -> 'в';
            case 'u' -> 'г';
            case 'l' -> 'д';
            case 't' -> 'е';
            case '`' -> 'ё';
            case ';' -> 'ж';
            case 'p' -> 'з';
            case 'b' -> 'и';
            case 'q' -> 'й';
            case 'r' -> 'к';
            case 'k' -> 'л';
            case 'v' -> 'м';
            case 'y' -> 'н';
            case 'j' -> 'о';
            case 'g' -> 'п';
            case 'h' -> 'р';
            case 'c' -> 'с';
            case 'n' -> 'т';
            case 'e' -> 'у';
            case 'a' -> 'ф';
            case '[' -> 'х';
            case 'w' -> 'ц';
            case 'x' -> 'ч';
            case 'i' -> 'ш';
            case 'o' -> 'щ';
            case ']' -> 'ъ';
            case 's' -> 'ы';
            case 'm' -> 'ь';
            case '\'' -> 'э';
            case '.' -> 'ю';
            case 'z' -> 'я';
            case '<' -> 'Б';
            case '~' -> 'Ё';
            case ':' -> 'Ж';
            case '{' -> 'Х';
            case '}' -> 'Ъ';
            case '"' -> 'Э';
            case '>' -> 'Ю';
            default -> c;
        };
return letter;
    }
}
