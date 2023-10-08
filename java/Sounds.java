package com.app.teste;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
public class Sounds {
    private SoundPool soundPool;
    private int audio1, audio2, audio3, audio4, audio5, audio6, audio7, audio8, audio9, audio10;
    private int audio11, audio12, audio13, audio14, audio15, audio16, audio17, audio18, audio19;
    private int audio20, audio21, audio22, audio23, audio24, audio25, audio26, audio27, audio28;

    public Sounds(Context context) {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        audio1 = soundPool.load(context, R.raw.audio1_do, 1);
        audio2 = soundPool.load(context, R.raw.audio2_dos, 1);
        audio3 = soundPool.load(context, R.raw.audio3_re, 1);
        audio4 = soundPool.load(context, R.raw.audio4_res, 1);
        audio5 = soundPool.load(context, R.raw.audio5_mi, 1);
        audio6 = soundPool.load(context, R.raw.audio6_fa, 1);
        audio7 = soundPool.load(context, R.raw.audio7_fas, 1);
        audio8 = soundPool.load(context, R.raw.audio8_sol, 1);
        audio9 = soundPool.load(context, R.raw.audio9_sols, 1);
        audio10 = soundPool.load(context, R.raw.audio10_la, 1);
        audio11 = soundPool.load(context, R.raw.audio11_las, 1);
        audio12 = soundPool.load(context, R.raw.audio12_si, 1);
        audio13 = soundPool.load(context, R.raw.audio13_do, 1);
        audio14 = soundPool.load(context, R.raw.audio14_dos, 1);
        audio15 = soundPool.load(context, R.raw.audio15_re, 1);
        audio16 = soundPool.load(context, R.raw.audio16_res, 1);
        audio17 = soundPool.load(context, R.raw.audio17_mi, 1);
        audio18 = soundPool.load(context, R.raw.audio18_fa, 1);
        audio19 = soundPool.load(context, R.raw.audio19_fas, 1);
        audio20 = soundPool.load(context, R.raw.audio20_sol, 1);
        audio21 = soundPool.load(context, R.raw.audio21_sols, 1);
        audio22 = soundPool.load(context, R.raw.audio22_la, 1);
        audio23 = soundPool.load(context, R.raw.audio23_las, 1);
        audio24 = soundPool.load(context, R.raw.audio24_si, 1);
        audio25 = soundPool.load(context, R.raw.audio25_do, 1);
        audio26 = soundPool.load(context, R.raw.audio26_dos, 1);
        audio27 = soundPool.load(context, R.raw.audio27_re, 1);
        audio28 = soundPool.load(context, R.raw.audio28_res, 1);
    }
  
    public void playSound(int soundId) {
        this.soundPool.play(soundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void audio1() {
        playSound(this.audio1);
    }
    public void audio2() {
        playSound(this.audio2);
    }
    public void audio3() {
        playSound(this.audio3);
    }
    public void audio4() {
        playSound(this.audio4);
    }
    public void audio5() {
        playSound(this.audio5);
    }
    public void audio6() {
        playSound(this.audio6);
    }
    public void audio7() {
        playSound(this.audio7);
    }
    public void audio8() {
        playSound(this.audio8);
    }
    public void audio9() {
        playSound(this.audio9);
    }
    public void audio10() {
        playSound(this.audio10);
    }
    public void audio11() {
        playSound(this.audio11);
    }
    public void audio12() {
        playSound(this.audio12);
    }
    public void audio13() {
        playSound(this.audio13);
    }
    public void audio14() {
        playSound(this.audio14);
    }
    public void audio15() {
        playSound(this.audio15);
    }
    public void audio16() {
        playSound(this.audio16);
    }
    public void audio17() {
        playSound(this.audio17);
    }
    public void audio18() {
        playSound(this.audio18);
    }
    public void audio19() {
        playSound(this.audio19);
    }
    public void audio20() {
        playSound(this.audio20);
    }
    public void audio21() {
        playSound(this.audio21);
    }
    public void audio22() {
        playSound(this.audio22);
    }
    public void audio23() {
        playSound(this.audio23);
    }
    public void audio24() {
        playSound(this.audio24);
    }
    public void audio25() {
        playSound(this.audio25);
    }
    public void audio26() {
        playSound(this.audio26);
    }
    public void audio27() {
        playSound(this.audio27);
    }
    public void audio28() {
        playSound(this.audio28);
    }
}
