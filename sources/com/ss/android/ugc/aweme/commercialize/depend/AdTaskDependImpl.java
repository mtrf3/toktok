package com.ss.android.ugc.aweme.commercialize.depend;

import X.AnonymousClass114;
import X.AnonymousClass446;
import X.C16880lQ;
import X.C224488rU;
import X.C251809uS;
import X.C251839uV;
import X.C3EA;
import X.C45804HyK;
import X.C57415Mg7;
import X.C57422MgE;
import X.C58096Mr6;
import X.C59209NLp;
import X.C59252NNg;
import X.C59287NOp;
import X.C59294NOw;
import X.C61200O0e;
import X.C78983UzD;
import X.FGR;
import X.NN1;
import X.NO5;
import X.NOD;
import X.NOE;
import X.NOP;
import X.ORY;
import Y.ACallableS82S0101000_11;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.SplashAdConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMChatExt;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdTaskDependImpl implements IAdTaskDepend {
    public static IAdTaskDepend LJIIZILJ() {
        Object LIZ = C58096Mr6.LIZ(IAdTaskDepend.class, false);
        if (LIZ != null) {
            return (IAdTaskDepend) LIZ;
        }
        if (C58096Mr6.LLLLIIIILLL == null) {
            synchronized (IAdTaskDepend.class) {
                if (C58096Mr6.LLLLIIIILLL == null) {
                    C58096Mr6.LLLLIIIILLL = new AdTaskDependImpl();
                }
            }
        }
        return C58096Mr6.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final String LJ() {
        return SharePrefCache.inst().getJsActlogUrl().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILL() {
        CommerceAdLandpageBulletConfig LIZ = C59287NOp.LIZ();
        if (LIZ == null || !LIZ.getTotalEnable()) {
            return false;
        }
        return LIZ.getAdLandpageRealEnable();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LIZIZ(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        C224488rU.LIZJ(openUrl);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        C224488rU.LIZIZ(context, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LJFF(Context context) {
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null) {
            return;
        }
        AnonymousClass114.LIZ(LJIJJ, R.string.b95);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJI(AwemeRawAd awemeRawAd) {
        if (C59252NNg.LJII(awemeRawAd) || C59252NNg.LJFF(awemeRawAd)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final Intent LJIIL(Context context) {
        o.LJIIIZ(context, "context");
        return new Intent(context, (Class<?>) CrossPlatformActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILJJIL(String str) {
        return OpenChatExt.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean open(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        return C61200O0e.LIZLLL().LJII(openUrl);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZ(Context context, String str) {
        return C57422MgE.LIZIZ(context, str, null, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJII(int i, Context context) {
        o.LJIIIZ(context, "context");
        return NO5.LJIIL(context, i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIIIIZZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        return NOE.LJJIIZ(context, str, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final JSONObject LJIIIZ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        return NN1.LJIIIZ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIIJJI(String str, String str2, boolean z) {
        String[] strArr;
        boolean z2 = false;
        if (!z || !o.LJ(str, "app")) {
            return false;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            SplashAdConfig splashAdConfig = (SplashAdConfig) SettingsManager.LJII("ad_splash_config", SplashAdConfig.class);
            if (splashAdConfig != null && (strArr = splashAdConfig.appNameAllowList) != null && ORY.LJJIJIIJIL(str2, strArr)) {
                z2 = true;
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        return !z2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILIIL(Context context, AwemeRawAd awemeRawAd, String url) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(context, "context");
        return NOP.LIZIZ(context, awemeRawAd, url);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LIZLLL(Context context, String schema, String str, Bundle bundle) {
        String str2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        if (C59294NOw.LIZ()) {
            Uri.Builder buildUpon = UriProtector.parse(schema).buildUpon();
            buildUpon.appendQueryParameter("use_spark", "1");
            IAdSparkUtils LJFF = AdSparkUtils.LJFF();
            if (LJFF != null) {
                String builder = buildUpon.toString();
                o.LJIIIIZZ(builder, "urlBuilder.toString()");
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    str2 = LJJI.LJIIL("lynx_feed");
                } else {
                    str2 = null;
                }
                LJFF.LIZLLL(context, builder, bundle, str2, C59209NLp.LIZIZ(), false);
                return;
            }
            return;
        }
        C57415Mg7.LIZIZ(context, schema, str, bundle);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILLIIL(final String str, String str2, String str3, String str4, final Context context) {
        String queryParameter;
        if (!OpenChatExt.LIZIZ(str2)) {
            queryParameter = null;
        } else {
            queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str2), "uid");
        }
        final AnonymousClass446 anonymousClass446 = new AnonymousClass446(str3, str4);
        final Looper LLJJJJ = C16880lQ.LLJJJJ();
        Handler handler = new Handler(LLJJJJ) { // from class: X.3uX
            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                o.LJIIIZ(msg, "msg");
                super.handleMessage(msg);
                if (msg.obj instanceof User) {
                    IMChatExt iMChatExt = new IMChatExt();
                    iMChatExt.commerceScene = "video";
                    iMChatExt.objectId = str;
                    InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                    Context context2 = context;
                    Object obj = msg.obj;
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    C98593tv c98593tv = new C98593tv(context2, IMUser.fromUser((User) obj));
                    c98593tv.setImAdLog(anonymousClass446);
                    c98593tv.setChatExt(iMChatExt);
                    imChatService.LJFF(c98593tv);
                }
            }
        };
        C251839uV.LIZ().getClass();
        String LIZJ = C251809uS.LIZJ(0, Boolean.TRUE, null, queryParameter, null);
        C3EA.LIZ(LIZJ);
        FGR.LIZIZ().LIZ(handler, new ACallableS82S0101000_11(2, LIZJ, 1), 0);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIIJ(Context context, AwemeRawAd awemeRawAd, String url, String title, String awemeId, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(awemeId, "awemeId");
        NOD nod = new NOD();
        nod.LIZ = context;
        nod.LIZIZ = awemeRawAd;
        nod.LJFF = url;
        nod.LJI = title;
        nod.LIZ(awemeId);
        nod.LIZLLL = i;
        return NO5.LJIILL(nod);
    }
}
