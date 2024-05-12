package X;

import java.io.IOException;

/* renamed from: X.PVg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64556PVg implements PUC {
    public final C64546PUw LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI = 0;
    public final /* synthetic */ C64560PVk LJLJJI;

    @Override // X.PUC
    public final C64545PUv timeout() {
        return this.LJLIL;
    }

    public AbstractC64556PVg(C64560PVk c64560PVk) {
        this.LJLJJI = c64560PVk;
        this.LJLIL = new C64546PUw(c64560PVk.LIZJ.timeout());
    }

    public final void LIZ(IOException iOException, boolean z) {
        int i = this.LJLJJI.LJ;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C64560PVk.LJI(this.LJLIL);
            C64560PVk c64560PVk = this.LJLJJI;
            c64560PVk.LJ = 6;
            C64583PWh c64583PWh = c64560PVk.LIZIZ;
            if (c64583PWh != null) {
                c64583PWh.LJIIIIZZ(!z, c64560PVk, this.LJLJI, iOException);
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state: ");
        LIZ.append(this.LJLJJI.LJ);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.PUC
    public long read(C64533PUj c64533PUj, long j) {
        try {
            long read = this.LJLJJI.LIZJ.read(c64533PUj, j);
            if (read > 0) {
                this.LJLJI += read;
            }
            return read;
        } catch (IOException e) {
            LIZ(e, false);
            throw e;
        }
    }
}
