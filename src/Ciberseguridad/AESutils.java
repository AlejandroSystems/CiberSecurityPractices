package Ciberseguridad;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.Base64;

public class AESutils {

    // Generar clave AES
    public static SecretKey generarClave() throws Exception {
        KeyGenerator generador = KeyGenerator.getInstance("AES");
        generador.init(128); // AES 128 bits
        return generador.generateKey();
    }

    // Cifrar texto plano
    public static String cifrarTexto(String texto, SecretKey clave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, clave);
        byte[] textoCifrado = cipher.doFinal(texto.getBytes());
        return Base64.getEncoder().encodeToString(textoCifrado);
    }

    // Descifrar texto cifrado
    public static String descifrarTexto(String textoCifrado, SecretKey clave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, clave);
        byte[] bytesDescifrados = cipher.doFinal(Base64.getDecoder().decode(textoCifrado));
        return new String(bytesDescifrados);
    }

    // Guardar clave en archivo
    public static void guardarClave(SecretKey clave, String ruta) throws Exception {
        byte[] encoded = clave.getEncoded();
        Files.write(Path.of(ruta), encoded);
    }

    // Leer clave desde archivo
    public static SecretKey leerClave(String ruta) throws Exception {
        byte[] keyBytes = Files.readAllBytes(Path.of(ruta));
        return new SecretKeySpec(keyBytes, "AES");
    }
}
