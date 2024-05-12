package X;

/* loaded from: classes12.dex */
public final class PWJ implements PUJ {
    public final C64533PUj LJLIL = new C64533PUj();
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ PWF LJLJJI;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.LJLJJI) {
            if (this.LJLILLLLZI) {
                return;
            }
            PWF pwf = this.LJLJJI;
            if (!pwf.LJII.LJLJI) {
                if (this.LJLIL.LJLILLLLZI > 0) {
                    while (this.LJLIL.LJLILLLLZI > 0) {
                        LIZ(true);
                    }
                } else {
                    pwf.LIZLLL.LJIIJ(pwf.LIZJ, true, null, 0L);
                }
            }
            synchronized (this.LJLJJI) {
                this.LJLILLLLZI = true;
            }
            this.LJLJJI.LIZLLL.flush();
            this.LJLJJI.LIZ();
        }
    }

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        synchronized (this.LJLJJI) {
            this.LJLJJI.LIZIZ();
        }
        while (this.LJLIL.LJLILLLLZI > 0) {
            LIZ(false);
            this.LJLJJI.LIZLLL.flush();
        }
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLJJI.LJIIIZ;
    }

    public PWJ(PWF pwf) {
        this.LJLJJI = pwf;
    }

    public final void LIZ(boolean z) {
        PWF pwf;
        long min;
        PWF pwf2;
        boolean z2;
        synchronized (this.LJLJJI) {
            this.LJLJJI.LJIIIZ.LJIIIIZZ();
            while (true) {
                try {
                    pwf = this.LJLJJI;
                    if (pwf.LIZIZ > 0 || this.LJLJI || this.LJLILLLLZI || pwf.LJIIJ != null) {
                        break;
                    } else {
                        pwf.LJIIIZ();
                    }
                } finally {
                }
            }
            pwf.LJIIIZ.LJIILJJIL();
            this.LJLJJI.LIZIZ();
            min = Math.min(this.LJLJJI.LIZIZ, this.LJLIL.LJLILLLLZI);
            pwf2 = this.LJLJJI;
            pwf2.LIZIZ -= min;
        }
        pwf2.LJIIIZ.LJIIIIZZ();
        try {
            PWF pwf3 = this.LJLJJI;
            PWE pwe = pwf3.LIZLLL;
            int i = pwf3.LIZJ;
            if (z && min == this.LJLIL.LJLILLLLZI) {
                z2 = true;
            } else {
                z2 = false;
            }
            pwe.LJIIJ(i, z2, this.LJLIL, min);
        } finally {
        }
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj c64533PUj, long j) {
        this.LJLIL.LLIIIL(c64533PUj, j);
        while (this.LJLIL.LJLILLLLZI >= 16384) {
            LIZ(false);
        }
    }
}
