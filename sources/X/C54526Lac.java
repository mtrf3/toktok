package X;

import android.os.SystemClock;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.poi.experiment.NearbyPreloadGeckoExperiment;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailPagePreloadGeckoExperiment;
import com.ss.android.ugc.aweme.poi.experiment.PoiReviewBannerPreloadGeckoExperiment;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiGeckoSyncChannels;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS15S0200100_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lac, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54526Lac {
    public static boolean LIZLLL;
    public static final java.util.Map<OSZ<EnumC54527Lad, C8TX>, InterfaceC88474Ynu<EnumC54527Lad, InterfaceC88472Yns<? super String, C76800UCe>, InterfaceC88472Yns<? super String, C76800UCe>, InterfaceC88472Yns<? super String, C76800UCe>, C76800UCe>> LIZ = new LinkedHashMap();
    public static final java.util.Map<EnumC54527Lad, List<String>> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<EnumC54527Lad, List<String>> LIZJ = new LinkedHashMap();
    public static final InterfaceC54498LaA LJ = LQA.LIZIZ.LJIIJJI();
    public static final C54525Lab LJFF = C54525Lab.LJLIL;
    public static final C54528Lae LJI = C54528Lae.LJLIL;

    static {
        List<String> list;
        for (EnumC54527Lad enumC54527Lad : EnumC54527Lad.values()) {
            java.util.Map<EnumC54527Lad, List<String>> map = LIZIZ;
            int i = C54529Laf.LIZ[enumC54527Lad.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        PoiGeckoSyncChannels poiGeckoSyncChannels = C9CD.LIZ().geckoSyncChannels;
                        if (poiGeckoSyncChannels == null || (list = poiGeckoSyncChannels.poiReviewBannerGeckoChannels) == null) {
                            list = C61878OQg.INSTANCE;
                        }
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    PoiGeckoSyncChannels poiGeckoSyncChannels2 = C9CD.LIZ().geckoSyncChannels;
                    if (poiGeckoSyncChannels2 == null || (list = poiGeckoSyncChannels2.poiDetailGeckoChannels) == null) {
                        list = C61878OQg.INSTANCE;
                    }
                }
            } else {
                PoiGeckoSyncChannels poiGeckoSyncChannels3 = C9CD.LIZ().geckoSyncChannels;
                if (poiGeckoSyncChannels3 == null || (list = poiGeckoSyncChannels3.nearbyGeckoChannels) == null) {
                    list = C61878OQg.INSTANCE;
                }
            }
            map.put(enumC54527Lad, list);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
        linkedHashMap.clear();
        PoiDetailPagePreloadGeckoExperiment.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        PoiDetailPagePreloadGeckoExperiment.PoiDetailPreLoadGeckoConfig poiDetailPreLoadGeckoConfig = PoiDetailPagePreloadGeckoExperiment.LIZIZ;
        LJIIIZ.getClass();
        PoiDetailPagePreloadGeckoExperiment.PoiDetailPreLoadGeckoConfig poiDetailPreLoadGeckoConfig2 = (PoiDetailPagePreloadGeckoExperiment.PoiDetailPreLoadGeckoConfig) FFL.LJIJ(false, "gecko_sync_poi_detail", 31744, PoiDetailPagePreloadGeckoExperiment.PoiDetailPreLoadGeckoConfig.class, poiDetailPreLoadGeckoConfig);
        if (poiDetailPreLoadGeckoConfig2 == null) {
            poiDetailPreLoadGeckoConfig2 = poiDetailPreLoadGeckoConfig;
        }
        if (poiDetailPreLoadGeckoConfig2.strategy == 1) {
            linkedHashMap.put(new OSZ(EnumC54527Lad.POI_DETAIL, C8TX.FIRST_FRAME), LJI);
        }
        FFL.LJIIIZ().getClass();
        PoiDetailPagePreloadGeckoExperiment.PoiDetailPreLoadGeckoConfig poiDetailPreLoadGeckoConfig3 = (PoiDetailPagePreloadGeckoExperiment.PoiDetailPreLoadGeckoConfig) FFL.LJIJ(false, "gecko_sync_poi_detail", 31744, PoiDetailPagePreloadGeckoExperiment.PoiDetailPreLoadGeckoConfig.class, poiDetailPreLoadGeckoConfig);
        if (poiDetailPreLoadGeckoConfig3 != null) {
            poiDetailPreLoadGeckoConfig = poiDetailPreLoadGeckoConfig3;
        }
        if (poiDetailPreLoadGeckoConfig.strategy == 2) {
            linkedHashMap.put(new OSZ(EnumC54527Lad.POI_DETAIL, C8TX.NONE_FIRST_FRAME), LJI);
        }
        PoiReviewBannerPreloadGeckoExperiment.LIZ.getClass();
        FFL LJIIIZ2 = FFL.LJIIIZ();
        PoiReviewBannerPreloadGeckoExperiment.PoiReviewBannerPreLoadGeckoConfig poiReviewBannerPreLoadGeckoConfig = PoiReviewBannerPreloadGeckoExperiment.LIZIZ;
        LJIIIZ2.getClass();
        PoiReviewBannerPreloadGeckoExperiment.PoiReviewBannerPreLoadGeckoConfig poiReviewBannerPreLoadGeckoConfig2 = (PoiReviewBannerPreloadGeckoExperiment.PoiReviewBannerPreLoadGeckoConfig) FFL.LJIJ(false, "gecko_sync_review_banner", 31744, PoiReviewBannerPreloadGeckoExperiment.PoiReviewBannerPreLoadGeckoConfig.class, poiReviewBannerPreLoadGeckoConfig);
        if (poiReviewBannerPreLoadGeckoConfig2 != null) {
            poiReviewBannerPreLoadGeckoConfig = poiReviewBannerPreLoadGeckoConfig2;
        }
        if (poiReviewBannerPreLoadGeckoConfig.strategy == 1) {
            linkedHashMap.put(new OSZ(EnumC54527Lad.REVIEW_BANNER, C8TX.FIRST_FRAME), LJI);
        }
        if (NearbyPreloadGeckoExperiment.LIZ().strategy == 1) {
            linkedHashMap.put(new OSZ(EnumC54527Lad.NEARBY, C8TX.FIRST_FRAME), LJI);
        }
        if (NearbyPreloadGeckoExperiment.LIZ().strategy == 2) {
            linkedHashMap.put(new OSZ(EnumC54527Lad.NEARBY, C8TX.NONE_FIRST_FRAME), LJFF);
        }
    }

    public static void LIZ(EnumC54527Lad enumC54527Lad, List list, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC88472Yns interfaceC88472Yns3) {
        if (list == null) {
            return;
        }
        java.util.Map<EnumC54527Lad, List<String>> map = LIZJ;
        if (o.LJ(((LinkedHashMap) map).get(enumC54527Lad), list)) {
            return;
        }
        map.put(enumC54527Lad, list);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AqS15S0200100_9 aqS15S0200100_9 = new AqS15S0200100_9(elapsedRealtime, enumC54527Lad, interfaceC88472Yns, 0);
        AqS15S0200100_9 aqS15S0200100_92 = new AqS15S0200100_9(elapsedRealtime, enumC54527Lad, interfaceC88472Yns2, 1);
        AqS15S0200100_9 aqS15S0200100_93 = new AqS15S0200100_9(elapsedRealtime, enumC54527Lad, interfaceC88472Yns3, 2);
        String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
        C61520OCm LIZ2 = O3E.LIZ(accessKey);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str;
            arrayList.add(targetChannel);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put(accessKey, arrayList);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setEnableThrottle(true);
            optionCheckUpdateParams.setEnableRetry(true);
            optionCheckUpdateParams.setListener(new C54530Lag(aqS15S0200100_92, aqS15S0200100_9, aqS15S0200100_93));
            if (LIZ2 != null) {
                LIZ2.LIZ("default", hashMap, optionCheckUpdateParams);
            }
        }
    }
}
