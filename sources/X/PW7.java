package X;

import java.net.ProtocolException;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PW7 implements InterfaceC48121Iub {
    public final boolean LIZ;

    public PW7(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        C64597PWv c64597PWv;
        C64598PWw LIZ;
        PW8 pw8 = (PW8) pxz;
        PW9 pw9 = pw8.LIZJ;
        C64583PWh c64583PWh = pw8.LIZIZ;
        C64561PVl c64561PVl = pw8.LIZLLL;
        Request request = pw8.LJFF;
        long currentTimeMillis = System.currentTimeMillis();
        pw8.LJII.requestHeadersStart(pw8.LJI);
        pw9.LIZIZ(request);
        pw8.LJII.requestHeadersEnd(pw8.LJI, request);
        if (C78934UyQ.LJJ(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                pw9.LIZ();
                pw8.LJII.responseHeadersStart(pw8.LJI);
                c64597PWv = pw9.LJFF(true);
                if (c64597PWv != null) {
                    if (c64561PVl.LJII == null) {
                        c64583PWh.LJFF();
                    }
                }
            } else {
                c64597PWv = null;
            }
            pw8.LJII.requestBodyStart(pw8.LJI);
            PUI pui = new PUI(pw9.LIZLLL(request, request.body().LIZ()));
            C64535PUl c64535PUl = new C64535PUl(pui);
            request.body().LJ(c64535PUl);
            c64535PUl.close();
            pw8.LJII.requestBodyEnd(pw8.LJI, pui.LJLILLLLZI);
        } else {
            c64597PWv = null;
        }
        pw9.LJ();
        if (c64597PWv == null) {
            pw8.LJII.responseHeadersStart(pw8.LJI);
            c64597PWv = pw9.LJFF(false);
        }
        c64597PWv.LIZ = request;
        c64597PWv.LJ = c64583PWh.LIZIZ().LJFF;
        c64597PWv.LJIIJ = currentTimeMillis;
        c64597PWv.LJIIJJI = System.currentTimeMillis();
        C64598PWw LIZ2 = c64597PWv.LIZ();
        int i = LIZ2.LJLJI;
        if (i == 100) {
            C64597PWv LJFF = pw9.LJFF(false);
            LJFF.LIZ = request;
            LJFF.LJ = c64583PWh.LIZIZ().LJFF;
            LJFF.LJIIJ = currentTimeMillis;
            LJFF.LJIIJJI = System.currentTimeMillis();
            LIZ2 = LJFF.LIZ();
            i = LIZ2.LJLJI;
        }
        pw8.LJII.responseHeadersEnd(pw8.LJI, LIZ2);
        if (this.LIZ && i == 101) {
            C64597PWv c64597PWv2 = new C64597PWv(LIZ2);
            c64597PWv2.LJI = PVA.LIZJ;
            LIZ = c64597PWv2.LIZ();
        } else {
            C64597PWv c64597PWv3 = new C64597PWv(LIZ2);
            c64597PWv3.LJI = pw9.LIZJ(LIZ2);
            LIZ = c64597PWv3.LIZ();
        }
        if ("close".equalsIgnoreCase(LIZ.LJLIL.header("Connection")) || "close".equalsIgnoreCase(LIZ.LIZ("Connection", null))) {
            c64583PWh.LJFF();
        }
        if ((i != 204 && i != 205) || LIZ.LJLJL.contentLength() <= 0) {
            return LIZ;
        }
        StringBuilder LJ = C7MY.LJ("HTTP ", i, " had non-zero Content-Length: ");
        LJ.append(LIZ.LJLJL.contentLength());
        throw new ProtocolException(X1D.LIZIZ(LJ));
    }
}
