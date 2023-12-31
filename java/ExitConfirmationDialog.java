package com.app.teste;

import android.app.Activity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ExitConfirmationDialog extends AppCompatActivity {
    private final Activity activity;
    private boolean isExitConfirmationShowing = false;

    public ExitConfirmationDialog(Activity activity) {
        this.activity = activity;
    }
  
    public void showExitConfirmation() {
        isExitConfirmationShowing = true;
        View customDialogView = activity.getLayoutInflater().inflate(R.layout.custom_dialog, null);
        TextView textTop = customDialogView.findViewById(R.id.textTop);
        ScrollView scrollView = customDialogView.findViewById(R.id.scrollView);
        TextView textLong = customDialogView.findViewById(R.id.textLong);
        Button btnYes = customDialogView.findViewById(R.id.btnYes);
        Button btnNo = customDialogView.findViewById(R.id.btnNo);
        
        textTop.setText("Mensagem 1...");
        String htmlText = "Mensagem 2...";
        textLong.setText(Html.fromHtml(htmlText));
        
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(customDialogView);
        AlertDialog dialog = builder.create();
        dialog.show();
        
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isExitConfirmationShowing = false;
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss(); // Feche a janela de confirmação
                }
            }
        });
    }
}
