package com.ss.android.ugc.aweme.ad.feed.superlike;

import X.C37087Eh1;
import X.C38319F2d;
import X.C58655N0h;
import X.C58704N2e;
import X.C59169NKb;
import X.C59190NKw;
import X.InterfaceC1803976d;
import X.InterfaceC60761Nsz;
import X.NKV;
import X.NKZ;
import X.NL3;
import X.NL4;
import X.NLW;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class FeedAdLynxSuperLike implements GenericLifecycleObserver {
    public final NL3 LJLIL;
    public final FrameLayout LJLILLLLZI;
    public Aweme LJLJI;
    public AwemeRawAd LJLJJI;
    public String LJLJJL;
    public final NLW LJLJJLL;
    public View LJLJL;
    public final NKV LJLJLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJLLL;
    public View LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C59169NKb LIZLLL() {
        String aid;
        Aweme aweme = this.LJLJI;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            FeedAdServiceImpl.LJJIJLIJ().LJIJ();
            return (C59169NKb) NKZ.LIZ.LIZ(aid);
        }
        return null;
    }

    public final void LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AwemeRawAd awemeRawAd2;
        AdLynxEntryData lynxEntryData;
        this.LJLJI = aweme;
        String str = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LJLJJI = awemeRawAd;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (lynxEntryData = awemeRawAd2.getLynxEntryData()) != null) {
            str = lynxEntryData.getLynxScheme();
        }
        this.LJLJJL = str;
        Object context = this.LJLILLLLZI.getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        if (aweme != null) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    public final void LIZIZ(String str) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", this.LJLJJI);
        LIZLLL.LIZJ("superlike", "refer");
        LIZLLL.LIZIZ(str, "fail_reason");
        if (o.LJ(str, "load_timeout")) {
            LIZLLL.LIZIZ(Integer.valueOf(this.LJLLL), "failed_reason_status");
        }
        LIZLLL.LJI();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPopupWindowCloseEvent(C38319F2d event) {
        int i;
        o.LJIIIZ(event, "event");
        int i2 = event.LJLIL;
        View view = this.LJLL;
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        if (i2 != i) {
            return;
        }
        this.LJLIL.hide();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSuperLikeStatusEvent(C37087Eh1 event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        this.LJLLL = i;
        if (i == 1) {
            this.LJLLJ = true;
        }
    }

    public FeedAdLynxSuperLike(NL3 superLikeDelegate, FrameLayout frameLayout) {
        NLW nlw;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(superLikeDelegate, "superLikeDelegate");
        this.LJLIL = superLikeDelegate;
        this.LJLILLLLZI = frameLayout;
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        C59190NKw c59190NKw = null;
        if (LIZLLL instanceof NLW) {
            nlw = (NLW) LIZLLL;
        } else {
            nlw = null;
        }
        this.LJLJJLL = nlw;
        this.LJLJL = View.inflate(frameLayout.getContext(), R.layout.bjp, null);
        NL4 nl4 = new NL4(this);
        this.LJLLL = -1;
        View view = this.LJLJL;
        if (view != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) view.findViewById(R.id.feed_ad_lynx_super_like_spark_container);
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        }
        this.LJLJLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        if (nlw != null) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            c59190NKw = nlw.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, LJJI != null ? LJJI.LJIIL("lynx_feed") : null, nl4);
        }
        this.LJLJLJ = c59190NKw;
    }

    public final void LIZJ(String str, JSONObject jSONObject) {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIIZ(str, jSONObject);
        }
    }
}
