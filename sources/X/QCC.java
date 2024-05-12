package X;

/* loaded from: classes12.dex */
public final class QCC {
    public byte[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public char LIZLLL;
    public boolean LJ;

    public final boolean LIZJ() {
        int i = this.LIZIZ;
        if (2 != LIZ()) {
            return false;
        }
        int i2 = 0;
        while ("lo".charAt(i2) == this.LIZ[i]) {
            i++;
            i2++;
            if (i2 >= 2) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL() {
        if (this.LIZ != null) {
        } else {
            throw new IllegalStateException("Must call reset first");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        r1 = r6.LIZJ;
        r0 = r1 - r6.LIZIZ;
        r6.LIZIZ = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ() {
        /*
            r6 = this;
            r6.LIZLLL()
            boolean r0 = r6.LJ
            if (r0 == 0) goto L46
            int r5 = r6.LIZJ
            int r4 = r6.LIZIZ
            if (r5 <= r4) goto L2f
            byte[] r3 = r6.LIZ
            char r2 = r6.LIZLLL
        L11:
            r1 = -1
            if (r4 >= r5) goto L1a
            r0 = r3[r4]
            if (r0 != r2) goto L23
            if (r4 != r1) goto L26
        L1a:
            int r1 = r6.LIZJ
            int r0 = r6.LIZIZ
            int r0 = r1 - r0
            r6.LIZIZ = r1
            return r0
        L23:
            int r4 = r4 + 1
            goto L11
        L26:
            int r0 = r6.LIZIZ
            int r1 = r4 - r0
            int r0 = r4 + 1
            r6.LIZIZ = r0
            return r1
        L2f:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "Reading past end of input stream at "
            r2.append(r0)
            int r1 = r6.LIZIZ
            java.lang.String r0 = "."
            java.lang.String r0 = X.C08380Uo.LIZ(r2, r1, r0, r2)
            r3.<init>(r0)
            throw r3
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must call useDelimiter first"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCC.LIZ():int");
    }

    public final int LIZIZ() {
        LIZLLL();
        if (this.LJ) {
            int i = this.LIZIZ;
            int LIZ = LIZ();
            byte[] bArr = this.LIZ;
            int i2 = LIZ + i;
            int i3 = 0;
            while (i < i2) {
                int i4 = i + 1;
                int i5 = bArr[i] - 48;
                if (i5 >= 0 && i5 <= 9) {
                    i3 = (i3 * 10) + i5;
                    i = i4;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Invalid int in buffer at ");
                    LIZ2.append(i4 - 1);
                    LIZ2.append(".");
                    throw new NumberFormatException(X1D.LIZIZ(LIZ2));
                }
            }
            return i3;
        }
        throw new IllegalStateException("Must call useDelimiter first");
    }
}
