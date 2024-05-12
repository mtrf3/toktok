package X;

/* loaded from: classes12.dex */
public final class PVT implements PUJ {
    public final C64546PUw LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ C64560PVk LJLJI;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        this.LJLJI.LIZLLL.LLIIIZ("0\r\n\r\n");
        C64560PVk c64560PVk = this.LJLJI;
        C64546PUw c64546PUw = this.LJLIL;
        c64560PVk.getClass();
        C64560PVk.LJI(c64546PUw);
        this.LJLJI.LJ = 3;
    }

    @Override // X.PUJ, java.io.Flushable
    public final synchronized void flush() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLJI.LIZLLL.flush();
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLIL;
    }

    public PVT(C64560PVk c64560PVk) {
        this.LJLJI = c64560PVk;
        this.LJLIL = new C64546PUw(c64560PVk.LIZLLL.timeout());
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj c64533PUj, long j) {
        if (!this.LJLILLLLZI) {
            if (j == 0) {
                return;
            }
            this.LJLJI.LIZLLL.LLLLLILLIL(j);
            this.LJLJI.LIZLLL.LLIIIZ("\r\n");
            this.LJLJI.LIZLLL.LLIIIL(c64533PUj, j);
            this.LJLJI.LIZLLL.LLIIIZ("\r\n");
            return;
        }
        throw new IllegalStateException("closed");
    }
}
