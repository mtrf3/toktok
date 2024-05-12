package X;

import java.net.ProtocolException;

/* loaded from: classes12.dex */
public final class PVS implements PUJ {
    public final C64546PUw LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;
    public final /* synthetic */ C64560PVk LJLJJI;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        if (this.LJLJI <= 0) {
            C64560PVk c64560PVk = this.LJLJJI;
            C64546PUw c64546PUw = this.LJLIL;
            c64560PVk.getClass();
            C64560PVk.LJI(c64546PUw);
            this.LJLJJI.LJ = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLJJI.LIZLLL.flush();
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLIL;
    }

    public PVS(C64560PVk c64560PVk, long j) {
        this.LJLJJI = c64560PVk;
        this.LJLIL = new C64546PUw(c64560PVk.LIZLLL.timeout());
        this.LJLJI = j;
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj c64533PUj, long j) {
        if (!this.LJLILLLLZI) {
            long j2 = c64533PUj.LJLILLLLZI;
            if ((j | 0) >= 0 && 0 <= j2 && j2 - 0 >= j) {
                if (j <= this.LJLJI) {
                    this.LJLJJI.LIZLLL.LLIIIL(c64533PUj, j);
                    this.LJLJI -= j;
                    return;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("expected ");
                    LIZ.append(this.LJLJI);
                    throw new ProtocolException(C132805Jc.LIZLLL(LIZ, " bytes but received ", j, LIZ));
                }
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalStateException("closed");
    }
}
