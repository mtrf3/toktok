package com.ss.android.ugc.aweme.ui.util;

import X.C188727au;
import X.FMX;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.analysis.Analysis;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StayTimeFragmentComponent implements GenericLifecycleObserver {
    public final Analysis LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        if (this.LJLILLLLZI != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
            if (currentTimeMillis > 100 && !TextUtils.isEmpty(this.LJLIL.getLabelName())) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("duration", String.valueOf(currentTimeMillis));
                c188727au.LJIIIZ("enter_from", this.LJLIL.getLabelName());
                FMX.LJIIL("stay_time", c188727au.LIZ);
            }
            this.LJLILLLLZI = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (!this.LJLJI) {
            return;
        }
        LIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (!this.LJLJI) {
            return;
        }
        this.LJLILLLLZI = System.currentTimeMillis();
    }

    public StayTimeFragmentComponent(Fragment f, Analysis analysis) {
        o.LJIIIZ(f, "f");
        this.LJLIL = analysis;
        this.LJLILLLLZI = -1L;
        this.LJLJI = true;
        f.getLifecycle().addObserver(this);
    }
}
