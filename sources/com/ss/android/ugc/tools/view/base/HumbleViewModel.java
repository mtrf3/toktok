package com.ss.android.ugc.tools.view.base;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class HumbleViewModel extends ViewModel implements GenericLifecycleObserver {
    public boolean destroyed;
    public final LifecycleOwner lifecycleOwner;

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    private final void destroy() {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        onCleared();
    }

    private final void observeLifecycle() {
        Lifecycle lifecycle = this.lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            destroy();
        } else {
            this.lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        destroy();
        this.lifecycleOwner.getLifecycle().removeObserver(this);
    }

    public final boolean isDestroyed() {
        return this.destroyed;
    }

    public HumbleViewModel(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.lifecycleOwner = lifecycleOwner;
        observeLifecycle();
    }
}
