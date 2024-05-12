package X;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Irx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47957Irx {
    public static int LIZ() {
        return C00F.LIZ(31744, 1, "audio_mode", true);
    }

    public static boolean LIZIZ() {
        String str;
        if (LIZ() != 1) {
            String str2 = Build.MANUFACTURER;
            String str3 = null;
            if (str2 != null) {
                str = str2.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            if (!o.LJ(str, "OPPO")) {
                if (str2 != null) {
                    str3 = str2.toUpperCase(Locale.ROOT);
                    o.LJIIIIZZ(str3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
                if (!o.LJ(str3, "REALME")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LIZ() == 3 || LIZ() == 5) {
            return true;
        }
        return false;
    }
}
