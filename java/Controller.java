package com.app.teste;
import android.media.MediaDrm;
import android.view.View;
public class Controller {
    private Views views;
    private Sounds sound;

    public Controller(Views views, Sounds sound) {
        this.views = views;
        this.sound = sound;
        initController();
    }
    private void initController() {
        views.setButtonListenerGif1( new ActionListenerGif1() );
        views.setButtonListenerGif2( new ActionListenerGif2() );
        views.setButtonListenerGif3( new ActionListenerGif3() );
        views.setButtonListenerGif4( new ActionListenerGif4() );
        views.setButtonListenerGif5( new ActionListenerGif5() );
        views.setButtonListenerGif6( new ActionListenerGif6() );
        views.setButtonListenerGif7( new ActionListenerGif7() );
        views.setButtonListenerGif8( new ActionListenerGif8() );
        views.setButtonListenerGif9( new ActionListenerGif9() );
        views.setButtonListenerGif10( new ActionListenerGif10() );
        views.setButtonListenerGif11( new ActionListenerGif11() );
        views.setButtonListenerGif12( new ActionListenerGif12() );
        views.setButtonListenerGif13( new ActionListenerGif13() );
        views.setButtonListenerGif14( new ActionListenerGif14() );
        views.setButtonListenerGif15( new ActionListenerGif15() );
        views.setButtonListenerGif16( new ActionListenerGif16() );
        views.setButtonListenerGif17( new ActionListenerGif17() );
        views.setButtonListenerGif18( new ActionListenerGif18() );
        views.setButtonListenerGif19( new ActionListenerGif19() );
        views.setButtonListenerGif20( new ActionListenerGif20() );
        views.setButtonListenerGif21( new ActionListenerGif21() );
        views.setButtonListenerGif22( new ActionListenerGif22() );
        views.setButtonListenerGif23( new ActionListenerGif23() );
        views.setButtonListenerGif24( new ActionListenerGif24() );
        views.setButtonListenerGif25( new ActionListenerGif25() );
        views.setButtonListenerGif26( new ActionListenerGif26() );
        views.setButtonListenerGif27( new ActionListenerGif27() );
        views.setButtonListenerGif28( new ActionListenerGif28() );
        //layoutExit.onBackPressed();
    }
    private class ActionListenerGif1 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif1();
            sound.audio1();
        }
    }
    private class ActionListenerGif2 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif2();
            sound.audio2();
        }
    }
    private class ActionListenerGif3 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif3();
            sound.audio3();
        }
    }
    private class ActionListenerGif4 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif4();
            sound.audio4();
        }
    }
    private class ActionListenerGif5 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif5();
            sound.audio5();
        }
    }
    private class ActionListenerGif6 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif6();
            sound.audio6();
        }
    }
    private class ActionListenerGif7 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif7();
            sound.audio7();
        }
    }
    private class ActionListenerGif8 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif8();
            sound.audio8();
        }
    }
    private class ActionListenerGif9 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif9();
            sound.audio9();
        }
    }
    private class ActionListenerGif10 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif10();
            sound.audio10();
        }
    }
    private class ActionListenerGif11 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif11();
            sound.audio11();
        }
    }
    private class ActionListenerGif12 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif12();
            sound.audio12();
        }
    }
    private class ActionListenerGif13 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif13();
            sound.audio13();
        }
    }
    private class ActionListenerGif14 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif14();
            sound.audio14();
        }
    }
    private class ActionListenerGif15 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif15();
            sound.audio15();
        }
    }
    private class ActionListenerGif16 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif16();
            sound.audio16();
        }
    }
    private class ActionListenerGif17 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif17();
            sound.audio17();
        }
    }
    private class ActionListenerGif18 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif18();
            sound.audio18();
        }
    }
    private class ActionListenerGif19 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif19();
            sound.audio19();
        }
    }
    private class ActionListenerGif20 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif20();
            sound.audio20();
        }
    }
    private class ActionListenerGif21 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif21();
            sound.audio21();
        }
    }
    private class ActionListenerGif22 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif22();
            sound.audio22();
        }
    }
    private class ActionListenerGif23 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif23();
            sound.audio23();
        }
    }
    private class ActionListenerGif24 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif24();
            sound.audio24();
        }
    }
    private class ActionListenerGif25 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif25();
            sound.audio25();
        }
    }
    private class ActionListenerGif26 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif26();
            sound.audio26();
        }
    }
    private class ActionListenerGif27 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif27();
            sound.audio27();
        }
    }
    private class ActionListenerGif28 implements View.OnClickListener{
        @Override
        public void onClick( View v ){
            views.startGifAnimationGif28();
            sound.audio28();
        }
    }
}
