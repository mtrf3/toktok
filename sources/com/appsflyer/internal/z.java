package com.appsflyer.internal;

import X.C16880lQ;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z implements Runnable {
    public static String AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
    public static String valueOf = "https://%svalidate.%s/api/v" + ai.valueOf + "/androidevent?buildnumber=6.4.0&app_id=";
    public WeakReference<Context> AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public String getLevel;
    public Map<String, String> init;
    public String values;

    @Override // java.lang.Runnable
    public final void run() {
        com_appsflyer_internal_z_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public final void com_appsflyer_internal_z__run$___twin___() {
        int i;
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            Context context = this.AFInAppEventParameterName.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.values);
            hashMap.put("sig-data", this.AppsFlyer2dXConversionCallback);
            hashMap.put("signature", this.AFVersionDeclaration);
            final HashMap hashMap2 = new HashMap(hashMap);
            new PthreadThread(new Runnable() { // from class: com.appsflyer.internal.z.3
                @Override // java.lang.Runnable
                public final void run() {
                    com_appsflyer_internal_z$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_appsflyer_internal_z$3__run$___twin___() {
                    z zVar = z.this;
                    z.AFInAppEventType(zVar, hashMap2, zVar.init, z.this.AFInAppEventParameterName);
                }

                public static void com_appsflyer_internal_z$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_appsflyer_internal_z$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, "er/internal/z").start();
            hashMap.put("dev_key", this.AFInAppEventType);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            String jSONObject = new JSONObject(hashMap).toString();
            String LLLZ = C16880lQ.LLLZ(AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()});
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", LLLZ, jSONObject);
            cd cdVar = new cd();
            cdVar.AFInAppEventType(hashMap);
            cdVar.valueOf(LLLZ);
            HttpURLConnection valueOf2 = valueOf(cdVar);
            if (valueOf2 != null) {
                i = valueOf2.getResponseCode();
            } else {
                i = -1;
            }
            ai.valueOf();
            String AFInAppEventParameterName = ai.AFInAppEventParameterName(valueOf2);
            aj.AFInAppEventParameterName().AFInAppEventType("server_response", LLLZ, String.valueOf(i), AFInAppEventParameterName);
            JSONObject jSONObject2 = new JSONObject(AFInAppEventParameterName);
            jSONObject2.put("code", i);
            if (i == 200) {
                AFLogger.valueOf("Validate response 200 ok: " + jSONObject2.toString());
                values(jSONObject2.optBoolean("result"), this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, jSONObject2.toString());
            } else {
                AFLogger.valueOf("Failed Validate request");
                values(false, this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, jSONObject2.toString());
            }
            if (valueOf2 != null) {
                valueOf2.disconnect();
            }
        } catch (Throwable th) {
            try {
                if (ai.AFKeystoreWrapper != null) {
                    AFLogger.valueOf("Failed Validate request + ex", th);
                    values(false, this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, th.getMessage());
                }
                AFLogger.valueOf(th.getMessage(), th);
            } finally {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    public static void com_appsflyer_internal_z_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(z zVar) {
        boolean LIZ;
        try {
            zVar.com_appsflyer_internal_z__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static HttpURLConnection valueOf(ce ceVar) {
        AFLogger.AFInAppEventType("Calling " + ceVar.onAppOpenAttributionNative);
        ceVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
        return new ah(ceVar).AFInAppEventParameterName();
    }

    public static /* synthetic */ void AFInAppEventType(z zVar, Map map, Map map2, WeakReference weakReference) {
        int i;
        if (weakReference.get() != null) {
            ab.AFKeystoreWrapper((Context) weakReference.get()).valueOf();
            String str = C16880lQ.LLLZ(valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}) + ((Context) weakReference.get()).getPackageName();
            String string = ai.values((Context) weakReference.get()).getString("referrer", "");
            cc ccVar = new cc((Context) weakReference.get());
            ccVar.AppsFlyer2dXConversionCallback = zVar.AFInAppEventType;
            ccVar.AFVersionDeclaration = string;
            ai valueOf2 = ai.valueOf();
            Map<String, Object> valueOf3 = valueOf2.valueOf(ccVar);
            valueOf3.put("price", zVar.AFLogger$LogLevel);
            valueOf3.put("currency", zVar.getLevel);
            valueOf3.put("receipt_data", map);
            if (map2 != null) {
                valueOf3.put("extra_prms", map2);
            }
            valueOf3.putAll(valueOf2.values());
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", str, new JSONObject(valueOf3).toString());
            HttpURLConnection httpURLConnection = null;
            try {
                ccVar.AFInAppEventType(valueOf3);
                ccVar.valueOf(str);
                httpURLConnection = valueOf(ccVar);
                if (httpURLConnection != null) {
                    i = httpURLConnection.getResponseCode();
                } else {
                    i = -1;
                }
                String AFInAppEventParameterName = ai.AFInAppEventParameterName(httpURLConnection);
                aj.AFInAppEventParameterName().AFInAppEventType("server_response", str, String.valueOf(i), AFInAppEventParameterName);
                AFLogger.valueOf("Validate-WH response - " + i + ": " + new JSONObject(AFInAppEventParameterName).toString());
            } catch (Throwable th) {
                try {
                    AFLogger.valueOf(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
    }

    public static void values(boolean z, String str, String str2, String str3, String str4) {
        if (ai.AFKeystoreWrapper != null) {
            AFLogger.AFInAppEventType("Validate callback parameters: " + str + " " + str2 + " " + str3);
            if (z) {
                AFLogger.AFInAppEventType("Validate in app purchase success: ".concat(String.valueOf(str4)));
                ai.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.AFInAppEventType("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = ai.AFKeystoreWrapper;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public z(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFInAppEventParameterName = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.values = str2;
        this.AppsFlyer2dXConversionCallback = str4;
        this.AFLogger$LogLevel = str5;
        this.getLevel = str6;
        this.init = map;
        this.AFVersionDeclaration = str3;
    }
}
