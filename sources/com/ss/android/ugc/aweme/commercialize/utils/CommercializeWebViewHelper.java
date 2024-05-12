package com.ss.android.ugc.aweme.commercialize.utils;

import X.C169696lJ;
import X.C59314NPq;
import X.FMX;
import X.NWV;
import X.NX2;
import X.NXI;
import X.NZQ;
import X.NZX;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness;

/* loaded from: classes11.dex */
public class CommercializeWebViewHelper extends NWV implements GenericLifecycleObserver {
    public final LifecycleOwner LJLJJLL;
    public long LJLJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.LJLILLLLZI.onCreate(this.LJLIL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJLILLLLZI.LIZJ(this.LJLIL);
        this.LJLJJL.getClass();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIIZ(true, this.LJLILLLLZI.getWebBackForwardList(), ((NXI) this.LJLILLLLZI.LJI(NXI.class)).LIZ(), null);
        }
        this.LJLJJLL.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.LJLILLLLZI.LIZIZ(this.LJLIL);
        this.LJLJJL.getClass();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIIZ(false, this.LJLILLLLZI.getWebBackForwardList(), null, null);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJL;
        this.LJLJL = 0L;
        FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
        NX2 nx2 = (NX2) CrossPlatformLegacyServiceImpl.LJIJ().LJIILL(NX2.class, this.LJLJJL);
        if (nx2 != null) {
            nx2.LIZIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        this.LJLILLLLZI.LIZLLL(this.LJLIL);
        this.LJLJJL.LIZIZ.LIZ(WalletBusiness.class).getClass();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZLLL = false;
            adWebStatBusiness.LJ = false;
        }
        this.LJLJL = System.currentTimeMillis();
        NX2 nx2 = (NX2) CrossPlatformLegacyServiceImpl.LJIJ().LJIILL(NX2.class, this.LJLJJL);
        if (nx2 != null) {
            this.LJLILLLLZI.LJI(NXI.class);
            nx2.LIZ();
        }
    }

    public CommercializeWebViewHelper(Activity activity, NZQ nzq, NZX nzx, C59314NPq c59314NPq, LifecycleOwner lifecycleOwner) {
        super(activity, nzq, nzx, c59314NPq);
        nzq.setCrossPlatformActivityContainer(this);
        this.LJLJJLL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
