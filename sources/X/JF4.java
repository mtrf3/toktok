package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes9.dex */
public final class JF4 {
    public static final int LIZ = Build.VERSION.SDK_INT;

    public static boolean LIZIZ() {
        String str;
        String str2 = "";
        if (!(!TextUtils.isEmpty(LIZ("ro.build.version.emui")))) {
            str = "";
        } else {
            str = LIZ("ro.build.version.emui");
        }
        if (str.contains("EmotionUI_3.0")) {
            return true;
        }
        if (!TextUtils.isEmpty(LIZ("ro.build.version.emui"))) {
            str2 = LIZ("ro.build.version.emui");
        }
        if ("EmotionUI 3".equals(str2) || str2.contains("EmotionUI_3.1")) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        String str;
        int intValue;
        if (LIZ("ro.build.display.id").toLowerCase().contains("flyme")) {
            str = LIZ("ro.build.display.id");
        } else {
            str = "";
        }
        if (!str.isEmpty()) {
            try {
                if (str.toLowerCase().contains("os")) {
                    intValue = CastIntegerProtector.valueOf(str.substring(9, 10)).intValue();
                } else {
                    intValue = CastIntegerProtector.valueOf(str.substring(6, 7)).intValue();
                }
                if (intValue >= 4) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static boolean LIZLLL() {
        String str;
        if (!TextUtils.isEmpty(LIZ("ro.miui.ui.version.name"))) {
            str = LIZ("ro.miui.ui.version.name");
        } else {
            str = "";
        }
        boolean z = 0;
        z = 0;
        if (!str.isEmpty()) {
            try {
                z = CastIntegerProtector.valueOf(str.substring(1)).intValue();
                if (z >= 6) {
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
            }
        }
        return z;
    }

    public static String LIZ(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }
}
