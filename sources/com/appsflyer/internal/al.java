package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* loaded from: classes.dex */
public final class al {
    public static String AFInAppEventParameterName;
    public static String AFKeystoreWrapper;

    public static void AFInAppEventParameterName(String str) {
        AFKeystoreWrapper = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        AFInAppEventParameterName = sb.toString();
    }

    public static void values(String str) {
        if (AFKeystoreWrapper == null) {
            AFInAppEventParameterName(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.valueOf(str.replace(str2, AFInAppEventParameterName));
        }
    }
}
