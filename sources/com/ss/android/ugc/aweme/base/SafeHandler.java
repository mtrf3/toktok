package com.ss.android.ugc.aweme.base;

import X.C145665ne;
import X.C16880lQ;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes3.dex */
public class SafeHandler extends Handler implements GenericLifecycleObserver {
    public final LifecycleOwner LJLIL;

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        super(C16880lQ.LLJJJJ());
        this.LJLIL = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C145665ne.LIZ[event.ordinal()] != 1) {
            return;
        }
        removeCallbacksAndMessages(null);
        LifecycleOwner lifecycleOwner2 = this.LJLIL;
        if (lifecycleOwner2 == null) {
            return;
        }
        lifecycleOwner2.getLifecycle().removeObserver(this);
    }
}
