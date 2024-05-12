package com.ss.android.ugc.aweme.commercialize.live.feedLive;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C17N;
import X.C221108m2;
import X.C38317F2b;
import X.C42625Go9;
import X.C45804HyK;
import X.C47623ImZ;
import X.C59190NKw;
import X.C59209NLp;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C90193gN;
import X.F9N;
import X.InterfaceC59337NQn;
import X.NKV;
import X.NLE;
import X.NLF;
import X.NLW;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class FeedLiveAdLynxCard implements GenericLifecycleObserver, InterfaceC59337NQn {
    public final FrameLayout LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public Aweme LJLJJL;
    public AwemeRawAd LJLJJLL;
    public CardStruct LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public C47623ImZ LJLLILLLL;
    public View LJLLJ;
    public final Handler LJLLL = new Handler(C16880lQ.LLJJJJ());
    public final C62822Ol8 LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public final View LJZ;
    public final NKV LJZI;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJZL;
    public final Keva LL;

    public final void LIZJ() {
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        hide();
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJLL = false;
        this.LJLLI = false;
        this.LJLZ = -1;
        this.LJLLL.removeCallbacksAndMessages(null);
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    @Override // X.InterfaceC59337NQn
    public final void LIZIZ() {
        String cardUrl;
        String str;
        String jSONObject;
        String str2;
        String str3;
        String str4;
        CardStruct cardStruct = this.LJLJL;
        if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
            Uri.Builder buildUpon = UriProtector.parse(cardUrl).buildUpon();
            m mVar = new m();
            AwemeRawAd awemeRawAd = this.LJLJJLL;
            String str5 = null;
            String str6 = "";
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    str2 = String.valueOf(adId);
                } else {
                    str2 = null;
                }
                mVar.LJJIIZ("adId", str2);
                mVar.LJJIIZ("creativeId", awemeRawAd.getCreativeIdStr());
                mVar.LJJIIZ("logExtra", awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    str3 = String.valueOf(groupId);
                } else {
                    str3 = null;
                }
                mVar.LJJIIZ("groupId", str3);
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                o.LJII(clickTrackUrlList, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                List<String> clickTrackUrlList2 = clickTrackUrlList.getUrlList();
                if (clickTrackUrlList2 != null && !clickTrackUrlList2.isEmpty()) {
                    g gVar = new g();
                    o.LJIIIIZZ(clickTrackUrlList2, "clickTrackUrlList");
                    Iterator<String> it = clickTrackUrlList2.iterator();
                    while (it.hasNext()) {
                        gVar.LJJIIJ(it.next());
                    }
                    mVar.LJJII("clickTrackUrlList", gVar);
                }
                String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
                if (nativeSiteAdInfo == null) {
                    nativeSiteAdInfo = "";
                }
                mVar.LJJIIZ("pageData", nativeSiteAdInfo);
                mVar.LJJIIJ("isVoted", Integer.valueOf(this.LL.getBoolean(String.valueOf(awemeRawAd.getCreativeId()), false) ? 1 : 0));
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str4 = nativeSiteConfig.getLynxScheme();
                } else {
                    str4 = null;
                }
                mVar.LJJIIZ("lynxSchema", str4);
            }
            Aweme aweme = this.LJLJJL;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            mVar.LJJIIZ("itemId", String.valueOf(str));
            mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(this.LJLIL.getContext()) ? 1 : 0));
            CardStruct cardStruct2 = this.LJLJL;
            if (cardStruct2 != null) {
                JSONObject cardData = cardStruct2.getCardData();
                if (cardData != null && (jSONObject = cardData.toString()) != null) {
                    str6 = jSONObject;
                }
                mVar.LJJIIZ("cardData", str6);
            }
            Context context = this.LJLIL.getContext();
            o.LJIIIIZZ(context, "container.context");
            mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(context)));
            mVar.LJJIIJ("isCardState", 1);
            Context context2 = this.LJLIL.getContext();
            o.LJIIIIZZ(context2, "container.context");
            C45804HyK.LJIJJ(context2);
            mVar.LJJIIJ("userHasVoted", 0);
            mVar.LJJIIJ("enableCardCloseButton", 0);
            String str7 = this.LJLILLLLZI;
            if (str7 != null) {
                mVar.LJJIIZ("adLiveJson", str7);
            }
            String str8 = this.LJLJI;
            if (str8 != null) {
                mVar.LJJIIZ("productInfo", str8);
            }
            String str9 = this.LJLJJI;
            if (str9 != null) {
                mVar.LJJIIZ("frontendExtraData", str9);
            }
            String jVar = mVar.toString();
            o.LJIIIIZZ(jVar, "dataObj.toString()");
            buildUpon.appendQueryParameter("initialData", jVar);
            NKV nkv = this.LJZI;
            if (nkv != null) {
                String builder = buildUpon.toString();
                o.LJIIIIZZ(builder, "urlBuilder.toString()");
                Bundle bundle = new Bundle();
                Context context3 = this.LJLIL.getContext();
                NLW nlw = (NLW) this.LJLLLL.getValue();
                if (nlw != null) {
                    Aweme aweme2 = this.LJLJJL;
                    o.LJIIIIZZ(context3, "context");
                    nlw.LJIIIIZZ(context3, bundle, aweme2);
                }
                AwemeRawAd awemeRawAd2 = this.LJLJJLL;
                if (awemeRawAd2 != null) {
                    str5 = awemeRawAd2.getNativeSiteCustomData();
                }
                bundle.putString("bundle_native_site_custom_data", str5);
                nkv.LIZ(bundle, builder, C59209NLp.LIZ().enableLynxCard);
            }
        }
    }

    public final void hide() {
        if (!this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = false;
        FrameLayout frameLayout = this.LJLIL;
        frameLayout.animate().alpha(0.0f).translationY(C17N.LJIILL(15.0d)).setDuration(290L).withEndAction(new ARunnableS37S0100000_1(frameLayout, 62)).start();
        C47623ImZ c47623ImZ = this.LJLLILLLL;
        if (c47623ImZ != null) {
            c47623ImZ.LIZ.gv0(null, "ad_live_card_hide");
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityDestroy() {
        Lifecycle lifecycle;
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "container.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJZL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
    }

    @Override // X.InterfaceC59337NQn
    public final void LJI() {
        LIZJ();
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC59337NQn
    public final void LIZ() {
        C42625Go9.LIZIZ(this);
    }

    public FeedLiveAdLynxCard(FrameLayout frameLayout) {
        Lifecycle lifecycle;
        this.LJLIL = frameLayout;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(NLF.LJLIL);
        this.LJLLLL = LIZIZ;
        this.LJLZ = -1;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bjr, frameLayout, true);
        o.LJIIIIZZ(LLLLIILL, "from(container.context).…d_spark, container, true)");
        this.LJZ = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.fuw);
        o.LJIIIIZZ(findViewById, "contentView.findViewById….live_ad_spark_container)");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) findViewById;
        this.LJZL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        NLE nle = new NLE(this);
        this.LL = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        NLW nlw = (NLW) LIZIZ.getValue();
        C59190NKw c59190NKw = null;
        if (nlw != null) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            c59190NKw = nlw.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, LJJI != null ? LJJI.LJIIL("lynx_feed") : null, nle);
        }
        this.LJZI = c59190NKw;
        Context context = frameLayout.getContext();
        o.LJIIIIZZ(context, "container.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC59337NQn
    public final void LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        this.LJLJJL = aweme;
        CardStruct cardStruct = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LJLJJLL = awemeRawAd;
        if (awemeRawAd == null) {
            if (aweme != null) {
                cardStruct = C63081OpJ.LJJJI(aweme);
            }
        } else if (aweme != null) {
            cardStruct = C63081OpJ.LJJJ(aweme);
        }
        this.LJLJL = cardStruct;
        LIZJ();
    }

    @Override // X.InterfaceC59337NQn
    public final void LJ(long j) {
        if (this.LJLJL == null || this.LJLJLJ) {
            return;
        }
        this.LJLLL.postDelayed(new ARunnableS46S0100000_10(this, 42), j);
    }

    @Override // X.InterfaceC59337NQn
    public final void LJII(C47623ImZ c47623ImZ) {
        this.LJLLILLLL = c47623ImZ;
    }

    @Override // X.InterfaceC59337NQn
    public final void LJIIIIZZ(CardStruct cardStruct) {
        this.LJLJL = cardStruct;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardCloseEvent(C38317F2b event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL != this.LJZL.hashCode()) {
            return;
        }
        hide();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        this.LJLZ = i;
        if (i == 1) {
            this.LJLLI = true;
        }
    }

    @Override // X.InterfaceC59337NQn
    public final void LJFF(String str, String str2, String str3) {
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }
}
