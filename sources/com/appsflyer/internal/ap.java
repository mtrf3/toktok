package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ap {
    public static void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (i.values().valueOf != null) {
            try {
                try {
                    DeepLink AFKeystoreWrapper = DeepLink.AFKeystoreWrapper(map);
                    AFKeystoreWrapper.values.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(AFKeystoreWrapper, null);
                } catch (JSONException e) {
                    AFLogger.values("[DDL] Error occurred", e);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                values(deepLinkResult);
                return;
            } catch (Throwable th) {
                values(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AFKeystoreWrapper(map);
    }

    public static void AFKeystoreWrapper(Map<String, String> map) {
        if (ai.AFInAppEventType != null) {
            try {
                AFLogger.AFInAppEventType("Calling onAppOpenAttribution with:\n" + map.toString());
                ai.AFInAppEventType.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    public static void values(DeepLinkResult deepLinkResult) {
        if (i.values().valueOf != null) {
            AFLogger.AFInAppEventType("[DDL] Calling onDeepLinking with:\n" + deepLinkResult.toString());
            try {
                i.values().valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.AFInAppEventType("[DDL] skipping, no callback registered");
    }

    public static void AFKeystoreWrapper(String str) {
        if (ai.AFInAppEventType != null) {
            try {
                AFLogger.AFInAppEventType("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                ai.AFInAppEventType.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    public static void AFInAppEventParameterName(String str, DeepLinkResult.Error error) {
        if (i.values().valueOf != null) {
            AFLogger.AFInAppEventType("[DDL] Error occurred: ".concat(String.valueOf(str)));
            values(new DeepLinkResult(null, error));
        } else {
            AFKeystoreWrapper(str);
        }
    }
}
