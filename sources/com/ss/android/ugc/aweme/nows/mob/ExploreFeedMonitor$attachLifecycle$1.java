package com.ss.android.ugc.aweme.nows.mob;

import X.ActivityC45651qj;
import X.C197397ot;
import X.C53976LGi;
import X.C7MK;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import kotlin.jvm.internal.AqS15S0000100_3;

/* loaded from: classes4.dex */
public final class ExploreFeedMonitor$attachLifecycle$1 implements GenericLifecycleObserver {
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
        if (C197397ot.LJLIL > 0) {
            C7MK.LJII("stay_time", new AqS15S0000100_3(System.currentTimeMillis() - C197397ot.LJLIL, 5));
            C197397ot.LJLIL = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        boolean z;
        IFriendsTabLayoutAbility LIZJ;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null && (LIZJ = C53976LGi.LIZJ(LIZLLL)) != null) {
            z = LIZJ.ma("SOCIAL_EXPLORE");
        } else {
            z = false;
        }
        if (C197397ot.LJLIL < 0 && z) {
            C197397ot.LJLIL = System.currentTimeMillis();
        }
    }
}
