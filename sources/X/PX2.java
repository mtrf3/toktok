package X;

import kotlin.jvm.internal.o;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PX2 implements InterfaceC48121Iub {
    /* JADX WARN: Type inference failed for: r0v4, types: [R, X.PWw] */
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        C64598PWw c64598PWw;
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        PY7 py7 = PY7.LIZLLL;
        PPC<Request, C64598PWw> LJIILLIIL = py7.LJIILLIIL(new PPC<>(request, 62));
        PPD ppd = LJIILLIIL.LJFF;
        if (ppd == PPD.INTERCEPT && (c64598PWw = LJIILLIIL.LIZIZ) != null) {
            return c64598PWw;
        }
        PPD ppd2 = PPD.EXCEPTION;
        if (ppd != ppd2 || (runtimeException2 = LJIILLIIL.LJ) == null) {
            Request request2 = LJIILLIIL.LIZ;
            o.LJI(request2);
            LJIILLIIL.LIZIZ = pw8.LIZ(request2);
            PPC<Request, C64598PWw> LIZIZ = py7.LIZIZ(LJIILLIIL);
            if (LIZIZ.LJFF != ppd2 || (runtimeException = LIZIZ.LJ) == null) {
                C64598PWw c64598PWw2 = LIZIZ.LIZIZ;
                o.LJI(c64598PWw2);
                return c64598PWw2;
            }
            throw runtimeException;
        }
        throw runtimeException2;
    }
}
