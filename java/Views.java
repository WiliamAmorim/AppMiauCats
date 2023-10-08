package com.app.teste;

import android.content.Context;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

public class Views{
    private ImageButton buttonCat1, buttonCat2, buttonCat3, buttonCat4, buttonCat5, buttonCat6, buttonCat7;
    private ImageButton buttonCat8, buttonCat9, buttonCat10, buttonCat11, buttonCat12, buttonCat13, buttonCat14;
    private ImageButton buttonCat15, buttonCat16, buttonCat17, buttonCat18, buttonCat19, buttonCat20, buttonCat21;
    private ImageButton buttonCat22, buttonCat23, buttonCat24, buttonCat25, buttonCat26, buttonCat27, buttonCat28;

    private Context context;
    private Controller controller;

    public Views(Context context, Controller controller ) {
        this.context = context;
        this.controller = controller;
    }
    public Views(android.view.View rootView) {
        buttonCat1 = rootView.findViewById(R.id.gif1);
        buttonCat2 = rootView.findViewById(R.id.gif2);
        buttonCat3 = rootView.findViewById(R.id.gif3);
        buttonCat4 = rootView.findViewById(R.id.gif4);
        buttonCat5 = rootView.findViewById(R.id.gif5);
        buttonCat6 = rootView.findViewById(R.id.gif6);
        buttonCat7 = rootView.findViewById(R.id.gif7);
        buttonCat8 = rootView.findViewById(R.id.gif8);
        buttonCat9 = rootView.findViewById(R.id.gif9);
        buttonCat10 = rootView.findViewById(R.id.gif10);
        buttonCat11 = rootView.findViewById(R.id.gif11);
        buttonCat12 = rootView.findViewById(R.id.gif12);
        buttonCat13 = rootView.findViewById(R.id.gif13);
        buttonCat14 = rootView.findViewById(R.id.gif14);
        buttonCat15 = rootView.findViewById(R.id.gif15);
        buttonCat16 = rootView.findViewById(R.id.gif16);
        buttonCat17 = rootView.findViewById(R.id.gif17);
        buttonCat18 = rootView.findViewById(R.id.gif18);
        buttonCat19 = rootView.findViewById(R.id.gif19);
        buttonCat20 = rootView.findViewById(R.id.gif20);
        buttonCat21 = rootView.findViewById(R.id.gif21);
        buttonCat22 = rootView.findViewById(R.id.gif22);
        buttonCat23 = rootView.findViewById(R.id.gif23);
        buttonCat24 = rootView.findViewById(R.id.gif24);
        buttonCat25 = rootView.findViewById(R.id.gif25);
        buttonCat26 = rootView.findViewById(R.id.gif26);
        buttonCat27 = rootView.findViewById(R.id.gif27);
        buttonCat28 = rootView.findViewById(R.id.gif28);

    }

