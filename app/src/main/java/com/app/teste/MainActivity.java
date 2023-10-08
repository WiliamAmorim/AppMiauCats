package com.app.teste;
import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
public class MainActivity extends AppCompatActivity {
    private Views views;
    private Sounds sound;
    private ExitConfirmationDialog exitConfirmationDialog;
    private boolean shouldShowExitDialog = false;
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        views = new Views(getWindow().getDecorView().findViewById(android.R.id.content));
        sound = new Sounds(this);

        controller = new Controller(views, sound);

        exitConfirmationDialog = new ExitConfirmationDialog(this);

    }
    @Override
    public void onBackPressed() {
        if (!shouldShowExitDialog) {
            exitConfirmationDialog.showExitConfirmation();
        } else {
            super.onBackPressed();
        }
    }


}
