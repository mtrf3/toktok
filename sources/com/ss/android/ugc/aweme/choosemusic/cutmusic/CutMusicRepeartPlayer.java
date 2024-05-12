package com.ss.android.ugc.aweme.choosemusic.cutmusic;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.XV8;
import X.XV9;
import Y.ARunnableS19S0101000_15;
import Y.ARunnableS51S0100000_15;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes16.dex */
public class CutMusicRepeartPlayer implements GenericLifecycleObserver {
    public MediaPlayer LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public ARunnableS19S0101000_15 LJLJJI;
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS51S0100000_15 LJLJJLL = new ARunnableS51S0100000_15(this, 26);
    public XV9 LJLJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            resume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            pause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.LJLIL.pause();
            }
            this.LJLIL.stop();
            this.LJLIL.release();
            this.LJLIL = null;
        }
        this.LJLJJL.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJLJJL.removeCallbacksAndMessages(null);
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.LJLIL.pause();
        }
        this.LJLJJL.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            this.LJLIL.start();
        }
        this.LJLJJL.post(this.LJLJJLL);
        this.LJLJJL.post(this.LJLJJI);
    }

    public final void LIZ(int i) {
        this.LJLILLLLZI = i;
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.LJLIL.pause();
        }
        ARunnableS19S0101000_15 aRunnableS19S0101000_15 = this.LJLJJI;
        if (aRunnableS19S0101000_15 != null) {
            this.LJLJJL.removeCallbacks(aRunnableS19S0101000_15);
        }
        this.LJLJJI = new ARunnableS19S0101000_15(this, i, 6);
        this.LJLIL.seekTo(i);
        this.LJLJJL.postDelayed(this.LJLJJI, this.LJLJI);
        this.LJLIL.start();
        ARunnableS51S0100000_15 aRunnableS51S0100000_15 = this.LJLJJLL;
        if (aRunnableS51S0100000_15 != null) {
            this.LJLJJL.removeCallbacks(aRunnableS51S0100000_15);
        }
        this.LJLJJL.post(this.LJLJJLL);
    }

    public CutMusicRepeartPlayer(ActivityC45651qj activityC45651qj, String str, int i, Fragment fragment) {
        this.LJLJI = i;
        fragment.getLifecycle().addObserver(this);
        MediaPlayer create = MediaPlayer.create(activityC45651qj, UriProtector.parse(str));
        this.LJLIL = create;
        if (create != null) {
            create.setAudioStreamType(3);
            this.LJLIL.setDisplay(null);
            this.LJLIL.setOnCompletionListener(new XV8(this));
        }
    }
}
