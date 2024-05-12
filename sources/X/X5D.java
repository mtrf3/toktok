package X;

/* loaded from: classes16.dex */
public final class X5D {
    public X5E LIZ;
    public X5E LIZIZ;
    public int LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002a, code lost:
    
        if ((r11 - r5.LIZIZ) < (r3.LIZIZ - r11)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ(long r11, long r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.X5E r4 = r10.LIZ     // Catch: java.lang.Throwable -> L45
            r8 = -1
            if (r4 != 0) goto L9
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            return r8
        L9:
            r3 = 0
            r5 = r4
        Lb:
            long r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L45
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L18
            X.X5E r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L45
            r3 = r5
            r5 = r0
            if (r0 == 0) goto L1d
            goto Lb
        L18:
            if (r3 == 0) goto L43
            if (r5 == r3) goto L1d
            goto L21
        L1d:
            r5 = r3
            if (r3 != 0) goto L2c
            goto L43
        L21:
            long r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L45
            long r6 = r11 - r0
            long r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> L45
            long r1 = r1 - r11
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1d
        L2c:
            long r3 = r4.LIZ     // Catch: java.lang.Throwable -> L45
            long r0 = r5.LIZ     // Catch: java.lang.Throwable -> L45
            long r3 = r3 - r0
            long r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L45
            long r13 = r13 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L41
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L41
            long r3 = r3 / r13
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            return r3
        L41:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            return r8
        L43:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            return r8
        L45:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X5D.LIZ(long, long):long");
    }

    public final void LIZIZ(long j, long j2) {
        X5E x5e;
        synchronized (this) {
            X5E x5e2 = this.LIZ;
            if (x5e2 != null) {
                if (j < x5e2.LIZ || j2 < x5e2.LIZIZ) {
                    return;
                }
                X5E x5e3 = x5e2.LIZJ;
                if (x5e3 != null && j2 - x5e3.LIZIZ < 1000) {
                    x5e2.LIZ = j;
                    x5e2.LIZIZ = j2;
                    return;
                }
            }
            int i = this.LIZJ;
            if (i >= 10 && (x5e = this.LIZIZ) != null) {
                X5E x5e4 = x5e.LIZLLL;
                x5e.LIZLLL = null;
                this.LIZIZ = x5e4;
                if (x5e4 != null) {
                    x5e4.LIZJ = null;
                }
            } else {
                this.LIZJ = i + 1;
                x5e = new X5E();
            }
            x5e.LIZ = j;
            x5e.LIZIZ = j2;
            if (x5e2 != null) {
                x5e.LIZJ = x5e2;
                x5e2.LIZLLL = x5e;
            }
            this.LIZ = x5e;
        }
    }
}
