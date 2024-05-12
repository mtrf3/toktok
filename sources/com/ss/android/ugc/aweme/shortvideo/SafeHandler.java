package com.ss.android.ugc.aweme.shortvideo;

import X.C16880lQ;
import X.GGF;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes8.dex */
public class SafeHandler extends Handler implements GenericLifecycleObserver {
    public final LifecycleOwner LJLIL;

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        super(C16880lQ.LLJJJJ());
        this.LJLIL = lifecycleOwner;
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(7, this, 19);
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            post(iDRunnableS6S0101000);
        } else {
            iDRunnableS6S0101000.run();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (GGF.LIZ[event.ordinal()] != 1) {
            return;
        }
        removeCallbacksAndMessages(null);
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(9, this, 4);
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            post(iDRunnableS6S0101000);
        } else {
            iDRunnableS6S0101000.run();
        }
    }
}
