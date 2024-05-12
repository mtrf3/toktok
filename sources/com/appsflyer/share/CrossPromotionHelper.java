package com.appsflyer.share;

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
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.co;
import com.appsflyer.internal.cp;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class CrossPromotionHelper {
    public static String AFKeystoreWrapper = "https://%simpression.%s";

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public final cp AFInAppEventType;
        public final WeakReference<Context> AFKeystoreWrapper;
        public final boolean valueOf;
        public final String values;

        public static URLConnection com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection(URL url) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-1856483817617218704"));
            return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
        }

        @Override // java.lang.Runnable
        public final void run() {
            com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public final void com_appsflyer_share_CrossPromotionHelper$c__run$___twin___() {
            HttpURLConnection httpURLConnection;
            if (this.valueOf) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(this.values));
                try {
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        if (responseCode != 301 && responseCode != 302) {
                            AFLogger.valueOf("call to " + this.values + " failed: " + responseCode);
                        } else {
                            AFLogger.values("Cross promotion redirection success: " + this.values, false);
                            if (this.AFInAppEventType != null && this.AFKeystoreWrapper.get() != null) {
                                this.AFInAppEventType.AFInAppEventType = httpURLConnection.getHeaderField("Location");
                                cp cpVar = this.AFInAppEventType;
                                Context context = this.AFKeystoreWrapper.get();
                                if (cpVar.AFInAppEventType != null) {
                                    C16880lQ.LIZJ(context, new Intent("android.intent.action.VIEW", Uri.parse(cpVar.AFInAppEventType)).setFlags(268435456));
                                }
                            }
                        }
                    } else {
                        AFLogger.values("Cross promotion impressions success: " + this.values, false);
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th) {
                    th = th;
                    try {
                        AFLogger.values(th.getMessage(), th);
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = null;
            }
        }

        public static URLConnection INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
            URLConnection pyu;
            RuntimeException runtimeException;
            URLConnection uRLConnection;
            URLConnection pyu2;
            if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
                return com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection(url);
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
                URLConnection com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection = com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection(url);
                if (com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection instanceof HttpsURLConnection) {
                    pyu = new PYT((HttpsURLConnection) com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection);
                } else {
                    if (!(com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection instanceof HttpURLConnection)) {
                        return com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection;
                    }
                    pyu = new PYU((HttpURLConnection) com_appsflyer_share_CrossPromotionHelper$c_java_net_URL_openConnection);
                }
                return pyu;
            }
            throw runtimeException;
        }

        public static void com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(c cVar) {
            boolean LIZ;
            try {
                cVar.com_appsflyer_share_CrossPromotionHelper$c__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public c(String str, cp cpVar, Context context, boolean z) {
            this.values = str;
            this.AFInAppEventType = cpVar;
            this.AFKeystoreWrapper = new WeakReference<>(context);
            this.valueOf = z;
        }
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    AFKeystoreWrapper = value;
                }
            } else if (key.equals("app")) {
                co.valueOf = value;
            }
        }
    }

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFInAppEventType = AFInAppEventType(context, str, str2, map, C16880lQ.LLLZ(co.valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new PthreadThread(new c(AFInAppEventType.generateLink(), new cp(), context, AppsFlyerLib.getInstance().isStopped()), "CrossPromotionHelper").start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new PthreadThread(new c(AFInAppEventType(context, str, str2, map, C16880lQ.LLLZ(AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()})).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped()), "CrossPromotionHelper").start();
        }
    }

    public static LinkGenerator AFInAppEventType(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.AFKeystoreWrapper = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }
}
