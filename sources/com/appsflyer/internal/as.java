package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class as {
    public static JSONObject valueOf(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
            if (jSONObject.optBoolean("monitor", false) && !z) {
                aj.AFInAppEventParameterName().AFInAppEventType();
            } else {
                aj.AFInAppEventParameterName().valueOf();
                aj.AFInAppEventParameterName().values();
            }
            if (jSONObject.has("ol_id")) {
                String optString = jSONObject.optString("ol_scheme", null);
                String optString2 = jSONObject.optString("ol_domain", null);
                String optString3 = jSONObject.optString("ol_ver", null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set("onelinkScheme", optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set("onelinkDomain", optString2);
                }
                if (optString3 != null) {
                    AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                    return jSONObject;
                }
                return jSONObject;
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            AFLogger.valueOf(th.getMessage(), th);
            aj.AFInAppEventParameterName().valueOf();
            aj.AFInAppEventParameterName().values();
            return jSONObject2;
        }
    }
}
