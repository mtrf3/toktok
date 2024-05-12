package com.appsflyer.internal;

import X.C03660Ck;
import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYT;
import X.PYU;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public abstract class am implements Runnable {
    public static String AFKeystoreWrapper = null;
    public static long AFLogger$LogLevel = 0;
    public static char[] getLevel = null;
    public static int onDeepLinkingNative = 0;
    public static int onInstallConversionDataLoadedNative = 1;
    public static String values;
    public final ai AFInAppEventParameterName;
    public String AFInAppEventType;
    public final Context init;
    public final String valueOf;
    public final String AppsFlyer2dXConversionCallback = UUID.randomUUID().toString();
    public final Map<String, Object> AFVersionDeclaration = AFKeystoreWrapper();

    public static void AFInAppEventType() {
        getLevel = new char[]{1452, 43551, 23272, 2818, 48084, 26734, 6395, 51328, 31033, 10668, 56919, 36564};
        AFLogger$LogLevel = -2488149479668928620L;
    }

    public static URLConnection com_appsflyer_internal_am_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-2188558172191876273"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public abstract void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection);

    @Override // java.lang.Runnable
    public void run() {
        com_appsflyer_internal_am_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public abstract String valueOf();

    public abstract void values();

    public abstract void values(String str);

    private Map<String, Object> AFKeystoreWrapper() {
        HashMap LIZJ = C03660Ck.LIZJ("build_number", "6.4.0");
        LIZJ.put("counter", Integer.valueOf(ai.AFInAppEventParameterName(ai.values(this.init), "appsFlyerCount", false)));
        LIZJ.put("model", Build.MODEL);
        LIZJ.put("brand", Build.BRAND);
        LIZJ.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        try {
            LIZJ.put("app_version_name", C16880lQ.LLLLLLZ(this.init.getPackageManager(), this.init.getPackageName(), 0).versionName);
            onInstallConversionDataLoadedNative = (onDeepLinkingNative + 109) % 128;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        LIZJ.put("app_id", this.init.getPackageName());
        LIZJ.put("platformextension", new an().AFKeystoreWrapper());
        onDeepLinkingNative = (onInstallConversionDataLoadedNative + 91) % 128;
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void com_appsflyer_internal_am__run$___twin___() {
        /*
            r7 = this;
            java.lang.String r6 = ""
            java.lang.String r5 = r7.valueOf()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "oneLinkUrl: "
            java.lang.String r0 = r0.concat(r1)
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0)
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L68
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L68
            java.net.URLConnection r3 = INVOKEVIRTUAL_com_appsflyer_internal_am_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(r0)     // Catch: java.lang.Throwable -> L68
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "content-type"
            java.lang.String r0 = "application/json"
            r3.setRequestProperty(r1, r0)     // Catch: java.lang.Throwable -> L68
            r0 = 3000(0xbb8, float:4.204E-42)
            r3.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L68
            r3.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r7.valueOf     // Catch: java.lang.Throwable -> L68
            r3.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L68
            r7.AFKeystoreWrapper(r3)     // Catch: java.lang.Throwable -> L68
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = com.appsflyer.internal.ai.AFInAppEventParameterName(r3)     // Catch: java.lang.Throwable -> L68
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L4f
            int r0 = com.appsflyer.internal.am.onDeepLinkingNative
            int r0 = r0 + 19
            int r0 = r0 % 128
            com.appsflyer.internal.am.onInstallConversionDataLoadedNative = r0
            java.lang.String r0 = "Status 200 ok"
            com.appsflyer.AFLogger.valueOf(r0)     // Catch: java.lang.Throwable -> L66
            goto L8f
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "Response code = "
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = " content = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L66
            r1.append(r4)     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L66
            goto L8f
        L66:
            r3 = move-exception
            goto L6a
        L68:
            r3 = move-exception
            r4 = r6
        L6a:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Error while calling "
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.valueOf(r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r0 = " stacktrace: "
            r1.append(r0)
            java.lang.String r0 = r3.toString()
            r1.append(r0)
            java.lang.String r6 = r1.toString()
        L8f:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lbe
            int r0 = com.appsflyer.internal.am.onInstallConversionDataLoadedNative
            int r0 = r0 + 45
            int r0 = r0 % 128
            com.appsflyer.internal.am.onDeepLinkingNative = r0
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Connection call succeeded: "
            java.lang.String r0 = r0.concat(r1)
            com.appsflyer.AFLogger.valueOf(r0)
            r7.values(r4)
            int r0 = com.appsflyer.internal.am.onInstallConversionDataLoadedNative
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.appsflyer.internal.am.onDeepLinkingNative = r0
            int r0 = r1 % 2
            if (r0 == 0) goto Lbd
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            throw r0
        Lbd:
            return
        Lbe:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Connection error: "
            java.lang.String r0 = r0.concat(r1)
            com.appsflyer.AFLogger.AFLogger$LogLevel(r0)
            r7.values()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.am.com_appsflyer_internal_am__run$___twin___():void");
    }

    static {
        AFInAppEventType();
        AFKeystoreWrapper = "v2";
        values = "https://%sonelink.%s/shortlink-sdk/" + AFKeystoreWrapper;
        onDeepLinkingNative = (onInstallConversionDataLoadedNative + 121) % 128;
    }

    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_am_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_appsflyer_internal_am_java_net_URL_openConnection(url);
        }
        PPC<URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection com_appsflyer_internal_am_java_net_URL_openConnection = com_appsflyer_internal_am_java_net_URL_openConnection(url);
            if (com_appsflyer_internal_am_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_appsflyer_internal_am_java_net_URL_openConnection);
            } else {
                if (!(com_appsflyer_internal_am_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_appsflyer_internal_am_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_appsflyer_internal_am_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static void com_appsflyer_internal_am_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(am amVar) {
        boolean LIZ;
        try {
            amVar.com_appsflyer_internal_am__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void values(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        ListProtector.add(arrayList, 1, AFKeystoreWrapper);
        httpsURLConnection.setRequestProperty(valueOf((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, (char) (1516 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), ah.valueOf(TextUtils.join("\u2063", arrayList.toArray()), AppsFlyerProperties.getInstance().getString("AppsFlyerKey") + this.AppsFlyer2dXConversionCallback + AFKeystoreWrapper));
        int i = onInstallConversionDataLoadedNative + 41;
        onDeepLinkingNative = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public am(ai aiVar, Context context, String str) {
        this.AFInAppEventParameterName = aiVar;
        this.init = context;
        this.valueOf = str;
    }

    public static String valueOf(int i, int i2, char c) {
        char c2;
        boolean z;
        char[] cArr = new char[i2];
        onInstallConversionDataLoadedNative = (onDeepLinkingNative + 103) % 128;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                c2 = 'H';
            } else {
                c2 = 5;
            }
            if (c2 != 'H') {
                break;
            }
            cArr[i3] = (char) ((getLevel[i + i3] ^ (i3 * AFLogger$LogLevel)) ^ c);
            i3++;
        }
        String str = new String(cArr);
        int i4 = onDeepLinkingNative + 53;
        onInstallConversionDataLoadedNative = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str;
        }
        return str;
    }
}
