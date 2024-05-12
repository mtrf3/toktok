package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C26227ARb;
import X.C26231ARf;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoDismissPermissionDialog implements GenericLifecycleObserver {
    public final ActivityC45651qj LJLIL;
    public final C26227ARb LJLILLLLZI;
    public C26231ARf LJLJI;
    public AbstractC65781Prl LJLJJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        }
    }

    public final boolean LIZ() {
        ICreativeSAAService LIZ;
        Lifecycle activityGetLifecycleSafely;
        if (this.LJLJI != null || (LIZ = SAAService.LIZ()) == null || (activityGetLifecycleSafely = LIZ.activityGetLifecycleSafely(this.LJLIL)) == null) {
            return false;
        }
        activityGetLifecycleSafely.addObserver(this);
        this.LJLILLLLZI.LIZJ(new AqS138S0200000_7(this, activityGetLifecycleSafely, 27));
        SAAService.LIZ().invokeMethodsSafely(this.LJLIL, new AqS157S0100000_7(this, 291));
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        C26231ARf c26231ARf = this.LJLJI;
        if (c26231ARf != null) {
            c26231ARf.LIZIZ(null);
        }
    }

    public AutoDismissPermissionDialog(ActivityC45651qj activity, C26227ARb c26227ARb) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = c26227ARb;
    }
}
