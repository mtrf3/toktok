package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import X.C102073zX;
import X.C3PX;
import X.C3PY;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class AbsReadStateDelegate extends Handler implements C3PY {
    public final C102073zX LJLIL;

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C3PX.onCreate(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C3PX.onDestroy(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C3PX.onPause(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C3PX.onResume(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C3PX.onStart(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C3PX.onStop(this);
    }

    public AbsReadStateDelegate(C102073zX dataCenter) {
        o.LJIIIZ(dataCenter, "dataCenter");
        this.LJLIL = dataCenter;
    }
}
