package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import X.C16880lQ;
import X.C170666ms;
import X.C82182WNe;
import X.WM7;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS50S0100000_14;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes15.dex */
public class RepeatMusicPlayer implements GenericLifecycleObserver {
    public MediaPlayer LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public ARunnableS18S0101000_14 LJLJJI;
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS50S0100000_14 LJLJL = new ARunnableS50S0100000_14(this, 86);
    public WM7 LJLJLJ;

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
        this.LJLJJLL.removeCallbacksAndMessages(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJLJJL.removeCallbacksAndMessages(null);
        this.LJLJJLL.removeCallbacksAndMessages(null);
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.LJLIL.pause();
        }
        this.LJLJJLL.removeCallbacksAndMessages(null);
    }

    public final void LIZ(int i) {
        this.LJLILLLLZI = i;
        C170666ms.LIZIZ("playMusic() called");
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.LJLIL.pause();
        }
        ARunnableS18S0101000_14 aRunnableS18S0101000_14 = this.LJLJJI;
        if (aRunnableS18S0101000_14 != null) {
            this.LJLJJL.removeCallbacks(aRunnableS18S0101000_14);
        }
        this.LJLJJI = new ARunnableS18S0101000_14(i, this, 25);
        this.LJLIL.seekTo(i);
        this.LJLJJL.postDelayed(this.LJLJJI, this.LJLJI);
        this.LJLIL.start();
        ARunnableS50S0100000_14 aRunnableS50S0100000_14 = this.LJLJL;
        if (aRunnableS50S0100000_14 != null) {
            this.LJLJJLL.removeCallbacks(aRunnableS50S0100000_14);
        }
        this.LJLJJLL.post(this.LJLJL);
    }

    public RepeatMusicPlayer(int i, WM7 wm7, String str) {
        this.LJLJI = i;
        wm7.getLifecycle().addObserver(this);
        MediaPlayer create = MediaPlayer.create(wm7.requireSceneContext(), UriProtector.parse(str));
        this.LJLIL = create;
        if (create != null) {
            create.setAudioStreamType(3);
            this.LJLIL.setDisplay(null);
            this.LJLIL.setOnCompletionListener(new C82182WNe(this));
        }
    }
}
