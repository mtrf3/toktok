package com.ss.android.ugc.aweme.base.component;

import X.C16880lQ;
import X.C55406Loo;
import X.X1D;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ExploreStayTimeFragmentComponent implements GenericLifecycleObserver {
    public final Fragment LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        if (!o.LJ("homepage_explore", this.LJLILLLLZI) || this.LJLJJI <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((char) 12304);
        LIZ.append(C16880lQ.LJLLJ(this.LJLIL.getClass()));
        LIZ.append("】report stay_time, delta: ");
        LIZ.append(elapsedRealtime);
        LIZ.append(", enterFrom:");
        LIZ.append(this.LJLILLLLZI);
        X1D.LIZIZ(LIZ);
        C55406Loo c55406Loo = new C55406Loo();
        c55406Loo.LJJL = String.valueOf(elapsedRealtime);
        c55406Loo.LIZLLL = this.LJLILLLLZI;
        c55406Loo.LJJLIIJ = this.LJLJI;
        c55406Loo.LJIILIIL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LJLJJL) {
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLJJL) {
            this.LJLJJI = SystemClock.elapsedRealtime();
        }
    }

    public ExploreStayTimeFragmentComponent(Fragment fragment, String str, String str2) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = -1L;
        this.LJLJJL = true;
        fragment.getLifecycle().addObserver(this);
    }
}
