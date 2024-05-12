package X;

import java.util.HashSet;

/* renamed from: X.2r9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71392r9 {
    public static final HashSet<String> LIZ = new HashSet<>();

    public static String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZJ());
        LIZ2.append("/unzip/");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        LIZ2.append("/action_bar_resources/animated_emoji");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ());
        LIZ2.append(str);
        LIZ2.append("/config.json");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZLLL(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ());
        LIZ2.append(str);
        LIZ2.append('/');
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }
}
