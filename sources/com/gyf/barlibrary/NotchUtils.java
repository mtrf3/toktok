package com.gyf.barlibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes11.dex */
public class NotchUtils {
    public static boolean isNotchResultInitialized;
    public static boolean sNotchResult;

    public static DisplayCutout getDisplayCutout(Activity activity) {
        Window window;
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 28 && activity != null && (window = activity.getWindow()) != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null) {
            return rootWindowInsets.getDisplayCutout();
        }
        return null;
    }

    public static boolean hasNotchAtAndroidP(Activity activity) {
        if (getDisplayCutout(activity) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasNotchAtHuaWei(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean hasNotchAtOPPO(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean hasNotchAtVIVO(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean hasNotchAtXiaoMi(Context context) {
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                if (((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1) {
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public static boolean hasNotchScreen(View view) {
        if (isNotchResultInitialized) {
            return sNotchResult;
        }
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (hasNotchAtXiaoMi(view.getContext()) || hasNotchAtHuaWei(view.getContext()) || hasNotchAtOPPO(view.getContext()) || hasNotchAtVIVO(view.getContext()) || hasNotchAtAndroidP(view)) {
            z = true;
        }
        sNotchResult = z;
        isNotchResultInitialized = true;
        return z;
    }

    public static DisplayCutout getDisplayCutout(View view) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 28 && view != null && (rootWindowInsets = view.getRootWindowInsets()) != null) {
            return rootWindowInsets.getDisplayCutout();
        }
        return null;
    }

    public static boolean hasNotchAtAndroidP(View view) {
        if (getDisplayCutout(view) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (isNotchResultInitialized) {
            return sNotchResult;
        }
        boolean z = false;
        if (activity == null) {
            return false;
        }
        if (hasNotchAtXiaoMi(activity) || hasNotchAtHuaWei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVIVO(activity) || hasNotchAtAndroidP(activity)) {
            z = true;
        }
        sNotchResult = z;
        isNotchResultInitialized = true;
        return z;
    }
}
