package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import kotlin.jvm.internal.o;
import okhttp3.Request;

/* renamed from: X.PVk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64560PVk implements PW9 {
    public final C64600PWy LIZ;
    public final C64583PWh LIZIZ;
    public final PW3 LIZJ;
    public final PVU LIZLLL;
    public int LJ;
    public long LJFF = 262144;

    @Override // X.PW9
    public final void LIZ() {
        this.LIZLLL.flush();
    }

    @Override // X.PW9
    public final void LJ() {
        this.LIZLLL.flush();
    }

    public final C64606PXe LJIIIIZZ() {
        C64605PXd c64605PXd = new C64605PXd();
        while (true) {
            String LLIIIILZ = this.LIZJ.LLIIIILZ(this.LJFF);
            this.LJFF -= LLIIIILZ.length();
            if (LLIIIILZ.length() != 0) {
                AbstractC64554PVe.LIZ.getClass();
                int indexOf = LLIIIILZ.indexOf(":", 1);
                if (indexOf != -1) {
                    c64605PXd.LIZIZ(LLIIIILZ.substring(0, indexOf), LLIIIILZ.substring(indexOf + 1));
                } else if (LLIIIILZ.startsWith(":")) {
                    c64605PXd.LIZIZ("", LLIIIILZ.substring(1));
                } else {
                    c64605PXd.LIZIZ("", LLIIIILZ);
                }
            } else {
                return new C64606PXe(c64605PXd);
            }
        }
    }

    @Override // X.PW9
    public final void cancel() {
        C64561PVl LIZIZ = this.LIZIZ.LIZIZ();
        if (LIZIZ != null) {
            PVA.LJFF(LIZIZ.LIZLLL);
        }
    }

    public static void LJI(C64546PUw c64546PUw) {
        C64545PUv c64545PUv = c64546PUw.LJ;
        C64547PUx delegate = C64545PUv.LIZLLL;
        o.LJIIJ(delegate, "delegate");
        c64546PUw.LJ = delegate;
        c64545PUv.LIZ();
        c64545PUv.LIZIZ();
    }

    @Override // X.PW9
    public final void LIZIZ(Request request) {
        Proxy.Type type = this.LIZIZ.LIZIZ().LIZJ.LIZIZ.type();
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (!request.isHttps() && type == Proxy.Type.HTTP) {
            sb.append(request.url());
        } else {
            sb.append(C64625PXx.LIZ(request.url()));
        }
        sb.append(" HTTP/1.1");
        LJIIIZ(request.headers(), sb.toString());
    }

    @Override // X.PW9
    public final PVQ LIZJ(C64598PWw c64598PWw) {
        C64583PWh c64583PWh = this.LIZIZ;
        c64583PWh.LJFF.responseBodyStart(c64583PWh.LJ);
        String LIZ = c64598PWw.LIZ("Content-Type", null);
        if (!C64573PVx.LIZIZ(c64598PWw)) {
            return new PVQ(LIZ, 0L, PU7.LIZ(LJII(0L)));
        }
        if ("chunked".equalsIgnoreCase(c64598PWw.LIZ("Transfer-Encoding", null))) {
            C64626PXy url = c64598PWw.LJLIL.url();
            if (this.LJ == 4) {
                this.LJ = 5;
                return new PVQ(LIZ, -1L, PU7.LIZ(new C64559PVj(this, url)));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("state: ");
            LIZ2.append(this.LJ);
            throw new IllegalStateException(X1D.LIZIZ(LIZ2));
        }
        long LIZ3 = C64573PVx.LIZ(c64598PWw);
        if (LIZ3 != -1) {
            return new PVQ(LIZ, LIZ3, PU7.LIZ(LJII(LIZ3)));
        }
        if (this.LJ == 4) {
            C64583PWh c64583PWh2 = this.LIZIZ;
            if (c64583PWh2 != null) {
                this.LJ = 5;
                c64583PWh2.LJFF();
                return new PVQ(LIZ, -1L, PU7.LIZ(new C64558PVi(this)));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("state: ");
        LIZ4.append(this.LJ);
        throw new IllegalStateException(X1D.LIZIZ(LIZ4));
    }

    @Override // X.PW9
    public final C64597PWv LJFF(boolean z) {
        int i = this.LJ;
        if (i != 1 && i != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("state: ");
            LIZ.append(this.LJ);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        try {
            String LLIIIILZ = this.LIZJ.LLIIIILZ(this.LJFF);
            this.LJFF -= LLIIIILZ.length();
            PPG LIZ2 = PPG.LIZ(LLIIIILZ);
            C64597PWv c64597PWv = new C64597PWv();
            c64597PWv.LIZIZ = LIZ2.LIZ;
            c64597PWv.LIZJ = LIZ2.LIZIZ;
            c64597PWv.LIZLLL = LIZ2.LIZJ;
            c64597PWv.LJFF = LJIIIIZZ().LJI();
            if (z && LIZ2.LIZIZ == 100) {
                return null;
            }
            if (LIZ2.LIZIZ == 100) {
                this.LJ = 3;
                return c64597PWv;
            }
            this.LJ = 4;
            return c64597PWv;
        } catch (EOFException e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("unexpected end of stream on ");
            LIZ3.append(this.LIZIZ);
            IOException iOException = new IOException(X1D.LIZIZ(LIZ3));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public final C64557PVh LJII(long j) {
        if (this.LJ == 4) {
            this.LJ = 5;
            return new C64557PVh(this, j);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state: ");
        LIZ.append(this.LJ);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.PW9
    public final PUJ LIZLLL(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            if (this.LJ == 1) {
                this.LJ = 2;
                return new PVT(this);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("state: ");
            LIZ.append(this.LJ);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        if (j != -1) {
            if (this.LJ == 1) {
                this.LJ = 2;
                return new PVS(this, j);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("state: ");
            LIZ2.append(this.LJ);
            throw new IllegalStateException(X1D.LIZIZ(LIZ2));
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void LJIIIZ(C64606PXe c64606PXe, String str) {
        if (this.LJ == 0) {
            PVU pvu = this.LIZLLL;
            pvu.LLIIIZ(str);
            pvu.LLIIIZ("\r\n");
            int length = c64606PXe.LIZ.length / 2;
            for (int i = 0; i < length; i++) {
                PVU pvu2 = this.LIZLLL;
                pvu2.LLIIIZ(c64606PXe.LJ(i));
                pvu2.LLIIIZ(": ");
                pvu2.LLIIIZ(c64606PXe.LJIIJ(i));
                pvu2.LLIIIZ("\r\n");
            }
            this.LIZLLL.LLIIIZ("\r\n");
            this.LJ = 1;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state: ");
        LIZ.append(this.LJ);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public C64560PVk(C64600PWy c64600PWy, C64583PWh c64583PWh, PW3 pw3, PVU pvu) {
        this.LIZ = c64600PWy;
        this.LIZIZ = c64583PWh;
        this.LIZJ = pw3;
        this.LIZLLL = pvu;
    }
}
