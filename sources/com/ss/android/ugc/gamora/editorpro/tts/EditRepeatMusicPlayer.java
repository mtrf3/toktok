package com.ss.android.ugc.gamora.editorpro.tts;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C170666ms;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS44S0100000_8;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes9.dex */
public class EditRepeatMusicPlayer implements GenericLifecycleObserver {
    public MediaPlayer LJLIL;
    public ARunnableS12S0101000_8 LJLILLLLZI;
    public final Handler LJLJI = new Handler(C16880lQ.LLJJJJ());
    public final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS44S0100000_8 LJLJJL = new ARunnableS44S0100000_8(this, 60);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        C170666ms.LIZIZ("stopMusic() called");
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.LJLIL.pause();
            }
            this.LJLIL.stop();
            this.LJLIL.release();
            this.LJLIL = null;
        }
        this.LJLJJI.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJLJI.removeCallbacksAndMessages(null);
        this.LJLJJI.removeCallbacksAndMessages(null);
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.LJLIL.pause();
        }
        this.LJLJJI.removeCallbacksAndMessages(null);
    }

    public final void LIZ(int i) {
        C170666ms.LIZIZ("playMusic() called");
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.LJLIL.pause();
        }
        ARunnableS12S0101000_8 aRunnableS12S0101000_8 = this.LJLILLLLZI;
        if (aRunnableS12S0101000_8 != null) {
            this.LJLJI.removeCallbacks(aRunnableS12S0101000_8);
        }
        this.LJLILLLLZI = new ARunnableS12S0101000_8(i, this, 24);
        this.LJLIL.seekTo(i);
        this.LJLIL.start();
        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = this.LJLJJL;
        if (aRunnableS44S0100000_8 != null) {
            this.LJLJJI.removeCallbacks(aRunnableS44S0100000_8);
        }
        this.LJLJJI.post(this.LJLJJL);
    }

    public EditRepeatMusicPlayer(ActivityC45651qj activityC45651qj, String str) {
        activityC45651qj.getLifecycle().addObserver(this);
        MediaPlayer create = MediaPlayer.create(activityC45651qj, UriProtector.parse(str));
        this.LJLIL = create;
        if (create != null) {
            create.setAudioStreamType(3);
            this.LJLIL.setDisplay(null);
        }
    }
}
