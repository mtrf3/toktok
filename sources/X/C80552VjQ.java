package X;

import android.os.Build;
import defpackage.i0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.VjQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80552VjQ {
    public static String LIZ(long j) {
        Calendar LJII = C80561VjZ.LJII();
        Calendar LJIIIIZZ = C80561VjZ.LJIIIIZZ(null);
        LJIIIIZZ.setTimeInMillis(j);
        if (LJII.get(1) == LJIIIIZZ.get(1)) {
            return LIZIZ(j, Locale.getDefault());
        }
        return LIZJ(j, Locale.getDefault());
    }

    public static String LIZIZ(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C80561VjZ.LIZJ("MMMd", locale).format(new Date(j));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) C80561VjZ.LJ(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int LIZIZ = C80561VjZ.LIZIZ(1, 0, pattern, "yY");
        if (LIZIZ < pattern.length()) {
            String str = "EMd";
            int LIZIZ2 = C80561VjZ.LIZIZ(1, LIZIZ, pattern, "EMd");
            if (LIZIZ2 < pattern.length()) {
                str = i0.LJFF("EMd", ",");
            }
            pattern = pattern.replace(pattern.substring(C80561VjZ.LIZIZ(-1, LIZIZ, pattern, str) + 1, LIZIZ2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j));
    }

    public static String LIZJ(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C80561VjZ.LIZJ("yMMMd", locale).format(new Date(j));
        }
        return C80561VjZ.LJ(2, locale).format(new Date(j));
    }
}
