package com.appsflyer.internal;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYT;
import X.PYU;
import android.app.Application;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class bv implements Runnable {
    public static String AFInAppEventType = "https://%sgcdsdk.%s/install_data/v4.0/";
    public static final List<String> valueOf = Arrays.asList("googleplay", "playstore", "googleplaystore");
    public final Application AFInAppEventParameterName;
    public final ScheduledExecutorService AFKeystoreWrapper;
    public final int AFVersionDeclaration;
    public final AtomicInteger AppsFlyer2dXConversionCallback;
    public final ai getLevel;
    public final String values;

    public static URLConnection com_appsflyer_internal_bv_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-2188558172191876233"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // java.lang.Runnable
    public final void run() {
        com_appsflyer_internal_bv_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:17|18|(2:92|(10:94|21|22|23|(5:27|(1:37)(1:31)|32|33|34)|38|(13:40|(1:42)|(1:46)|47|48|(2:50|(1:52)(1:53))|54|(1:56)|57|58|(1:60)(1:74)|61|(5:65|66|(1:68)|70|71))|32|33|34)(1:95))|20|21|22|23|(7:27|(1:29)|35|37|32|33|34)|38|(0)|32|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0290, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0291, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0296, code lost:
    
        if (r15.AFVersionDeclaration < 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0298, code lost:
    
        r4 = new com.appsflyer.internal.bv(r15);
        com.appsflyer.internal.ai.AFInAppEventParameterName(r4.AFKeystoreWrapper, r4, 10, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a6, code lost:
    
        com.appsflyer.AFLogger.valueOf(r5.getMessage(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ae, code lost:
    
        valueOf(r5.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02cb, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02cc, code lost:
    
        r15.AppsFlyer2dXConversionCallback.decrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d1, code lost:
    
        if (r12 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d3, code lost:
    
        r12.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d6, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199 A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:23:0x00f6, B:31:0x014a, B:35:0x0136, B:37:0x013a, B:38:0x0159, B:40:0x0199, B:42:0x01a7, B:44:0x01c1, B:46:0x01c7, B:47:0x01d4, B:50:0x01de, B:52:0x01e4, B:53:0x021f, B:54:0x01f7, B:56:0x01fd, B:57:0x0210, B:60:0x0235, B:61:0x0240, B:63:0x0244, B:66:0x024c, B:68:0x0260, B:71:0x026d, B:73:0x0268, B:74:0x023b), top: B:22:0x00f6, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void com_appsflyer_internal_bv__run$___twin___() {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.bv.com_appsflyer_internal_bv__run$___twin___():void");
    }

    public bv(bv bvVar) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFKeystoreWrapper = k.values.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.getLevel = bvVar.getLevel;
        this.AFInAppEventParameterName = bvVar.AFInAppEventParameterName;
        this.values = bvVar.values;
        this.AFVersionDeclaration = bvVar.AFVersionDeclaration + 1;
    }

    public static void AFInAppEventType(Map<String, Object> map) {
        AFLogger.AFInAppEventType("[GCD-A02] Calling onConversionDataSuccess with:\n" + map.toString());
        ai.AFInAppEventType.onConversionDataSuccess(map);
    }

    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_bv_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_appsflyer_internal_bv_java_net_URL_openConnection(url);
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
            URLConnection com_appsflyer_internal_bv_java_net_URL_openConnection = com_appsflyer_internal_bv_java_net_URL_openConnection(url);
            if (com_appsflyer_internal_bv_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_appsflyer_internal_bv_java_net_URL_openConnection);
            } else {
                if (!(com_appsflyer_internal_bv_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_appsflyer_internal_bv_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_appsflyer_internal_bv_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static void com_appsflyer_internal_bv_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(bv bvVar) {
        boolean LIZ;
        try {
            bvVar.com_appsflyer_internal_bv__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static void valueOf(String str) {
        if (ai.AFInAppEventType != null) {
            AFLogger.AFInAppEventType("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            ai.AFInAppEventType.onConversionDataFail(str);
        }
    }

    public bv(ai aiVar, Application application, String str) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFKeystoreWrapper = k.values.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.getLevel = aiVar;
        this.AFInAppEventParameterName = application;
        this.values = str;
        this.AFVersionDeclaration = 0;
    }
}
