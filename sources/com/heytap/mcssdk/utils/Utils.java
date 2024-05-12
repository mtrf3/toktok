package com.heytap.mcssdk.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.heytap.mcssdk.PushService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes28.dex */
public class Utils {
    public static String getString(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append((char) i);
        }
        return sb.toString();
    }

    public static int getVersionCode(Context context) {
        int i = 0;
        try {
            i = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionCode;
            return i;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getVersionCode--Exception:");
            LIZ.append(e.getMessage());
            d.b(X1D.LIZIZ(LIZ));
            return i;
        }
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), str, 0).versionCode;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getVersionCode--Exception:");
            LIZ.append(e.getMessage());
            d.b(X1D.LIZIZ(LIZ));
            return 0;
        }
    }

    public static String getVersionName(Context context) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getVersionName--Exception:");
            LIZ.append(e.getMessage());
            d.b(X1D.LIZIZ(LIZ));
            return CardStruct.IStatusCode.DEFAULT;
        }
    }

    public static String getVersionName(Context context, String str) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), str, 0).versionName;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getVersionName--Exception:");
            LIZ.append(e.getMessage());
            d.b(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static boolean isExistPackage(Context context, String str) {
        try {
            C16880lQ.LLLLLLZ(context.getPackageManager(), str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isExistPackage NameNotFoundException:");
            LIZ.append(e.getMessage());
            d.e(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public static boolean isSupportPush(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = C16880lQ.LLLLLLLLL(context.getPackageManager(), str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isSupportPush NameNotFoundException:");
            LIZ.append(e.getMessage());
            d.e(X1D.LIZIZ(LIZ));
            applicationInfo = null;
        }
        return applicationInfo != null && applicationInfo.metaData.getBoolean(str2, false);
    }

    public static int parseInt(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return CastIntegerProtector.parseInt(str);
            } catch (NumberFormatException e) {
                d.e("parseInt--NumberFormatException" + e.getMessage());
            }
        }
        return -1;
    }

    public static boolean isSupportPushByClient(Context context) {
        return PushService.a.a.isSupportPushByClient(context);
    }
}
