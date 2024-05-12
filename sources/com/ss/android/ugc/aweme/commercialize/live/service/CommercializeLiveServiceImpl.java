package com.ss.android.ugc.aweme.commercialize.live.service;

import X.AL5;
import X.ALE;
import X.AbstractC59064NGa;
import X.B5Z;
import X.C00F;
import X.C12310e3;
import X.C2068389v;
import X.C25877ADp;
import X.C28835BTj;
import X.C2U8;
import X.C36636EZk;
import X.C48841JEv;
import X.C56437MCz;
import X.C58096Mr6;
import X.C58310MuY;
import X.C58582Rq;
import X.C58655N0h;
import X.C58704N2e;
import X.C59406NTe;
import X.C59410NTi;
import X.C59411NTj;
import X.C59412NTk;
import X.C59413NTl;
import X.C59414NTm;
import X.C59415NTn;
import X.C59416NTo;
import X.C59421NTt;
import X.C60827Nu3;
import X.C63081OpJ;
import X.C78939UyV;
import X.C78983UzD;
import X.C86393XvR;
import X.EnumC35791E2x;
import X.FMX;
import X.HG3;
import X.InterfaceC37276Ek4;
import X.InterfaceC59337NQn;
import X.InterfaceC59736NcS;
import X.L4H;
import X.L4I;
import X.NIA;
import X.NIC;
import X.NKL;
import X.NT2;
import X.RBX;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.live.api.LiveAdCardApi;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenEvent;
import com.ss.android.ugc.aweme.commercialize.live.settings.PromoteConfigSettings;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PromoteEntrySchemaModel;
import com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel;
import com.ss.android.ugc.aweme.feed.model.PromotePreloadSettingsModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.i0;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class CommercializeLiveServiceImpl implements ICommercializeLiveService {
    public static int LJJIIJ(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 7;
        }
        if (i == 8) {
            return 6;
        }
        if (i == 14) {
            return 9;
        }
        if (i == 11) {
            return 8;
        }
        if (i == 12) {
            return 10;
        }
        if (i == 42) {
            return 11;
        }
        if (i == 43) {
            return 1;
        }
        switch (i) {
            case 50:
                return 3;
            case 51:
                return 4;
            case 52:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final int LIZIZ() {
        Integer recommendCML;
        try {
            PromoteConfigSettings.PromoteConfig promoteConfig = (PromoteConfigSettings.PromoteConfig) SettingsManager.LIZLLL().LJIIIIZZ("promote_config", PromoteConfigSettings.PromoteConfig.class, null);
            if (promoteConfig != null && (recommendCML = promoteConfig.getRecommendCML()) != null) {
                return recommendCML.intValue();
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJ() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_report_dislike_live", false);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIZILJ() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            String str = C59413NTl.LIZIZ;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String LJFF = i0.LJFF("time", str);
            String LJFF2 = i0.LJFF("times", str);
            int LIZ = C59413NTl.LIZ();
            long currentTimeMillis = System.currentTimeMillis();
            Keva keva = C59413NTl.LIZ;
            keva.storeLong(LJFF, currentTimeMillis);
            keva.storeInt(LJFF2, LIZ + 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final long LJIJJLI() {
        if (HG3.LJIILL().isLogin()) {
            String str = C59413NTl.LIZIZ;
            if (!TextUtils.isEmpty(str)) {
                return C59413NTl.LIZ.getLong(i0.LJFF("time", str), 0L);
            }
        }
        return System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final PromoteEntrySchemaModel LJIL() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PromoteEntrySchemaModel promoteEntrySchemaModel = C59410NTi.LIZ;
        PromoteEntrySchemaModel promoteEntrySchemaModel2 = (PromoteEntrySchemaModel) LIZLLL.LJIIIIZZ("Promote_entry_schema", PromoteEntrySchemaModel.class, promoteEntrySchemaModel);
        if (promoteEntrySchemaModel2 == null) {
            return promoteEntrySchemaModel;
        }
        return promoteEntrySchemaModel2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJJI() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PromotePreloadSettingsModel promotePreloadSettingsModel = L4I.LIZ;
        PromotePreloadSettingsModel promotePreloadSettingsModel2 = (PromotePreloadSettingsModel) LIZLLL.LJIIIIZZ("promote_preload_settings", PromotePreloadSettingsModel.class, promotePreloadSettingsModel);
        if (promotePreloadSettingsModel2 != null) {
            promotePreloadSettingsModel = promotePreloadSettingsModel2;
        }
        if (!promotePreloadSettingsModel.enable || C00F.LIZ(31744, 0, "Promote_use_preload", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJJIII() {
        C58310MuY.LIZIZ.getClass();
        C60827Nu3.LJIIL("promote_spark_biz");
    }

    public static ICommercializeLiveService LJJIIJZLJL() {
        Object LIZ = C58096Mr6.LIZ(ICommercializeLiveService.class, false);
        if (LIZ != null) {
            return (ICommercializeLiveService) LIZ;
        }
        if (C58096Mr6.LLLLLL == null) {
            synchronized (ICommercializeLiveService.class) {
                if (C58096Mr6.LLLLLL == null) {
                    C58096Mr6.LLLLLL = new CommercializeLiveServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIIIZZ() {
        LJJIIZI(10000L, "live_duration_10s");
        LJJIIZI(30000L, "live_duration_30s");
        LJJIIZI(60000L, "live_duration_60s");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJIIIZ() {
        return e1.LIZ(31744, "Promote_use_fixed_schema", true, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final PromoteIconFlipFrequencySettingsModel LJIILLIIL() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            PromoteIconFlipFrequencySettingsModel promoteIconFlipFrequencySettingsModel = C59412NTk.LIZ;
            PromoteIconFlipFrequencySettingsModel promoteIconFlipFrequencySettingsModel2 = (PromoteIconFlipFrequencySettingsModel) LIZLLL.LJIIIIZZ("promote_icon_flip_frequency_setting", PromoteIconFlipFrequencySettingsModel.class, promoteIconFlipFrequencySettingsModel);
            if (promoteIconFlipFrequencySettingsModel2 != null) {
                promoteIconFlipFrequencySettingsModel = promoteIconFlipFrequencySettingsModel2;
            }
            o.LJIIIIZZ(promoteIconFlipFrequencySettingsModel, "{\n            SettingsMa…: DEFAULT_GROUP\n        }");
            return promoteIconFlipFrequencySettingsModel;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return C59412NTk.LIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final int LJJ() {
        return C59413NTl.LIZ();
    }

    public static String LJJIIZ(Aweme aweme) {
        if (aweme.isLive()) {
            return "full_screen_feed_live";
        }
        if (C63081OpJ.LLIIIILZ(aweme)) {
            return "top_live";
        }
        if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
            return "feed_live";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZ(JSONObject params) {
        o.LJIIIZ(params, "params");
        try {
            String string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(params, "data"), "action_type");
            o.LJIIIIZZ(string, "data.getString(\"action_type\")");
            C2U8.LIZ(new BALeadsGenEvent(string));
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("LeadsGen Broadcast JSB", "Gson parse error", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if ((awemeRawAd2 != null && awemeRawAd2.getComponentType() == 3) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getComponentType() == 4)) {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C56437MCz(aweme, this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC59736NcS LJIIJJI(FrameLayout frameLayout) {
        return new NKL(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC59337NQn LJIIL(FrameLayout frameLayout) {
        return new FeedLiveAdLynxCard(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJIILIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int componentType = awemeRawAd.getComponentType();
            if (componentType == 1 || componentType == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIILJJIL(JSONObject params) {
        o.LJIIIZ(params, "params");
        JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(params, "data");
        try {
            String string = JSONObjectProtectorUtils.getString(params, "eventName");
            if (o.LJ(string, EnumC35791E2x.LIVE_LINK_PIN.getValue())) {
                C2U8.LIZ(new C59416NTo((BusinessLinksLiveLinkPin) new Gson().LJI(jSONObject.toString(), BusinessLinksLiveLinkPin.class), null));
            } else if (o.LJ(string, EnumC35791E2x.LIVE_LINK_CARD.getValue())) {
                C2U8.LIZ(new C59416NTo(null, (BusinessLinksLiveLinkCard) new Gson().LJI(jSONObject.toString(), BusinessLinksLiveLinkCard.class)));
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("Broadcast JSB", "Gson parse error", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJIJ(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        return LJJIIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJIJJ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (!aweme.isAd() && !C63081OpJ.LLF(aweme)) {
            return null;
        }
        return LJJIIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJJIFFI(String schema) {
        o.LJIIIZ(schema, "schema");
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        ALE ale = new ALE();
        ale.LIZ = "promote_spark_biz";
        ale.LJIIJ = 8;
        ale.LJIIJJI = 600;
        ale.LIZIZ(C25877ADp.LJLIL);
        ale.LJIIL = AL5.LJLIL;
        ale.LJIILIIL = L4H.LIZ;
        c60827Nu3.getClass();
        C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
        C60827Nu3.LJIIIIZZ(c60827Nu3, schema, "promote_spark_biz", null, 12);
    }

    public static void LJJIIZI(long j, String str) {
        LiveOuterService.LJJJLL().LJJIJIL().LJJLIIIJJIZ(B5Z.AUDIENCE_LIVE_PLAY_DURATION, new C59414NTm(j, str));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJFF(Context context, AqS134S0200000_3 aqS134S0200000_3) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_promote_effect_share;
        aqS134S0200000_3.invoke(new Pair("promote", c2068389v.LIZ(context)));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIJ(Context context, String str) {
        NIA nia;
        o.LJIIIZ(context, "context");
        C59421NTt c59421NTt = NIC.LIZJ;
        if (c59421NTt != null && (nia = c59421NTt.LJFF) != null) {
            nia.LIZ(str, false, true);
            String str2 = nia.LIZIZ;
            if (str2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("routerPage realurl = ");
                LIZ.append(str2);
                C58582Rq.LIZ(X1D.LIZIZ(LIZ), "PromoteAdHybridDelegate");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("routerPage cacheKey = ");
                Uri parse = UriProtector.parse(str2);
                o.LJIIIIZZ(parse, "parse(it)");
                LIZ2.append(C78939UyV.LJJJJJ(parse, NIC.LIZIZ));
                C58582Rq.LIZ(X1D.LIZIZ(LIZ2), "PromoteAdHybridDelegate");
                AbstractC59064NGa abstractC59064NGa = NIC.LIZ;
                if (abstractC59064NGa != null) {
                    abstractC59064NGa.LJJ(context, str2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r0.intValue() == 1) goto L5;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preload(android.content.Context r22, java.lang.String r23) {
        /*
            r21 = this;
            r5 = r23
            r3 = r22
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
            X.OWs r2 = r0.LJJJJIZL()
            java.lang.String r1 = "go_live_memory_leak_opt"
            r9 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r2.LIZJ(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L67
        L26:
            r1 = 0
        L27:
            X.NGc r0 = new X.NGc
            X.NMv r2 = X.EnumC59241NMv.SPARK
            if (r1 == 0) goto L31
            android.content.Context r3 = X.C16880lQ.LLLLL(r3)
        L31:
            java.lang.String r1 = "if (memoryLeakOptEnabled…ationContext else context"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r1)
            X.NGY r10 = new X.NGY
            r11 = 0
            r16 = 63
            r7 = 0
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.String r1 = "promote"
            r0.<init>(r1, r2, r3, r10)
            X.E8B r10 = X.E8B.LJLIL
            X.NIA r3 = new X.NIA
            java.lang.String r4 = "promote"
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            X.1PH r8 = new X.1PH
            r8.<init>()
            r19 = 0
            r11 = 1
            r12 = 104(0x68, float:1.46E-43)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.NFp r13 = X.EnumC59053NFp.CACHE_WITH_RETRY
            java.lang.String r1 = r3.LIZIZ
            if (r1 != 0) goto L6f
            goto L70
        L67:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L26
            goto L27
        L6f:
            r5 = r1
        L70:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "promote_use_keep_alive_in_ad_hybrid"
            r2.getClass()     // Catch: java.lang.Throwable -> L7e
            boolean r16 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r9)     // Catch: java.lang.Throwable -> L7e
            goto L84
        L7e:
            r1 = move-exception
            X.C78983UzD.LJIIZILJ(r1)
            r16 = 0
        L84:
            X.NTt r12 = new X.NTt
            r20 = 200(0xc8, float:2.8E-43)
            r14 = r5
            r15 = r11
            r17 = r3
            r18 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            X.NIC.LIZJ = r12
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = "preload realurl = "
            r2.append(r1)
            X.NTt r1 = X.NIC.LIZJ
            if (r1 == 0) goto Lc1
            X.NIA r1 = r1.LJFF
            if (r1 == 0) goto Lc1
            java.lang.String r1 = r1.LIZIZ
        La6:
            r2.append(r1)
            java.lang.String r2 = X.X1D.LIZIZ(r2)
            java.lang.String r1 = "PromoteAdHybridDelegate"
            X.C58582Rq.LIZ(r2, r1)
            X.NTt r2 = X.NIC.LIZJ
            if (r2 == 0) goto Lc0
            com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager r1 = com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager.LIZLLL()
            X.NGa r0 = r1.LIZIZ(r0, r2)
            X.NIC.LIZ = r0
        Lc0:
            return
        Lc1:
            r1 = 0
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl.preload(android.content.Context, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZLLL(Aweme aweme, EnterRoomConfig enterRoomConfig, int i) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        AwemeRawAd LJJJJI = C63081OpJ.LJJJJI(aweme);
        if (awemeRawAd != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterFromAd = true;
            roomsData.adLiveEnterRoomConfig = LJIILL(aweme, awemeRawAd, LJJIIJ(i));
        } else if (C63081OpJ.LLF(aweme) && LJJJJI != null) {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterFromAd = false;
            int LJJIIJ = LJJIIJ(i);
            String valueOf = String.valueOf(LJJJJI.getLiveAdType());
            String creativeIdStr = LJJJJI.getCreativeIdStr();
            String creativeIdStr2 = LJJJJI.getCreativeIdStr();
            String logExtra = LJJJJI.getLogExtra();
            Long groupId = LJJJJI.getGroupId();
            String str4 = null;
            if (groupId != null) {
                str = String.valueOf(groupId);
            } else {
                str = null;
            }
            Long adId = LJJJJI.getAdId();
            if (adId != null) {
                str4 = String.valueOf(adId);
            }
            AdLiveEnterRoomConfig adLiveEnterRoomConfig = new AdLiveEnterRoomConfig(valueOf, creativeIdStr, creativeIdStr2, logExtra, str, LJJIIJ, null, str4, LJJJJI.getAdvId(), C59406NTe.LJI(aweme), C59406NTe.LIZIZ(aweme), null, "1");
            adLiveEnterRoomConfig.enterFromAd = false;
            roomsData2.adLiveEnterRoomConfig = adLiveEnterRoomConfig;
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        if (roomsData3.enterFromMerge == null) {
            if (LJJIIJ(i) == 3) {
                str3 = "others_homepage";
            } else {
                str3 = "homepage_hot";
            }
            roomsData3.enterFromMerge = str3;
        }
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
        if (roomsData4.enterMethod == null) {
            if (LJJIIJ(i) == 3) {
                str2 = "others_photo";
            } else if (TextUtils.equals(LJIJJ(aweme), "full_screen_feed_live")) {
                str2 = "live_cell";
            } else {
                str2 = "video_head";
            }
            roomsData4.enterMethod = str2;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final AdLiveEnterRoomConfig LJIILL(Aweme aweme, AwemeRawAd awemeRawAd, int i) {
        String str;
        String str2;
        o.LJIIIZ(aweme, "aweme");
        String valueOf = String.valueOf(awemeRawAd.getLiveAdType());
        String creativeIdStr = awemeRawAd.getCreativeIdStr();
        String creativeIdStr2 = awemeRawAd.getCreativeIdStr();
        String logExtra = awemeRawAd.getLogExtra();
        Long groupId = awemeRawAd.getGroupId();
        AdDislikeInfo adDislikeInfo = null;
        if (groupId != null) {
            str = String.valueOf(groupId);
        } else {
            str = null;
        }
        String aid = aweme.getAid();
        Long adId = awemeRawAd.getAdId();
        if (adId != null) {
            str2 = String.valueOf(adId);
        } else {
            str2 = null;
        }
        String advId = awemeRawAd.getAdvId();
        String LJI = C59406NTe.LJI(aweme);
        String LIZIZ = C59406NTe.LIZIZ(aweme);
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            adDislikeInfo = awemeRawAd2.getDislikeInfo();
        }
        return new AdLiveEnterRoomConfig(valueOf, creativeIdStr, creativeIdStr2, logExtra, str, i, aid, str2, advId, LJI, LIZIZ, GsonProtectorUtils.toJson(LIZ, adDislikeInfo), null, 4096, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIJI(String str, String str2, Map map) {
        C86393XvR LJJIJIL;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && LJJIJIL.LIZIZ() != null) {
            C28835BTj.LIZ(str, str2, map, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZJ(Context context, Aweme aweme, int i, User user) {
        AwemeRawAd LJJJJI;
        Long creativeId;
        NT2 LIZJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        String LJIJJ = LJIJJ(aweme);
        if (LJIJJ == null) {
            return;
        }
        User user2 = null;
        if (aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                creativeId = awemeRawAd.getCreativeId();
            }
            creativeId = null;
        } else {
            if (C63081OpJ.LLF(aweme) && (LJJJJI = C63081OpJ.LJJJJI(aweme)) != null) {
                creativeId = LJJJJI.getCreativeId();
            }
            creativeId = null;
        }
        C59411NTj c59411NTj = C59411NTj.LIZIZ;
        c59411NTj.LIZ.LJJII(Integer.valueOf(i), creativeId, "open_ad_live", LJIJJ);
        if (o.LJ(LJIJJ, "full_screen_feed_live")) {
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null || (newLiveRoomData = aweme.getRoomFeedCellStruct().getNewLiveRoomData()) != null) {
                user2 = newLiveRoomData.owner;
            }
        } else {
            user2 = aweme.getAuthor();
        }
        if (user2 != null && user2.roomId == 0) {
            c59411NTj.LIZ.LJJII(Integer.valueOf(i), creativeId, "open_ad_live_room_id_null1", LJIJJ);
        }
        if (user != null) {
            user2 = user;
        } else if (user2 == null) {
            c59411NTj.LIZ.LJJII(Integer.valueOf(i), creativeId, "open_ad_live_user_null", LJIJJ);
            return;
        }
        if (user2.roomId == 0) {
            c59411NTj.LIZ.LJJII(Integer.valueOf(i), creativeId, "open_ad_live_room_id_null2", LJIJJ);
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mLogData.videoId = aweme.getAid();
        LIZLLL(aweme, enterRoomConfig, i);
        LiveOuterService.LJJJLL().LJIILL().LJIIZILJ(context, user2, enterRoomConfig);
        LJIIIIZZ();
        if (o.LJ(LJIJJ, "full_screen_feed_live")) {
            int LJJIIJ = LJJIIJ(i);
            if (!o.LJ(LJIJJ(aweme), "full_screen_feed_live") || LJJIIJ != 3) {
                return;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "click", aweme.getAwemeRawAd());
            C58655N0h LJJJJ = C63081OpJ.LJJJJ("homepage_ad", aweme, "click");
            if (LJJJJ != null) {
                LIZLLL = LJJJJ;
            }
            LIZLLL.LIZJ("photo", "refer");
            LIZLLL.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
            LIZLLL.LIZIZ(C59406NTe.LJI(aweme), "room_id");
            LIZLLL.LJI();
            return;
        }
        IAdSceneService LJII = AdSceneServiceImpl.LJII();
        if (LJII == null || (LIZJ = LJII.LIZJ()) == null) {
            return;
        }
        LIZJ.LJJIJ(context, aweme, i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJJII(Integer num, Long l, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("timing", str);
        jSONObject.putOpt("live_type", str2);
        if (num != null) {
            num.intValue();
            jSONObject.putOpt("click_from", num);
        }
        if (l != null) {
            l.longValue();
            jSONObject.putOpt("creative_id", l);
        }
        FMX.LJIILJJIL("ad_live_timing", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC37276Ek4 LJII(int i, String roomId, String str, long j, String str2) {
        o.LJIIIZ(roomId, "roomId");
        LiveAdCardApi.LIZ.getClass();
        return ((LiveAdCardApi) RetrofitFactory.LIZLLL().LIZ(C59415NTn.LIZIZ).LJFF().LIZ.LIZ(LiveAdCardApi.class)).getLiveAdCardInfo(roomId, str, str2, i, j);
    }
}
