package com.appsflyer.internal;

import X.C16880lQ;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bo {
    public static Map<String, Object> AFInAppEventType(Context context) {
        String string = ai.values(context).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return AFKeystoreWrapper(string);
        }
        throw new bp();
    }

    public static Map<String, Object> AFKeystoreWrapper(String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    if (jSONObject.isNull(next)) {
                        obj = null;
                    } else {
                        obj = jSONObject.get(next);
                    }
                    hashMap.put(next, obj);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }

    public static void values(ai aiVar, j jVar, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        if (!jVar.AFKeystoreWrapper()) {
            return;
        }
        if (ai.AFInAppEventType == null) {
            AFLogger.AFInAppEventType("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
            return;
        }
        AFLogger.AFInAppEventType("[GCD-A01] Loading conversion data. Counter: " + jVar.onAttributionFailureNative);
        long j = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0L);
        if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
            AFLogger.AFInAppEventType("[GCD-E02] Cached conversion data expired");
            ai.valueOf(context, "sixtyDayConversionData");
            ai.values(context, "attributionId", null);
            aiVar.valueOf(context, "appsflyerConversionDataCacheExpiration", 0L);
        }
        if (sharedPreferences.getString("attributionId", null) != null) {
            if (ai.AFInAppEventParameterName(sharedPreferences, "appsFlyerCount", false) <= 1) {
                return;
            }
            try {
                Map<String, Object> AFInAppEventType = AFInAppEventType(context);
                if (AFInAppEventType == null) {
                    return;
                }
                try {
                    if (!AFInAppEventType.containsKey("is_first_launch")) {
                        AFInAppEventType.put("is_first_launch", Boolean.FALSE);
                    }
                    bv.AFInAppEventType(AFInAppEventType);
                    return;
                } catch (Throwable th2) {
                    AFLogger.valueOf(th2.getLocalizedMessage(), th2);
                    return;
                }
            } catch (bp e) {
                AFLogger.valueOf(e.getMessage(), e);
                return;
            }
        }
        if (th != null) {
            bv.valueOf("Launch exception: " + th.getMessage());
        } else if (num.intValue() != 200) {
            bv.valueOf("Launch status code: ".concat(String.valueOf(num)));
        } else {
            bv bvVar = new bv(aiVar, (Application) C16880lQ.LLLLL(context), str);
            ai.AFInAppEventParameterName(bvVar.AFKeystoreWrapper, bvVar, 10L, TimeUnit.MILLISECONDS);
        }
    }
}
