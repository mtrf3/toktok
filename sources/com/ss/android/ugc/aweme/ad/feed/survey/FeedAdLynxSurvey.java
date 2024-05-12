package com.ss.android.ugc.aweme.ad.feed.survey;

import X.C0JU;
import X.C221108m2;
import X.C2LG;
import X.C40487Ful;
import X.C58655N0h;
import X.C58704N2e;
import X.C59190NKw;
import X.C59194NLa;
import X.C59197NLd;
import X.C62822Ol8;
import X.NKV;
import X.NLW;
import X.NLY;
import X.NLZ;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class FeedAdLynxSurvey implements GenericLifecycleObserver {
    public final NLY LJLIL;
    public final FrameLayout LJLILLLLZI;
    public Aweme LJLJI;
    public AwemeRawAd LJLJJI;
    public AdQuestionnaire LJLJJL;
    public long LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final View LJLJLJ;
    public final NKV LJLJLLL;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLL;
    public View LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZIZ() {
        Long l;
        int i;
        if (this.LJLIL.LJLJLJ) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_over", this.LJLJJI);
            AwemeRawAd awemeRawAd = this.LJLJJI;
            if (awemeRawAd != null) {
                l = awemeRawAd.getAdId();
            } else {
                l = null;
            }
            LIZLLL.LIZJ(l, "ad_id");
            LIZLLL.LIZJ(this.LJLLILLLL, "refer");
            LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LJLJJLL), "duration");
            AdQuestionnaire adQuestionnaire = this.LJLJJL;
            if (adQuestionnaire != null) {
                i = adQuestionnaire.getId();
            } else {
                i = 0;
            }
            C0JU.LIZJ(i, LIZLLL, "five_star_survey_id");
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onHomeTabPressed(C2LG event) {
        Long l;
        int i;
        o.LJIIIZ(event, "event");
        NLY nly = this.LJLIL;
        if (nly.LJLJLJ) {
            nly.LIZ();
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_over", this.LJLJJI);
            AwemeRawAd awemeRawAd = this.LJLJJI;
            if (awemeRawAd != null) {
                l = awemeRawAd.getAdId();
            } else {
                l = null;
            }
            LIZLLL.LIZJ(l, "ad_id");
            LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LJLJJLL), "duration");
            AdQuestionnaire adQuestionnaire = this.LJLJJL;
            if (adQuestionnaire != null) {
                i = adQuestionnaire.getId();
            } else {
                i = 0;
            }
            C0JU.LIZJ(i, LIZLLL, "five_star_survey_id");
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwipeUpEvent(C40487Ful event) {
        int i;
        DataCenter dataCenter;
        o.LJIIIZ(event, "event");
        int i2 = event.LJLIL;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        if (i2 != i) {
            return;
        }
        String str = event.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        this.LJLLILLLL = str;
        NLY nly = this.LJLIL;
        C59197NLd c59197NLd = nly.LJLJLLL;
        if (c59197NLd != null && (dataCenter = nly.LJLJI) != null) {
            dataCenter.jv0(c59197NLd, "action_ad_swipe_up_video");
        }
    }

    public FeedAdLynxSurvey(NLY surveyDelegate, FrameLayout frameLayout) {
        o.LJIIIZ(surveyDelegate, "surveyDelegate");
        this.LJLIL = surveyDelegate;
        this.LJLILLLLZI = frameLayout;
        this.LJLJJLL = -1L;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C59194NLa.LJLIL);
        this.LJLJL = LIZIZ;
        C59190NKw c59190NKw = null;
        View inflate = View.inflate(frameLayout.getContext(), R.layout.bjq, null);
        o.LJIIIIZZ(inflate, "inflate(container.contex…_lynx_survey_spark, null)");
        this.LJLJLJ = inflate;
        this.LJLLILLLL = "";
        NLZ nlz = new NLZ(this);
        frameLayout.removeAllViews();
        frameLayout.addView(inflate);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) inflate.findViewById(R.id.spark_center_view_container);
        this.LJLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        NLW nlw = (NLW) LIZIZ.getValue();
        if (nlw != null) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            c59190NKw = nlw.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, LJJI != null ? LJJI.LJIIL("lynx_feed") : null, nlz);
        }
        this.LJLJLLL = c59190NKw;
    }

    public final void LIZ(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LJLJI = aweme;
        AdQuestionnaire adQuestionnaire = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LJLJJI = awemeRawAd;
        if (awemeRawAd != null) {
            adQuestionnaire = awemeRawAd.getAdQuestionnaire();
        }
        this.LJLJJL = adQuestionnaire;
        Object context = this.LJLILLLLZI.getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
