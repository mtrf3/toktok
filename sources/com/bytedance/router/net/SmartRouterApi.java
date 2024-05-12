package com.bytedance.router.net;

import X.C16880lQ;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import defpackage.a1;
import defpackage.i0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class SmartRouterApi {
    public static Map<String, String> sCommonParams;

    /* loaded from: classes7.dex */
    public static class ApiResult<T> {
        public int errorCode = -1;
        public T result;
    }

    public static boolean reportRouterConfig(Context context, ServerParam serverParam, RouterConfig routerConfig) {
        return false;
    }

    public static Map<String, String> getCommonParams(Context context) {
        Map<String, String> map = sCommonParams;
        if (map != null) {
            return map;
        }
        sCommonParams = new HashMap();
        try {
            sCommonParams.put("version_code", String.valueOf(C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 128).versionCode));
            Bundle bundle = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle != null) {
                sCommonParams.put("update_version_code", String.valueOf(bundle.getInt("UPDATE_VERSION_CODE")));
            }
            sCommonParams.put("device_platform", "android");
            sCommonParams.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        } catch (Exception e) {
            sCommonParams = null;
            C16880lQ.LLLLIIL(e);
        }
        return sCommonParams;
    }

    public static String getRouterConfigTag(Context context) {
        Map<String, String> commonParams = getCommonParams(context);
        String str = "";
        if (commonParams == null) {
            return "";
        }
        String str2 = sCommonParams.get("version_code");
        String str3 = sCommonParams.get("update_version_code");
        if (!TextUtils.isEmpty(str2)) {
            str = i0.LJFF("", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            return a1.LJ(str, "_", str2);
        }
        return str;
    }

    public static ApiResult<RouterConfig> requestConfig(Context context, ServerParam serverParam) {
        return new ApiResult<>();
    }
}
