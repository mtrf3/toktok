package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class FCW {
    public static boolean LIZ;

    static {
        PatternProtector.compile("^0-([\\d]+)$");
    }

    public static boolean LIZIZ() {
        if (!LIZ) {
            try {
                Class.forName("miui.os.Build");
                C63986P9i.LIZ = true;
                LIZ = true;
                return true;
            } catch (Exception unused) {
                LIZ = true;
            }
        }
        return C63986P9i.LIZ;
    }

    public static boolean LIZ(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = EXC.LIZ().LIZIZ("ro.build.version.emui");
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (!TextUtils.isEmpty(str) && (lowerCase.startsWith("emotionui") || lowerCase.startsWith("magicui"))) {
            return true;
        }
        try {
            str2 = Build.BRAND;
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.getDefault()).startsWith("hua")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str3)) {
            if (str3.toLowerCase(Locale.getDefault()).startsWith("hua")) {
                return true;
            }
        }
        return false;
    }
}
