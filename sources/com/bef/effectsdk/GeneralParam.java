package com.bef.effectsdk;

import X.C1FJ;
import X.UPJ;
import X.X1D;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class GeneralParam {
    public static GetNetWorkInfo sGetNetworkInfo;

    /* loaded from: classes.dex */
    public interface GetNetWorkInfo {
        int checkUrl(String str);

        HashMap<String, String> getHeader(String str);

        HashMap<String, String> getParam(String str);
    }

    public static native String nativeGetParamByKey(String str);

    public static native void nativeSetParamWithKey(String str, String str2);

    public static native void nativeSetParams(HashMap<String, String> hashMap);

    public static int checkUrlStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        if (getNetWorkInfo == null) {
            return 0;
        }
        return getNetWorkInfo.checkUrl(str);
    }

    public static String convertMapToString(HashMap<String, String> hashMap) {
        if (hashMap.isEmpty()) {
            return "";
        }
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) C1FJ.LIZJ(LIZ, next.getKey(), "=", next));
        String LIZIZ = X1D.LIZIZ(LIZ);
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            String key = next2.getKey();
            String value = next2.getValue();
            if (!key.isEmpty() && !value.isEmpty()) {
                LIZIZ = UPJ.LIZIZ(LIZIZ, "&", key, "=", value);
            }
        }
        return LIZIZ;
    }

    public static String getHeaderStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        if (getNetWorkInfo == null) {
            return "";
        }
        return convertMapToString(getNetWorkInfo.getHeader(str));
    }

    public static String getParamByKey(String str) {
        return nativeGetParamByKey(str);
    }

    public static String getParamStr(String str) {
        GetNetWorkInfo getNetWorkInfo = sGetNetworkInfo;
        if (getNetWorkInfo == null) {
            return "";
        }
        return convertMapToString(getNetWorkInfo.getParam(str));
    }

    public static void setNetWorkInfoCallback(GetNetWorkInfo getNetWorkInfo) {
        sGetNetworkInfo = getNetWorkInfo;
    }

    public static void setParams(HashMap<String, String> hashMap) {
        nativeSetParams(hashMap);
    }

    public static void setParamWithKey(String str, String str2) {
        nativeSetParamWithKey(str, str2);
    }
}
