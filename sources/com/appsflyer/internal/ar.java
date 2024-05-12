package com.appsflyer.internal;

import X.C16880lQ;
import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.c;
import com.appsflyer.internal.cl;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ar extends bu {
    public static String onAttributionFailure = "https://%sdlsdk.%s/v1.0/android/";
    public static long onInstallConversionDataLoadedNative;
    public int AppsFlyerConversionListener;
    public int AppsFlyerInAppPurchaseValidatorListener;
    public final JSONObject AppsFlyerLib;
    public final au onAppOpenAttribution;
    public final CountDownLatch onConversionDataFail;
    public final List<cl> onDeepLinking;
    public int onInstallConversionFailureNative;
    public boolean onValidateInApp;

    /* renamed from: com.appsflyer.internal.ar$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[cl.a.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[cl.a.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[cl.a.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private boolean values() {
        int i;
        List list = (List) this.AFInAppEventType.get("referrers");
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i >= this.AppsFlyerConversionListener || this.AFInAppEventType.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFInAppEventParameterName(cl clVar) {
        if (AFInAppEventType(clVar)) {
            this.onDeepLinking.add(clVar);
            this.onConversionDataFail.countDown();
            AFLogger.AFInAppEventType("[DDL] Added non-organic ".concat(C16880lQ.LJLLJ(clVar.getClass())));
        } else {
            int i = this.AppsFlyerInAppPurchaseValidatorListener + 1;
            this.AppsFlyerInAppPurchaseValidatorListener = i;
            if (i == this.AppsFlyerConversionListener) {
                this.onConversionDataFail.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFInAppEventType(Context context) {
        String[] strArr;
        this.onInstallConversionFailureNative++;
        AFLogger.AFInAppEventType("[DDL] Preparing request " + this.onInstallConversionFailureNative);
        if (this.onInstallConversionFailureNative == 1) {
            ai valueOf = ai.valueOf();
            this.AFInAppEventType.put("is_first", Boolean.valueOf(ai.AFInAppEventType(context)));
            this.AFInAppEventType.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            this.AFInAppEventType.put("os", Build.VERSION.RELEASE);
            this.AFInAppEventType.put("type", Build.MODEL);
            this.AFInAppEventType.put("request_id", valueOf.getAppsFlyerUID(context));
            l lVar = valueOf.onAppOpenAttributionNative;
            if (lVar != null && (strArr = lVar.valueOf) != null) {
                this.AFInAppEventType.put("sharing_filter", strArr);
            }
            Map<String, Object> valueOf2 = valueOf(ad.AFInAppEventType(context, new HashMap()));
            Map<String, Object> valueOf3 = valueOf(ad.values(context));
            if (valueOf2 != null) {
                this.AFInAppEventType.put("gaid", valueOf2);
            }
            if (valueOf3 != null) {
                this.AFInAppEventType.put("oaid", valueOf3);
            }
        }
        Map<String, Object> map = this.AFInAppEventType;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        this.AFInAppEventType.put("request_count", Integer.valueOf(this.onInstallConversionFailureNative));
        ArrayList arrayList = new ArrayList();
        for (cl clVar : this.onDeepLinking) {
            if (clVar.valueOf == cl.a.FINISHED) {
                HashMap hashMap = new HashMap();
                Object obj = clVar.values.get("referrer");
                if (obj != null) {
                    hashMap.put("source", clVar.values.get("source"));
                    hashMap.put("value", obj);
                    arrayList.add(hashMap);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFInAppEventType.put("referrers", arrayList);
        }
        String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        valueOf(UriProtector.parse(C16880lQ.LLLZ(this.onAppOpenAttributionNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()})).buildUpon().appendPath(context.getPackageName()).appendQueryParameter("af_sig", ah.valueOf(this.AFInAppEventType.get("timestamp") + string, string)).appendQueryParameter("sdk_version", ai.valueOf).build().toString());
    }

    public final void valueOf(DeepLinkResult deepLinkResult) {
        try {
            this.AppsFlyerLib.put("status", deepLinkResult.getStatus().toString());
            this.AppsFlyerLib.put("timeout_value", onInstallConversionDataLoadedNative);
        } catch (JSONException unused) {
        }
        au auVar = this.onAppOpenAttribution;
        auVar.values.edit().putString("ddl", this.AppsFlyerLib.toString()).apply();
        ap.values(deepLinkResult);
    }

    public static /* synthetic */ void AFInAppEventType(ar arVar) {
        ArrayList arrayList = new ArrayList();
        for (cl clVar : ai.valueOf().init) {
            if (clVar != null && clVar.valueOf != cl.a.NOT_STARTED) {
                arrayList.add(clVar);
            }
        }
        arVar.AppsFlyerConversionListener = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final cl clVar2 = (cl) it.next();
            int i = AnonymousClass3.AFKeystoreWrapper[clVar2.valueOf.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    clVar2.addObserver(new Observer() { // from class: com.appsflyer.internal.ar.1
                        @Override // java.util.Observer
                        public final void update(Observable observable, Object obj) {
                            AFLogger.AFInAppEventType("[DDL] " + clVar2.values.get("source") + " referrer collected via observer");
                            ar.this.AFInAppEventParameterName((cl) observable);
                        }
                    });
                }
            } else {
                AFLogger.AFInAppEventType("[DDL] " + clVar2.values.get("source") + " referrer collected earlier");
                arVar.AFInAppEventParameterName(clVar2);
            }
        }
    }

    private Map<String, Object> valueOf(final c.d.b bVar) {
        if (bVar != null && bVar.values != null) {
            Boolean bool = bVar.AFKeystoreWrapper;
            if (bool == null || !bool.booleanValue()) {
                return new HashMap<String, Object>() { // from class: com.appsflyer.internal.ar.2
                    {
                        put("type", "unhashed");
                        put("value", c.d.b.this.values);
                    }
                };
            }
            return null;
        }
        return null;
    }

    public static boolean AFInAppEventType(cl clVar) {
        Long l = (Long) clVar.values.get("click_ts");
        if (l == null || System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) >= TimeUnit.DAYS.toMillis(1L)) {
            return false;
        }
        return true;
    }

    public ar(Context context, au auVar) {
        super(null, onAttributionFailure, Boolean.FALSE, Boolean.TRUE, null, context);
        this.onDeepLinking = new ArrayList();
        this.onConversionDataFail = new CountDownLatch(1);
        this.AppsFlyerLib = new JSONObject();
        this.onAppOpenAttribution = auVar;
    }

    public static /* synthetic */ DeepLinkResult AFInAppEventType(ar arVar, Context context) {
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            if (arVar.onInstallConversionFailureNative == 1) {
                arVar.AppsFlyerLib.put("from_fg", currentTimeMillis - arVar.onAppOpenAttribution.values.getLong("fg_ts", 0L));
            }
            HttpURLConnection AFInAppEventParameterName = new ah(arVar).AFInAppEventParameterName();
            JSONArray optJSONArray = arVar.AppsFlyerLib.optJSONArray("net");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            optJSONArray.put(arVar.onInstallConversionFailureNative - 1, currentTimeMillis2 - currentTimeMillis);
            arVar.AppsFlyerLib.put("net", optJSONArray);
            if (AFInAppEventParameterName.getResponseCode() == 200) {
                ai.valueOf();
                JSONObject jSONObject = new JSONObject(ai.AFInAppEventParameterName(AFInAppEventParameterName));
                arVar.onValidateInApp = jSONObject.optBoolean("is_second_ping", true);
                if (!jSONObject.optBoolean("found")) {
                    if (arVar.onInstallConversionFailureNative > 1 || !arVar.values() || !arVar.onValidateInApp) {
                        break;
                    }
                    AFLogger.AFInAppEventType("[DDL] Waiting for referrers...");
                    arVar.onConversionDataFail.await();
                    arVar.AppsFlyerLib.put("rfr_wait", System.currentTimeMillis() - currentTimeMillis2);
                    if (arVar.AppsFlyerInAppPurchaseValidatorListener == arVar.AppsFlyerConversionListener) {
                        return new DeepLinkResult(null, null);
                    }
                    arVar.AFInAppEventType(context);
                } else {
                    DeepLink AFKeystoreWrapper = DeepLink.AFKeystoreWrapper(jSONObject.optJSONObject("click_event"));
                    AFKeystoreWrapper.values.put("is_deferred", true);
                    return new DeepLinkResult(AFKeystoreWrapper, null);
                }
            } else {
                AFLogger.AFInAppEventType("[DDL] Error occurred. Server response code = " + AFInAppEventParameterName.getResponseCode());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
        return new DeepLinkResult(null, null);
    }
}
