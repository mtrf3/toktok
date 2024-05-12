package X;

import android.graphics.Path;
import defpackage.i0;

/* renamed from: X.0Qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07360Qq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (((r4 - 'z') * (r4 - 'a')) <= 0) goto L14;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0091. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C07350Qp[] LIZJ(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07360Qq.LIZJ(java.lang.String):X.0Qp[]");
    }

    public static Path LIZLLL(String str) {
        Path path = new Path();
        C07350Qp[] LIZJ = LIZJ(str);
        if (LIZJ != null) {
            try {
                C07350Qp.LIZIZ(LIZJ, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException(i0.LJFF("Error in parsing ", str), e);
            }
        }
        return null;
    }

    public static C07350Qp[] LJ(C07350Qp[] c07350QpArr) {
        if (c07350QpArr == null) {
            return null;
        }
        C07350Qp[] c07350QpArr2 = new C07350Qp[c07350QpArr.length];
        for (int i = 0; i < c07350QpArr.length; i++) {
            c07350QpArr2[i] = new C07350Qp(c07350QpArr[i]);
        }
        return c07350QpArr2;
    }

    public static boolean LIZ(C07350Qp[] c07350QpArr, C07350Qp[] c07350QpArr2) {
        if (c07350QpArr == null || c07350QpArr2 == null || c07350QpArr.length != c07350QpArr2.length) {
            return false;
        }
        for (int i = 0; i < c07350QpArr.length; i++) {
            C07350Qp c07350Qp = c07350QpArr[i];
            char c = c07350Qp.LIZ;
            C07350Qp c07350Qp2 = c07350QpArr2[i];
            if (c != c07350Qp2.LIZ || c07350Qp.LIZIZ.length != c07350Qp2.LIZIZ.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] LIZIZ(int i, float[] fArr) {
        if (i >= 0) {
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, Math.min(i, fArr.length));
            return fArr2;
        }
        throw new IllegalArgumentException();
    }
}
