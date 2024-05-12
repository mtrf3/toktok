package X;

import java.util.ArrayDeque;

/* loaded from: classes12.dex */
public final class PWG implements PUC {
    public final C64533PUj LJLIL = new C64533PUj();
    public final C64533PUj LJLILLLLZI = new C64533PUj();
    public final long LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final /* synthetic */ PWF LJLJJLL;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.LJLJJLL) {
            this.LJLJJI = true;
            C64533PUj c64533PUj = this.LJLILLLLZI;
            j = c64533PUj.LJLILLLLZI;
            c64533PUj.LIZ();
            if (!((ArrayDeque) this.LJLJJLL.LJ).isEmpty()) {
                this.LJLJJLL.getClass();
            }
            this.LJLJJLL.notifyAll();
        }
        if (j > 0) {
            this.LJLJJLL.LIZLLL.LJI(j);
        }
        this.LJLJJLL.LIZ();
    }

    @Override // X.PUC
    public final C64545PUv timeout() {
        return this.LJLJJLL.LJIIIIZZ;
    }

    public PWG(PWF pwf, long j) {
        this.LJLJJLL = pwf;
        this.LJLJI = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        r2 = -1;
     */
    @Override // X.PUC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(X.C64533PUj r14, long r15) {
        /*
            r13 = this;
            r4 = 0
            r2 = r15
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto Lae
        L7:
            X.PWF r9 = r13.LJLJJLL
            monitor-enter(r9)
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> Lab
            X.PWI r0 = r0.LJIIIIZZ     // Catch: java.lang.Throwable -> Lab
            r0.LJIIIIZZ()     // Catch: java.lang.Throwable -> Lab
            X.PWF r1 = r13.LJLJJLL     // Catch: java.lang.Throwable -> La2
            X.PWT r6 = r1.LJIIJ     // Catch: java.lang.Throwable -> La2
            if (r6 == 0) goto L44
        L17:
            boolean r0 = r13.LJLJJI     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L9a
            java.util.Deque<X.PXe> r0 = r1.LJ     // Catch: java.lang.Throwable -> La2
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L2a
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> La2
            r0.getClass()     // Catch: java.lang.Throwable -> La2
        L2a:
            X.PUj r8 = r13.LJLILLLLZI     // Catch: java.lang.Throwable -> La2
            long r0 = r8.LJLILLLLZI     // Catch: java.lang.Throwable -> La2
            r11 = -1
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L46
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> La2
            long r2 = r8.read(r14, r0)     // Catch: java.lang.Throwable -> La2
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> La2
            long r7 = r0.LIZ     // Catch: java.lang.Throwable -> La2
            long r7 = r7 + r2
            r0.LIZ = r7     // Catch: java.lang.Throwable -> La2
            goto L5a
        L44:
            r6 = 0
            goto L17
        L46:
            boolean r0 = r13.LJLJJL     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L7b
            if (r6 != 0) goto L7b
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> La2
            r0.LJIIIZ()     // Catch: java.lang.Throwable -> La2
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> Lab
            X.PWI r0 = r0.LJIIIIZZ     // Catch: java.lang.Throwable -> Lab
            r0.LJIILJJIL()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lab
            goto L7
        L5a:
            if (r6 != 0) goto L7d
            X.PWE r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> La2
            X.PWd r0 = r0.LJZ     // Catch: java.lang.Throwable -> La2
            int r0 = r0.LIZ()     // Catch: java.lang.Throwable -> La2
            int r0 = r0 / 2
            long r0 = (long) r0     // Catch: java.lang.Throwable -> La2
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 < 0) goto L7d
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> La2
            X.PWE r8 = r0.LIZLLL     // Catch: java.lang.Throwable -> La2
            int r7 = r0.LIZJ     // Catch: java.lang.Throwable -> La2
            long r0 = r0.LIZ     // Catch: java.lang.Throwable -> La2
            r8.LJIIL(r7, r0)     // Catch: java.lang.Throwable -> La2
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> La2
            r0.LIZ = r4     // Catch: java.lang.Throwable -> La2
            goto L7d
        L7b:
            r2 = -1
        L7d:
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> Lab
            X.PWI r0 = r0.LJIIIIZZ     // Catch: java.lang.Throwable -> Lab
            r0.LJIILJJIL()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lab
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L91
            X.PWF r0 = r13.LJLJJLL
            X.PWE r0 = r0.LIZLLL
            r0.LJI(r2)
            return r2
        L91:
            if (r6 != 0) goto L94
            return r11
        L94:
            X.PWa r0 = new X.PWa
            r0.<init>(r6)
            throw r0
        L9a:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "stream closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La2
            throw r1     // Catch: java.lang.Throwable -> La2
        La2:
            r1 = move-exception
            X.PWF r0 = r13.LJLJJLL     // Catch: java.lang.Throwable -> Lab
            X.PWI r0 = r0.LJIIIIZZ     // Catch: java.lang.Throwable -> Lab
            r0.LJIILJJIL()     // Catch: java.lang.Throwable -> Lab
            throw r1     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lab
            throw r0
        Lae:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = X.C61845OOz.LIZ(r0, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PWG.read(X.PUj, long):long");
    }
}
