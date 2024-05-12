package com.bytedance.realx.base;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import dalvik.system.BaseDexClassLoader;

/* loaded from: classes7.dex */
public class ContextUtils {
    public static Context applicationContext;

    public static String getAppPath() {
        return C16880lQ.LLIIJI(applicationContext, "").toString();
    }

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static String getAppLibPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String findLibrary = ((BaseDexClassLoader) applicationContext.getClassLoader()).findLibrary(str);
            if (findLibrary == null) {
                return "";
            }
            return findLibrary;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getAppLibPath Exception : ");
            LIZ.append(e.getMessage());
            RXLogging.e("realx Utils", X1D.LIZIZ(LIZ));
            throw e;
        }
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
