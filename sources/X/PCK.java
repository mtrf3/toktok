package X;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class PCK {
    public static final PCM LIZ = new PCM();

    public static boolean LJFF() {
        try {
            return Class.forName("miui.os.Build").getName().length() > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String LIZ() {
        String LIZIZ = LIZIZ("persist.pxr.product.forcename");
        if (TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = LIZIZ("pxr.vendorhw.product.name");
        }
        if (TextUtils.isEmpty(LIZIZ)) {
            return Build.PRODUCT;
        }
        return LIZIZ;
    }

    public static boolean LIZLLL() {
        if (!"oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.BRAND;
            if (!"oppo".equalsIgnoreCase(str) && !"realme".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJ() {
        String str = Build.DISPLAY;
        if ((!TextUtils.isEmpty(str) && str.contains("Flyme")) || "flyme".equals(Build.USER)) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
        } catch (Exception unused) {
            return "";
        }
    }
}
