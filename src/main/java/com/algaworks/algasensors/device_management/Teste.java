package com.algaworks.algasensors.device_management;

public class Teste {

    public static void main(String[] args) {
        System.out.println(reshape(3, "abc de fghij"));
    }

    //O metodo reshape(n, str) deve retornar a string str sem espaços e disposta em linhas de no máximo n caracteres.
    public static String reshape(int n, String str) {

        StringBuilder result = new StringBuilder();
        String trimmedStr = str.replaceAll("\\s+", ""); // Remove all whitespace

        for (int i = 0; i < trimmedStr.length(); i += n) { // i += n é a mesma coisa que i = i + n
            if (i + n < trimmedStr.length()) {
                result.append(trimmedStr, i, i + n).append("\n");
            } else {
                result.append(trimmedStr.substring(i));
            }
        }

        return result.toString().trim(); // Remove trailing newline if any

    }
}
