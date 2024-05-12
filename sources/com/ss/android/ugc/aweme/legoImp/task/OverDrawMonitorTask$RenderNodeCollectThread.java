package com.ss.android.ugc.aweme.legoImp.task;

import X.C16880lQ;
import Y.ARunnableS44S0100000_8;
import Y.IDHandlerS21S0100000_8;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes9.dex */
public final class OverDrawMonitorTask$RenderNodeCollectThread extends HandlerThread implements GenericLifecycleObserver {
    public IDHandlerS21S0100000_8 LJLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onAppBackground();
        } else if (event == Lifecycle.Event.ON_START) {
            onAppForeground();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onAppBackground() {
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = this.LJLIL;
        if (iDHandlerS21S0100000_8 != null) {
            iDHandlerS21S0100000_8.removeCallbacksAndMessages(null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onAppForeground() {
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = this.LJLIL;
        if (iDHandlerS21S0100000_8 != null) {
            iDHandlerS21S0100000_8.sendEmptyMessage(0);
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 23));
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = new IDHandlerS21S0100000_8(this, getLooper(), 1);
        iDHandlerS21S0100000_8.sendEmptyMessage(0);
        this.LJLIL = iDHandlerS21S0100000_8;
    }

    @Override // android.os.HandlerThread
    public final boolean quit() {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = this.LJLIL;
        if (iDHandlerS21S0100000_8 != null) {
            iDHandlerS21S0100000_8.removeCallbacksAndMessages(null);
        }
        this.LJLIL = null;
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public final boolean quitSafely() {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = this.LJLIL;
        if (iDHandlerS21S0100000_8 != null) {
            iDHandlerS21S0100000_8.removeCallbacksAndMessages(null);
        }
        this.LJLIL = null;
        return super.quitSafely();
    }
}
