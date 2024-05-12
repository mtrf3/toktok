package com.ss.android.ugc.aweme.music.ui.reuseaudio;

import X.C84908XUa;
import X.XU2;
import X.XUR;
import X.XUS;
import X.XUT;
import X.XUV;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ReuseAudioPlayer implements GenericLifecycleObserver {
    public final XU2 LJLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LJLIL.isPlaying()) {
            this.LJLIL.pause();
        }
        this.LJLIL.release();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.LJLIL.isPlaying()) {
            this.LJLIL.pause();
        }
    }

    public ReuseAudioPlayer(LifecycleOwner lifecycleOwner, C84908XUa c84908XUa) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        lifecycleOwner.getLifecycle().addObserver(this);
        XU2 xu2 = new XU2("ReuseAudioDetailFragment");
        this.LJLIL = xu2;
        xu2.LIZJ(new XUR(c84908XUa));
        xu2.LJFF(new XUS(c84908XUa));
        xu2.LIZIZ(new XUT(c84908XUa));
        xu2.LJ(new XUV(c84908XUa));
    }
}
