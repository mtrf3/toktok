package com.bytedance.router.util;

import X.C00F;
import X.C16880lQ;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RoutesConfig;
import defpackage.a1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Util {
    public static int getAppVersionCode(Context context) {
        Bundle bundle;
        PackageManager packageManager = context.getPackageManager();
        int i = -1;
        try {
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(packageManager, context.getPackageName(), 128);
            if (LLLLLLLLL != null && (bundle = LLLLLLLLL.metaData) != null) {
                i = bundle.getInt("UPDATE_VERSION_CODE", -1);
                if (i > 0) {
                    return i;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, context.getPackageName(), 0);
            if (LLLLLLZ != null) {
                return LLLLLLZ.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return i;
    }

    public static String getRealRouteUrl(String str) {
        Uri parse = UriProtector.parse(str);
        if (parse.isHierarchical()) {
            if (!TextUtils.isEmpty(parse.getScheme())) {
                return "//" + parse.getAuthority() + parse.getPath();
            }
            return str;
        }
        return null;
    }

    public static String getRouteUrl(String str) {
        Uri parse = UriProtector.parse(str);
        if (parse.isHierarchical()) {
            if (!TextUtils.isEmpty(parse.getScheme())) {
                return parse.getScheme() + "://" + parse.getAuthority() + parse.getPath();
            }
            return "//" + parse.getAuthority() + parse.getPath();
        }
        return null;
    }

    public static boolean isLegalUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return UriProtector.parse(str).isHierarchical();
    }

    public static Map<String, String> sliceUrlParams(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.e("Slice url params but the url is null!!!");
            return Collections.EMPTY_MAP;
        }
        Uri parse = UriProtector.parse(str);
        if (!parse.isHierarchical()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : UriProtector.getQueryParameterNames(parse)) {
            if (!TextUtils.isEmpty(str2)) {
                String queryParameter = UriProtector.getQueryParameter(parse, str2);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                hashMap.put(str2, queryParameter);
            }
        }
        return hashMap;
    }

    public static String completeUrl(String str, String str2) {
        if (TextUtils.isEmpty(UriProtector.parse(str2).getScheme())) {
            if (str2.startsWith("//")) {
                return C00F.LIZIZ(str, ':', str2);
            }
            return a1.LJ(str, "://", str2);
        }
        return str2;
    }

    public static boolean isLegalUrl(String str, RoutesConfig routesConfig) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = UriProtector.parse(str);
        if (!parse.isHierarchical()) {
            return false;
        }
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String str2 : otherSchemes) {
                if (scheme.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
