package com.ss.android.ugc.aweme.legoImp.task.observer_task;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.E4J;
import X.E4L;
import X.E4Q;
import X.E5W;
import X.EnumC35839E4t;
import X.InterfaceC195797mJ;
import X.InterfaceC79713Ax;
import Y.AObserverS74S0100000_6;
import android.content.Context;
import com.ss.android.ugc.aweme.plugin.PluginService;

/* loaded from: classes7.dex */
public final class CohortSubscriptionObserver implements E4J {
    public static final /* synthetic */ int LIZLLL = 0;
    public InterfaceC79713Ax LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(E4L.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(E5W.LJLIL);

    /* loaded from: classes7.dex */
    public interface CohortSubscriptionApi {
        @E4Q
        AbstractC73672Svk<Object> request(@InterfaceC195797mJ String str);
    }

    @Override // X.E4J
    public final void run(Context context) {
        this.LIZ = PluginService.createIPluginServicebyMonsterPlugin(false).backgroundThreadObserveAll(EnumC35839E4t.COHORT_SUBSCRIBE_DATA, new AObserverS74S0100000_6(this, 4));
    }
}
