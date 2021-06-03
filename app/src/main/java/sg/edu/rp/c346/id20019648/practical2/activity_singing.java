package sg.edu.rp.c346.id20019648.practical2;
// Tan FangYi 20019648

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class activity_singing extends AppCompatActivity {
    TextView tvDescSinging, tvSingingHeader, tvVenueSinging, tvUrlSinging;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singing2);

        tvDescSinging = findViewById(R.id.tvDescSinging);
        registerForContextMenu(tvDescSinging);

        tvSingingHeader = findViewById(R.id.tvSingingHeader);
        registerForContextMenu(tvSingingHeader);

        tvVenueSinging = findViewById(R.id.tvVenueSinging);
        registerForContextMenu(tvVenueSinging);

        tvUrlSinging = findViewById(R.id.tvUrlSinging);
        registerForContextMenu(tvUrlSinging);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "French");
        menu.add(0, 2, 2, "Website");
        menu.add(0, 3, 3, "Details");

        if (v == tvUrlSinging) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlygood.tv/why-you-should-take-up-singing-as-a-hobby-second-life-career-path-2078280022.html"));
            startActivity(intent);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0) {
            tvDescSinging.setText("Singing can help you to relax and destress because you can immerse yourself into the world of music. You can vent your emotions through music and get to relax eventually.");
            return true;

        } else if (item.getItemId() == 1) {
            tvDescSinging.setText("Chanter peut vous aider à vous détendre et à vous déstresser car vous pouvez vous immerger dans le monde de la musique. Vous pouvez exprimer vos émotions à travers la musique et finir par vous détendre.");
            return true;

        } else if (item.getItemId() == 2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlygood.tv/why-you-should-take-up-singing-as-a-hobby-second-life-career-path-2078280022.html"));
            startActivity(intent);
            return true;

        } else if (item.getItemId() == 3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://avenueone.sg/going-out/live-music-venues-singapore/"));
            return true;
        }
        return super.onContextItemSelected(item);
    }
}