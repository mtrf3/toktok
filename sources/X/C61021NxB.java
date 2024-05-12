package X;

import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.Request;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.NxB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61021NxB {
    public static final /* synthetic */ int LIZ = 0;

    public static Request LIZ(Forest forest, RequestParams params, String url, boolean z) {
        Object LIZ2;
        boolean z2;
        boolean checkGeckoFileAvailable;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        boolean z6;
        ArrayList arrayList;
        InterfaceC61309O4j interfaceC61309O4j;
        Integer LJJIL;
        boolean z7;
        boolean z8;
        C61157NzN c61157NzN;
        o.LJIIJ(url, "url");
        o.LJIIJ(forest, "forest");
        o.LJIIJ(params, "params");
        try {
            LIZ2 = UriProtector.parse(url);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        android.net.Uri build = new Uri.Builder().build();
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = build;
        }
        android.net.Uri uri = (android.net.Uri) LIZ2;
        java.util.Map<String, Object> customParams = params.getCustomParams();
        String accessKey = params.getAccessKey();
        if (accessKey.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = "";
        if (z2 && ((c61157NzN = forest.getConfig().LJFF) == null || (accessKey = c61157NzN.LIZ) == null)) {
            accessKey = "";
        }
        String bundle = params.getBundle();
        if (bundle == null) {
            bundle = "";
        }
        String channel = params.getChannel();
        if (channel != null) {
            str = channel;
        }
        C61023NxD c61023NxD = new C61023NxD(accessKey, str, bundle);
        boolean waitGeckoUpdate = params.getWaitGeckoUpdate();
        boolean waitLowStorageUpdate = params.getWaitLowStorageUpdate();
        boolean onlyLocal = params.getOnlyLocal();
        boolean disableCdn = params.getDisableCdn();
        boolean disableBuiltin = params.getDisableBuiltin();
        boolean disableOffline = params.getDisableOffline();
        boolean disableGeckoUpdate = params.getDisableGeckoUpdate();
        boolean loadToMemory = params.getLoadToMemory();
        boolean allowIOOnMainThread = params.getAllowIOOnMainThread();
        if (params.getLoadToMemory()) {
            checkGeckoFileAvailable = false;
        } else {
            checkGeckoFileAvailable = params.getCheckGeckoFileAvailable();
        }
        int loadRetryTimes = params.getLoadRetryTimes();
        EnumC61028NxI resourceScene = params.getResourceScene();
        String groupId = params.getGroupId();
        Boolean enableNegotiation = params.getEnableNegotiation();
        if (enableNegotiation != null) {
            z3 = enableNegotiation.booleanValue();
        } else {
            z3 = forest.getConfig().LIZIZ;
        }
        Boolean enableMemoryCache = params.getEnableMemoryCache();
        if (enableMemoryCache != null) {
            z4 = enableMemoryCache.booleanValue();
        } else {
            forest.getConfig().getClass();
            z4 = false;
        }
        Boolean enableCDNCache = params.getEnableCDNCache();
        if (enableCDNCache != null) {
            z5 = enableCDNCache.booleanValue();
        } else {
            z5 = forest.getConfig().LIZLLL;
        }
        Long maxExpirationTime = params.getMaxExpirationTime();
        if (maxExpirationTime != null) {
            j = maxExpirationTime.longValue();
        } else {
            j = C61022NxC.LJFF;
        }
        Boolean needLocalFile = params.getNeedLocalFile();
        if (needLocalFile != null) {
            z6 = needLocalFile.booleanValue();
        } else {
            z6 = forest.getConfig().LIZJ;
        }
        List LLJILJILJ = ORZ.LLJILJILJ(params.getFetcherSequence());
        boolean isPreload$forest_release = params.isPreload$forest_release();
        boolean enableRequestReuse = params.getEnableRequestReuse();
        String sessionId = params.getSessionId();
        Object webResourceRequest = params.getWebResourceRequest();
        boolean cdnRegionRedirect = params.getCdnRegionRedirect();
        boolean geckoUrlRedirect = params.getGeckoUrlRedirect();
        List<String> redirectRegions = params.getRedirectRegions();
        if (redirectRegions != null) {
            arrayList = new ArrayList(C32I.LJJL(redirectRegions, 10));
            for (String str2 : redirectRegions) {
                Locale locale = Locale.ENGLISH;
                o.LJFF(locale, "Locale.ENGLISH");
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(locale);
                    o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    arrayList.add(lowerCase);
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
                }
            }
        } else {
            arrayList = null;
        }
        Request request = new Request(url, forest, customParams, c61023NxD, waitGeckoUpdate, waitLowStorageUpdate, onlyLocal, disableCdn, disableBuiltin, disableOffline, disableGeckoUpdate, loadToMemory, allowIOOnMainThread, checkGeckoFileAvailable, loadRetryTimes, resourceScene, z, groupId, z3, z4, z5, j, LLJILJILJ, isPreload$forest_release, enableRequestReuse, sessionId, webResourceRequest, z6, cdnRegionRedirect, geckoUrlRedirect, arrayList, params.getParallelLoading());
        request.setOnlyOnline(params.getOnlyOnline());
        EnumC39910FlS netWorker = params.getNetWorker();
        if (netWorker == null) {
            netWorker = forest.getConfig().LIZ;
        }
        int i = C39911FlT.LIZ[netWorker.ordinal()];
        if (i != 1) {
            if (i == 2) {
                interfaceC61309O4j = C61297O3x.LIZJ;
            } else {
                throw new C162476Zf();
            }
        } else {
            interfaceC61309O4j = C61298O3y.LIZJ;
        }
        request.setNetDepender(interfaceC61309O4j);
        GeckoXAdapter geckoXAdapter = forest.getGeckoXAdapter();
        o.LJFF(uri, "uri");
        if (geckoXAdapter.isGeckoCDNAndMergeConfig(uri, url, request)) {
            String LJJJJI = C78926UyI.LJJJJI(uri, "only_online");
            if (LJJJJI != null) {
                request.setOnlyOnline(o.LJ(LJJJJI, "1"));
            }
            String LJJJJI2 = C78926UyI.LJJJJI(uri, "wait_gecko_update");
            if (LJJJJI2 == null) {
                if (request.getWaitGeckoUpdate() || o.LJ(LJJJJI2, "1")) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                request.setWaitGeckoUpdate(z8);
            } else {
                String LJJJJI3 = C78926UyI.LJJJJI(uri, "dynamic");
                if (LJJJJI3 != null && (LJJIL = C38350F3i.LJJIL(LJJJJI3)) != null) {
                    int intValue = LJJIL.intValue();
                    if (intValue == 1 || intValue == 2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    request.setWaitGeckoUpdate(z7);
                }
            }
        } else if (request.getGeckoModel().L()) {
            String channel2 = UriProtector.getQueryParameter(uri, "gecko_channel");
            String bundle2 = UriProtector.getQueryParameter(uri, "gecko_bundle");
            String ak = UriProtector.getQueryParameter(uri, "gecko_access_key");
            if (C96Q.LIZ(channel2) && C96Q.LIZ(bundle2)) {
                C61023NxD geckoModel = request.getGeckoModel();
                o.LJFF(channel2, "channel");
                geckoModel.getClass();
                geckoModel.LJLILLLLZI = channel2;
                C61023NxD geckoModel2 = request.getGeckoModel();
                o.LJFF(bundle2, "bundle");
                geckoModel2.getClass();
                geckoModel2.LJLJI = bundle2;
                if (C96Q.LIZ(ak)) {
                    C61023NxD geckoModel3 = request.getGeckoModel();
                    o.LJFF(ak, "ak");
                    geckoModel3.getClass();
                    geckoModel3.LJLIL = ak;
                }
                request.setGeckoSource(EnumC61024NxE.URL_QUERY);
            } else if (!params.getDisablePrefixParser()) {
                Iterator<String> it = forest.getConfig().LJII.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C61023NxD LIZ3 = C36882Edi.LIZ(url, it.next());
                    if (LIZ3 != null) {
                        request.setGeckoSource(EnumC61024NxE.INJECTED_PREFIXES);
                        C61023NxD geckoModel4 = request.getGeckoModel();
                        String str3 = LIZ3.LJLILLLLZI;
                        geckoModel4.getClass();
                        o.LJIIJ(str3, "<set-?>");
                        geckoModel4.LJLILLLLZI = str3;
                        C61023NxD geckoModel5 = request.getGeckoModel();
                        String str4 = LIZ3.LJLJI;
                        geckoModel5.getClass();
                        o.LJIIJ(str4, "<set-?>");
                        geckoModel5.LJLJI = str4;
                        break;
                    }
                }
            }
        }
        return request;
    }
}
