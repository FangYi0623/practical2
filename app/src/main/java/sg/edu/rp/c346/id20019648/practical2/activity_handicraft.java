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

public class activity_handicraft extends AppCompatActivity {
    TextView tvDescHandicraft, tvUrlHandicraft, tvVenueHandicraft, tvHandicraftHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handicraft);

        tvDescHandicraft = findViewById(R.id.tvDescHandicraft);
        registerForContextMenu(tvDescHandicraft);

        tvUrlHandicraft = findViewById(R.id.tvUrlHandicraft);
        registerForContextMenu(tvUrlHandicraft);

        tvVenueHandicraft = findViewById(R.id.tvVenueHandicraft);
        registerForContextMenu(tvVenueHandicraft);

        tvHandicraftHeader = findViewById(R.id.tvHandicraftHeader);
        registerForContextMenu(tvHandicraftHeader);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "French");
        menu.add(0, 2, 2, "Website");
        menu.add(0, 3, 3, "Details");

        if (v == tvUrlHandicraft) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.firefoxbikes.com/blog/5-reasons-why-cycling-should-be-your-daily-habit-and-not-just-a-hobby/#:~:text=Cycling%20as%20we%20know%20it,fall%20in%20love%20with%20it!"));
            startActivity(intent);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0) {
            tvDescHandicraft.setText("Handicraft is a hobby that can help to improve your patience and is helpful in keeping you calm and spend time.");
            return true;

        } else if (item.getItemId() == 1) {
            tvDescHandicraft.setText(" L'artisanat est un passe-temps qui peut aider à améliorer votre patience et vous aide à rester calme et à passer du temps.");
            return true;

        } else if (item.getItemId() == 2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.craftmakerpro.com/business-tips/5-reasons-crafting-best-hobby-world/"));
            startActivity(intent);
            return true;

        } else if (item.getItemId() == 3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://getspaces.com/landing/arts-crafts-venues-rental-singapore"));
            return true;
        }

        return super.onContextItemSelected(item);
}
}