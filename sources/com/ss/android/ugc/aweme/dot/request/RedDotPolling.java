package com.ss.android.ugc.aweme.dot.request;

import X.AbstractC73672Svk;
import X.C40405FtR;
import X.C52697KmD;
import X.C73411SrX;
import X.LHD;
import X.LHE;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabRedDotOptimizationSettings;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class RedDotPolling implements GenericLifecycleObserver {
    public static final RedDotPolling LJLIL = new RedDotPolling();
    public static C73411SrX LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onForeground();
        }
    }

    public static void LIZ() {
        if (!((Boolean) C52697KmD.LIZ.getValue()).booleanValue()) {
            return;
        }
        C73411SrX c73411SrX = LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        long j = FriendsTabRedDotOptimizationSettings.LIZ().pollingIntervalSeconds;
        LJLILLLLZI = (C73411SrX) AbstractC73672Svk.LJJIIZI(j, j, TimeUnit.SECONDS).LJJJJZI(C40405FtR.LJLIL);
    }

    public final void LIZIZ() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        LIZ();
        StateOwner.LJLIL.getClass();
        StateOwner.LJLJJLL.observeForever(LHD.LJLIL);
        StateOwner.LJLJJL.observeForever(LHE.LJLIL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onForeground() {
        LIZ();
    }
}
