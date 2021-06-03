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

public class activity_badminton extends AppCompatActivity {
    TextView tvDescBadminton, tvHeaderBadminton, tvVenueBadminton, tvUrlBadminton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);

        tvHeaderBadminton = findViewById(R.id.tvHeaderBadminton);
        registerForContextMenu(tvHeaderBadminton);

        tvDescBadminton = findViewById(R.id.tvDescBadminton);
        registerForContextMenu(tvDescBadminton);

        tvVenueBadminton = findViewById(R.id.tvVenueBadminton);
        registerForContextMenu(tvVenueBadminton);

        tvUrlBadminton = findViewById(R.id.tvUrlBadminton);
        registerForContextMenu(tvUrlBadminton);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "French");
        menu.add(0, 2, 2, "Website");
        menu.add(0, 3, 3, "Details");

        if (v == tvUrlBadminton) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.everyoneactive.com/content-hub/activities/9-reasons-to-try-badminton/"));
            startActivity(intent);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0) {
            tvDescBadminton.setText("Badminton beings you health benefits such as fat burning and enhances your agility. You are required to movev around and you can get to socialize with other people.");
            return true;

        } else if (item.getItemId() == 1) {
            tvDescBadminton.setText("Le badminton vous apporte des bienfaits pour la santé tels que la combustion des graisses et améliore votre agilité. Vous devez vous déplacer et vous pouvez socialiser avec d'autres personnes.");
            return true;

        } else if (item.getItemId() == 2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.everyoneactive.com/content-hub/activities/9-reasons-to-try-badminton/"));
            startActivity(intent);
            return true;

        } else if (item.getItemId() == 3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.playo.co/different-types-badminton-courts/"));
            startActivity(intent);
            return true;
        }

        return super.onContextItemSelected(item);
    }
}