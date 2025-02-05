import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FortuneCookieApp extends JFrame {
    private JLabel labelMensaje;
    private JButton button;
    
    // Lista de mensajes
    private final String[] mensajes = {
        "La vida te dará una sorpresa agradable.",
        "El éxito está en tu futuro cercano.",
        "Hoy es un buen día para empezar algo nuevo.",
        "Tu amabilidad abrirá nuevas puertas.",
        "Grandes cosas están por venir, sé paciente.",
        "La perseverancia siempre da frutos."
    };

    public FortuneCookieApp() {
        // Configuración de la ventana
        setTitle("Galleta de la Fortuna");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centrar ventana

        // Etiqueta para el mensaje
        labelMensaje = new JLabel("Presiona el botón para tu fortuna", SwingConstants.CENTER);
        labelMensaje.setFont(new Font("Arial", Font.BOLD, 14));
        add(labelMensaje, BorderLayout.CENTER);

        // Botón para obtener un mensaje
        button = new JButton("Obtener fortuna");
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int index = rand.nextInt(mensajes.length);
                labelMensaje.setText(mensajes[index]);
            }
        });
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FortuneCookieApp().setVisible(true);
        });
    }
}
