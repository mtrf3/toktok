package com.ss.android.ugc.aweme.live;

import X.C60520Np6;
import X.C60525NpB;
import android.os.HandlerThread;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class LivePlayActivityObserver implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        HandlerThread handlerThread = C60525NpB.LIZ;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            C60525NpB.LIZ = null;
        }
        HandlerThread handlerThread2 = new HandlerThread("watch_live_timer");
        C60525NpB.LIZ = handlerThread2;
        handlerThread2.start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        synchronized (C60520Np6.LIZ) {
            C60520Np6.LIZIZ.clear();
        }
        HandlerThread handlerThread = C60525NpB.LIZ;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        C60525NpB.LIZ = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        synchronized (C60520Np6.LIZ) {
            Iterator<Runnable> it = C60520Np6.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            C60520Np6.LIZIZ.clear();
        }
    }
}
