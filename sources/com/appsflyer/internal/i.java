package com.appsflyer.internal;

import X.C03880Dg;
import X.C07780Sg;
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
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {
    public static Intent AFInAppEventParameterName;
    public static final int AFInAppEventType = (int) TimeUnit.SECONDS.toMillis(2);
    public static String[] AFKeystoreWrapper;
    public static i AFVersionDeclaration;
    public static String[] AppsFlyer2dXConversionCallback;
    public static volatile boolean values;
    public String AFLogger$LogLevel;
    public Map<String, String> getLevel;
    public List<List<String>> init = new ArrayList();
    public DeepLinkListener valueOf;

    public static i values() {
        if (AFVersionDeclaration == null) {
            AFVersionDeclaration = new i();
        }
        return AFVersionDeclaration;
    }

    public static boolean AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder LIZIZ = C07780Sg.LIZIZ("Validate if link ", str, " belongs to ESP domains: ");
        LIZIZ.append(Arrays.asList(AFKeystoreWrapper));
        AFLogger.AFInAppEventParameterName(LIZIZ.toString());
        try {
            return Arrays.asList(AFKeystoreWrapper).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static Uri AFKeystoreWrapper(Intent intent) {
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            return intent.getData();
        }
        return null;
    }

    private Uri valueOf(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = UriProtector.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    private boolean AFInAppEventParameterName(Intent intent, Context context, Map<String, Object> map) {
        Uri uri;
        Uri uri2;
        String string;
        Uri valueOf;
        Uri uri3 = null;
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        Intent intent2 = AFInAppEventParameterName;
        if (intent2 != null && "android.intent.action.VIEW".equals(intent2.getAction())) {
            uri2 = intent2.getData();
        } else {
            uri2 = null;
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        List<List<String>> list = this.init;
        if (list != null && !list.isEmpty() && LLJJIJI != null) {
            Iterator<List<String>> it = this.init.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<String> next = it.next();
                if (next != null) {
                    Iterator<String> it2 = next.iterator();
                    if (it2.hasNext() && (string = LLJJIJI.getString(it2.next())) != null && (valueOf = valueOf(string, it2)) != null) {
                        AFLogger.AFInAppEventType("Found deeplink in push payload at " + next.toString());
                        ai.valueOf(map).put("payloadKey", this.init);
                        uri3 = valueOf;
                        break;
                    }
                }
            }
        }
        if (uri != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, map, uri);
                return true;
            }
            AFLogger.valueOf("skipping re-use of previously consumed deep link: " + uri.toString() + " w/af_consumed");
            return false;
        }
        if (uri2 != null) {
            if (!AFInAppEventParameterName.hasExtra("af_consumed")) {
                AFInAppEventParameterName.putExtra("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, map, uri2);
                return true;
            }
            AFLogger.valueOf("skipping re-use of previously consumed trampoline deep link: " + uri2.toString() + " w/af_consumed");
            return false;
        }
        if (uri3 != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, map, uri3);
                return true;
            }
            AFLogger.valueOf("skipping re-use of previously consumed deep link from push: " + uri3.toString() + " w/af_consumed");
            return false;
        }
        AFLogger.AFInAppEventType("No deep link detected");
        return false;
    }

    public final void AFKeystoreWrapper(final Context context, final Map<String, Object> map, final Uri uri) {
        if (AFKeystoreWrapper(uri.toString())) {
            values = true;
            if (k.values == null) {
                k.values = new k();
            }
            k kVar = k.values;
            if (kVar.AFInAppEventParameterName == null) {
                kVar.AFInAppEventParameterName = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(kVar.AFInAppEventType);
            }
            kVar.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.i.2
                public static URLConnection com_appsflyer_internal_i$2_java_net_URL_openConnection(URL url) {
                    C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "2309626391053107430"));
                    return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com_appsflyer_internal_i$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_appsflyer_internal_i$2__run$___twin___() {
                    Integer num;
                    Object obj;
                    String str;
                    int i;
                    Uri uri2;
                    long currentTimeMillis = System.currentTimeMillis();
                    String uri3 = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    do {
                        Map<String, Object> values2 = values(UriProtector.parse(uri3));
                        uri3 = (String) values2.get("res");
                        num = (Integer) values2.get("status");
                        obj = values2.get("error");
                        if (uri3 == null || !i.AFKeystoreWrapper(uri3)) {
                            break;
                        }
                        if (i2 < 4) {
                            arrayList.add(uri3);
                        }
                        i2++;
                    } while (i2 < 5);
                    HashMap hashMap = new HashMap();
                    if (uri3 != null) {
                        str = uri3;
                    } else {
                        str = "";
                    }
                    hashMap.put("res", str);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    hashMap.put("status", Integer.valueOf(i));
                    if (obj != null) {
                        hashMap.put("error", obj);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put("redirects", arrayList);
                    }
                    hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        map.put("af_deeplink_r", hashMap);
                        map.put("af_deeplink", uri.toString());
                    }
                    ai valueOf = ai.valueOf();
                    Context context2 = context;
                    Map<String, Object> map2 = map;
                    if (uri3 != null) {
                        uri2 = UriProtector.parse(uri3);
                    } else {
                        uri2 = uri;
                    }
                    valueOf.valueOf(context2, map2, uri2);
                    i.values = false;
                }

                public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_i$2_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
                    URLConnection pyu;
                    RuntimeException runtimeException;
                    URLConnection uRLConnection;
                    URLConnection pyu2;
                    if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
                        return com_appsflyer_internal_i$2_java_net_URL_openConnection(url);
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
                        URLConnection com_appsflyer_internal_i$2_java_net_URL_openConnection = com_appsflyer_internal_i$2_java_net_URL_openConnection(url);
                        if (com_appsflyer_internal_i$2_java_net_URL_openConnection instanceof HttpsURLConnection) {
                            pyu = new PYT((HttpsURLConnection) com_appsflyer_internal_i$2_java_net_URL_openConnection);
                        } else {
                            if (!(com_appsflyer_internal_i$2_java_net_URL_openConnection instanceof HttpURLConnection)) {
                                return com_appsflyer_internal_i$2_java_net_URL_openConnection;
                            }
                            pyu = new PYU((HttpURLConnection) com_appsflyer_internal_i$2_java_net_URL_openConnection);
                        }
                        return pyu;
                    }
                    throw runtimeException;
                }

                public static void com_appsflyer_internal_i$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_appsflyer_internal_i$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public static Map<String, Object> values(Uri uri2) {
                    HashMap hashMap = new HashMap();
                    try {
                        AFLogger.AFInAppEventType("ESP deeplink resolving is started: " + uri2.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_appsflyer_internal_i$2_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(uri2.toString()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int i = i.AFInAppEventType;
                        httpURLConnection.setReadTimeout(i);
                        httpURLConnection.setConnectTimeout(i);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.4.0");
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put("status", Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.AFInAppEventType("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        AFLogger.valueOf(th.getMessage(), th);
                    }
                    return hashMap;
                }
            });
        } else {
            ai.valueOf().valueOf(context, map, uri);
        }
        AFInAppEventParameterName = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFKeystoreWrapper(java.util.Map<java.lang.String, java.lang.Object> r9, com.appsflyer.internal.au r10, android.content.Intent r11, android.content.Context r12) {
        /*
            r8 = this;
            android.content.SharedPreferences r3 = com.appsflyer.internal.ai.values(r12)
            boolean r0 = r8.AFInAppEventParameterName(r11, r12, r9)
            java.lang.String r2 = "ddl_sent"
            if (r0 != 0) goto L99
            com.appsflyer.deeplink.DeepLinkListener r0 = r8.valueOf
            if (r0 == 0) goto L99
            com.appsflyer.internal.ai.valueOf()
            java.lang.String r0 = "appsFlyerCount"
            r1 = 0
            int r0 = com.appsflyer.internal.ai.AFInAppEventParameterName(r3, r0, r1)
            if (r0 != 0) goto L99
            boolean r0 = r3.getBoolean(r2, r1)
            if (r0 != 0) goto L99
            com.appsflyer.internal.ar r4 = new com.appsflyer.internal.ar
            r4.<init>(r12, r10)
            java.lang.String r0 = "[DDL] start"
            com.appsflyer.AFLogger.AFInAppEventType(r0)
            java.util.concurrent.FutureTask r7 = new java.util.concurrent.FutureTask
            com.appsflyer.internal.ar$5 r0 = new com.appsflyer.internal.ar$5
            r0.<init>()
            r7.<init>(r0)
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread r1 = new com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread
            java.lang.String r0 = "er/internal/i"
            r1.<init>(r7, r0)
            r1.start()
            r5 = 0
            long r0 = com.appsflyer.internal.ar.onInstallConversionDataLoadedNative     // Catch: java.util.concurrent.ExecutionException -> L4f java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L6d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L4f java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L6d
            java.lang.Object r0 = r7.get(r0, r6)     // Catch: java.util.concurrent.ExecutionException -> L4f java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L6d
            com.appsflyer.deeplink.DeepLinkResult r0 = (com.appsflyer.deeplink.DeepLinkResult) r0     // Catch: java.util.concurrent.ExecutionException -> L4f java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L6d
            r4.valueOf(r0)     // Catch: java.util.concurrent.ExecutionException -> L4f java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L6d
            goto L99
        L4f:
            r6 = move-exception
            goto L52
        L51:
            r6 = move-exception
        L52:
            java.lang.String r0 = "[DDL] Error occurred"
            com.appsflyer.AFLogger.values(r0, r6)
            com.appsflyer.deeplink.DeepLinkResult r1 = new com.appsflyer.deeplink.DeepLinkResult
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L6a
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
        L63:
            r1.<init>(r5, r0)
            r4.valueOf(r1)
            goto L99
        L6a:
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.UNEXPECTED
            goto L63
        L6d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "[DDL] Timeout, didn't manage to find deferred deep link after "
            r6.<init>(r0)
            int r0 = r4.onInstallConversionFailureNative
            r6.append(r0)
            java.lang.String r0 = " attempt(s) within "
            r6.append(r0)
            long r0 = com.appsflyer.internal.ar.onInstallConversionDataLoadedNative
            r6.append(r0)
            java.lang.String r0 = " milliseconds"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.appsflyer.AFLogger.AFInAppEventType(r0)
            com.appsflyer.deeplink.DeepLinkResult r1 = new com.appsflyer.deeplink.DeepLinkResult
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.TIMEOUT
            r1.<init>(r5, r0)
            r4.valueOf(r1)
        L99:
            android.content.SharedPreferences$Editor r1 = r3.edit()
            r0 = 1
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r2, r0)
            r0.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.i.AFKeystoreWrapper(java.util.Map, com.appsflyer.internal.au, android.content.Intent, android.content.Context):void");
    }
}
