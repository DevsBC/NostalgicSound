package itcj.juanaranda.nostalgicsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.xp);
        Button playButton = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);

        mp.setOnCompletionListener(mp1 -> {
            Toast.makeText(getApplicationContext(), "Juan Carlos Aranda Alonso", Toast.LENGTH_SHORT).show();
            textView.setText("");
        });

        playButton.setOnClickListener(v -> {
            textView.setText("Windows XP");
            mp.start();
        });

    }
}