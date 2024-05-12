package com.ss.android.ugc.aweme.web.realtimeres;

import X.C35998EAw;
import X.C37048EgO;
import X.C48841JEv;
import X.C58096Mr6;
import X.C58653N0f;
import X.C58685N1l;
import X.C74092vV;
import X.C78613UtF;
import X.C78983UzD;
import X.EHQ;
import X.EHR;
import X.EHS;
import X.EnumC39910FlS;
import X.O3U;
import X.XKX;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.newmedia.ad.WebAdUserAgentServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.log.AdWebEventLoger;
import com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdLandPageRealtimeResourceModule implements IAdLandPageRealtimeResourceModule {
    public final Set<String> LIZ = Collections.synchronizedSet(new LinkedHashSet());

    public static IAdLandPageRealtimeResourceModule LJFF() {
        Object LIZ = C58096Mr6.LIZ(IAdLandPageRealtimeResourceModule.class, false);
        if (LIZ != null) {
            return (IAdLandPageRealtimeResourceModule) LIZ;
        }
        if (C58096Mr6.k8 == null) {
            synchronized (IAdLandPageRealtimeResourceModule.class) {
                if (C58096Mr6.k8 == null) {
                    C58096Mr6.k8 = new AdLandPageRealtimeResourceModule();
                }
            }
        }
        return C58096Mr6.k8;
    }

    @Override // com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule
    public final Set<String> LJ() {
        Set<String> preconnectSet = this.LIZ;
        o.LJIIIIZZ(preconnectSet, "preconnectSet");
        return preconnectSet;
    }

    @Override // com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule
    public final void LIZJ(AwemeRawAd awemeRawAd) {
        Integer num;
        String webUrl;
        List<String> list;
        String str;
        if (awemeRawAd == null) {
            return;
        }
        LandingPageNetworkOptimization landingPageNetworkOptimization = awemeRawAd.getLandingPageNetworkOptimization();
        if (landingPageNetworkOptimization != null) {
            num = Integer.valueOf(landingPageNetworkOptimization.getNetworkOptimization());
            if (num != null && num.intValue() == 0) {
                return;
            }
        } else {
            num = null;
        }
        String channelName = awemeRawAd.getChannelName();
        if (channelName == null || ujb.o.LJJJJJL(channelName) || (webUrl = awemeRawAd.getWebUrl()) == null || ujb.o.LJJJJJL(webUrl)) {
            return;
        }
        C74092vV LJIILJJIL = AdLandPagePreloadServiceImpl.LJJI().LJIILJJIL(LIZLLL("feed", channelName));
        if (LJIILJJIL == null || (list = LJIILJJIL.LJI) == null) {
            return;
        }
        int i = 2;
        if (num == null) {
            return;
        }
        if (num.intValue() == 1 && awemeRawAd.getPreloadH5Type() == 2) {
            num = 2;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            AdWebEventLoger adWebEventLoger = new AdWebEventLoger();
            C58685N1l.LIZ.getClass();
            C58653N0f event = C58685N1l.LJJJJLI;
            String creativeIdStr = awemeRawAd.getCreativeIdStr();
            o.LJIIIIZZ(creativeIdStr, "rawAd.creativeIdStr");
            String logExtra = awemeRawAd.getLogExtra();
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str = String.valueOf(groupId);
            } else {
                str = null;
            }
            o.LJIIIZ(event, "event");
            adWebEventLoger.LJJIIJZLJL(event, creativeIdStr, logExtra, str, null);
            IWebAdUserAgentService LIZIZ = WebAdUserAgentServiceImpl.LIZIZ();
            o.LJIIIIZZ(webUrl, "webUrl");
            LJIIIIZZ(webUrl, new LinkedHashMap(), LIZIZ.LIZ(null, webUrl, awemeRawAd.isEnableWebGoogleLogin()));
            LJI(10, list);
            return;
        }
        if (num.intValue() != 2) {
            return;
        }
        if (awemeRawAd.getPreloadH5Type() == 2) {
            i = 10;
        }
        LJI(i, list);
    }

    public final void LJII(String str) {
        if (str == null || ujb.o.LJJJJJL(str) || o.LJ(str, "null")) {
            return;
        }
        String LIZIZ = C35998EAw.LIZIZ(str);
        if (LIZIZ != null && !ujb.o.LJJJJJL(LIZIZ)) {
            this.LIZ.add(LIZIZ);
        }
        try {
            TTNetInit.preconnectUrl(str);
        } catch (Exception unused) {
            C78983UzD.LJIILJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule
    public final void LLLJL(Aweme aweme) {
        this.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule
    public final String LIZLLL(String channelScene, String str) {
        o.LJIIIZ(channelScene, "channelScene");
        return O3U.LIZJ(AdLandPagePreloadServiceImpl.LJJI().LJIIL(channelScene), str);
    }

    public final void LJI(int i, List<String> list) {
        int min = Math.min(i, list.size());
        for (int i2 = 0; i2 < min; i2++) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new EHR(this, (String) ListProtector.get(list, i2), null), 3);
        }
    }

    public static void LJIIIIZZ(String str, Map map, Map map2) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        Forest forest = AdWebViewInterceptorService.LIZJ().LIZIZ().LIZ;
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setDisableOffline(true);
        requestParams.setEnableMemoryCache(Boolean.TRUE);
        requestParams.setLoadToMemory(true);
        requestParams.setDisableBuiltin(true);
        requestParams.setNetWorker(EnumC39910FlS.TTNet);
        requestParams.setWebResourceRequest(new C37048EgO(str, map, map2));
        Forest.preload$default(forest, str, requestParams, false, null, null, 28, null);
    }

    @Override // com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule
    public final void LIZ(String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new EHQ(str2, this, "feed", str3, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule
    public final void LIZIZ(String str, String str2, String str3, AwemeRawAd awemeRawAd) {
        if (str == null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new EHS(str2, this, "feed", str3, str, awemeRawAd, null), 3);
    }
}
