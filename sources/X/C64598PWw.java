package X;

import java.io.Closeable;
import okhttp3.Request;

/* renamed from: X.PWw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64598PWw implements Closeable {
    public final Request LJLIL;
    public final EnumC64572PVw LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final PNS LJLJJL;
    public final C64606PXe LJLJJLL;
    public final PVM LJLJL;
    public final C64598PWw LJLJLJ;
    public final C64598PWw LJLJLLL;
    public final C64598PWw LJLL;
    public final long LJLLI;
    public final long LJLLILLLL;

    public final boolean LIZIZ() {
        int i = this.LJLJI;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PVM pvm = this.LJLJL;
        if (pvm != null) {
            pvm.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Response{protocol=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", code=");
        LIZ.append(this.LJLJI);
        LIZ.append(", message=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", url=");
        LIZ.append(this.LJLIL.url());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C64598PWw(C64597PWv c64597PWv) {
        this.LJLIL = c64597PWv.LIZ;
        this.LJLILLLLZI = c64597PWv.LIZIZ;
        this.LJLJI = c64597PWv.LIZJ;
        this.LJLJJI = c64597PWv.LIZLLL;
        this.LJLJJL = c64597PWv.LJ;
        C64605PXd c64605PXd = c64597PWv.LJFF;
        c64605PXd.getClass();
        this.LJLJJLL = new C64606PXe(c64605PXd);
        this.LJLJL = c64597PWv.LJI;
        this.LJLJLJ = c64597PWv.LJII;
        this.LJLJLLL = c64597PWv.LJIIIIZZ;
        this.LJLL = c64597PWv.LJIIIZ;
        this.LJLLI = c64597PWv.LJIIJ;
        this.LJLLILLLL = c64597PWv.LJIIJJI;
    }

    public final String LIZ(String str, String str2) {
        String LIZLLL = this.LJLJJLL.LIZLLL(str);
        if (LIZLLL != null) {
            return LIZLLL;
        }
        return str2;
    }
}
