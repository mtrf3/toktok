package com.ss.android.ugc.aweme.bullet.module.base;

import X.C59551NYt;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes11.dex */
public class CommonBizActivityDelegate extends C59551NYt implements GenericLifecycleObserver {
    public Activity LJLIL;

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            LJFF(activity, null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            LIZJ(activity);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            LIZIZ(activity);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            LIZLLL(activity);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            LJII(activity);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            LJ(activity);
        }
    }
}
