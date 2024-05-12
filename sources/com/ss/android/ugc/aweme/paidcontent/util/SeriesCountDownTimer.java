package com.ss.android.ugc.aweme.paidcontent.util;

import X.C65652ht;
import X.XKQ;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SeriesCountDownTimer implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLJI = 0;
    public XKQ LJLIL;
    public C65652ht LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        XKQ xkq = this.LJLIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLIL = null;
    }

    public SeriesCountDownTimer(LifecycleRegistry lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        lifecycle.addObserver(this);
    }
}
