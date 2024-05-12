package X;

import android.app.Application;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NvJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60905NvJ {
    public static JSONArray LIZ;
    public static List<Pattern> LIZIZ;

    public static C39902FlK LIZ(C60737Nsb c60737Nsb) {
        String str;
        IResourceService iResourceService;
        String str2;
        String str3;
        C39902FlK c39902FlK;
        if (c60737Nsb != null && (c39902FlK = (C39902FlK) c60737Nsb.LIZIZ(C39902FlK.class)) != null) {
            return c39902FlK;
        }
        String str4 = "hybridkit_default_bid";
        if (c60737Nsb == null || (iResourceService = (IResourceService) c60737Nsb.LIZIZ(IResourceService.class)) == null) {
            C61483OBb.LIZJ.getClass();
            C61483OBb LIZIZ2 = C61484OBc.LIZIZ();
            if (c60737Nsb == null || (str = c60737Nsb.bid) == null) {
                str = "hybridkit_default_bid";
            }
            iResourceService = (IResourceService) LIZIZ2.LIZIZ(IResourceService.class, str);
            if (iResourceService == null) {
                C61483OBb.LIZJ.getClass();
                C61483OBb LIZIZ3 = C61484OBc.LIZIZ();
                if (c60737Nsb != null && (str2 = c60737Nsb.bid) != null) {
                    str4 = str2;
                }
                return (C39902FlK) LIZIZ3.LIZIZ(C39902FlK.class, str4);
            }
        }
        String bid = iResourceService.getBid();
        C61483OBb.LIZJ.getClass();
        C61483OBb LIZIZ4 = C61484OBc.LIZIZ();
        if (c60737Nsb != null && (str3 = c60737Nsb.bid) != null) {
            str4 = str3;
        }
        C39902FlK c39902FlK2 = (C39902FlK) LIZIZ4.LIZIZ(C39902FlK.class, str4);
        if (c39902FlK2 != null && o.LJ(c39902FlK2.LIZIZ, bid)) {
            return c39902FlK2;
        }
        Application application = C61270O2w.LIZ.LIZJ;
        if (application != null) {
            C39902FlK c39902FlK3 = new C39902FlK(application, new C39917FlZ(iResourceService.getResourceConfig()));
            C61484OBc.LIZIZ().LIZ(bid, C39902FlK.class, c39902FlK3);
            return c39902FlK3;
        }
        o.LJIIZILJ();
        throw null;
    }

    public static boolean LJIIJ(String str) {
        JSONArray jSONArray = LIZ;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String data = JSONArrayProtectorUtils.getString(jSONArray, i);
                o.LJFF(data, "data");
                if (s.LJJJLZIJ(str, data, false) || o.LJ(data, "*")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static InterfaceC61488OBg LIZIZ(C60737Nsb c60737Nsb, Boolean bool) {
        boolean z;
        String str;
        InterfaceC61488OBg LIZIZ2;
        if (bool == null) {
            if (c60737Nsb != null) {
                InterfaceC60710NsA interfaceC60710NsA = c60737Nsb.hybridParams;
                if (interfaceC60710NsA != null) {
                    z = interfaceC60710NsA.LIZJ();
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            return LIZ(c60737Nsb);
        }
        if (c60737Nsb == null || (LIZIZ2 = (InterfaceC61488OBg) c60737Nsb.LIZIZ(IResourceService.class)) == null) {
            C61483OBb.LIZJ.getClass();
            C61483OBb LIZIZ3 = C61484OBc.LIZIZ();
            if (c60737Nsb == null || (str = c60737Nsb.bid) == null) {
                str = "hybridkit_default_bid";
            }
            LIZIZ2 = LIZIZ3.LIZIZ(IResourceService.class, str);
            if (LIZIZ2 == null) {
                return LIZ(c60737Nsb);
            }
        }
        return LIZIZ2;
    }

    public static void LJ(RequestParams requestParams, C60737Nsb c60737Nsb) {
        InterfaceC60710NsA interfaceC60710NsA;
        HybridSchemaParam LIZLLL;
        String str;
        HybridSchemaParam LIZLLL2;
        if (c60737Nsb != null && (interfaceC60710NsA = c60737Nsb.hybridParams) != null && (LIZLLL = interfaceC60710NsA.LIZLLL()) != null && LIZLLL.getLockResource()) {
            InterfaceC60710NsA interfaceC60710NsA2 = c60737Nsb.hybridParams;
            if (interfaceC60710NsA2 == null || (LIZLLL2 = interfaceC60710NsA2.LIZLLL()) == null || (str = LIZLLL2.getSessionId()) == null) {
                str = c60737Nsb.containerId;
            }
            requestParams.setSessionId(str);
        }
    }

    public static void LJII(RequestParams requestParams, HybridSchemaParam hybridSchemaParam) {
        String bundle;
        if (hybridSchemaParam == null) {
            return;
        }
        LJIIIIZZ(requestParams, hybridSchemaParam);
        if (ujb.o.LJJJJJL(requestParams.getAccessKey())) {
            String accessKey = hybridSchemaParam.getAccessKey();
            if (accessKey == null && (accessKey = hybridSchemaParam.getAccessKeyBp()) == null) {
                accessKey = "";
            }
            requestParams.setAccessKey(accessKey);
        }
        String channel = requestParams.getChannel();
        if (channel == null || channel.length() == 0 || (bundle = requestParams.getBundle()) == null || bundle.length() == 0) {
            String channel2 = hybridSchemaParam.getChannel();
            String bundle2 = hybridSchemaParam.getBundle();
            if (channel2.length() > 0 && bundle2.length() > 0) {
                requestParams.setChannel(channel2);
                requestParams.setBundle(bundle2);
            }
        }
    }

    public static void LJIIIIZZ(RequestParams requestParams, HybridSchemaParam hybridSchemaParam) {
        int dynamic;
        EnumC39910FlS enumC39910FlS;
        if (hybridSchemaParam == null) {
            return;
        }
        Integer netWorker = hybridSchemaParam.getNetWorker();
        boolean z = true;
        if (netWorker != null) {
            int intValue = netWorker.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    enumC39910FlS = null;
                } else {
                    enumC39910FlS = EnumC39910FlS.Downloader;
                }
            } else {
                enumC39910FlS = EnumC39910FlS.TTNet;
            }
            requestParams.setNetWorker(enumC39910FlS);
        }
        Boolean disableCDN = hybridSchemaParam.getDisableCDN();
        if (disableCDN != null) {
            requestParams.setDisableCdn(disableCDN.booleanValue());
        }
        Boolean disableBuiltin = hybridSchemaParam.getDisableBuiltin();
        if (disableBuiltin != null) {
            requestParams.setDisableBuiltin(disableBuiltin.booleanValue());
        }
        Boolean disableGeckoUpdate = hybridSchemaParam.getDisableGeckoUpdate();
        if (disableGeckoUpdate != null) {
            requestParams.setDisableGeckoUpdate(disableGeckoUpdate.booleanValue());
        }
        Boolean disableOffline = hybridSchemaParam.getDisableOffline();
        if (disableOffline != null || (disableOffline = hybridSchemaParam.getDisableGecko()) != null) {
            requestParams.setDisableOffline(disableOffline.booleanValue());
        }
        Boolean onlyLocal = hybridSchemaParam.getOnlyLocal();
        if (onlyLocal != null) {
            requestParams.setOnlyLocal(onlyLocal.booleanValue());
        }
        Boolean enableMemoryCache = hybridSchemaParam.getEnableMemoryCache();
        if (enableMemoryCache != null) {
            requestParams.setEnableMemoryCache(Boolean.valueOf(enableMemoryCache.booleanValue()));
        }
        Boolean waitGeckoUpdate = hybridSchemaParam.getWaitGeckoUpdate();
        if ((waitGeckoUpdate == null || !waitGeckoUpdate.booleanValue()) && (dynamic = hybridSchemaParam.getDynamic()) != 1 && dynamic != 2) {
            z = false;
        }
        requestParams.setWaitGeckoUpdate(z);
        requestParams.setCdnRegionRedirect(hybridSchemaParam.getCdnRegionRedirect());
        requestParams.setWaitLowStorageUpdate(hybridSchemaParam.getWaitLowStorageUpdate());
        requestParams.setGeckoUrlRedirect(hybridSchemaParam.getGeckoUrlRedirection());
        requestParams.setRedirectRegions(s.LJLJJL(hybridSchemaParam.getRedirectRegions(), new String[]{","}, 0, 6));
    }

    public static String LIZJ(HybridSchemaParam getSourceUrl, String str, boolean z) {
        o.LJIIJ(getSourceUrl, "$this$getSourceUrl");
        if (str != null && ujb.o.LJJJLIIL(str, "http", false)) {
            return str;
        }
        if (z) {
            if (!ujb.o.LJJJJJL(getSourceUrl.getUrl())) {
                return getSourceUrl.getUrl();
            }
            if (!ujb.o.LJJJJJL(getSourceUrl.getSurl())) {
                return getSourceUrl.getSurl();
            }
            return "";
        }
        if (!ujb.o.LJJJJJL(getSourceUrl.getUrl())) {
            return getSourceUrl.getUrl();
        }
        if (!ujb.o.LJJJJJL(getSourceUrl.getSurl())) {
            return getSourceUrl.getSurl();
        }
        return getSourceUrl.getFallbackUrl();
    }

    public static String LIZLLL(String url, RequestParams requestParams, android.net.Uri finalUri) {
        Integer LJJIL;
        boolean z;
        boolean z2;
        String bundle;
        o.LJIIJ(url, "url");
        if (!ujb.o.LJJJLIIL(url, "http", false)) {
            if (finalUri == null) {
                finalUri = UriProtector.parse(url);
            }
            o.LJFF(finalUri, "finalUri");
            String LJJJJI = C78926UyI.LJJJJI(finalUri, "disable_builtin");
            if (LJJJJI != null) {
                requestParams.setDisableBuiltin(o.LJ(LJJJJI, "1"));
            }
            String LJJJJI2 = C78926UyI.LJJJJI(finalUri, "disable_offline");
            if (LJJJJI2 != null) {
                requestParams.setDisableOffline(o.LJ(LJJJJI2, "1"));
            }
            String LJJJJI3 = C78926UyI.LJJJJI(finalUri, "disable_gecko");
            if (LJJJJI3 != null) {
                requestParams.setDisableOffline(o.LJ(LJJJJI3, "1"));
            }
            String LJJJJI4 = C78926UyI.LJJJJI(finalUri, "disable_gecko_update");
            if (LJJJJI4 != null) {
                requestParams.setDisableGeckoUpdate(o.LJ(LJJJJI4, "1"));
            }
            String LJJJJI5 = C78926UyI.LJJJJI(finalUri, "disable_cdn");
            if (LJJJJI5 != null) {
                requestParams.setDisableCdn(o.LJ(LJJJJI5, "1"));
            }
            String LJJJJI6 = C78926UyI.LJJJJI(finalUri, "only_local");
            if (LJJJJI6 != null) {
                requestParams.setOnlyLocal(o.LJ(LJJJJI6, "1"));
            }
            String LJJJJI7 = C78926UyI.LJJJJI(finalUri, "enable_memory_cache");
            if (LJJJJI7 != null) {
                requestParams.setEnableMemoryCache(Boolean.valueOf(o.LJ(LJJJJI7, "1")));
            }
            String LJJJJI8 = C78926UyI.LJJJJI(finalUri, "wait_gecko_update");
            if (LJJJJI8 != null) {
                requestParams.setWaitGeckoUpdate(o.LJ(LJJJJI8, "1"));
            } else {
                String LJJJJI9 = C78926UyI.LJJJJI(finalUri, "dynamic");
                if (LJJJJI9 != null && (LJJIL = C38350F3i.LJJIL(LJJJJI9)) != null) {
                    int intValue = LJJIL.intValue();
                    if (intValue == 1 || intValue == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    requestParams.setWaitGeckoUpdate(z);
                }
            }
            if (requestParams.getAccessKey().length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                String LJJJJI10 = C78926UyI.LJJJJI(finalUri, "accessKey");
                if (LJJJJI10 == null && (LJJJJI10 = C78926UyI.LJJJJI(finalUri, "access_key")) == null) {
                    LJJJJI10 = "";
                }
                requestParams.setAccessKey(LJJJJI10);
            }
            String channel = requestParams.getChannel();
            if (channel == null || channel.length() == 0 || (bundle = requestParams.getBundle()) == null || bundle.length() == 0) {
                String LJJJJI11 = C78926UyI.LJJJJI(finalUri, "channel");
                String LJJJJI12 = C78926UyI.LJJJJI(finalUri, "bundle");
                if (LJJJJI11 != null && LJJJJI11.length() != 0 && LJJJJI12 != null && LJJJJI12.length() != 0) {
                    requestParams.setChannel(LJJJJI11);
                    requestParams.setBundle(LJJJJI12);
                }
            }
            String LJJJJI13 = C78926UyI.LJJJJI(finalUri, "redirect_cdn_by_region");
            if (LJJJJI13 != null) {
                requestParams.setCdnRegionRedirect(o.LJ(LJJJJI13, "1"));
            }
            String LJJJJI14 = C78926UyI.LJJJJI(finalUri, "gecko_url_redirection");
            if (LJJJJI14 != null) {
                requestParams.setGeckoUrlRedirect(o.LJ(LJJJJI14, "1"));
            }
            String LJJJJI15 = C78926UyI.LJJJJI(finalUri, "redirect_regions");
            if (LJJJJI15 != null) {
                requestParams.setRedirectRegions(s.LJLJJL(LJJJJI15, new String[]{","}, 0, 6));
            }
            String LJJJJI16 = C78926UyI.LJJJJI(finalUri, "url");
            if (LJJJJI16 == null && (LJJJJI16 = C78926UyI.LJJJJI(finalUri, "surl")) == null && (LJJJJI16 = C78926UyI.LJJJJI(finalUri, "res_url")) == null) {
                return "";
            }
            return LJJJJI16;
        }
        return url;
    }

    public static void LJIIIZ(String url, String str, String str2, String str3, boolean z) {
        String str4;
        o.LJIIJ(url, "url");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", url);
        if (str != null) {
            jSONObject.put("content-type", str);
        }
        if (z) {
            str4 = "blocked";
        } else {
            str4 = "pass";
        }
        jSONObject.put("state", str4);
        C79605VMb c79605VMb = new C79605VMb("tiktok_font_request");
        c79605VMb.LIZIZ = str2;
        c79605VMb.LIZ = url;
        c79605VMb.LJIIIIZZ = str3;
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
        C79604VMa LIZ2 = c79605VMb.LIZ();
        OFH.LIZLLL.getClass();
        OFH.LIZLLL(LIZ2);
    }

    public static void LJFF(String url, JSONObject templateResData, C61295O3v response, long j, long j2, boolean z) {
        boolean z2;
        o.LJIIJ(url, "url");
        o.LJIIJ(templateResData, "templateResData");
        o.LJIIJ(response, "response");
        if (!z && LJIIJ(url)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            templateResData.put("res_from", response.P(response.LLD));
            templateResData.put("is_memory", o.LJ(response.LLD, "memory"));
        } else if (o.LJ(response.LLD, "memory")) {
            templateResData.put("is_memory", 1);
            templateResData.put("res_from", response.P(response.LLF));
        } else {
            templateResData.put("is_memory", 0);
            templateResData.put("res_from", response.P(response.LLD));
        }
        templateResData.put("res_version", response.LLFFF);
        templateResData.put("gecko_channel", response.LJZI.getGeckoModel().LJLILLLLZI);
        templateResData.put("gecko_bundle", response.LJZI.getGeckoModel().LJLJI);
        templateResData.put("res_load_cost", j2 - j);
        Long valueOf = Long.valueOf(templateResData.optLong("container_init_cost"));
        if (0 != valueOf.longValue()) {
            templateResData.put("container_init_cost", j - valueOf.longValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        if (r1 != 4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.lang.String r7, org.json.JSONObject r8, X.O26 r9, X.O1M r10, long r11, boolean r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60905NvJ.LJI(java.lang.String, org.json.JSONObject, X.O26, X.O1M, long, boolean):void");
    }
}
