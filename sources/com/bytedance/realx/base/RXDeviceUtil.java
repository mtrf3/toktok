package com.bytedance.realx.base;

import X.C16880lQ;
import X.X1D;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes7.dex */
public class RXDeviceUtil {
    public static String customOS = "";
    public static String customOSVersion = "";

    public static boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean isMagicUI() {
        return false;
    }

    public static String deleteSpaceAndToUpperCase(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replaceAll(" ", "").toUpperCase();
    }

    public static String getCustomOSVersion(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        return customOSVersion;
    }

    public static String getPhoneSystem(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(customOS);
        LIZ.append("_");
        LIZ.append(customOSVersion);
        return X1D.LIZIZ(LIZ);
    }

    public static String getSystemPropertyValue(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static void setCustomOSInfo(String str) {
        char c;
        try {
            String deleteSpaceAndToUpperCase = deleteSpaceAndToUpperCase(str);
            switch (deleteSpaceAndToUpperCase.hashCode()) {
                case -1881642058:
                    if (deleteSpaceAndToUpperCase.equals("REALME")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1706170181:
                    if (deleteSpaceAndToUpperCase.equals("XIAOMI")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -602397472:
                    if (deleteSpaceAndToUpperCase.equals("ONEPLUS")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2432928:
                    if (deleteSpaceAndToUpperCase.equals("OPPO")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2634924:
                    if (deleteSpaceAndToUpperCase.equals("VIVO")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 68924490:
                    if (deleteSpaceAndToUpperCase.equals("HONOR")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 73239724:
                    if (deleteSpaceAndToUpperCase.equals("MEIZU")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 74632627:
                    if (deleteSpaceAndToUpperCase.equals("NUBIA")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 77852109:
                    if (deleteSpaceAndToUpperCase.equals("REDMI")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2141820391:
                    if (deleteSpaceAndToUpperCase.equals("HUAWEI")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (isHarmonyOS()) {
                        customOSVersion = getSystemPropertyValue("hw_sc.build.platform.version");
                        customOS = "HarmonyOS";
                        return;
                    } else {
                        customOS = "EMUI";
                        customOSVersion = getSystemPropertyValue("ro.build.version.emui");
                        return;
                    }
                case 1:
                    if (!TextUtils.isEmpty(getSystemPropertyValue("ro.build.version.magic"))) {
                        customOS = "MagicUI";
                        customOSVersion = getSystemPropertyValue("ro.build.version.magic");
                        return;
                    } else {
                        if (isHarmonyOS()) {
                            customOS = "HarmonyOS";
                            if (!TextUtils.isEmpty(getSystemPropertyValue("hw_sc.build.platform.version"))) {
                                customOSVersion = getSystemPropertyValue("hw_sc.build.platform.version");
                                return;
                            } else {
                                customOSVersion = "";
                                return;
                            }
                        }
                        customOS = "EMUI";
                        customOSVersion = getSystemPropertyValue("ro.build.version.emui");
                        return;
                    }
                case 2:
                case 3:
                    customOS = "MIUI";
                    customOSVersion = getSystemPropertyValue("ro.miui.ui.version.name");
                    return;
                case 4:
                case 5:
                    customOS = "ColorOS";
                    customOSVersion = getSystemPropertyValue("ro.build.version.opporom");
                    return;
                case 6:
                    customOS = "Funtouch";
                    customOSVersion = getSystemPropertyValue("ro.vivo.os.version");
                    return;
                case 7:
                    customOS = "HydrogenOS";
                    customOSVersion = getSystemPropertyValue("ro.rom.version");
                    return;
                case '\b':
                    customOS = "Flyme";
                    customOSVersion = getSystemPropertyValue("ro.build.display.id");
                    return;
                case '\t':
                    customOS = getSystemPropertyValue("ro.build.nubia.rom.name");
                    customOSVersion = getSystemPropertyValue("ro.build.nubia.rom.code");
                    return;
                default:
                    customOS = "Android";
                    customOSVersion = Build.VERSION.RELEASE;
                    return;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
