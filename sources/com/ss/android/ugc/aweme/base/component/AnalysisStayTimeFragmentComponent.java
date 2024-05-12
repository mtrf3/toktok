package com.ss.android.ugc.aweme.base.component;

import X.C10K;
import X.FMX;
import X.InterfaceC45040Hm0;
import X.InterfaceC55407Lop;
import Y.ACallableS20S0100100_9;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.analysis.Analysis;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public class AnalysisStayTimeFragmentComponent implements GenericLifecycleObserver {
    public long LJLIL = -1;
    public final WeakReference<InterfaceC45040Hm0> LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC55407Lop LJLJJI;

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

    public final void LIZIZ() {
        if (this.LJLIL != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
            if (currentTimeMillis > 100 && LIZ() != null && !TextUtils.isEmpty(LIZ().getLabelName())) {
                C10K.LIZIZ(new ACallableS20S0100100_9(currentTimeMillis, this, 0), FMX.LIZIZ(), null);
            }
            this.LJLIL = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (!this.LJLJI) {
            return;
        }
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (!this.LJLJI) {
            return;
        }
        this.LJLIL = System.currentTimeMillis();
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.LJLJI = z;
        if (fragment instanceof InterfaceC45040Hm0) {
            this.LJLILLLLZI = new WeakReference<>(fragment);
        }
        fragment.getLifecycle().addObserver(this);
    }
}
