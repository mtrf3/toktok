package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.C59314NPq;
import X.NWV;
import X.NXA;
import X.NXI;
import X.NZQ;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdPopUpWebPageContainer extends NWV implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLL = 0;
    public final LifecycleOwner LJLJJLL;
    public final int LJLJL;
    public boolean LJLJLJ;
    public final boolean LJLJLLL;

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

    public final void LIZ() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZLLL = false;
            adWebStatBusiness.LJ = false;
        }
    }

    public final void LJ() {
        if (!this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = false;
        this.LJLILLLLZI.LIZIZ(this.LJLIL);
        this.LJLJJL.getClass();
        if (this.LJLIL.findViewById(this.LJLJL) != null) {
            DownloadBusiness downloadBusiness = (DownloadBusiness) this.LJLJJL.LIZ(DownloadBusiness.class);
            Activity activity = this.LJLIL;
            int i = downloadBusiness.LJ;
            if (i == 0) {
                i = R.id.r2;
            }
            activity.findViewById(i);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (!this.LJLJLLL) {
            return;
        }
        this.LJLJLJ = false;
        this.LJLILLLLZI.LIZJ(this.LJLIL);
        this.LJLJJL.getClass();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        LJ();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIIZ(false, this.LJLILLLLZI.getWebBackForwardList(), null, null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        System.currentTimeMillis();
        this.LJLILLLLZI.LIZLLL(this.LJLIL);
        this.LJLJJL.LIZIZ.LIZ(WalletBusiness.class).getClass();
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.LJLJJL.LIZ(DownloadBusiness.class);
        if (downloadBusiness != null) {
            downloadBusiness.LJ = this.LJLJL;
            downloadBusiness.LIZ(this.LJLIL, (NXI) this.LJLILLLLZI.LJI(NXI.class));
            this.LJLJLJ = true;
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZLLL = false;
            adWebStatBusiness.LJ = false;
        }
        AdWebStatBusiness adWebStatBusiness2 = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness2 != null) {
            adWebStatBusiness2.LJI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPopUpWebPageContainer(Activity activity, NZQ nzq, NXA iSingleWebViewStatus, C59314NPq c59314NPq, LifecycleOwner lifecycleOwner) {
        super(activity, nzq, iSingleWebViewStatus, c59314NPq);
        o.LJIIIZ(iSingleWebViewStatus, "iSingleWebViewStatus");
        this.LJLJJLL = lifecycleOwner;
        this.LJLJL = R.id.tk;
        nzq.setCrossPlatformActivityContainer(this);
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJLLL = true;
    }
}
