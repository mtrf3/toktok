package com.ss.android.ugc.aweme.nows.mob;

import X.C194157jf;
import X.C197387os;
import X.C7XD;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowFeedMonitor$attachLifecycle$1 implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        C7XD.LIZ("NowFeedMonitor", "now tab onPause");
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_inbox", !o.LJ(null, C194157jf.LIZ));
        C197387os.LIZIZ(bundle);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        boolean z;
        C7XD.LIZ("NowFeedMonitor", "now tab onResume");
        IFriendsTabLayoutAbility LIZLLL = C197387os.LIZLLL();
        if (LIZLLL != null) {
            z = LIZLLL.ma("SOCIAL_NOWS");
        } else {
            z = false;
        }
        if (C197387os.LJLJJL == -1 && z) {
            C197387os.LJLJJL = System.currentTimeMillis();
        }
    }
}
