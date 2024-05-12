package com.ss.android.ugc.aweme.sticker.tabguide;

import X.T4Q;
import X.T4R;
import X.TGR;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes13.dex */
public final class DefaultStickerTabGuidePresenter implements GenericLifecycleObserver, LifecycleObserver, TGR {
    @Override // X.TGR
    public final void LIZ(T4Q t4q) {
    }

    @Override // X.TGR
    public final void LIZIZ(T4R t4r) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }
}
