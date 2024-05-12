package com.ss.android.ugc.aweme.crossplatform.activity;

import X.C58149Mrx;
import X.C59314NPq;
import X.NXI;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class MainMixActivityContainer extends MixActivityContainer {
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer, com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer, X.InterfaceC59569NZl
    public final void LJ() {
        ShareH5Service.LIZ.getClass();
        C58149Mrx.LIZ().LJJ(this.LJLJJL, this.LJLJJLL.getCurrentUrl(), 1);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIFFI() {
        ((DownloadBusiness) this.LJLJJL.LIZ(DownloadBusiness.class)).LIZ(this.LJLIL, (NXI) this.LJLJJLL.LJI(NXI.class));
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIJL() {
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.LJLJJL.LIZ(DownloadBusiness.class);
        Activity activity = this.LJLIL;
        int i = downloadBusiness.LJ;
        if (i == 0) {
            i = R.id.r2;
        }
        activity.findViewById(i);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIIJZLJL() {
        if (LJIIJ()) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIJJI(this.LJLJJL, ((NXI) this.LJLJJLL.LJI(NXI.class)).LIZ(), 2);
        } else {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIJJ(this.LJLJJL, 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIIZ() {
        if (LJIIJ()) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIJJI(this.LJLJJL, ((NXI) this.LJLJJLL.LJI(NXI.class)).LIZ(), 1);
        } else {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIJJ(this.LJLJJL, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIJIIJI(Boolean bool) {
        if (bool.booleanValue()) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIJJLI(this.LJLJJL, ((NXI) this.LJLJJLL.LJI(NXI.class)).LIZ(), 2);
        } else {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIJJLI(this.LJLJJL, ((NXI) this.LJLJJLL.LJI(NXI.class)).LIZ(), 1);
        }
    }

    public MainMixActivityContainer(Activity activity, C59314NPq c59314NPq) {
        super(activity, c59314NPq);
    }
}
