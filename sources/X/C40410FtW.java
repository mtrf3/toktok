package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.FtW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40410FtW {
    public static boolean LIZ;

    public static boolean LIZ() {
        C40413FtZ c40413FtZ = new C40413FtZ(EnumC40416Ftc.LIKE);
        if (c40413FtZ.LJI == 0) {
            c40413FtZ.LIZIZ(System.currentTimeMillis());
        }
        if (System.currentTimeMillis() - c40413FtZ.LJI >= TimeUnit.DAYS.toMillis(7L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0036, code lost:
    
        if (r0.intValue() != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r11, X.EnumC40416Ftc r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40410FtW.LIZIZ(android.content.Context, X.Ftc):boolean");
    }
}
