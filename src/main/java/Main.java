import com.slack.api.bolt.App;
import com.slack.api.bolt.socket_mode.SocketModeApp;
import listeners.Listeners;

public class Main {

    public static void main(String[] args) throws Exception {
        // App expects an env variable: SLACK_BOT_TOKEN - Esto es una prueba
        var app = new App();
        Listeners.register(app);
        // SocketModeApp expects an env variables: SLACK_APP_TOKEN
        new SocketModeApp(app).start();
    }
}
