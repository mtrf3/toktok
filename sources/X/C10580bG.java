package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.0bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10580bG {
    public static boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i >= 30) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                if (str.toUpperCase(locale).compareTo("S".toUpperCase(locale)) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
