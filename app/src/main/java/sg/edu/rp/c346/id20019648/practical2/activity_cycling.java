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

public class activity_cycling extends AppCompatActivity {
    TextView tvDescCycling, tvCyclingHeader, tvVenueCycling, tvUrlCycling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycling);

        tvCyclingHeader = findViewById(R.id.tvCyclingHeader);
        registerForContextMenu(tvCyclingHeader);

        tvDescCycling = findViewById(R.id.tvDescCycling);
        registerForContextMenu(tvDescCycling);

        tvVenueCycling = findViewById(R.id.tvVenueCycling);
        registerForContextMenu(tvVenueCycling);

        tvUrlCycling = findViewById(R.id.tvUrlCycling);
        registerForContextMenu(tvUrlCycling);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "French");
        menu.add(0, 2, 2, "Website");
        menu.add(0, 3, 3, "Details");

        if (v == tvUrlCycling) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.firefoxbikes.com/blog/5-reasons-why-cycling-should-be-your-daily-habit-and-not-just-a-hobby/#:~:text=Cycling%20as%20we%20know%20it,fall%20in%20love%20with%20it!"));
            startActivity(intent);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0) {
            tvDescCycling.setText("Cycling is a hobby that brings you health benefits such as fat burning and you can relax. You can feel the wind go pass you s you are cycling and you can in turn feel calm.");
            return true;

        } else if (item.getItemId() == 1) {
            tvDescCycling.setText("Le cyclisme est un passe-temps qui vous apporte des bienfaits pour la santé tels que la combustion des graisses et vous permet de vous détendre. Vous pouvez sentir le vent passer devant vous lorsque vous faites du vélo et vous pouvez à votre tour vous sentir calme.");

            return true;

        } else if (item.getItemId() == 2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.firefoxbikes.com/blog/5-reasons-why-cycling-should-be-your-daily-habit-and-not-just-a-hobby/#:~:text=Cycling%20as%20we%20know%20it,fall%20in%20love%20with%20it!"));
            startActivity(intent);
            return true;

        } else if (item.getItemId() == 3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.timeout.com/singapore/things-to-do/the-best-cycling-trails-in-singapore"));
            return true;
        }

        return super.onContextItemSelected(item);
    }
}