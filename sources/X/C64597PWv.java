package X;

import defpackage.i0;
import okhttp3.Request;

/* renamed from: X.PWv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64597PWv {
    public Request LIZ;
    public EnumC64572PVw LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public PNS LJ;
    public C64605PXd LJFF;
    public PVM LJI;
    public C64598PWw LJII;
    public C64598PWw LJIIIIZZ;
    public C64598PWw LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;

    public final C64598PWw LIZ() {
        if (this.LIZ != null) {
            if (this.LIZIZ != null) {
                if (this.LIZJ >= 0) {
                    if (this.LIZLLL != null) {
                        return new C64598PWw(this);
                    }
                    throw new IllegalStateException("message == null");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("code < 0: ");
                LIZ.append(this.LIZJ);
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
            throw new IllegalStateException("protocol == null");
        }
        throw new IllegalStateException("request == null");
    }

    public C64597PWv() {
        this.LIZJ = -1;
        this.LJFF = new C64605PXd();
    }

    public C64597PWv(C64598PWw c64598PWw) {
        this.LIZJ = -1;
        this.LIZ = c64598PWw.LJLIL;
        this.LIZIZ = c64598PWw.LJLILLLLZI;
        this.LIZJ = c64598PWw.LJLJI;
        this.LIZLLL = c64598PWw.LJLJJI;
        this.LJ = c64598PWw.LJLJJL;
        this.LJFF = c64598PWw.LJLJJLL.LJI();
        this.LJI = c64598PWw.LJLJL;
        this.LJII = c64598PWw.LJLJLJ;
        this.LJIIIIZZ = c64598PWw.LJLJLLL;
        this.LJIIIZ = c64598PWw.LJLL;
        this.LJIIJ = c64598PWw.LJLLI;
        this.LJIIJJI = c64598PWw.LJLLILLLL;
    }

    public static void LIZIZ(String str, C64598PWw c64598PWw) {
        if (c64598PWw.LJLJL == null) {
            if (c64598PWw.LJLJLJ == null) {
                if (c64598PWw.LJLJLLL == null) {
                    if (c64598PWw.LJLL == null) {
                        return;
                    } else {
                        throw new IllegalArgumentException(i0.LJFF(str, ".priorResponse != null"));
                    }
                }
                throw new IllegalArgumentException(i0.LJFF(str, ".cacheResponse != null"));
            }
            throw new IllegalArgumentException(i0.LJFF(str, ".networkResponse != null"));
        }
        throw new IllegalArgumentException(i0.LJFF(str, ".body != null"));
    }
}
