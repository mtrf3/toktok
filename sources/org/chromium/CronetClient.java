package org.chromium;

import X.AbstractC66650QDu;
import X.AbstractC66666QEk;
import X.AbstractC66670QEo;
import X.AbstractRunnableC64795Pbr;
import X.C16880lQ;
import X.C36598EXy;
import X.C36841Ed3;
import X.C61460OAe;
import X.C64793Pbp;
import X.C65199PiN;
import X.C66652QDw;
import X.C66653QDx;
import X.C66654QDy;
import X.C66655QDz;
import X.EnumC64792Pbo;
import X.F9J;
import X.IUY;
import X.PP6;
import X.QE0;
import X.QE1;
import X.QE2;
import X.QEJ;
import X.QEK;
import X.V2B;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import zdb.g;

/* loaded from: classes12.dex */
public class CronetClient implements ICronetClient {
    public static ICronetClient.ICronetBootFailureChecker sCronetBootFailureChecker = null;
    public static volatile QEK sCronetEngine = null;
    public static volatile int sNetworkThreadPriority = 20;
    public static volatile AbstractC66666QEk sRequestFinishedInfoListener;
    public int mCrashDetectTimerInterval = 5000;
    public int mCrashLimitTimes;
    public int mTTNetCrashTimes;

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public long getCostTime(long j, long j2) {
        if (j2 == -1 || j == -1 || j2 > j) {
            return -1L;
        }
        return j - j2;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public String getCronetVersion() {
        return "TTNetVersion:2fdb62f9 2023-09-06 QuicVersion:bb24d47c 2023-07-19";
    }

    public static long getALogFuncAddr() {
        return ((Long) Reflect.on(Class.forName("com.bytedance.ttnet.TTALog").newInstance()).call("getALogFuncAddr").get()).longValue();
    }

    public static int getAppSecurityLevel() {
        try {
            return ((Integer) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getAppSecurityLevel").get()).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static QEK getCronetEngine() {
        if (sCronetEngine != null) {
            return sCronetEngine;
        }
        throw new NullPointerException("Cronet engine is null.");
    }

    public static int getEffectiveConnectionType() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            return ((AbstractC66650QDu) sCronetEngine).LJIILIIL();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static int getEffectiveHttpRttMs() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            return ((AbstractC66650QDu) sCronetEngine).LJIILJJIL();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static int getEffectiveRxThroughputKbps() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            return ((AbstractC66650QDu) sCronetEngine).LJIILL();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static int getEffectiveTransportRttMs() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            return ((AbstractC66650QDu) sCronetEngine).LJIILLIIL();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static Map<String, int[]> getGroupRTTEstimates() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            return ((AbstractC66650QDu) sCronetEngine).LJIIZILJ();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static boolean getListenAppStateIndependently() {
        try {
            return ((Boolean) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getListenAppStateIndependently").get()).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static long getMaxHttpDiskCacheSize() {
        try {
            return ((Long) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getMaxHttpDiskCacheSize").get()).longValue();
        } catch (Exception unused) {
            return 67108864L;
        }
    }

    public static int[] getNetworkQuality() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            AbstractC66650QDu abstractC66650QDu = (AbstractC66650QDu) sCronetEngine;
            return new int[]{abstractC66650QDu.LJIJJLI(), abstractC66650QDu.LJIJ(), abstractC66650QDu.LJIIL()};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static int getNetworkQualityLevel() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            return ((AbstractC66650QDu) sCronetEngine).LJIJI();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setCookieInitCompleted() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIJIIJI();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void triggerSwitchingToCellular() {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIL();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static String getDomainConfigByRegion() {
        String LIZ = C66653QDx.LIZIZ().LIZ("getCarrierRegion");
        String LIZ2 = C66653QDx.LIZIZ().LIZ("getSysRegion");
        String LIZ3 = C66653QDx.LIZIZ().LIZ("getRegion");
        if (TextUtils.isEmpty(LIZ)) {
            if (!TextUtils.isEmpty(LIZ2)) {
                LIZ = LIZ2;
            } else {
                LIZ = LIZ3;
            }
        }
        if (TextUtils.isEmpty(LIZ)) {
            return null;
        }
        try {
            return (String) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getGetDomainConfigByRegion", new Class[]{String.class}, LIZ).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void clearClientOpaqueData(Context context) {
        try {
            if (!C36841Ed3.LIZJ(context)) {
                return;
            }
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetClient", "clearClientOpaqueData start");
            }
            if (sCronetEngine instanceof AbstractC66650QDu) {
                ((AbstractC66650QDu) sCronetEngine).LJII();
            }
        } catch (Throwable unused) {
        }
    }

    public static List<InetAddress> dnsLookup(String str) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            return ((AbstractC66650QDu) sCronetEngine).LJIIIIZZ(str);
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void getMappingRequestState(final String str) {
        CronetUrlRequest cronetUrlRequest;
        try {
            if (!TextUtils.isEmpty(str) && (cronetUrlRequest = (CronetUrlRequest) ((ConcurrentHashMap) IUY.LIZ).get(str)) != null) {
                cronetUrlRequest.LJJI(new QEJ() { // from class: org.chromium.CronetClient.4
                    @Override // X.QEJ
                    public void onStatus(int i) {
                        C66652QDw LIZ = C66652QDw.LIZ();
                        String str2 = str;
                        if (LIZ.LIZ) {
                            C66653QDx LIZIZ = C66653QDx.LIZIZ();
                            LIZIZ.getClass();
                            if (QE0.LIZ().loggerDebug()) {
                                QE0 LIZ2 = QE0.LIZ();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("onMappingRequestStatus key = ");
                                LIZ3.append(str2);
                                LIZ3.append(" status = ");
                                LIZ3.append(i);
                                LIZ2.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ3));
                            }
                            try {
                                Object obj = LIZIZ.LIZ;
                                if (obj != null) {
                                    new C36598EXy(obj).LIZJ("onMappingRequestStatus", new Class[]{String.class, Integer.TYPE}, str2, Integer.valueOf(i));
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    public static C65199PiN getPacketLossRateMetrics(int i) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            C65199PiN c65199PiN = new C65199PiN();
            AbstractC66650QDu abstractC66650QDu = (AbstractC66650QDu) sCronetEngine;
            c65199PiN.LIZ = abstractC66650QDu.LJIL(i);
            abstractC66650QDu.LJJ(i);
            c65199PiN.LIZIZ = abstractC66650QDu.LJIIJ(i);
            abstractC66650QDu.LJIIJJI(i);
            return c65199PiN;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private String getProxyConfig(String str) {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append("ttnet_config.json");
                    File file = new File(X1D.LIZIZ(LIZ));
                    if (file.exists()) {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            str2 = new JSONObject(sb.toString()).optString("ttnet_proxy", "");
                            bufferedReader = bufferedReader2;
                        } catch (Throwable unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return str2;
                        }
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } catch (Throwable unused2) {
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return str2;
    }

    private long getTime(Date date) {
        if (date == null) {
            return -1L;
        }
        return date.getTime();
    }

    private long getValue(Long l) {
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static boolean notifySwitchToMultiNetwork(boolean z) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIFFI(z);
            return true;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void preconnectUrl(String str) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIII(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void reportNetDiagnosisUserLog(String str) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIIJZLJL(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAlogFuncAddr(long j) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIIZI(j);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAppStartUpState(int i) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIJ(i);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setHostResolverRules(String str) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIJIIJIL(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setNetworkThreadPriority(int i) {
        sNetworkThreadPriority = i;
    }

    public static void setProxy(String str) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIJIL(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private void tryCreateRequestFinishedInfoListener(Executor executor) {
        if (sRequestFinishedInfoListener == null) {
            synchronized (CronetClient.class) {
                if (sRequestFinishedInfoListener == null) {
                    sRequestFinishedInfoListener = new AbstractC66666QEk(executor) { // from class: org.chromium.CronetClient.5
                        private long getTime(Date date) {
                            if (date == null) {
                                return -1L;
                            }
                            return date.getTime();
                        }

                        @Override // X.AbstractC66666QEk
                        public void onRequestFinished(QE2 qe2) {
                            QE1 qe1;
                            if (qe2 != null && (qe1 = ((C66655QDz) qe2).LIZJ) != null) {
                                try {
                                    String str = "";
                                    if (QE0.LIZ().loggerDebug()) {
                                        try {
                                            if (((C66655QDz) qe2).LJ != null) {
                                                StringBuilder LIZ = X1D.LIZ();
                                                LIZ.append("");
                                                LIZ.append(" http status = ");
                                                LIZ.append(((C61460OAe) ((C66655QDz) qe2).LJ).LIZJ);
                                                str = X1D.LIZIZ(LIZ);
                                            }
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append(str);
                                            LIZ2.append(" finishedReason = ");
                                            LIZ2.append(((C66655QDz) qe2).LIZLLL);
                                            str = X1D.LIZIZ(LIZ2);
                                        } catch (Exception e) {
                                            C16880lQ.LLLLIIL(e);
                                        }
                                        QE0.LIZ().loggerD("CronetClient", str + " url = " + ((C66655QDz) qe2).LIZ);
                                        QE0.LIZ().loggerD("CronetClient", (((((((" dns_cost = " + CronetClient.this.getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LIZJ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LIZIZ))) + " ms ") + " connect_cost = " + CronetClient.this.getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LIZLLL))) + " ms ") + " ssl_cost = " + CronetClient.this.getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJI)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJFF))) + " ms ") + " sending_cost = " + CronetClient.this.getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIIIZZ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJII))) + " ms ") + " push_cost = " + CronetClient.this.getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIJ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIIZ))) + " ms ") + " response_cost = " + CronetClient.this.getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIL)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIJJI))) + " ms ") + " total_cost = " + ((C66654QDy) qe1).LJIILL + " ms ") + " remote_ip = " + ((C66654QDy) qe1).LJIJ + " : " + ((C66654QDy) qe1).LJIJI);
                                        try {
                                            if (((C66655QDz) qe2).LJFF != null) {
                                                QE0.LIZ().loggerD("CronetClient", " exception = " + ((C66655QDz) qe2).LJFF.getMessage());
                                            }
                                        } catch (Exception e2) {
                                            C16880lQ.LLLLIIL(e2);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    };
                }
            }
        }
    }

    public static String[] ttUrlDispatch(String str) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            Map<String, String> LJJJIL = ((AbstractC66650QDu) sCronetEngine).LJJJIL(str);
            return new String[]{LJJJIL.get("final_url"), LJJJIL.get("epoch"), LJJJIL.get("etag")};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getCronetInternalErrorCode(HttpURLConnection httpURLConnection) {
        int i = 0;
        if (!(httpURLConnection instanceof CronetHttpURLConnection)) {
            return 0;
        }
        IOException iOException = ((CronetHttpURLConnection) httpURLConnection).LJIIJJI;
        if (iOException instanceof AbstractC66670QEo) {
            i = ((AbstractC66670QEo) iOException).getCronetInternalErrorCode();
        } else if (iOException instanceof g) {
            i = ((g) iOException).getCronetInternalErrorCode();
        }
        return i;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetBootFailureChecker(ICronetClient.ICronetBootFailureChecker iCronetBootFailureChecker) {
        sCronetBootFailureChecker = iCronetBootFailureChecker;
    }

    private void detectCronetColdStartCrash(final Context context, PP6 pp6) {
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "ss_app_config");
        int i = LIZIZ.getInt("crash_limit_times", 0);
        this.mCrashLimitTimes = i;
        if (i <= 0) {
            int i2 = LIZIZ.getInt("ttnet_crash_times", 0);
            this.mTTNetCrashTimes = i2;
            if (i2 > 0) {
                SharedPreferences.Editor edit = LIZIZ.edit();
                edit.putInt("ttnet_crash_times", 0);
                edit.apply();
                return;
            }
            return;
        }
        this.mTTNetCrashTimes = LIZIZ.getInt("ttnet_crash_times", 0);
        int i3 = LIZIZ.getInt("crash_detect_interval_ms", 5000);
        this.mCrashDetectTimerInterval = i3;
        if (i3 <= 0) {
            this.mCrashDetectTimerInterval = 5000;
        }
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("processname is ");
            LIZ.append(C36841Ed3.LIZ(context));
            LIZ.append(" count is ");
            LIZ.append(this.mTTNetCrashTimes);
            LIZ.append(" limit is ");
            LIZ.append(this.mCrashLimitTimes);
            LIZ.append(" interval is ");
            LIZ.append(this.mCrashDetectTimerInterval);
            X1D.LIZIZ(LIZ);
        }
        if (this.mTTNetCrashTimes >= this.mCrashLimitTimes) {
            if (V2B.LJFF()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("processname is ");
                LIZ2.append(C36841Ed3.LIZ(context));
                LIZ2.append("set secure mode true");
                X1D.LIZIZ(LIZ2);
            }
            pp6.LIZ.LJIIIZ();
        }
        if (!C36841Ed3.LIZJ(context)) {
            return;
        }
        final SharedPreferences.Editor edit2 = LIZIZ.edit();
        int i4 = this.mTTNetCrashTimes + 1;
        this.mTTNetCrashTimes = i4;
        edit2.putInt("ttnet_crash_times", i4);
        edit2.commit();
        if (V2B.LJFF()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("processname is ");
            LIZ3.append(C36841Ed3.LIZ(context));
            LIZ3.append(" save count ");
            LIZ3.append(this.mTTNetCrashTimes);
            X1D.LIZIZ(LIZ3);
        }
        C64793Pbp.LIZ(EnumC64792Pbo.NETWORK).LIZIZ(new AbstractRunnableC64795Pbr(this.mCrashDetectTimerInterval, 0L) { // from class: org.chromium.CronetClient.1
            @Override // java.lang.Runnable
            public void run() {
                org_chromium_CronetClient$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void org_chromium_CronetClient$1__run$___twin___() {
                if (V2B.LJFF()) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("processname is ");
                    LIZ4.append(C36841Ed3.LIZ(context));
                    LIZ4.append(" clear count ");
                    X1D.LIZIZ(LIZ4);
                }
                edit2.putInt("ttnet_crash_times", 0);
                edit2.apply();
            }

            public static void org_chromium_CronetClient$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ4;
                try {
                    anonymousClass1.org_chromium_CronetClient$1__run$___twin___();
                } finally {
                    if (LIZ4) {
                    }
                }
            }
        });
    }

    public static void removeClientOpaqueData(Context context, String str) {
        try {
            if (!C36841Ed3.LIZJ(context)) {
                return;
            }
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetClient", "removeClientOpaqueData start");
            }
            if (sCronetEngine instanceof AbstractC66650QDu) {
                ((AbstractC66650QDu) sCronetEngine).LJJIIJ(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void runInBackGround(Context context, boolean z) {
        try {
            if (!C36841Ed3.LIZJ(context)) {
                return;
            }
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetClient", "runInBackGround start");
            }
            if (sCronetEngine instanceof AbstractC66650QDu) {
                ((AbstractC66650QDu) sCronetEngine).LJJIIZ(z);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setBestHostWithRouteSelectionName(String str, String str2) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIJL(str, str2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void triggerGetDomain(Context context, boolean z) {
        try {
            if (!C36841Ed3.LIZJ(context)) {
                return;
            }
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetClient", "triggerGetDomain start");
            }
            if (sCronetEngine instanceof AbstractC66650QDu) {
                ((AbstractC66650QDu) sCronetEngine).LJJIZ(z);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map) {
        String str;
        if (httpURLConnection == null || map == null || !(httpURLConnection instanceof CronetHttpURLConnection)) {
            return;
        }
        try {
            CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) httpURLConnection;
            if (cronetHttpURLConnection.LJJ == null && cronetHttpURLConnection.LJJIIJZLJL) {
                try {
                    cronetHttpURLConnection.LJJIIJ.await(50L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            QE2 qe2 = cronetHttpURLConnection.LJJ;
            if (qe2 != null && ((C66655QDz) qe2).LIZJ != null) {
                QE1 qe1 = ((C66655QDz) qe2).LIZJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((C66654QDy) qe1).LJIJ);
                LIZ.append(":");
                LIZ.append(((C66654QDy) qe1).LJIJI);
                map.put("remote_ip", X1D.LIZIZ(LIZ));
                map.put("dns_time", Long.valueOf(getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LIZJ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LIZIZ)))));
                map.put("connect_time", Long.valueOf(getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LIZLLL)))));
                map.put("ssl_time", Long.valueOf(getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJI)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJFF)))));
                map.put("send_time", Long.valueOf(getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIIIZZ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJII)))));
                map.put("push_time", Long.valueOf(getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIJ)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIIZ)))));
                map.put("receive_time", Long.valueOf(getCostTime(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIL)), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJIIJJI)))));
                map.put("socket_reused", Boolean.valueOf(((C66654QDy) qe1).LJIILIIL));
                map.put("ttfb", Long.valueOf(getValue(((C66654QDy) qe1).LJIILJJIL)));
                map.put("total_time", Long.valueOf(getValue(((C66654QDy) qe1).LJIILL)));
                map.put("send_byte_count", Long.valueOf(getValue(((C66654QDy) qe1).LJIILLIIL)));
                map.put("received_byte_count", Long.valueOf(getValue(((C66654QDy) qe1).LJIIZILJ)));
                map.put("retry_attempts", Long.valueOf(getValue(((C66654QDy) qe1).LJIJJ)));
                map.put("request_headers", ((C66654QDy) qe1).LJIJJLI);
                map.put("response_headers", ((C66654QDy) qe1).LJIL);
                map.put("request_start", Long.valueOf(getTime(qe1.LIZ())));
                map.put("post_task_start", Long.valueOf(getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJJ))));
                map.put("wait_ctx", Long.valueOf(getCostTime(getTime(qe1.LIZ()), getTime(C66654QDy.LIZIZ(((C66654QDy) qe1).LJJ)))));
            }
            if (cronetHttpURLConnection.LJIL != null) {
                str = cronetHttpURLConnection.LJIL;
            } else {
                str = "";
            }
            map.put("request_log", str);
        } catch (Throwable unused) {
        }
    }

    public static void tryStartNetDetect(String[] strArr, int i, int i2) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJJ(strArr, i, i2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void ttDnsResolve(String str, int i, String str2) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJJI(str, i, str2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        try {
            if (!C36841Ed3.LIZJ(context)) {
                return;
            }
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetClient", "addClientOpaqueData start");
            }
            if (sCronetEngine instanceof AbstractC66650QDu) {
                ((AbstractC66650QDu) sCronetEngine).LJFF(strArr, bArr, bArr2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor) {
        try {
            tryCreateCronetEngine(context, false, false, false, z, str2, executor, false);
            return (HttpURLConnection) sCronetEngine.LJ(new URL(str));
        } catch (Throwable th) {
            if (!(th instanceof MalformedURLException)) {
                if ((th instanceof UnsupportedOperationException) && th.getMessage() != null && th.getMessage().contains("Unexpected protocol")) {
                    throw new IOException("MalformedURLException", th);
                }
                throw new IOException(th);
            }
            throw th;
        }
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJIIIZ(z, str, str2, str3, z2, str4);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJII(str, str2, str3, str4, str5, str6);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setZstdFuncAddr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJIJLIJ(j, j2, j3, j4, j5, j6, j7, j8);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:104|105|106|(5:170|171|(1:173)|174|(5:176|111|112|113|(19:115|116|117|(1:119)|120|(1:122)|126|127|128|(1:130)(1:167)|131|(1:133)|134|135|(1:137)|139|(1:141)(1:164)|142|(8:144|145|146|(1:148)|149|(1:152)|153|(3:158|(1:160)|161)))(18:123|117|(0)|120|(0)|126|127|128|(0)(0)|131|(0)|134|135|(0)|139|(0)(0)|142|(0))))|108|(5:110|111|112|113|(0)(0))|126|127|128|(0)(0)|131|(0)|134|135|(0)|139|(0)(0)|142|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03b3, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0333, code lost:
    
        if (r9 == false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x033b A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0369 A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0378 A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0352 A[Catch: all -> 0x0362, TRY_LEAVE, TryCatch #1 {all -> 0x0362, blocks: (B:113:0x034d, B:123:0x0352), top: B:112:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039f A[Catch: all -> 0x045c, TRY_LEAVE, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ac A[Catch: Exception -> 0x03b2, all -> 0x045c, TRY_LEAVE, TryCatch #8 {Exception -> 0x03b2, blocks: (B:135:0x03a4, B:137:0x03ac), top: B:134:0x03a4, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d8 A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e0 A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e5 A[Catch: all -> 0x045c, TRY_LEAVE, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0389 A[Catch: all -> 0x0399, TRY_LEAVE, TryCatch #12 {all -> 0x0399, blocks: (B:128:0x0384, B:167:0x0389), top: B:127:0x0384 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ec A[Catch: all -> 0x0302, TryCatch #2 {all -> 0x0302, blocks: (B:102:0x02e7, B:179:0x02ec), top: B:101:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0298 A[Catch: all -> 0x02a8, TRY_LEAVE, TryCatch #5 {all -> 0x02a8, blocks: (B:91:0x0293, B:185:0x0298), top: B:90:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026d A[Catch: all -> 0x028c, TryCatch #6 {all -> 0x028c, blocks: (B:86:0x0268, B:188:0x026d), top: B:85:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020e A[Catch: all -> 0x0261, TryCatch #0 {all -> 0x0261, blocks: (B:81:0x0209, B:193:0x020e), top: B:80:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01e6 A[Catch: all -> 0x0202, TryCatch #3 {all -> 0x0202, blocks: (B:76:0x01e1, B:204:0x01e6), top: B:75:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01be A[Catch: all -> 0x01da, TryCatch #13 {all -> 0x01da, blocks: (B:71:0x01b9, B:211:0x01be), top: B:70:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0112 A[Catch: all -> 0x012c, TryCatch #7 {all -> 0x012c, blocks: (B:46:0x010d, B:218:0x0112), top: B:45:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[Catch: all -> 0x045c, TRY_ENTER, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165 A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a A[Catch: all -> 0x045c, TRY_LEAVE, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af A[Catch: all -> 0x045c, TryCatch #14 {, blocks: (B:6:0x0007, B:9:0x000d, B:11:0x0011, B:13:0x042c, B:14:0x0433, B:16:0x0017, B:18:0x004f, B:19:0x0054, B:22:0x0099, B:24:0x009f, B:26:0x00a5, B:27:0x00ac, B:29:0x00b2, B:30:0x00b7, B:228:0x00d8, B:35:0x00dd, B:43:0x0101, B:44:0x0106, B:220:0x0127, B:49:0x012c, B:51:0x014e, B:52:0x015d, B:54:0x0165, B:55:0x017f, B:57:0x018a, B:66:0x01a7, B:68:0x01ad, B:69:0x01b2, B:213:0x01cf, B:215:0x01d5, B:74:0x01da, B:206:0x01f7, B:208:0x01fd, B:79:0x0202, B:195:0x021f, B:197:0x0225, B:198:0x022d, B:200:0x0233, B:84:0x0261, B:190:0x0282, B:89:0x028c, B:95:0x02a9, B:97:0x02af, B:99:0x02c9, B:100:0x02e0, B:182:0x0341, B:111:0x0346, B:117:0x0363, B:119:0x0369, B:120:0x036e, B:122:0x0378, B:126:0x037d, B:131:0x0399, B:133:0x039f, B:135:0x03a4, B:137:0x03ac, B:139:0x03b6, B:141:0x03d8, B:142:0x03da, B:144:0x03e0, B:164:0x03e5, B:166:0x03b3, B:106:0x0303, B:108:0x0335, B:110:0x033b, B:232:0x0094, B:233:0x0434, B:235:0x043a, B:236:0x0448, B:237:0x045a, B:21:0x005c), top: B:5:0x0007, inners: #8, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void tryCreateCronetEngine(android.content.Context r13, boolean r14, boolean r15, boolean r16, boolean r17, java.lang.String r18, java.util.concurrent.Executor r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.tryCreateCronetEngine(android.content.Context, boolean, boolean, boolean, boolean, java.lang.String, java.util.concurrent.Executor, boolean):void");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor, boolean z5) {
        tryCreateCronetEngine(context, z, z2, z3, z4, str, executor, z5);
    }

    public static void notifyStoreRegionUpdated(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (sCronetEngine instanceof AbstractC66650QDu) {
            ((AbstractC66650QDu) sCronetEngine).LJJJJ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }
}
