package X;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Request;

/* renamed from: X.PWt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64595PWt implements PX8 {
    public final /* synthetic */ Request LIZ;
    public final /* synthetic */ PXI LIZIZ;

    public C64595PWt(PXI pxi, Request request) {
        this.LIZIZ = pxi;
        this.LIZ = request;
    }

    @Override // X.PX8
    public final void onFailure(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
        this.LIZIZ.LIZLLL(iOException, null);
    }

    @Override // X.PX8
    public final void onResponse(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
        try {
            this.LIZIZ.LIZJ(c64598PWw);
            AbstractC64554PVe.LIZ.getClass();
            C64583PWh c64583PWh = ((C64587PWl) interfaceC48133Iun).LJLILLLLZI.LIZIZ;
            c64583PWh.LJFF();
            C64561PVl LIZIZ = c64583PWh.LIZIZ();
            LIZIZ.getClass();
            C64594PWs c64594PWs = new C64594PWs(LIZIZ.LJIIIIZZ, LIZIZ.LJIIIZ, c64583PWh);
            try {
                PXI pxi = this.LIZIZ;
                QXX qxx = pxi.LIZ;
                if (qxx != null) {
                    qxx.LLLIIII(pxi, c64598PWw);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OkHttp WebSocket ");
                LIZ.append(this.LIZ.url().LJIJI());
                this.LIZIZ.LJ(X1D.LIZIZ(LIZ), c64594PWs);
                c64583PWh.LIZIZ().LJ.setSoTimeout(0);
                this.LIZIZ.LJFF();
            } catch (Exception e) {
                this.LIZIZ.LIZLLL(e, null);
            }
        } catch (ProtocolException e2) {
            this.LIZIZ.LIZLLL(e2, c64598PWw);
            PVA.LJ(c64598PWw);
        }
    }
}
