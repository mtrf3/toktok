package com.ss.android.ugc.aweme.account.base;

import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes9.dex */
public class SafeHandler extends Handler implements GenericLifecycleObserver {
    public final LifecycleOwner LJLIL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        removeCallbacksAndMessages(null);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        this.LJLIL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
