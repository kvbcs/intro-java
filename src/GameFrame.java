import javax.swing.JFrame;
public class GameFrame extends JFrame{
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame(); // lance le jeu
    }
}