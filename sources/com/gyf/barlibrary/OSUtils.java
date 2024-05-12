package com.gyf.barlibrary;

import X.C16880lQ;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes9.dex */
public class OSUtils {
    public static String getFlymeOSFlag() {
        return getSystemProperty("ro.build.display.id", "");
    }

    public static boolean isEMUI() {
        return !TextUtils.isEmpty(getSystemProperty("ro.build.version.emui", ""));
    }

    public static boolean isMIUI() {
        return !TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name", ""));
    }

    public static String getEMUIVersion() {
        if (!isEMUI()) {
            return "";
        }
        return getSystemProperty("ro.build.version.emui", "");
    }

    public static String getFlymeOSVersion() {
        if (!isFlymeOS()) {
            return "";
        }
        return getSystemProperty("ro.build.display.id", "");
    }

    public static String getMIUIVersion() {
        if (!isMIUI()) {
            return "";
        }
        return getSystemProperty("ro.miui.ui.version.name", "");
    }

    public static boolean isEMUI3_0() {
        if (getEMUIVersion().contains("EmotionUI_3.0")) {
            return true;
        }
        return false;
    }

    public static boolean isEMUI3_1() {
        String eMUIVersion = getEMUIVersion();
        if ("EmotionUI 3".equals(eMUIVersion) || eMUIVersion.contains("EmotionUI_3.1")) {
            return true;
        }
        return false;
    }

    public static boolean isEMUI3_x() {
        if (isEMUI3_0() || isEMUI3_1()) {
            return true;
        }
        return false;
    }

    public static boolean isFlymeOS() {
        return getFlymeOSFlag().toLowerCase().contains("flyme");
    }

    public static boolean isFlymeOS4Later() {
        int intValue;
        String flymeOSVersion = getFlymeOSVersion();
        if (flymeOSVersion.isEmpty()) {
            return false;
        }
        try {
            if (flymeOSVersion.toLowerCase().contains("os")) {
                intValue = CastIntegerProtector.valueOf(flymeOSVersion.substring(9, 10)).intValue();
            } else {
                intValue = CastIntegerProtector.valueOf(flymeOSVersion.substring(6, 7)).intValue();
            }
            if (intValue < 4) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isFlymeOS5() {
        int intValue;
        String flymeOSVersion = getFlymeOSVersion();
        if (flymeOSVersion.isEmpty()) {
            return false;
        }
        try {
            if (flymeOSVersion.toLowerCase().contains("os")) {
                intValue = CastIntegerProtector.valueOf(flymeOSVersion.substring(9, 10)).intValue();
            } else {
                intValue = CastIntegerProtector.valueOf(flymeOSVersion.substring(6, 7)).intValue();
            }
            if (intValue != 5) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isMIUI6Later() {
        String mIUIVersion = getMIUIVersion();
        if (mIUIVersion.isEmpty()) {
            return false;
        }
        try {
            if (CastIntegerProtector.valueOf(mIUIVersion.substring(1)).intValue() < 6) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return str2;
        }
    }
}
