package X;

import java.util.Arrays;

/* loaded from: classes16.dex */
public final class YVC {
    public final String LIZ;
    public final char[] LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final byte[] LJI;

    public final String toString() {
        return this.LIZ;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.LIZIZ) + 1237;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YVC) {
            YVC yvc = (YVC) obj;
            yvc.getClass();
            if (Arrays.equals(this.LIZIZ, yvc.LIZIZ)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0058. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[LOOP:1: B:32:0x00a0->B:34:0x00a4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public YVC(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r7 = 128(0x80, float:1.8E-43)
            byte[] r4 = new byte[r7]
            r2 = -1
            java.util.Arrays.fill(r4, r2)
            r3 = 0
            r1 = 0
        La:
            int r0 = r10.length
            r5 = 1
            if (r1 >= r0) goto L44
            char r6 = r10[r1]
            if (r6 >= r7) goto L30
            r0 = r4[r6]
            if (r0 != r2) goto L1c
            byte r0 = (byte) r1
            r4[r6] = r0
            int r1 = r1 + 1
            goto La
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r1[r3] = r0
            java.lang.String r0 = "Duplicate character: %s"
            java.lang.String r0 = X.PTI.LIZ(r0, r1)
            r2.<init>(r0)
            throw r2
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r1[r3] = r0
            java.lang.String r0 = "Non-ASCII character: %s"
            java.lang.String r0 = X.PTI.LIZ(r0, r1)
            r2.<init>(r0)
            throw r2
        L44:
            r8.<init>()
            r8.LIZ = r9
            r8.LIZIZ = r10
            int r6 = r10.length     // Catch: java.lang.ArithmeticException -> Lb9
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> Lb9
            if (r6 <= 0) goto Lb1
            int[] r1 = X.YVF.LIZ     // Catch: java.lang.ArithmeticException -> Lb9
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> Lb9
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> Lb9
            switch(r0) {
                case 1: goto L61;
                case 2: goto L66;
                case 3: goto L66;
                case 4: goto L75;
                case 5: goto L75;
                case 6: goto L7e;
                case 7: goto L7e;
                case 8: goto L7e;
                default: goto L5b;
            }     // Catch: java.lang.ArithmeticException -> Lb9
        L5b:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> Lb9
            r0.<init>()     // Catch: java.lang.ArithmeticException -> Lb9
            throw r0     // Catch: java.lang.ArithmeticException -> Lb9
        L61:
            int r0 = r6 + (-1)
            r0 = r0 & r6
            if (r0 != 0) goto L6d
        L66:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r6)     // Catch: java.lang.ArithmeticException -> Lb9
            int r2 = 31 - r0
            goto L8c
        L6d:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> Lb9
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> Lb9
            throw r1     // Catch: java.lang.ArithmeticException -> Lb9
        L75:
            int r0 = r6 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> Lb9
            int r2 = 32 - r0
            goto L8c
        L7e:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r6)     // Catch: java.lang.ArithmeticException -> Lb9
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r2 = 31 - r1
            int r0 = r0 - r6
            int r0 = r0 >>> 31
            int r2 = r2 + r0
        L8c:
            r8.LIZLLL = r2     // Catch: java.lang.ArithmeticException -> Lb9
            int r1 = java.lang.Integer.numberOfTrailingZeros(r2)
            int r0 = 3 - r1
            int r5 = r5 << r0
            r8.LJ = r5
            int r2 = r2 >> r1
            r8.LJFF = r2
            int r0 = r6 + (-1)
            r8.LIZJ = r0
            r8.LJI = r4
        La0:
            int r0 = r8.LJFF
            if (r3 >= r0) goto Lb0
            int r2 = r3 * 8
            int r1 = r8.LIZLLL
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.YVE.LIZ(r2, r1, r0)
            int r3 = r3 + 1
            goto La0
        Lb0:
            return
        Lb1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> Lb9
            java.lang.String r0 = "x (0) must be > 0"
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> Lb9
            throw r1     // Catch: java.lang.ArithmeticException -> Lb9
        Lb9:
            r3 = move-exception
            int r2 = r10.length
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r0 = X.C64.LIZIZ(r0, r2)
            r1.<init>(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YVC.<init>(java.lang.String, char[]):void");
    }
}
