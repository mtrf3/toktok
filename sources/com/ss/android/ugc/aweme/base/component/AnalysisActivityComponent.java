package com.ss.android.ugc.aweme.base.component;

import X.C10K;
import X.C99533vR;
import X.FMX;
import X.InterfaceC45040Hm0;
import Y.ACallableS19S0100100_7;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class AnalysisActivityComponent implements GenericLifecycleObserver {
    public long LJLIL;
    public final WeakReference<InterfaceC45040Hm0> LJLILLLLZI;
    public final Activity LJLJI;

    public final void onPause() {
        if (this.LJLIL != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
            if (currentTimeMillis > 0) {
                C10K.LIZIZ(new ACallableS19S0100100_7(currentTimeMillis, this, 5), FMX.LIZIZ(), null);
            }
            this.LJLIL = -1L;
        }
    }

    public AnalysisActivityComponent(Fragment fragment) {
        this.LJLJI = fragment.mo49getActivity();
        if (fragment instanceof InterfaceC45040Hm0) {
            this.LJLILLLLZI = new WeakReference<>(fragment);
        }
    }

    public AnalysisActivityComponent(Activity activity) {
        this.LJLJI = activity;
        if (activity instanceof InterfaceC45040Hm0) {
            this.LJLILLLLZI = new WeakReference<>(activity);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C99533vR.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            onPause();
            return;
        }
        this.LJLIL = System.currentTimeMillis();
    }
}
