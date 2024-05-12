package com.ss.android.ugc.aweme.ad.feed.card;

import X.C0RN;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C221108m2;
import X.C278517l;
import X.C35986EAk;
import X.C38316F2a;
import X.C38317F2b;
import X.C38318F2c;
import X.C38320F2e;
import X.C40485Fuj;
import X.C40487Ful;
import X.C45804HyK;
import X.C50420Jqa;
import X.C58655N0h;
import X.C58704N2e;
import X.C58954NBu;
import X.C59190NKw;
import X.C59211NLr;
import X.C59212NLs;
import X.C59213NLt;
import X.C59215NLv;
import X.C59216NLw;
import X.C59217NLx;
import X.C59219NLz;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C73318Sq2;
import X.C73969T1h;
import X.C770830u;
import X.EFJ;
import X.F2Z;
import X.F9N;
import X.FMX;
import X.InterfaceC60761Nsz;
import X.NKP;
import X.NKU;
import X.NKV;
import X.NKX;
import X.NLW;
import X.NSW;
import X.QD3;
import X.SJI;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T16;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS46S0100000_10;
import Y.AfS62S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.network.ScoreApi;
import com.ss.android.ugc.aweme.ad.network.VoteApi;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class FeedAdLynxCard implements GenericLifecycleObserver, NSW {
    public static Integer LLIIII;
    public final C59211NLr LJLIL;
    public final FrameLayout LJLILLLLZI;
    public Aweme LJLJI;
    public AwemeRawAd LJLJJI;
    public CardStruct LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public String LJLLLL;
    public int LJLLLLLL;
    public View LJLZ;
    public final NKV LJZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJZI;
    public View LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public int LLFF;
    public C59215NLv LLFFF;
    public final Keva LLFII;
    public final C73318Sq2 LLFZ;
    public final NKX LLI;
    public NKU LLIFFJFJJ;
    public boolean LLII;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            sendCardShowState();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            sendCardHideState();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    @Override // X.NSW
    public final void LIZ() {
        C59213NLt c59213NLt = C59213NLt.LIZ;
        C59213NLt.LIZIZ = null;
        EventBus.LIZJ().LJIJ(c59213NLt);
        C59213NLt.LIZJ = false;
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public final FrameLayout LIZJ() {
        Context context = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context, "container.context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) LJIJJ.findViewById(R.id.rq);
        if (viewStub == null) {
            return (FrameLayout) LJIJJ.findViewById(R.id.rp);
        }
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }

    public final void LJ() {
        C59213NLt c59213NLt = C59213NLt.LIZ;
        C59213NLt.LIZIZ = null;
        EventBus.LIZJ().LJIJ(c59213NLt);
        C59213NLt.LIZJ = false;
        EventBus.LIZJ().LJIJ(this);
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJLLI = null;
    }

    public final void LJI() {
        DataCenter dataCenter;
        if (this.LLFF == 2 && (dataCenter = this.LJLIL.LJLJJI) != null) {
            dataCenter.jv0(null, "action_ad_pop_up_web_pause_video");
        }
    }

    public final void LJII() {
        C59213NLt c59213NLt = C59213NLt.LIZ;
        C59213NLt.LIZIZ = new WeakReference<>(this);
        EventBus.LIZJ().LJIILJJIL(c59213NLt);
        C59213NLt.LIZJ = true;
    }

    public final boolean LJIIIIZZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        Object context = this.LJLILLLLZI.getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        LJ();
        this.LLFZ.dispose();
        if (this.LLII) {
            return false;
        }
        this.LL = false;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
        }
        View view = this.LJLZ;
        if ((view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) view) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJZL = null;
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityDestroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        Object context = this.LJLILLLLZI.getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        C59215NLv c59215NLv = this.LLFFF;
        if (c59215NLv != null) {
            c59215NLv.enable(false);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJZL = null;
        this.LLFZ.dispose();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void sendCardHideState() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        if (this.LLF && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onHide();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void sendCardShowState() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        if (this.LLF && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onShow();
        }
    }

    public final void LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LJLJI = aweme;
        CardStruct cardStruct = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LJLJJI = awemeRawAd;
        Object context = this.LJLILLLLZI.getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        if (this.LJLJJI == null) {
            if (aweme != null) {
                cardStruct = C63081OpJ.LJJJI(aweme);
            }
        } else if (aweme != null) {
            cardStruct = C63081OpJ.LJJJ(aweme);
        }
        this.LJLJJL = cardStruct;
        LIZLLL(aweme);
    }

    public final void LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        NKU nku = this.LLIFFJFJJ;
        if (nku != null) {
            nku.LJ();
        }
        if (!this.LLII) {
            C188727au LIZJ = C0RN.LIZJ(0, "is_successful", 0, "is_ever_failed");
            LIZJ.LIZLLL(1, "failed_reason");
            FMX.LJIIL("feed_lynx_card_preload_usage", LIZJ.LIZ);
        }
    }

    public final void LJIIL(int i) {
        boolean z;
        NKU nku;
        InterfaceC60761Nsz kitView;
        this.LJLZ.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLF = z;
        if (z) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.onShow();
            }
            if (!this.LLII || (nku = this.LLIFFJFJJ) == null) {
                return;
            }
            nku.LJII = true;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardCloseEvent(C38317F2b event) {
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(event, "event");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() == event.LJLIL) {
            C59211NLr c59211NLr = this.LJLIL;
            if (c59211NLr.LJLJLLL) {
                DataCenter dataCenter = c59211NLr.LJLJJI;
                if (dataCenter != null) {
                    dataCenter.jv0(Boolean.FALSE, "ad_feed_card_show_state");
                }
                FrameLayout frameLayout = c59211NLr.LJLIL;
                if (frameLayout != null) {
                    frameLayout.animate().alpha(0.0f).translationY(C17N.LJIILL(15.0d)).setDuration(290L).withEndAction(new ARunnableS37S0100000_1(frameLayout, 79)).start();
                }
                c59211NLr.LJLJJL.postDelayed(new ARunnableS46S0100000_10(c59211NLr, 111), 200L);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                kitView.onHide();
            }
            this.LLF = false;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardCollapseEvent(F2Z event) {
        ViewGroup viewGroup;
        o.LJIIIZ(event, "event");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() == event.LJLILLLLZI) {
            int i = event.LJLIL;
            if (i == 1) {
                if (this.LLFF == 1) {
                    return;
                }
                this.LLFF = 1;
                C59215NLv c59215NLv = this.LLFFF;
                if (c59215NLv != null) {
                    c59215NLv.enable(false);
                }
                this.LJLZ.post(new ARunnableS46S0100000_10(this, 114));
                return;
            }
            if (i != 2 || this.LLFF == 0) {
                return;
            }
            this.LLFF = 0;
            ViewParent parent = this.LJLZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(this.LJLZ, viewGroup);
            }
            this.LJLZ.setAlpha(0.0f);
            this.LJLZ.setTranslationY(0.0f);
            this.LJLILLLLZI.addView(this.LJLZ, new ViewGroup.LayoutParams(C17N.LJIILL(270.0d), -2));
            View view = this.LJZL;
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(C17N.LJIILL(270.0d), -2));
            }
            this.LJLZ.animate().alpha(1.0f).setInterpolator(new SJI()).setDuration(300L).start();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardExpandEvent(C38316F2a event) {
        String str;
        String cardUrl;
        Uri parse;
        ViewGroup viewGroup;
        o.LJIIIZ(event, "event");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null || sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() != event.LJLILLLLZI || event.LJLIL != 1 || this.LLFF == 2) {
            return;
        }
        this.LLFF = 2;
        FrameLayout LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        ViewParent parent = this.LJLZ.getParent();
        String str2 = null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this.LJLZ, viewGroup);
        }
        LIZJ.addView(this.LJLZ, new FrameLayout.LayoutParams(-1, -1));
        View view = this.LJZL;
        if (view != null) {
            C278517l.LIZIZ(-1, -1, view);
        }
        LIZJ.setVisibility(0);
        DataCenter dataCenter = this.LJLIL.LJLJJI;
        if (dataCenter != null) {
            dataCenter.jv0(null, "action_ad_pop_up_web_pause_video");
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("ad_wap_stat", "load_finish", this.LJLJJI);
        LIZLLL.LIZIZ("lynx", "render_type");
        LIZLLL.LIZIZ(0, "duration");
        CardStruct cardStruct = this.LJLJJL;
        if (cardStruct == null || (cardUrl = cardStruct.getCardUrl()) == null || (parse = UriProtector.parse(cardUrl)) == null || (str = UriProtector.getQueryParameter(parse, "channel")) == null) {
            str = null;
        }
        LIZLLL.LIZIZ(str, "channel_name");
        AwemeRawAd awemeRawAd = this.LJLJJI;
        if (awemeRawAd != null) {
            str2 = awemeRawAd.getPageId();
        }
        LIZLLL.LIZIZ(str2, "page_id");
        LIZLLL.LIZIZ(1, "first_page");
        LIZLLL.LJI();
        if (this.LLFFF == null) {
            Context context = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context, "container.context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ == null) {
                return;
            } else {
                this.LLFFF = new C59215NLv(LJIJJ, this);
            }
        }
        C59215NLv c59215NLv = this.LLFFF;
        if (c59215NLv == null) {
            return;
        }
        c59215NLv.enable(true);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        this.LJLLLLLL = i;
        if (i == 1) {
            this.LLD = true;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowCardEvent(C38318F2c event) {
        C59211NLr c59211NLr;
        Aweme aweme;
        o.LJIIIZ(event, "event");
        Aweme aweme2 = this.LJLJI;
        if (aweme2 == null || !C63081OpJ.LLJJJJ(aweme2) || (aweme = (c59211NLr = this.LJLIL).LJLJLJ) == null || aweme.isDelete() || c59211NLr.LJLJJI == null || aweme.getAuthor().getFollowStatus() != 0) {
            return;
        }
        C50420Jqa c50420Jqa = new C50420Jqa(12, aweme);
        c50420Jqa.LJLLL = "card";
        DataCenter dataCenter = c59211NLr.LJLJJI;
        if (dataCenter == null) {
            return;
        }
        dataCenter.jv0(c50420Jqa, "feed_internal_event");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowEvent(FollowStatusEvent event) {
        User author;
        o.LJIIIZ(event, "event");
        FollowStatus followStatus = event.status;
        Aweme aweme = this.LJLJI;
        if (aweme != null && C63081OpJ.LLJJJJ(aweme)) {
            Aweme aweme2 = this.LJLJI;
            String str = null;
            if (aweme2 != null && ((author = aweme2.getAuthor()) == null || (str = author.getUid()) == null)) {
                str = "";
            }
            if (!TextUtils.equals(str, followStatus.userId)) {
                return;
            }
            int i = followStatus.followStatus;
            if (i == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isFollowed", false);
                LJIIIZ("followStatusChanged", jSONObject);
            } else {
                if (2149 == i) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isFollowed", true);
                LJIIIZ("followStatusChanged", jSONObject2);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onGetScoreEvent(C38320F2e event) {
        int i;
        String str;
        o.LJIIIZ(event, "event");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() == event.LJLIL) {
            ScoreApi.LIZ.getClass();
            ScoreApi LIZ = C35986EAk.LIZ();
            Aweme aweme = this.LJLJI;
            if (aweme == null || !C63081OpJ.LJLL(aweme)) {
                return;
            }
            String str2 = null;
            if (true ^ TextUtils.isEmpty(C63081OpJ.LJJJLL(aweme))) {
                C188727au c188727au = new C188727au();
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo != null) {
                    str = commerceVideoAuthInfo.getCreativeId();
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("cid", str);
                c188727au.LJIIIZ("enter_method", C63081OpJ.LJJJLL(aweme));
                FMX.LJIIL("ad_feedback_card_rate", c188727au.LIZ);
            }
            AwemeCommerceStruct commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo2 != null) {
                str2 = commerceVideoAuthInfo2.getAdFeedBackEntrance();
            }
            if (TextUtils.equals(str2, "ACE")) {
                i = 0;
            } else {
                i = 3;
            }
            String itemId = aweme.getCommerceVideoAuthInfo().getItemId();
            o.LJIIIIZZ(itemId, "thisAweme.commerceVideoAuthInfo.itemId");
            String advId = aweme.getCommerceVideoAuthInfo().getAdvId();
            o.LJIIIIZZ(advId, "thisAweme.commerceVideoAuthInfo.advId");
            String adId = aweme.getCommerceVideoAuthInfo().getAdId();
            o.LJIIIIZZ(adId, "thisAweme.commerceVideoAuthInfo.adId");
            String creativeId = aweme.getCommerceVideoAuthInfo().getCreativeId();
            o.LJIIIIZZ(creativeId, "thisAweme.commerceVideoAuthInfo.creativeId");
            this.LLFZ.LIZ(LIZ.sendScoreOption(itemId, advId, adId, creativeId, aweme.getCommerceVideoAuthInfo().getSendNoticeTime(), event.LJLILLLLZI, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0100000_10(this, 0), C59216NLw.LJLIL));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onGetVoteCardOptionEvent(C40485Fuj event) {
        int i;
        Long l;
        o.LJIIIZ(event, "event");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        int i2 = 0;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() == event.LJLIL) {
            Context context = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context, "container.context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                i = LJIJJ.hashCode();
            } else {
                i = 0;
            }
            Integer num = LLIIII;
            if (num == null || i != num.intValue()) {
                if (LJIJJ != null) {
                    i2 = LJIJJ.hashCode();
                }
                LLIIII = Integer.valueOf(i2);
            }
            VoteApi.LIZ.getClass();
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = EFJ.LIZJ;
            VoteApi voteApi = (VoteApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(VoteApi.class);
            Aweme aweme = this.LJLJI;
            if (aweme == null) {
                return;
            }
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "thisAweme.aid");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            Long l2 = null;
            if (awemeRawAd != null) {
                l = awemeRawAd.getCreativeId();
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                l2 = awemeRawAd2.getAdId();
            }
            this.LLFZ.LIZ(voteApi.sendVoteOption(aid, valueOf, String.valueOf(l2), event.LJLILLLLZI).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0100000_10(this, 1), C59217NLx.LJLIL));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPopupWebShowEvent(C59219NLz event) {
        o.LJIIIZ(event, "event");
        C59215NLv c59215NLv = this.LLFFF;
        if (c59215NLv != null) {
            c59215NLv.enable(!event.LJLIL);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwipeUpVideoEvent(C40487Ful event) {
        DataCenter dataCenter;
        o.LJIIIZ(event, "event");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() == event.LJLIL && (dataCenter = this.LJLIL.LJLJJI) != null) {
            dataCenter.jv0(null, "action_ad_swipe_up_video");
        }
    }

    public final void LJIIIZ(String str, JSONObject jSONObject) {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIIZ(str, jSONObject);
        }
    }

    public FeedAdLynxCard(C59211NLr cardDelegate, FrameLayout frameLayout, String str) {
        NKP nkp;
        NKU nku;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        ViewGroup viewGroup;
        o.LJIIIZ(cardDelegate, "cardDelegate");
        this.LJLIL = cardDelegate;
        this.LJLILLLLZI = frameLayout;
        this.LJLJJLL = -100;
        this.LJLJL = -100;
        this.LJLLJ = -1;
        this.LJLLL = -1;
        this.LJLLLLLL = -1;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58954NBu.LJLIL);
        C59190NKw c59190NKw = null;
        View inflate = View.inflate(frameLayout.getContext(), R.layout.bjk, null);
        o.LJIIIIZZ(inflate, "inflate(container.contex…ad_lynx_card_spark, null)");
        this.LJLZ = inflate;
        C59212NLs c59212NLs = new C59212NLs(this);
        this.LLFII = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        this.LLFZ = new C73318Sq2();
        IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
        if (LJJIJLIJ != null) {
            LJJIJLIJ.LJIIZILJ();
            nkp = NKP.LIZ;
        } else {
            nkp = null;
        }
        this.LLI = nkp;
        if (nkp != null) {
            nku = (NKU) nkp.LIZ(str);
        } else {
            nku = null;
        }
        this.LLIFFJFJJ = nku;
        if (nku != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = nku.LIZLLL) != null && nku.LIZ == 3) {
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, viewGroup);
            }
            this.LJLZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
            this.LLII = true;
            this.LLD = true;
            this.LL = nku.LJI;
            this.LJZL = nku.LJ;
            this.LJZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        }
        frameLayout.addView(this.LJLZ);
        if (!this.LLII) {
            this.LJZI = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) this.LJLZ.findViewById(R.id.spark_container);
        }
        NLW nlw = (NLW) LIZIZ.getValue();
        if (nlw != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJZI;
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            c59190NKw = nlw.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, LJJI != null ? LJJI.LJIIL("lynx_feed") : null, c59212NLs);
        }
        this.LJZ = c59190NKw;
    }

    @Override // X.NSW
    public final void LJFF(String str, String str2, String str3) {
        this.LJLJLLL = str;
        this.LJLL = str2;
        this.LJLLI = str3;
    }

    public final void LJIIJ(int i, int i2, String str) {
        this.LJLLJ = i;
        this.LJLLL = i2;
        this.LJLLLL = str;
    }

    public final void LJIIJJI(int i, int i2, int i3) {
        this.LJLJJLL = i;
        this.LJLJL = i2;
        this.LJLJLJ = i3;
    }
}
