package com.ss.android.ugc.aweme.ad.feed.sticker;

import X.AbstractC59184NKq;
import X.C188727au;
import X.C37147Ehz;
import X.C37148Ei0;
import X.C46260IDo;
import X.C58112Pv;
import X.C58655N0h;
import X.C58704N2e;
import X.C59171NKd;
import X.C59190NKw;
import X.FMX;
import X.InterfaceC60761Nsz;
import X.NG2;
import X.NGP;
import X.NKV;
import X.NL7;
import X.NL8;
import X.NLW;
import X.NPC;
import X.NQI;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class FeedAdLynxSticker extends AbstractFeedLynxView {
    public String LJLLJ;
    public boolean LJLLL;
    public final NKV LJLLLL;
    public AdStickerData LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public int LJZI;

    public final void LJIIJ() {
        this.LJLJLLL = false;
        this.LJZI = -1;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final m LJ() {
        Aweme aweme = this.LJLJJI;
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "container.context");
        m LIZ = NG2.LIZ(context, aweme);
        NGP.LIZ(aweme, LIZ);
        return LIZ;
    }

    public final Bundle LJI() {
        Aweme aweme = this.LJLJJI;
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "container.context");
        return NG2.LIZIZ(context, aweme);
    }

    public final void LJIIIZ() {
        C37148Ei0.LIZIZ(this.LJZ, "ad_lynx_sticker_show_success", this.LJLZ, this.LJLLJ, this.LJLJLLL);
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", this.LJLJJL);
        LIZLLL.LIZJ("sticker", "refer");
        NQI nqi = this.LJLILLLLZI;
        o.LJII(nqi, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxStickerDelegate");
        LIZLLL.LIZIZ(Integer.valueOf(((NL7) nqi).LJLLI + 1), "play_order");
        LIZLLL.LJI();
    }

    public final boolean LJFF() {
        return C58112Pv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final AbstractC59184NKq LIZ(String str) {
        IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
        if (LJJIJLIJ != null) {
            LJJIJLIJ.LJIIIZ();
            return C59171NKd.LIZ.LIZ(str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = this;
            r3.LJLJJI = r4
            r2 = 0
            if (r4 == 0) goto L55
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
        L9:
            r3.LJLJJL = r0
            android.view.ViewGroup r0 = r3.LJLIL
            android.content.Context r1 = r0.getContext()
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L22
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 == 0) goto L22
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            if (r0 == 0) goto L22
            r0.addObserver(r3)
        L22:
            boolean r0 = r3.LJFF()
            if (r0 == 0) goto L50
            X.NKq r0 = r3.LJLJL
            if (r0 == 0) goto L2f
            r0.LJ()
        L2f:
            boolean r0 = r3.LJLJJLL
            if (r0 != 0) goto L50
            if (r4 == 0) goto L53
            r3.LJII(r4)
        L38:
            com.ss.android.ugc.aweme.commercialize.model.AdStickerData r0 = X.C63081OpJ.LJJIIZ(r4)
        L3c:
            r3.LJLLLLLL = r0
            if (r0 == 0) goto L44
            java.lang.String r2 = r0.getStickerUrl()
        L44:
            r3.LJLLJ = r2
            if (r4 == 0) goto L4f
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZJ()
            r0.LJIILJJIL(r3)
        L4f:
            return
        L50:
            if (r4 == 0) goto L53
            goto L38
        L53:
            r0 = r2
            goto L3c
        L55:
            r0 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(0, "is_successful");
        c188727au.LIZLLL(0, "is_ever_failed");
        c188727au.LJIIIZ("is_spark", "1");
        c188727au.LIZLLL(1, "failed_reason");
        FMX.LJIIL("feed_lynx_sticker_preload_usage", c188727au.LIZ);
    }

    public final void LJIIIIZZ(String str) {
        if (o.LJ(str, "load_timeout")) {
            C37148Ei0.LIZIZ(this.LJZ, "ad_lynx_sticker_load_timeout", this.LJLZ, this.LJLLJ, this.LJLJLLL);
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_fail", this.LJLJJL);
        LIZLLL.LIZJ("sticker", "refer");
        LIZLLL.LIZIZ(str, "fail_reason");
        if (o.LJ(str, "load_timeout")) {
            LIZLLL.LIZIZ(Integer.valueOf(this.LJZI), "failed_reason_status");
        }
        NQI nqi = this.LJLILLLLZI;
        o.LJII(nqi, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxStickerDelegate");
        LIZLLL.LIZIZ(Integer.valueOf(((NL7) nqi).LJLLI + 1), "play_order");
        LIZLLL.LJI();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAdPlayEvent(C46260IDo event) {
        o.LJIIIZ(event, "event");
        if (NPC.LJIIIZ(this.LJLLLLLL) && this.LJLILLLLZI.isShowing()) {
            LJIIJJI("event_card_show", null);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C37147Ehz event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        this.LJZI = i;
        this.LJZ = true;
        if (i == 1) {
            this.LJLZ = true;
        } else {
            C37148Ei0.LIZ(event, "adLynx_sticker_status_fail", this.LJLLI, this.LJLLJ, null, null, null);
        }
    }

    public final void LJIIJJI(String str, JSONObject jSONObject) {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLLILLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIIZ(str, jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedAdLynxSticker(ViewGroup viewGroup, NL7 feedLynxViewDelegate, String str) {
        super(viewGroup, feedLynxViewDelegate, str);
        o.LJIIIZ(feedLynxViewDelegate, "feedLynxViewDelegate");
        NL8 nl8 = new NL8(this);
        NLW nlw = this.LJLJLJ;
        C59190NKw c59190NKw = null;
        if (nlw != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLLILLLL;
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            c59190NKw = nlw.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, LJJI != null ? LJJI.LJIIL("lynx_feed") : null, nl8);
        }
        this.LJLLLL = c59190NKw;
        this.LJZI = -1;
    }
}
