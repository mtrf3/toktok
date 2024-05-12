package com.ss.android.ugc.aweme.im.sdk.activitystatus.lifecycleowner;

import X.C16880lQ;
import X.C4RI;
import X.C57434MgQ;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActivityStatusLifecycleOwner implements LifecycleOwner {
    public final Activity LJLIL;
    public final LifecycleRegistry LJLILLLLZI = new LifecycleRegistry(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return this.LJLILLLLZI;
    }

    public ActivityStatusLifecycleOwner(Activity activity) {
        LifecycleOwner LIZIZ;
        Lifecycle lifecycle;
        this.LJLIL = activity;
        if (activity != null && (LIZIZ = C57434MgQ.LIZIZ(activity)) != null && (lifecycle = LIZIZ.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.activitystatus.lifecycleowner.ActivityStatusLifecycleOwner.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    int i = C4RI.LIZ[event.ordinal()];
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            return;
                        }
                        ActivityStatusLifecycleOwner.this.LIZ(true);
                        return;
                    }
                    ActivityStatusLifecycleOwner.this.LIZ(false);
                }
            });
        }
    }

    public final void LIZ(boolean z) {
        LifecycleOwner LIZIZ;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        if (this.LJLILLLLZI.getCurrentState() == Lifecycle.State.INITIALIZED) {
            if (z) {
                return;
            }
        } else if (z) {
            this.LJLILLLLZI.setCurrentState(Lifecycle.State.DESTROYED);
        }
        Activity activity = this.LJLIL;
        if (activity == null || (LIZIZ = C57434MgQ.LIZIZ(activity)) == null || (lifecycle = LIZIZ.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null) {
            return;
        }
        Lifecycle.State state = Lifecycle.State.RESUMED;
        if (C16880lQ.LLJJIJIL(currentState, state) >= 0) {
            this.LJLILLLLZI.setCurrentState(state);
            return;
        }
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (C16880lQ.LLJJIJIL(currentState, state2) <= 0) {
            return;
        }
        this.LJLILLLLZI.setCurrentState(state2);
    }
}
