package X;

import android.app.Activity;

/* loaded from: classes10.dex */
public final class LF2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(LF4.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(LF3.LJLIL);
    public static Boolean LIZJ;

    static {
        LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r0 == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Boolean r0 = X.LF2.LIZJ
            if (r0 != 0) goto L3b
            X.LF1 r2 = X.LF1.LIZIZ
            int r0 = r2.LIZ()
            r1 = 1
            if (r0 != 0) goto L44
            boolean r0 = X.LF7.LIZ()
            if (r0 == 0) goto L47
            r2.LIZIZ(r1)
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.LF2.LIZJ = r0
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "isTablet check duration:"
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            r2.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "DeviceAuth"
            X.LFE.LIZIZ(r0, r1)
        L3b:
            java.lang.Boolean r1 = X.LF2.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            return r0
        L44:
            if (r0 != r1) goto L4b
            goto L1a
        L47:
            r0 = 2
            r2.LIZIZ(r0)
        L4b:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LF2.LIZJ():boolean");
    }

    public static boolean LIZIZ(Activity activity) {
        if (!LIZJ()) {
            return false;
        }
        C53948LFg LIZJ2 = C53946LFe.LIZJ(activity, null);
        return LIZ(LIZJ2.LIZIZ(), LIZJ2.LIZ());
    }

    public static boolean LIZ(int i, int i2) {
        if (i > i2) {
            int intValue = ((Number) LIZIZ.getValue()).intValue() + i2;
            i2 = i;
            i = intValue;
        }
        DJE.LIZ.getClass();
        if (i >= ((Number) DJE.LIZLLL.getValue()).intValue() && i2 >= ((Number) DJE.LJ.getValue()).intValue()) {
            return true;
        }
        return false;
    }
}
