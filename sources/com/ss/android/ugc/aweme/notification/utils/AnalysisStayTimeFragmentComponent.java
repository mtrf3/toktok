package com.ss.android.ugc.aweme.notification.utils;

import X.C188727au;
import X.FMX;
import X.InterfaceC45040Hm0;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class AnalysisStayTimeFragmentComponent implements GenericLifecycleObserver {
    public final WeakReference<InterfaceC45040Hm0> LJLILLLLZI;
    public long LJLIL = -1;
    public boolean LJLJI = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final Analysis LIZ() {
        InterfaceC45040Hm0 interfaceC45040Hm0;
        WeakReference<InterfaceC45040Hm0> weakReference = this.LJLILLLLZI;
        if (weakReference == null || (interfaceC45040Hm0 = weakReference.get()) == null) {
            return null;
        }
        return interfaceC45040Hm0.getAnalysis();
    }

    public final void LIZJ() {
        if (this.LJLIL != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
            if (currentTimeMillis > 100 && LIZ() != null && !TextUtils.isEmpty(LIZ().getLabelName())) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("duration", String.valueOf(currentTimeMillis));
                c188727au.LJIIIZ("enter_from", LIZ().getLabelName());
                FMX.LJIIL("stay_time", c188727au.LIZ);
            }
            this.LJLIL = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (!this.LJLJI) {
            return;
        }
        LIZJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (!this.LJLJI) {
            return;
        }
        this.LJLIL = System.currentTimeMillis();
    }

    public AnalysisStayTimeFragmentComponent(AmeBaseFragment ameBaseFragment) {
        if (ameBaseFragment instanceof InterfaceC45040Hm0) {
            this.LJLILLLLZI = new WeakReference<>(ameBaseFragment);
        }
        ameBaseFragment.getLifecycle().addObserver(this);
    }

    public final void LIZIZ(boolean z) {
        boolean z2 = !z;
        this.LJLJI = z2;
        if (z2) {
            this.LJLIL = System.currentTimeMillis();
        } else {
            LIZJ();
        }
    }
}
