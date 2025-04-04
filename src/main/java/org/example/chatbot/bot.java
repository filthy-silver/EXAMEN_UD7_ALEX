package org.example.chatbot;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class bot {
    static HashMap<String, String> chat = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        chat.putAll(Map.of(
                "hola", "Hola! En qué puedo ayudarte?",
                "adios", "Hasta luego :D",
                "qué", "Es una pregunta muy relativa.",
                "tiempo", "No tengo acceso a esa información. :(",
                "patata", "Me encantan las patatas",
                "caso", "No te estoy haciendo caso.",
                "entiendes?", "No quiero entiender.",
                "gracias", "De nada!",
                "no", "'no' exactamente a qué?",
                "pregunta", "Preguntame lo que quieras"
        ));
        chat.putAll(Map.of(
                "hola!", "HOLA!",
                "dime", "No te diré nada.",
                "que?", "Explicate mejor.",
                "hora", "Nunca.",
                "hora?", "Hora de escribir 'salir'."
        ));

        System.out.println("Bienvenido! Escribe 'salir' para acabar la conversación...");
        String userEntry = "";

        do {
            boolean answer = false;
            userEntry = sc.nextLine().toLowerCase();
            String[] userWords = userEntry.split(" ");
            for (String word : userWords) {
                if (chat.containsKey(word)) {
                    System.out.println("Chat:" + chat.get(word));
                    answer = true;
                    break;
                }
            }
            if (!answer && !userEntry.equals("salir")) {
                System.out.println("Chat: Lo siento, no te entendí");
            }

        } while (!userEntry.equals("salir"));

        System.out.println("Has salido correctamente");
    }
}
