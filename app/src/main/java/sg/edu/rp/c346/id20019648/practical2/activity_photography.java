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

public class activity_photography extends AppCompatActivity {
    TextView tvDescPhotography, tvHeadingPhotography, tvVenuePhotography, tvUrlPhotography;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography);

        tvDescPhotography = findViewById(R.id.tvDescPhotography);
        registerForContextMenu(tvDescPhotography);

        tvHeadingPhotography = findViewById(R.id.tvHeadingPhotography);
        registerForContextMenu(tvHeadingPhotography);

        tvVenuePhotography = findViewById(R.id.tvVenuePhotography);
        registerForContextMenu(tvVenuePhotography);

        tvUrlPhotography = findViewById(R.id.tvUrlPhotography);
        registerForContextMenu(tvUrlPhotography);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "French");
        menu.add(0, 2, 2, "Website");
        menu.add(0, 3, 3, "Details");

        if (v == tvUrlPhotography) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://digital-photography-school.com/10-reasons-photography-great-hobby/#:~:text=Photography%20is%20a%20hobby%20that,Start%20getting%20real%20now!"));
            startActivity(intent);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0) {
            tvDescPhotography.setText("Photography is hobby that can be done by all ages. The skills can be learnt online or through tuition or workshops. Photography allows people to capture moments of their life that they want to keep.");
            return true;

        } else if (item.getItemId() == 1) {
            tvDescPhotography.setText("La photographie est un passe-temps qui peut être fait par tous les âges. Les compétences peuvent être apprises en ligne ou par le biais de cours ou d'ateliers. La photographie permet aux gens de capturer des moments de leur vie qu'ils souhaitent conserver.");

            return true;

        } else if (item.getItemId() == 2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://digital-photography-school.com/10-reasons-photography-great-hobby/#:~:text=Photography%20is%20a%20hobby%20that,Start%20getting%20real%20now!"));
            startActivity(intent);
            return true;

        } else if (item.getItemId() == 3) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thewanderinglens.com/singapore-photography-locations/"));
            return true;
        }
        return super.onContextItemSelected(item);
    }
}