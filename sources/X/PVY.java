package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PVY implements PUJ {
    public int LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final /* synthetic */ PVW LJLJJL;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.LJLJJI) {
            PVW pvw = this.LJLJJL;
            pvw.LIZIZ(this.LJLIL, pvw.LJFF.LJLILLLLZI, this.LJLJI, true);
            this.LJLJJI = true;
            this.LJLJJL.LJII = false;
            return;
        }
        throw new IOException("closed");
    }

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        if (!this.LJLJJI) {
            PVW pvw = this.LJLJJL;
            pvw.LIZIZ(this.LJLIL, pvw.LJFF.LJLILLLLZI, this.LJLJI, false);
            this.LJLJI = false;
            return;
        }
        throw new IOException("closed");
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLJJL.LIZJ.timeout();
    }

    public PVY(PVW pvw) {
        this.LJLJJL = pvw;
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj c64533PUj, long j) {
        boolean z;
        long LIZJ;
        if (!this.LJLJJI) {
            this.LJLJJL.LJFF.LLIIIL(c64533PUj, j);
            if (this.LJLJI) {
                long j2 = this.LJLILLLLZI;
                if (j2 != -1 && this.LJLJJL.LJFF.LJLILLLLZI > j2 - 8192) {
                    z = true;
                    LIZJ = this.LJLJJL.LJFF.LIZJ();
                    if (LIZJ <= 0 && !z) {
                        this.LJLJJL.LIZIZ(this.LJLIL, LIZJ, this.LJLJI, false);
                        this.LJLJI = false;
                        return;
                    }
                    return;
                }
            }
            z = false;
            LIZJ = this.LJLJJL.LJFF.LIZJ();
            if (LIZJ <= 0) {
                return;
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }
}