    public void setButtonListenerGif1(android.view.View.OnClickListener listener) {
        buttonCat1.setOnClickListener(listener);
    }
    public void setButtonListenerGif2(android.view.View.OnClickListener listener) {
        buttonCat2.setOnClickListener(listener);
    }
    public void setButtonListenerGif3(android.view.View.OnClickListener listener) {
        buttonCat3.setOnClickListener(listener);
    }
    public void setButtonListenerGif4(android.view.View.OnClickListener listener) {
        buttonCat4.setOnClickListener(listener);
    }
    public void setButtonListenerGif5(android.view.View.OnClickListener listener) {
        buttonCat5.setOnClickListener(listener);
    }
    public void setButtonListenerGif6(android.view.View.OnClickListener listener) {
        buttonCat6.setOnClickListener(listener);
    }
    public void setButtonListenerGif7(android.view.View.OnClickListener listener) {
        buttonCat7.setOnClickListener(listener);
    }
    public void setButtonListenerGif8(android.view.View.OnClickListener listener) {
        buttonCat8.setOnClickListener(listener);
    }
    public void setButtonListenerGif9(android.view.View.OnClickListener listener) {
        buttonCat9.setOnClickListener(listener);
    }
    public void setButtonListenerGif10(android.view.View.OnClickListener listener) {
        buttonCat10.setOnClickListener(listener);
    }
    public void setButtonListenerGif11(android.view.View.OnClickListener listener) {
        buttonCat11.setOnClickListener(listener);
    }
    public void setButtonListenerGif12(android.view.View.OnClickListener listener) {
        buttonCat12.setOnClickListener(listener);
    }
    public void setButtonListenerGif13(android.view.View.OnClickListener listener) {
        buttonCat13.setOnClickListener(listener);
    }
    public void setButtonListenerGif14(android.view.View.OnClickListener listener) {
        buttonCat14.setOnClickListener(listener);
    }
    public void setButtonListenerGif15(android.view.View.OnClickListener listener) {
        buttonCat15.setOnClickListener(listener);
    }
    public void setButtonListenerGif16(android.view.View.OnClickListener listener) {
        buttonCat16.setOnClickListener(listener);
    }
    public void setButtonListenerGif17(android.view.View.OnClickListener listener) {
        buttonCat17.setOnClickListener(listener);
    }
    public void setButtonListenerGif18(android.view.View.OnClickListener listener) {
        buttonCat18.setOnClickListener(listener);
    }
    public void setButtonListenerGif19(android.view.View.OnClickListener listener) {
        buttonCat19.setOnClickListener(listener);
    }
    public void setButtonListenerGif20(android.view.View.OnClickListener listener) {
        buttonCat20.setOnClickListener(listener);
    }
    public void setButtonListenerGif21(android.view.View.OnClickListener listener) {
        buttonCat21.setOnClickListener(listener);
    }
    public void setButtonListenerGif22(android.view.View.OnClickListener listener) {
        buttonCat22.setOnClickListener(listener);
    }
    public void setButtonListenerGif23(android.view.View.OnClickListener listener) {
        buttonCat23.setOnClickListener(listener);
    }
    public void setButtonListenerGif24(android.view.View.OnClickListener listener) {
        buttonCat24.setOnClickListener(listener);
    }
    public void setButtonListenerGif25(android.view.View.OnClickListener listener) {
        buttonCat25.setOnClickListener(listener);
    }
    public void setButtonListenerGif26(android.view.View.OnClickListener listener) {
        buttonCat26.setOnClickListener(listener);
    }
    public void setButtonListenerGif27(android.view.View.OnClickListener listener) {
        buttonCat27.setOnClickListener(listener);
    }
    public void setButtonListenerGif28(android.view.View.OnClickListener listener) {
        buttonCat28.setOnClickListener(listener);
    }
    public void startGifAnimation(int gifResource, ImageButton button) {
        button.setBackgroundResource(gifResource);
        Drawable drawable = button.getBackground();
        if (drawable instanceof AnimatedImageDrawable) {
            ((AnimatedImageDrawable) drawable).start();
        }
    }
    public void startGifAnimationGif1(){ startGifAnimation(R.drawable.gif1, buttonCat1); }
    public void startGifAnimationGif2(){ startGifAnimation(R.drawable.gif2, buttonCat2); }
    public void startGifAnimationGif3(){ startGifAnimation(R.drawable.gif3, buttonCat3); }
    public void startGifAnimationGif4(){ startGifAnimation(R.drawable.gif4, buttonCat4); }
    public void startGifAnimationGif5(){ startGifAnimation(R.drawable.gif5, buttonCat5); }
    public void startGifAnimationGif6(){ startGifAnimation(R.drawable.gif6, buttonCat6); }
    public void startGifAnimationGif7(){ startGifAnimation(R.drawable.gif7, buttonCat7); }
    public void startGifAnimationGif8(){ startGifAnimation(R.drawable.gif8, buttonCat8); }
    public void startGifAnimationGif9(){ startGifAnimation(R.drawable.gif9, buttonCat9); }
    public void startGifAnimationGif10(){ startGifAnimation(R.drawable.gif10, buttonCat10); }
    public void startGifAnimationGif11(){ startGifAnimation(R.drawable.gif11, buttonCat11); }
    public void startGifAnimationGif12(){ startGifAnimation(R.drawable.gif12, buttonCat12); }
    public void startGifAnimationGif13(){ startGifAnimation(R.drawable.gif13, buttonCat13); }
    public void startGifAnimationGif14(){ startGifAnimation(R.drawable.gif14, buttonCat14); }
    public void startGifAnimationGif15(){ startGifAnimation(R.drawable.gif15, buttonCat15); }
    public void startGifAnimationGif16(){ startGifAnimation(R.drawable.gif16, buttonCat16); }
    public void startGifAnimationGif17(){ startGifAnimation(R.drawable.gif17, buttonCat17); }
    public void startGifAnimationGif18(){ startGifAnimation(R.drawable.gif18, buttonCat18); }
    public void startGifAnimationGif19(){ startGifAnimation(R.drawable.gif19, buttonCat19); }
    public void startGifAnimationGif20(){ startGifAnimation(R.drawable.gif20, buttonCat20); }
    public void startGifAnimationGif21(){ startGifAnimation(R.drawable.gif21, buttonCat21); }
    public void startGifAnimationGif22(){ startGifAnimation(R.drawable.gif22, buttonCat22); }
    public void startGifAnimationGif23(){ startGifAnimation(R.drawable.gif23, buttonCat23); }
    public void startGifAnimationGif24(){ startGifAnimation(R.drawable.gif24, buttonCat24); }
    public void startGifAnimationGif25(){ startGifAnimation(R.drawable.gif25, buttonCat25); }
    public void startGifAnimationGif26(){ startGifAnimation(R.drawable.gif26, buttonCat26); }
    public void startGifAnimationGif27(){ startGifAnimation(R.drawable.gif27, buttonCat27); }
    public void startGifAnimationGif28(){ startGifAnimation(R.drawable.gif28, buttonCat28); }
}
