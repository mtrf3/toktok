package com.bytedance.ttnet;

import X.C16880lQ;
import X.C36841Ed3;
import X.C36951Eep;
import X.C37819Esp;
import X.C48182Iva;
import X.C48631J6t;
import X.C56662Kg;
import X.C64667PZn;
import X.C64668PZo;
import X.C64693PaD;
import X.C64704PaO;
import X.C64728Pam;
import X.C64731Pap;
import X.C64734Pas;
import X.C64735Pat;
import X.C64752PbA;
import X.C64766PbO;
import X.C64771PbT;
import X.C64781Pbd;
import X.C65199PiN;
import X.EZY;
import X.EnumC64762PbK;
import X.FMN;
import X.FXG;
import X.InterfaceC64727Pal;
import X.InterfaceC64741Paz;
import X.OCC;
import X.OCE;
import X.OJZ;
import X.PP3;
import X.QE7;
import X.RunnableC64767PbP;
import X.V1M;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import defpackage.i0;
import ee1.e;
import ee1.l;
import ee1.m;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TTNetInit {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DOMAIN_NETLOG_KEY = "netlog";
    public static volatile FMN env;
    public static volatile String sClientIPString;
    public static long sCookieManagerInitStartTime;
    public static ICronetAppProvider sCronetProvider;
    public static Map<String, String> sGetDomainRegionMap;
    public static InterfaceC64741Paz sITTNetDepend;
    public static volatile boolean sNotifiedColdStartFinsish;
    public static volatile List<String> sPublicIPv4List;
    public static volatile List<String> sPublicIPv6List;
    public static InterfaceC64727Pal sSystemApiSandbox;
    public static volatile int sDelayTime = 10;
    public static volatile CountDownLatch sLatchInitCompleted = new CountDownLatch(1);
    public static volatile boolean sApiHttpInterceptEnabled = false;
    public static volatile boolean sCookieLogReportEnabled = false;
    public static volatile boolean sListenAppStateIndependently = false;
    public static volatile boolean sMainThreadInitCookieEnabled = true;
    public static volatile long sMaxHttpDiskCacheSize = 67108864;
    public static volatile int sAppSecurityLevel = 0;
    public static C48182Iva sLifeCycleMonitor = new C48182Iva();

    public static void doCommand(Context context, String str) {
    }

    public static void setALogFuncAddr(long j) {
    }

    public static void setEnableURLDispatcher(boolean z) {
    }

    public static void setFirstRequestWaitTime(long j) {
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public static void tryInitCookieManager(Context context, boolean z, boolean z2) {
        com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(context, z, z2);
    }

    public static boolean urlDispatchEnabled() {
        return true;
    }

    static {
        TTALog.ensureALogInitialized();
        env = FMN.RELEASE;
        sNotifiedColdStartFinsish = false;
        sClientIPString = "";
        sCookieManagerInitStartTime = 0L;
    }

    public static void countDownInitCompletedLatch() {
        try {
            if (sLatchInitCompleted.getCount() > 0) {
                sLatchInitCompleted.countDown();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void getInitCompletedLatch() {
        try {
            sLatchInitCompleted.await(5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static InterfaceC64741Paz getTTNetDepend() {
        InterfaceC64741Paz interfaceC64741Paz = sITTNetDepend;
        if (interfaceC64741Paz != null) {
            return interfaceC64741Paz;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    public static void injectOkhttp3HttpDnsDepend() {
        InterfaceC64741Paz interfaceC64741Paz = sITTNetDepend;
        if (interfaceC64741Paz != null && (interfaceC64741Paz instanceof FXG)) {
            interfaceC64741Paz.getClass();
            sITTNetDepend.getClass();
        }
        int appId = sITTNetDepend.getAppId();
        String str = sITTNetDepend.LJIIL().get("httpdns");
        if (!TextUtils.isEmpty(C64667PZn.LJIIIZ)) {
            return;
        }
        C64667PZn.LJIIIIZZ = appId;
        C64667PZn.LJIIIZ = str;
        C64667PZn.LJIIJJI = null;
        C64667PZn.LJIIJ = null;
    }

    public static void notifyColdStartFinish() {
        if (sITTNetDepend != null && !sNotifiedColdStartFinsish) {
            sNotifiedColdStartFinsish = true;
            sITTNetDepend.onColdStartFinish();
        }
    }

    public static void useCustomizedCookieStoreName() {
        OJZ.LIZLLL = "ttnetCookieStore";
    }

    public static void forceInitCronetKernel() {
        QE7.LIZ().LIZ = EnumC64762PbK.FORCE_INIT;
        C64693PaD.LJIILIIL(getTTNetDepend().getContext()).LJJI(false, C64734Pas.LJIIIZ(getTTNetDepend().getContext()).LIZJ(), true);
    }

    public static long getALogFuncAddr() {
        return TTALog.getALogFuncAddr();
    }

    public static C64693PaD getCronetHttpClient() {
        if (C64752PbA.LIZ()) {
            C64693PaD LJIILIIL = C64693PaD.LJIILIIL(getTTNetDepend().getContext());
            LJIILIIL.LJJI(true, C64734Pas.LJIIIZ(getTTNetDepend().getContext()).LIZJ(), false);
            return LJIILIIL;
        }
        return null;
    }

    public static int getEffectiveConnectionType() {
        try {
            C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
            C64693PaD.LIZJ();
            return ((Integer) Reflect.on(C64693PaD.LIZLLL).call("getEffectiveConnectionType").get()).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Map<String, C48631J6t> getGroupRttEstimates() {
        C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
        C64693PaD.LIZJ();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((Map) Reflect.on(C64693PaD.LIZLLL).call("getGroupRTTEstimates").get()).entrySet()) {
            if (((int[]) entry.getValue()).length == 2) {
                C48631J6t c48631J6t = new C48631J6t();
                c48631J6t.LIZ = ((int[]) entry.getValue())[0];
                c48631J6t.LIZIZ = ((int[]) entry.getValue())[1];
                c48631J6t.LIZJ = -1;
                hashMap.put(entry.getKey(), c48631J6t);
            } else {
                throw new UnknownFormatConversionException("getGroupRttEstimates returns wrong format");
            }
        }
        return hashMap;
    }

    public static C48631J6t getNetworkQuality() {
        C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
        C64693PaD.LIZJ();
        int[] iArr = (int[]) Reflect.on(C64693PaD.LIZLLL).call("getNetworkQuality").get();
        if (iArr.length == 3) {
            C48631J6t c48631J6t = new C48631J6t();
            c48631J6t.LIZ = iArr[0];
            c48631J6t.LIZIZ = iArr[1];
            c48631J6t.LIZJ = iArr[2];
            return c48631J6t;
        }
        throw new UnknownFormatConversionException("getNetworkQuality returns wrong format");
    }

    public static void preInitCronetKernel() {
        QE7.LIZ().LIZ = EnumC64762PbK.PRE_INIT;
        int i = -1;
        try {
            if (getCronetHttpClient() == null) {
                i = C64667PZn.LIZIZ;
                feedBackCronetInitFailedLog(i, "");
            }
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                i = 3;
            }
            String LJJIL = V1M.LJJIL(th);
            if (LJJIL.length() > 1024) {
                LJJIL = LJJIL.substring(0, 1024);
            }
            feedBackCronetInitFailedLog(i, LJJIL);
            throw th;
        }
    }

    public static void setCookieInitCompleted() {
        try {
            if (getCronetHttpClient() != null) {
                ICronetClient iCronetClient = C64693PaD.LIZLLL;
                if (iCronetClient != null) {
                    Reflect.on(iCronetClient).call("setCookieInitCompleted");
                    return;
                }
                throw new UnsupportedOperationException("CronetEngine has not been initialized.");
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean apiHttpInterceptEnabled() {
        return sApiHttpInterceptEnabled;
    }

    public static boolean cookieLogReportEnabled() {
        return sCookieLogReportEnabled;
    }

    public static int getAppSecurityLevel() {
        return sAppSecurityLevel;
    }

    public static String getClientIpString() {
        return sClientIPString;
    }

    public static ICronetAppProvider getCronetProvider() {
        return sCronetProvider;
    }

    public static FMN getEnv() {
        return env;
    }

    public static boolean getListenAppStateIndependently() {
        return sListenAppStateIndependently;
    }

    public static long getMaxHttpDiskCacheSize() {
        return sMaxHttpDiskCacheSize;
    }

    public static List<String> getPublicIPv4List() {
        return sPublicIPv4List;
    }

    public static List<String> getPublicIPv6List() {
        return sPublicIPv6List;
    }

    public static InterfaceC64727Pal getSystemApiSandbox() {
        return sSystemApiSandbox;
    }

    public static void clearClientOpaqueData(Context context) {
        C64693PaD.LJIILIIL(context).getClass();
        try {
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null && C64693PaD.LIZJ != null) {
                Reflect.on(iCronetClient).call("clearClientOpaqueData", new Class[]{Context.class}, C64693PaD.LIZJ);
            }
        } catch (Throwable unused) {
        }
    }

    public static List<InetAddress> dnsLookup(String str) {
        if (QE7.LJJIJ) {
            C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null) {
                return (List) Reflect.on(iCronetClient).call("dnsLookup", new Class[]{String.class}, str).get();
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void enableApiHttpIntercept(boolean z) {
        sApiHttpInterceptEnabled = z;
    }

    public static void enableCookieLogReport(boolean z) {
        sCookieLogReportEnabled = z;
    }

    public static String getGetDomainConfigByRegion(String str) {
        Map<String, String> map = sGetDomainRegionMap;
        if (map == null || map.isEmpty() || sCronetProvider == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return sGetDomainRegionMap.get(str.toLowerCase());
    }

    public static void getMappingRequestState(String str) {
        try {
            C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
            C64693PaD.LIZJ();
            Reflect.on(C64693PaD.LIZLLL).call("getMappingRequestState", new Class[]{String.class}, str).get();
        } catch (Throwable unused) {
        }
    }

    public static C65199PiN getPacketLossRateMetrics(int i) {
        C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
        C64693PaD.LIZJ();
        return (C65199PiN) Reflect.on(C64693PaD.LIZLLL).call("getPacketLossRateMetrics", new Class[]{Integer.TYPE}, Integer.valueOf(i)).get();
    }

    public static void onClientIPChanged(String str) {
        if (str != null) {
            sClientIPString = str;
        }
    }

    public static void preconnectUrl(String str) {
        if (QE7.LJJIJ) {
            try {
                new URL(str).toURI();
                C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
                C64693PaD.LJIJ(str);
                return;
            } catch (Exception e) {
                throw e;
            }
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void setAppSecurityLevel(int i) {
        sAppSecurityLevel = i;
    }

    public static void setBypassOfflineCheck(boolean z) {
        C64693PaD.LJFF = z;
    }

    public static void setCookieHandler(Context context) {
        CookieManager cookieManager;
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null && (cookieHandler instanceof OCC)) {
                C64735Pat.LJFF();
                setCookieInitCompleted();
                return;
            }
            if (sCookieManagerInitStartTime <= 0) {
                C64735Pat.LJFF();
                setCookieInitCompleted();
                return;
            }
            try {
                cookieManager = C16880lQ.LLIIL();
            } catch (Throwable th) {
                sDelayTime = 0;
                CookieInitFailedReport(context, th.getMessage());
                cookieManager = null;
            }
            int i = sDelayTime;
            getTTNetDepend().LJIILIIL();
            CookieHandler.setDefault(new OCC(context, i, cookieManager, null, new OCE(context)));
            C64735Pat.LJFF();
            setCookieInitCompleted();
        } catch (Throwable th2) {
            CookieInitFailedReport(context, th2.getMessage());
        }
    }

    public static void setCronetDepend(ICronetAppProvider iCronetAppProvider) {
        if (iCronetAppProvider != null) {
            sCronetProvider = iCronetAppProvider;
            String carrierRegion = iCronetAppProvider.getCarrierRegion();
            String sysRegion = iCronetAppProvider.getSysRegion();
            String region = iCronetAppProvider.getRegion();
            if (TextUtils.isEmpty(carrierRegion)) {
                if (!TextUtils.isEmpty(sysRegion)) {
                    carrierRegion = sysRegion;
                } else {
                    carrierRegion = region;
                }
            }
            C64704PaO LJFF = C64704PaO.LJFF();
            String storeIdcRuleJSON = iCronetAppProvider.getStoreIdcRuleJSON();
            String appInitialRegionInfo = iCronetAppProvider.getAppInitialRegionInfo();
            Context context = getTTNetDepend().getContext();
            C64731Pap c64731Pap = new C64731Pap(iCronetAppProvider);
            LJFF.getClass();
            Logger.debug();
            if (!TextUtils.isEmpty(storeIdcRuleJSON) && context != null) {
                try {
                    JSONObject jSONObject = new JSONObject(storeIdcRuleJSON);
                    JSONArray optJSONArray = jSONObject.optJSONArray("update_store_idc_path_list");
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String string = JSONArrayProtectorUtils.getString(optJSONArray, i);
                        if (!TextUtils.isEmpty(string)) {
                            ((ArrayList) LJFF.LJII).add(string);
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("add_store_idc_host_list");
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        String string2 = JSONArrayProtectorUtils.getString(optJSONArray2, i2);
                        if (!TextUtils.isEmpty(string2)) {
                            ((ArrayList) LJFF.LJIIIIZZ).add(string2);
                        }
                    }
                    LJFF.LJIIIZ = context;
                    LJFF.LJIIJJI = c64731Pap;
                    if (!TextUtils.isEmpty(carrierRegion)) {
                        LJFF.LIZLLL = carrierRegion.toLowerCase();
                    }
                    if (!((ArrayList) LJFF.LJIIIIZZ).isEmpty() && !((ArrayList) LJFF.LJII).isEmpty()) {
                        LJFF.LJIIJ = true;
                        LJFF.LJFF = appInitialRegionInfo;
                        LJFF.LJI();
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            if (!TextUtils.isEmpty(carrierRegion)) {
                C64728Pam.LJJIFFI = getGetDomainConfigByRegion(carrierRegion);
            }
            if (TextUtils.isEmpty(C64728Pam.LJJIFFI)) {
                C64728Pam.LJJIFFI = iCronetAppProvider.getGetDomainDefaultJSON();
            }
            Logger.debug();
            return;
        }
        throw new IllegalArgumentException("cronetDepend is null");
    }

    public static void setDelayTime(int i) {
        sDelayTime = i;
    }

    public static void setEnv(FMN fmn) {
        env = fmn;
    }

    public static void setGetDomainRegionMap(Map<String, String> map) {
        if (map != null) {
            sGetDomainRegionMap = map;
            return;
        }
        throw new IllegalArgumentException("getDomainRegionMap is null");
    }

    public static void setHostResolverRulesForTesting(String str) {
        if (getCronetHttpClient() != null) {
            C64693PaD.LIZJ();
            Reflect.on(C64693PaD.LIZLLL).call("setHostResolverRules", new Class[]{String.class}, str);
        }
    }

    public static void setListenAppStateIndependently(boolean z) {
        sListenAppStateIndependently = z;
    }

    public static void setMainThreadInitCookieEnabled(boolean z) {
        sMainThreadInitCookieEnabled = z;
    }

    public static void setMaxHttpDiskCacheSize(long j) {
        if (j > 0) {
            sMaxHttpDiskCacheSize = j;
        }
    }

    public static void setProcessFlag(int i) {
        C36841Ed3.LIZ.set(i);
    }

    public static void setProxy(String str) {
        if (QE7.LJJIJ) {
            C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
            C64693PaD.LIZJ();
            Reflect.on(C64693PaD.LIZLLL).call("setProxy", new Class[]{String.class}, str).get();
            return;
        }
        C64667PZn.LJII(getTTNetDepend().getContext());
        if (str == null) {
            C64667PZn.LIZLLL = null;
            return;
        }
        String[] split = str.split(";");
        if (split.length > 0) {
            String[] split2 = split[0].trim().split("=");
            if (split2.length == 2) {
                String lowerCase = split2[0].trim().toLowerCase();
                String[] split3 = split2[1].trim().split(":");
                if (split3.length == 2) {
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(split3[0], CastIntegerProtector.parseInt(split3[1]));
                    if (lowerCase.equals("http") || lowerCase.equals("https")) {
                        C64667PZn.LIZLLL = new Proxy(Proxy.Type.HTTP, inetSocketAddress);
                        return;
                    } else {
                        if (!lowerCase.equals("socks") && !lowerCase.equals("socks4") && !lowerCase.equals("socks5")) {
                            return;
                        }
                        C64667PZn.LIZLLL = new Proxy(Proxy.Type.SOCKS, inetSocketAddress);
                        return;
                    }
                }
                throw new IllegalArgumentException(i0.LJFF("Invalid proxy rule:", str));
            }
            throw new IllegalArgumentException(i0.LJFF("Invalid proxy rule:", str));
        }
        throw new IllegalArgumentException(i0.LJFF("Invalid proxy rule:", str));
    }

    public static void setSystemApiSandbox(InterfaceC64727Pal interfaceC64727Pal) {
        sSystemApiSandbox = interfaceC64727Pal;
    }

    public static void setTTNetDepend(InterfaceC64741Paz interfaceC64741Paz) {
        sITTNetDepend = interfaceC64741Paz;
        Map<String, String> LJIIL = getTTNetDepend().LJIIL();
        if (TextUtils.isEmpty(LJIIL.get("httpdns")) || (TextUtils.isEmpty(LJIIL.get("boe")) && TextUtils.isEmpty(LJIIL.get("boe_https")))) {
            sITTNetDepend = null;
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        InterfaceC64741Paz interfaceC64741Paz2 = sITTNetDepend;
        if (interfaceC64741Paz2 instanceof FXG) {
            interfaceC64741Paz2.getClass();
            setAppSecurityLevel(sAppSecurityLevel | 1);
        }
        C64668PZo.LJJIJIL = new PP3();
        String str = LJIIL.get("boe");
        C36951Eep.LIZ = str;
        if (!TextUtils.isEmpty(str)) {
            C36951Eep.LIZLLL = true;
        }
        String str2 = LJIIL.get("boe_https");
        C36951Eep.LIZIZ = str2;
        if (!TextUtils.isEmpty(str2)) {
            C36951Eep.LIZLLL = false;
        }
        injectOkhttp3HttpDnsDepend();
    }

    public static void trigerGetDomain(Context context) {
        triggerGetDomain(context, false);
    }

    public static void trySetDefaultUserAgent(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        char c = charArray[i];
                        if (c < ' ' || c > '~') {
                            charArray[i] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        str = new String(charArray);
                    }
                }
            } catch (Exception unused) {
            }
        }
        C64735Pat.LJFF = str;
    }

    public static C37819Esp ttUrlDispatch(String str) {
        if (!C64734Pas.LJIIIZ(getTTNetDepend().getContext()).LJ()) {
            e LIZ = l.LJ().LIZ(new m(str, null, null));
            if (LIZ != null) {
                return new C37819Esp(LIZ.LIZ, String.valueOf(l.LJ().LIZJ.get()), l.LJ().LJIIJ);
            }
            throw new IllegalArgumentException("Illegal originalUrl or TNC switch is disabled");
        }
        if (QE7.LJJIJ) {
            try {
                new URL(str).toURI();
                return C64693PaD.LJJIIJ(str);
            } catch (Exception e) {
                throw e;
            }
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void CookieInitFailedReport(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "failed");
            jSONObject.put("exception", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        getTTNetDepend().LIZLLL();
    }

    public static C64781Pbd TTDnsResolve(String str, int i) {
        C64771PbT c64771PbT;
        if (QE7.LJJIJ) {
            synchronized (C64771PbT.class) {
                if (C64771PbT.LIZIZ == null) {
                    C64771PbT.LIZIZ = new C64771PbT();
                }
                c64771PbT = C64771PbT.LIZIZ;
            }
            c64771PbT.getClass();
            C64766PbO c64766PbO = new C64766PbO(str, i);
            ((ConcurrentHashMap) c64771PbT.LIZ).put(c64766PbO.LIZ, c64766PbO);
            C64693PaD LJIILIIL = C64693PaD.LJIILIIL(getTTNetDepend().getContext());
            String str2 = c64766PbO.LIZ;
            LJIILIIL.getClass();
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null) {
                Reflect.on(iCronetClient).call("ttDnsResolve", new Class[]{String.class, Integer.TYPE, String.class}, str, Integer.valueOf(i), str2).get();
                c64766PbO.LIZIZ.await();
                ((ConcurrentHashMap) c64771PbT.LIZ).remove(c64766PbO.LIZ);
                return c64766PbO.LIZJ;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void feedBackCronetInitFailedLog(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", i);
            jSONObject.put("exception", str);
            jSONObject.put("model", Build.MODEL);
            String str2 = "";
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null && strArr.length > 0) {
                str2 = Arrays.asList(strArr).toString();
            }
            jSONObject.put("abis", str2);
            getTTNetDepend().LJIIJJI("cronet_failed", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void monitorLogSend(String str, JSONObject jSONObject) {
        InterfaceC64741Paz interfaceC64741Paz = sITTNetDepend;
        if (interfaceC64741Paz != null) {
            interfaceC64741Paz.LJIIJJI(str, jSONObject);
        }
    }

    public static void onPublicIPsChanged(List<String> list, List<String> list2) {
        sPublicIPv4List = list;
        sPublicIPv6List = list2;
    }

    public static void removeClientOpaqueData(Context context, String str) {
        C64693PaD.LJIILIIL(context).getClass();
        try {
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null && C64693PaD.LIZJ != null) {
                Reflect.on(iCronetClient).call("removeClientOpaqueData", new Class[]{Context.class, String.class}, C64693PaD.LIZJ, str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void runInBackGround(Context context, boolean z) {
        C64693PaD.LJIILIIL(context).getClass();
        try {
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null && C64693PaD.LIZJ != null) {
                Reflect.on(iCronetClient).call("runInBackGround", new Class[]{Context.class, Boolean.TYPE}, C64693PaD.LIZJ, Boolean.valueOf(z));
            }
        } catch (Throwable unused) {
        }
    }

    public static void triggerGetDomain(Context context, boolean z) {
        C64693PaD.LJIILIIL(context).getClass();
        try {
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null && C64693PaD.LIZJ != null) {
                Reflect.on(iCronetClient).call("triggerGetDomain", new Class[]{Context.class, Boolean.TYPE}, C64693PaD.LIZJ, Boolean.valueOf(z));
            }
        } catch (Throwable unused) {
        }
    }

    public static void com_bytedance_ttnet_TTNetInit__tryInitCookieManager$___twin___(Context context, boolean z, boolean z2) {
        String str;
        Map<String, List<String>> map;
        try {
            sCookieManagerInitStartTime = System.currentTimeMillis();
            if (z) {
                CookieSyncManager.createInstance(context);
                C16880lQ.LLIIL().setAcceptCookie(true);
                setCookieHandler(context);
                Logger.debug();
            } else {
                C64735Pat.LJFF();
                setCookieInitCompleted();
            }
        } catch (Throwable th) {
            if (C36841Ed3.LIZJ(context) && C16880lQ.LLLLIIIILLL() != C16880lQ.LLJJJJ().getThread()) {
                if (sMainThreadInitCookieEnabled) {
                    new Handler(C16880lQ.LLJJJJ()).post(new RunnableC64767PbP(context, z, z2));
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error", th.getMessage());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                InterfaceC64741Paz interfaceC64741Paz = sITTNetDepend;
                if (interfaceC64741Paz != null) {
                    interfaceC64741Paz.LJIIJJI("async_init_cookie_manager_fail", jSONObject);
                }
                CookieInitFailedReport(context, th.getMessage());
            }
        }
        ClientKeyManager LJFF = ClientKeyManager.LJFF();
        LJFF.getClass();
        ClientKeyManager.LJIIIZ = z2;
        try {
            ClientKeyManager.LJII = KevaImpl.getRepo("ttnet_client_key_config", 1);
        } catch (Throwable unused) {
        }
        Keva keva = ClientKeyManager.LJII;
        if (keva == null) {
            return;
        }
        String string = keva.getString("client_key_config", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                LJFF.LIZIZ(new JSONObject(string));
            } catch (Throwable unused2) {
            }
        }
        if (!ClientKeyManager.LJIIIIZZ) {
            return;
        }
        String string2 = ClientKeyManager.LJII.getString("session_id", "");
        long j = 0;
        long j2 = ClientKeyManager.LJII.getLong("session_time", 0L);
        LJFF.LJ = ClientKeyManager.LJII.getString("session_url", "");
        LJFF.LIZJ = ClientKeyManager.LJII.getString("client_key", "");
        String string3 = ClientKeyManager.LJII.getString("kms_version", "");
        LJFF.LJFF = string3;
        ClientKeyManager.LJIIJ = ClientKeyManager.LJ(LJFF.LIZJ, string3);
        if (string2.isEmpty() || LJFF.LJ.isEmpty()) {
            return;
        }
        String[] split = string2.split(";");
        int i = 0;
        if (split != null && split.length > 0) {
            LJFF.LIZLLL = split[0].trim();
        }
        if (TextUtils.isEmpty(LJFF.LIZLLL)) {
            return;
        }
        if (split != null && split.length >= 2 && j2 > 0) {
            int length = split.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2) && str2.toLowerCase().trim().startsWith("Max-Age=".toLowerCase())) {
                    String[] split2 = str2.split("=");
                    if (split2 != null && split2.length == 2) {
                        try {
                            long parseLong = CastLongProtector.parseLong(split2[1]);
                            if (parseLong > 0) {
                                long currentTimeMillis = parseLong - ((System.currentTimeMillis() - j2) / 1000);
                                if (currentTimeMillis > 0) {
                                    j = currentTimeMillis;
                                }
                                String trim = str2.trim();
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Max-Age=");
                                LIZ.append(j);
                                str = string2.replaceFirst(trim, X1D.LIZIZ(LIZ));
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
            string2 = str;
        }
        Logger.debug();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (cookieHandler != null) {
            try {
                URI LIZJ = EZY.LIZJ(LJFF.LJ);
                if (LIZJ != null && (map = cookieHandler.get(LIZJ, null)) != null && !map.isEmpty() && map.containsKey("Cookie")) {
                    String obj = map.get("Cookie").toString();
                    Logger.debug();
                    if (!TextUtils.isEmpty(obj)) {
                        if (!obj.contains(LJFF.LIZLLL)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(string2);
                            linkedHashMap.put("Set-Cookie", arrayList);
                            cookieHandler.put(LIZJ, linkedHashMap);
                            Logger.debug();
                            LJFF.LIZJ(obj);
                        }
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(string2);
                        linkedHashMap2.put("Set-Cookie", arrayList2);
                        cookieHandler.put(LIZJ, linkedHashMap2);
                        Logger.debug();
                        LJFF.LIZJ("empty");
                    }
                }
            } catch (Throwable unused4) {
            }
        }
    }

    public static void com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(Context context, boolean z, boolean z2) {
        C56662Kg.LIZ().LIZJ("feed_network_init_cookie_duration", false);
        com_bytedance_ttnet_TTNetInit__tryInitCookieManager$___twin___(context, z, z2);
    }

    public static boolean tryStartTTNetDetect(String[] strArr, int i, int i2) {
        if (strArr == null || strArr.length <= 0 || i <= 0 || i > 180 || i2 < 0) {
            return false;
        }
        try {
            C64693PaD.LJIILIIL(getTTNetDepend().getContext()).getClass();
            C64693PaD.LJJIII(strArr, i, i2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        C64693PaD.LJIILIIL(context).getClass();
        try {
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null && C64693PaD.LIZJ != null) {
                Reflect.on(iCronetClient).call("addClientOpaqueData", new Class[]{Context.class, String[].class, byte[].class, byte[].class}, C64693PaD.LIZJ, strArr, bArr, bArr2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (z && (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
            return;
        }
        try {
            if (getCronetHttpClient() != null) {
                C64693PaD.LJII(z, str, str2, str3, z2, str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0113, code lost:
    
        if (r1.contains(":miniapp") != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void tryInitTTNet(android.content.Context r10, android.app.Application r11, X.InterfaceC64715PaZ<X.C64672PZs> r12, X.InterfaceC64760PbI<X.C64672PZs> r13, X.InterfaceC64784Pbg r14, boolean r15, boolean... r16) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.TTNetInit.tryInitTTNet(android.content.Context, android.app.Application, X.PaZ, X.PbI, X.Pbg, boolean, boolean[]):void");
    }

    public static void setZstdFuncAddr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        if (getCronetHttpClient() != null) {
            Logger.debug();
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null) {
                Reflect on = Reflect.on(iCronetClient);
                Class<?> cls = Long.TYPE;
                on.call("setZstdFuncAddr", new Class[]{cls, cls, cls, cls, cls, cls, cls, cls}, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8));
                return;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }
}
