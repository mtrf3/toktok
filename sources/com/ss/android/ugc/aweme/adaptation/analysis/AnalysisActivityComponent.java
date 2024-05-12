package com.ss.android.ugc.aweme.adaptation.analysis;

import X.C10K;
import X.FMX;
import X.G90;
import X.GBU;
import Y.ACallableS19S0100100_7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class AnalysisActivityComponent implements GenericLifecycleObserver {
    public long LJLIL;
    public final WeakReference<G90> LJLILLLLZI;
    public final LifecycleOwner LJLJI;

    public final Analysis LIZ() {
        G90 g90;
        WeakReference<G90> weakReference = this.LJLILLLLZI;
        if (weakReference == null || (g90 = weakReference.get()) == null) {
            return null;
        }
        return g90.getAnalysis();
    }

    public AnalysisActivityComponent(LifecycleOwner lifecycleOwner, G90 g90) {
        this.LJLJI = lifecycleOwner;
        this.LJLILLLLZI = new WeakReference<>(g90);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (lifecycleOwner != this.LJLJI) {
            return;
        }
        int i = GBU.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2 || this.LJLIL == -1) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
            if (LIZ() != null && currentTimeMillis > LIZ().getMinValidStayDuration()) {
                C10K.LIZIZ(new ACallableS19S0100100_7(currentTimeMillis, this, 3), FMX.LIZIZ(), null);
            }
            this.LJLIL = -1L;
            return;
        }
        this.LJLIL = System.currentTimeMillis();
    }
}
