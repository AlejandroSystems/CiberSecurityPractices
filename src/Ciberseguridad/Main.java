package Ciberseguridad;

import javax.crypto.SecretKey;

public class Main {

    public static void main(String[] args) {
        try {
            // 1. Generar clave y guardarla
            SecretKey clave = AESutils.generarClave();
            AESutils.guardarClave(clave, "clave.aes");

            // 2. Texto de prueba
            String original = "Este es un texto confidencial.";
            System.out.println("Texto original: " + original);

            // 3. Cifrado
            String cifrado = AESutils.cifrarTexto(original, clave);
            System.out.println("Texto cifrado: " + cifrado);

            // 4. Leer clave desde archivo y descifrar
            SecretKey claveLeida = AESutils.leerClave("clave.aes");
            String descifrado = AESutils.descifrarTexto(cifrado, claveLeida);
            System.out.println("Texto descifrado: " + descifrado);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
