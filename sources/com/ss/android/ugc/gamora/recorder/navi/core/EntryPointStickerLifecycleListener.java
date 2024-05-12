package com.ss.android.ugc.gamora.recorder.navi.core;

import X.C72709SgD;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bef.effectsdk.message.MessageCenter;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class EntryPointStickerLifecycleListener extends C72709SgD implements GenericLifecycleObserver {
    public final Lifecycle LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLILLLLZI.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LJLIL.invoke(Boolean.FALSE);
        MessageCenter.removeListener(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
    }

    public EntryPointStickerLifecycleListener(Lifecycle lifecycle, AqS178S0100000_12 aqS178S0100000_12) {
        super(aqS178S0100000_12);
        this.LJLILLLLZI = lifecycle;
    }
}
