package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import defpackage.a1;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class BML {
    public static String LIZIZ(int i) {
        if (i < 0) {
            return "";
        }
        if (i <= 999) {
            return String.valueOf(i);
        }
        if (i <= 999999) {
            if (i % 1000 >= 100) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LIZ("%.1f", Float.valueOf(((i / 100) * 100) / 1000.0f)));
                LIZ.append('K');
                return LIZJ(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(String.valueOf(i / 1000));
            LIZ2.append('K');
            return LIZJ(X1D.LIZIZ(LIZ2));
        }
        if (i % 1000000 >= 100000) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ("%.1f", Float.valueOf(((i / ImagePreloadExperiment.PRIORITY_DEFAULT) * ImagePreloadExperiment.PRIORITY_DEFAULT) / 1000000.0f)));
            LIZ3.append('M');
            return LIZJ(X1D.LIZIZ(LIZ3));
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(String.valueOf(i / 1000000));
        LIZ4.append('M');
        return LIZJ(X1D.LIZIZ(LIZ4));
    }

    public static String LIZJ(String str) {
        if (C15380j0.LJIIZILJ()) {
            return a1.LJ("\u200f", str, "\u200f");
        }
        return str;
    }

    public static String LIZ(String str, Object... objArr) {
        return C16880lQ.LLLZI(Locale.US, str, objArr);
    }
}
