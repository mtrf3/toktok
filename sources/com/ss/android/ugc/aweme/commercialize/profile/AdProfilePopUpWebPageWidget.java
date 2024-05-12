package com.ss.android.ugc.aweme.commercialize.profile;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C169696lJ;
import X.C207668Da;
import X.C63081OpJ;
import X.FMX;
import X.NO7;
import X.NTM;
import X.NTN;
import X.NTO;
import X.NWF;
import Y.ARunnableS46S0100000_10;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class AdProfilePopUpWebPageWidget extends AbsAdFeedWidget {
    public static final Map<String, WeakReference<Runnable>> LJZ = new HashMap();
    public NWF LJLLI;
    public long LJLLILLLL;
    public String LJLLJ;
    public final NTO LJLLL = new NTO(this);
    public final NTM LJLLLL = new NTM(this);
    public final NTN LJLLLLLL = new NTN(this);
    public final ARunnableS46S0100000_10 LJLZ = new ARunnableS46S0100000_10(this, 44);

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        LJIILLIIL(System.currentTimeMillis() - this.LJLLILLLL);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.LJLLILLLL = System.currentTimeMillis();
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: LJIILL */
    public final void onChanged(C207668Da c207668Da) {
        String str;
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        String aid;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Aweme aweme2;
        String aid2;
        super.onChanged(c207668Da);
        if (c207668Da != null && (str = c207668Da.LIZ) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected") && (aweme = this.LJLJLJ) != null) {
                    if ((!C63081OpJ.LLJLIL(aweme) && !C63081OpJ.LLJL(aweme) && ((awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebviewType() != 1)) || (aweme2 = this.LJLJLJ) == null || (aid2 = aweme2.getAid()) == null) {
                        return;
                    }
                    ((HashMap) LJZ).put(aid2, new WeakReference(this.LJLZ));
                    return;
                }
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected")) {
                return;
            }
            Aweme aweme3 = this.LJLJLJ;
            if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                ((HashMap) LJZ).remove(aid);
            }
            if (this.LJLLI == null || (fragment = this.LJLJLLL) == null || (mo49getActivity = fragment.mo49getActivity()) == null) {
                return;
            }
            NWF LIZ = NO7.LIZ(mo49getActivity);
            if (LIZ != null) {
                LIZ.LJIJ();
                FrameLayout LIZIZ = NO7.LIZIZ(mo49getActivity);
                if (LIZIZ != null) {
                    C16880lQ.LJLLLL(LIZ, LIZIZ);
                }
            }
            this.LJLLI = null;
        }
    }

    public final void LJIILLIIL(long j) {
        if (this.LJLLI == null) {
            return;
        }
        FMX.LJIIL("h5_stay_time", C169696lJ.LJ(j, "duration").LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C207668Da) obj);
    }
}
