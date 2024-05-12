package com.ss.android.ugc.aweme.commercialize.utils;

import X.ActivityC45651qj;
import X.C113504cs;
import X.C169696lJ;
import X.C232659Bd;
import X.C2U8;
import X.C59284NOm;
import X.C59391NSp;
import X.FMX;
import X.NTB;
import X.NTC;
import X.NTD;
import X.NWF;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class AdPopUpWebPageHelper implements GenericLifecycleObserver {
    public static final Map<Integer, AdPopUpWebPageHelper> LJLL = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLILLLLZI;
    public long LJLJI;
    public final WeakReference<ActivityC45651qj> LJLJJI;
    public NWF LJLJJL;
    public boolean LJLJJLL;
    public final NTB LJLJL;
    public final NTD LJLJLJ;
    public final NTC LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final ActivityC45651qj LIZIZ() {
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        NWF nwf = this.LJLJJL;
        if (nwf != null && nwf.LJIIJJI() && !this.LJLJJLL) {
            C2U8.LIZ(new C232659Bd());
        }
        this.LJLJI = System.currentTimeMillis();
    }

    public final Aweme LIZ() {
        C59284NOm LIZ = C113504cs.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIL;
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ActivityC45651qj LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        C59391NSp.LIZ(LIZIZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJI;
        if (this.LJLJJL == null) {
            return;
        }
        FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
    }

    public AdPopUpWebPageHelper(ActivityC45651qj activityC45651qj) {
        this.LJLJJI = new WeakReference<>(activityC45651qj);
        activityC45651qj.getLifecycle().addObserver(this);
        this.LJLJL = new NTB(this);
        this.LJLJLJ = new NTD(this);
        this.LJLJLLL = new NTC(this);
    }
}
