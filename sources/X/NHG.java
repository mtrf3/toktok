package X;

import Y.ACallableS37S1100000_10;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NHG {
    public static final NHG LIZ = new NHG();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(NH2.LJLIL);
    public static final ConcurrentHashMap<String, ION> LIZJ = new ConcurrentHashMap<>();
    public static final HashMap<String, C60712Zv> LIZLLL = new HashMap<>();
    public static final C73849Syb<NHJ> LJ = new C73849Syb<>();

    public static final void LIZLLL() {
        LJ.onNext(NHK.LIZ);
    }

    public static List LJ() {
        return (List) LIZIZ.getValue();
    }

    public static final void LJIILIIL() {
        NHI event = NHI.LIZ;
        o.LJIIIZ(event, "event");
        LJ.onNext(event);
        boolean z = false;
        for (Map.Entry<String, ION> entry : LIZJ.entrySet()) {
            AwemeRawAd awemeRawAd = entry.getValue().LIZJ;
            if (awemeRawAd != null) {
                entry.getValue().LIZJ = null;
                if (!z && awemeRawAd.getPreloadWebNew() == 1) {
                    AdLandPagePreloadServiceImpl.LJJI().LJFF(awemeRawAd);
                    z = true;
                }
            }
        }
    }

    public final C73775SxP LJFF() {
        return LJ.LJJIFFI(C78886Uxe.LJLILLLLZI).LJIILIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIIZ(final String str) {
        HashMap<String, C60712Zv> hashMap = LIZLLL;
        final long currentTimeMillis = System.currentTimeMillis();
        hashMap.put(str, new Object(str, currentTimeMillis) { // from class: X.2Zv
            public final String LIZ;
            public final long LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C60712Zv)) {
                    return false;
                }
                C60712Zv c60712Zv = (C60712Zv) obj;
                return o.LJ(this.LIZ, c60712Zv.LIZ) && this.LIZIZ == c60712Zv.LIZIZ;
            }

            public final int hashCode() {
                String str2 = this.LIZ;
                return C16880lQ.LLJIJIL(this.LIZIZ) + ((str2 == null ? 0 : str2.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PreloadAdWebStateMsg(channel=");
                LIZ2.append(this.LIZ);
                LIZ2.append(", clickTime=");
                return C47135Ieh.LIZIZ(LIZ2, this.LIZIZ, ')', LIZ2);
            }

            {
                this.LIZ = str;
                this.LIZIZ = currentTimeMillis;
            }
        });
    }

    public static final void LJIILLIIL(List<String> list) {
        String str;
        if (list != null) {
            for (String str2 : list) {
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    str = LJJI.LJIIL("lynx_feed");
                } else {
                    str = null;
                }
                LIZJ(str2, str);
            }
        }
    }

    public final void LJII(String str) {
        if (str != null && LJ().contains(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("active_status", 1);
            hashMap.put("channel", str);
            C58764N4m LIZ2 = C58766N4o.LIZ();
            LIZ2.LIZ = "draw_ad";
            LIZ2.LIZIZ = "active_finish";
            LIZ2.LJII("card_common");
            LIZ2.LIZ(hashMap);
            LIZ2.LIZLLL();
            LIZ2.LJIIIIZZ();
            C58655N0h LJ2 = C58704N2e.LJ("draw_ad", "active_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            LJ2.LIZJ("debug", "ad_event_type");
            LJ2.LIZJ("card_common", "refer");
            LJ2.LIZ(hashMap);
            LJ2.LJII();
            LIZJ.remove(str);
        }
    }

    public static void LIZ(Aweme aweme, List list) {
        List<AnchorCommonStruct> anchors;
        List geckoChannel;
        WikipediaExtra wikipediaExtra;
        Integer status;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            try {
                wikipediaExtra = (WikipediaExtra) new Gson().LJI(anchorCommonStruct2.getExtra(), WikipediaExtra.class);
            } catch (Exception unused) {
                if (C78685UuP.LJJJZ(anchorCommonStruct2.getSchema()) && C78685UuP.LJJJZ(anchorCommonStruct2.getKeyword()) && anchorCommonStruct2.getGeneralType() == 1) {
                }
            }
            if (C78685UuP.LJJJZ(anchorCommonStruct2.getSchema())) {
                if (C78685UuP.LJJJZ(anchorCommonStruct2.getKeyword())) {
                    if (anchorCommonStruct2.getGeneralType() == 1) {
                        if (wikipediaExtra != null && (status = wikipediaExtra.getStatus()) != null && status.intValue() == 2) {
                        }
                        arrayList.add(anchorCommonStruct);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) it.next();
            String extra = anchorCommonStruct3.getExtra();
            if (extra != null && extra.length() != 0) {
                j parse = GsonProtectorUtils.parse(new com.google.gson.o(), anchorCommonStruct3.getExtra());
                if (!(parse instanceof m)) {
                    return;
                }
                m LJIIZILJ = parse.LJIIZILJ();
                Boolean bool = (Boolean) GsonProtectorUtils.fromJson(new Gson(), LJIIZILJ.LJJIJ("is_schema_lynx"), new NHH().getType());
                if (bool != null && bool.booleanValue() && (geckoChannel = (List) GsonProtectorUtils.fromJson(new Gson(), LJIIZILJ.LJJIJ("gecko_channel"), new TypeToken<List<? extends String>>() { // from class: X.2Qq
                }.getType())) != null && !geckoChannel.isEmpty()) {
                    o.LJIIIIZZ(geckoChannel, "geckoChannel");
                    ((ArrayList) list).addAll(geckoChannel);
                }
            }
        }
    }

    public static final int LIZIZ(String str, String str2) {
        String str3;
        String str4;
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI == null) {
            return 0;
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZIZ() == null) {
            return 0;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if (!O3U.LIZ(LJJI.LJIIL(str3), str)) {
            return 0;
        }
        if (NH3.LIZ() != null) {
            str4 = NTF.LJII(str, str2);
        } else {
            str4 = null;
        }
        if (C74102vW.LIZ(str4) != null) {
            return 2;
        }
        return -2;
    }

    public static void LIZJ(String str, String str2) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZIZ() != null) {
            NJP.LIZIZ(str, str2, null);
        }
    }

    public static final void LJIIIIZZ(List<? extends Pair<String, Long>> list, boolean z) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Pair<String, Long> pair : list) {
            ION ion = LIZJ.get(pair.first);
            if (ion != null) {
                HashMap hashMap = new HashMap();
                Object obj = pair.first;
                o.LJIIIIZZ(obj, "pair.first");
                hashMap.put("channel_name", obj);
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    LJJI.LJIJ();
                    hashMap.put("landing_type", 2);
                }
                Object obj2 = pair.second;
                o.LJIIIIZZ(obj2, "pair.second");
                long longValue = ((Number) obj2).longValue();
                if (z) {
                    i = 1;
                } else if (longValue != 0) {
                    i = 2;
                }
                hashMap.put("response_status", Integer.valueOf(i));
                C58764N4m LIZ2 = C58766N4o.LIZ();
                LIZ2.LIZIZ = "ad_landing_channel_query";
                LIZ2.LIZ = "ad_wap_stat";
                LIZ2.LIZJ(Long.valueOf(ion.LIZ));
                LIZ2.LJFF(ion.LIZIZ);
                LIZ2.LIZ(hashMap);
                LIZ2.LIZLLL();
                LIZ2.LJIIIIZZ();
                C58655N0h LJ2 = C58704N2e.LJ("ad_wap_stat", "ad_landing_channel_query", String.valueOf(ion.LIZ), ion.LIZIZ, null);
                LJ2.LIZJ("debug", "ad_event_type");
                LJ2.LIZ(hashMap);
                LJ2.LJII();
                return;
            }
        }
    }

    public static final void LJIIL(String str, boolean z) {
        if (str == null) {
            return;
        }
        String str2 = null;
        if (LJ().contains(str)) {
            ION ion = new ION(0L, str2, 7);
            ion.LIZLLL = System.currentTimeMillis();
            LIZJ.put(str, ion);
            HashMap hashMap = new HashMap();
            ion.LJ = z ? 1 : 0;
            hashMap.put("is_diff", Integer.valueOf(z ? 1 : 0));
            hashMap.put("channel", str);
            C58764N4m LIZ2 = C58766N4o.LIZ();
            LIZ2.LIZ = "draw_ad";
            LIZ2.LIZIZ = "download_start";
            LIZ2.LJII("card_common");
            LIZ2.LIZ(hashMap);
            LIZ2.LIZLLL();
            LIZ2.LJIIIIZZ();
            C58655N0h LJ2 = C58704N2e.LJ("draw_ad", "download_start", CardStruct.IStatusCode.DEFAULT, null, null);
            LJ2.LIZJ("debug", "ad_event_type");
            LJ2.LIZJ("card_common", "refer");
            LJ2.LIZ(hashMap);
            LJ2.LJII();
            return;
        }
        ION ion2 = LIZJ.get(str);
        if (ion2 != null) {
            ion2.LIZLLL = System.currentTimeMillis();
            HashMap hashMap2 = new HashMap();
            ion2.LJ = z ? 1 : 0;
            hashMap2.put("is_diff", Integer.valueOf(z ? 1 : 0));
            hashMap2.put("channel_name", str);
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                LJJI.LJIJ();
                hashMap2.put("landing_type", 2);
            }
            C58764N4m LIZ3 = C58766N4o.LIZ();
            LIZ3.LIZIZ = "ad_landing_channel_download_start";
            LIZ3.LIZ = "ad_wap_stat";
            LIZ3.LIZJ(Long.valueOf(ion2.LIZ));
            LIZ3.LJFF(ion2.LIZIZ);
            LIZ3.LIZ(hashMap2);
            LIZ3.LIZLLL();
            LIZ3.LJIIIIZZ();
            C58655N0h LJ3 = C58704N2e.LJ("ad_wap_stat", "ad_landing_channel_download_start", String.valueOf(ion2.LIZ), ion2.LIZIZ, null);
            LJ3.LIZJ("debug", "ad_event_type");
            LJ3.LIZ(hashMap2);
            LJ3.LJII();
        }
    }

    public final void LJI(String str, Throwable th) {
        String str2;
        if (str != null && LJ().contains(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("active_status", 0);
            hashMap.put("channel", str);
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            hashMap.put("fail_reason", str2);
            C58764N4m LIZ2 = C58766N4o.LIZ();
            LIZ2.LIZ = "draw_ad";
            LIZ2.LIZIZ = "active_finish";
            LIZ2.LJII("card_common");
            LIZ2.LIZ(hashMap);
            LIZ2.LIZLLL();
            LIZ2.LJIIIIZZ();
            C58655N0h LJ2 = C58704N2e.LJ("draw_ad", "active_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            LJ2.LIZJ("debug", "ad_event_type");
            LJ2.LIZJ("card_common", "refer");
            LJ2.LIZ(hashMap);
            LJ2.LJII();
            LIZJ.remove(str);
        }
    }

    public final void LJIILJJIL(String str, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C58582Rq.LIZIZ(EF7.LIZIZ(), "Feed data update");
        C10K.LIZJ(new ACallableS37S1100000_10(list, str, 6));
        IEcUgVSAService LJIIJJI = EcUgVSAService.LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.LJII(list);
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZIZ() != null) {
            NJP.LJIIIZ(list);
        }
    }

    public final void LJIILL(String str, OJP ojp) {
        if (ojp != null) {
            NHL event = NHL.LIZ;
            o.LJIIIZ(event, "event");
            LJ.onNext(event);
        }
        C10K.LIZJ(new ACallableS37S1100000_10(ojp, str, 7));
    }

    public final void LJIIJJI(long j, long j2, String str) {
        if (str == null) {
            return;
        }
        if (LJ().contains(str)) {
            ConcurrentHashMap<String, ION> concurrentHashMap = LIZJ;
            ION ion = concurrentHashMap.get(str);
            if (ion == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("download_status", 1);
            hashMap.put("is_diff", Integer.valueOf(ion.LJ));
            hashMap.put("download_duration", Long.valueOf(System.currentTimeMillis() - ion.LIZLLL));
            hashMap.put("download_size", Long.valueOf(j2));
            hashMap.put("package_id", Long.valueOf(j));
            hashMap.put("channel", str);
            C58764N4m LIZ2 = C58766N4o.LIZ();
            LIZ2.LIZ = "draw_ad";
            LIZ2.LIZIZ = "download_finish";
            LIZ2.LJII("card_common");
            LIZ2.LIZ(hashMap);
            LIZ2.LIZLLL();
            LIZ2.LJIIIIZZ();
            C58655N0h LJ2 = C58704N2e.LJ("draw_ad", "download_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            LJ2.LIZJ("debug", "ad_event_type");
            LJ2.LIZJ("card_common", "refer");
            LJ2.LIZ(hashMap);
            LJ2.LJII();
            concurrentHashMap.remove(str);
            return;
        }
        ConcurrentHashMap<String, ION> concurrentHashMap2 = LIZJ;
        ION ion2 = concurrentHashMap2.get(str);
        if (ion2 != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("download_status", 1);
            hashMap2.put("is_diff", Integer.valueOf(ion2.LJ));
            hashMap2.put("channel_name", str);
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                LJJI.LJIJ();
                hashMap2.put("landing_type", 2);
            }
            hashMap2.put("download_duration", Long.valueOf(System.currentTimeMillis() - ion2.LIZLLL));
            hashMap2.put("download_size", Long.valueOf(j2));
            hashMap2.put("package_id", Long.valueOf(j));
            C58764N4m LIZ3 = C58766N4o.LIZ();
            LIZ3.LIZIZ = "ad_landing_channel_download_finish";
            LIZ3.LIZ = "ad_wap_stat";
            LIZ3.LIZJ(Long.valueOf(ion2.LIZ));
            LIZ3.LJFF(ion2.LIZIZ);
            LIZ3.LIZLLL();
            LIZ3.LIZ(hashMap2);
            LIZ3.LJIIIIZZ();
            C58655N0h LJ3 = C58704N2e.LJ("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(ion2.LIZ), ion2.LIZIZ, null);
            LJ3.LIZJ("debug", "ad_event_type");
            LJ3.LIZ(hashMap2);
            LJ3.LJII();
            concurrentHashMap2.remove(str);
        }
    }

    public static final void LJIIJ(long j, String str, long j2, Throwable th) {
        String message;
        String message2;
        if (str == null) {
            return;
        }
        String str2 = "";
        if (LJ().contains(str)) {
            ConcurrentHashMap<String, ION> concurrentHashMap = LIZJ;
            ION ion = concurrentHashMap.get(str);
            if (ion == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("download_status", 0);
            hashMap.put("is_diff", Integer.valueOf(ion.LJ));
            hashMap.put("download_duration", Long.valueOf(System.currentTimeMillis() - ion.LIZLLL));
            hashMap.put("download_size", Long.valueOf(j2));
            hashMap.put("package_id", Long.valueOf(j));
            hashMap.put("channel", str);
            if (th != null && (message2 = th.getMessage()) != null) {
                str2 = message2;
            }
            hashMap.put("fail_reason", str2);
            C58764N4m LIZ2 = C58766N4o.LIZ();
            LIZ2.LIZ = "draw_ad";
            LIZ2.LIZIZ = "download_finish";
            LIZ2.LJII("card_common");
            LIZ2.LIZ(hashMap);
            LIZ2.LIZLLL();
            LIZ2.LJIIIIZZ();
            C58655N0h LJ2 = C58704N2e.LJ("draw_ad", "download_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            LJ2.LIZJ("debug", "ad_event_type");
            LJ2.LIZJ("card_common", "refer");
            LJ2.LIZ(hashMap);
            LJ2.LJII();
            concurrentHashMap.remove(str);
            return;
        }
        ConcurrentHashMap<String, ION> concurrentHashMap2 = LIZJ;
        ION ion2 = concurrentHashMap2.get(str);
        if (ion2 != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("download_status", 0);
            hashMap2.put("is_diff", Integer.valueOf(ion2.LJ));
            hashMap2.put("channel_name", str);
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                LJJI.LJIJ();
                hashMap2.put("landing_type", 2);
            }
            hashMap2.put("download_duration", Long.valueOf(System.currentTimeMillis() - ion2.LIZLLL));
            hashMap2.put("download_size", Long.valueOf(j2));
            if (th != null && (message = th.getMessage()) != null) {
                str2 = message;
            }
            hashMap2.put("download_fail_reason", str2);
            hashMap2.put("package_id", Long.valueOf(j));
            C58764N4m LIZ3 = C58766N4o.LIZ();
            LIZ3.LIZIZ = "ad_landing_channel_download_finish";
            LIZ3.LIZ = "ad_wap_stat";
            LIZ3.LIZJ(Long.valueOf(ion2.LIZ));
            LIZ3.LJFF(ion2.LIZIZ);
            LIZ3.LIZ(hashMap2);
            LIZ3.LIZLLL();
            LIZ3.LJIIIIZZ();
            C58655N0h LJ3 = C58704N2e.LJ("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(ion2.LIZ), ion2.LIZIZ, null);
            LJ3.LIZJ("debug", "ad_event_type");
            LJ3.LIZ(hashMap2);
            LJ3.LJII();
            concurrentHashMap2.remove(str);
        }
    }

    public static final void LJIIZILJ(Integer num, long j, String str, String str2, NativeSiteConfig nativeSiteConfig) {
        List<String> geckoChannel;
        String str3;
        String str4 = null;
        if (num == null) {
            return;
        }
        int i = 4;
        if (num.intValue() == 4) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                str4 = LJJI.LJIIL("splash");
            }
            LIZJ(str, str4);
            if (str != null) {
                LIZJ.put(str, new ION(j, str2, i));
            }
            IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI2 == null) {
                return;
            }
            LJJI2.LJIIIZ(Long.valueOf(j), str);
            return;
        }
        if (num.intValue() != 9 || nativeSiteConfig == null || (geckoChannel = nativeSiteConfig.getGeckoChannel()) == null) {
            return;
        }
        for (String str5 : geckoChannel) {
            IAdLandPagePreloadService LJJI3 = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI3 != null) {
                str3 = LJJI3.LJIIL("lynx_feed");
            } else {
                str3 = null;
            }
            LIZJ(str5, str3);
        }
    }
}
