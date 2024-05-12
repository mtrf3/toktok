package X;

import android.os.Build;

/* loaded from: classes9.dex */
public final class J2M {
    public static final int LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;

    static {
        int i = Build.VERSION.SDK_INT;
        LIZ = i;
        String str = Build.DEVICE;
        LIZIZ = str;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        LIZJ = str3;
        LIZLLL = Build.HARDWARE;
        LJ = Build.BRAND;
        StringBuilder LIZLLL2 = C06540Nm.LIZLLL(str, ", ", str3, ", ", str2);
        LIZLLL2.append(", ");
        LIZLLL2.append(i);
        X1D.LIZIZ(LIZLLL2);
    }
}
