package X;

import java.io.IOException;

/* renamed from: X.PYm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64640PYm implements PX8 {
    public final /* synthetic */ InterfaceC64642PYo LIZ;
    public final /* synthetic */ C64639PYl LIZIZ;

    public C64640PYm(C64639PYl c64639PYl, InterfaceC64642PYo interfaceC64642PYo) {
        this.LIZIZ = c64639PYl;
        this.LIZ = interfaceC64642PYo;
    }

    @Override // X.PX8
    public final void onFailure(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
        try {
            this.LIZ.onFailure(this.LIZIZ, iOException);
        } catch (Throwable th) {
            C65138PhO.LJIILIIL(th);
        }
    }

    @Override // X.PX8
    public final void onResponse(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
        try {
            try {
                this.LIZ.onResponse(this.LIZIZ, this.LIZIZ.LIZIZ(c64598PWw));
            } catch (Throwable th) {
                C65138PhO.LJIILIIL(th);
            }
        } catch (Throwable th2) {
            C65138PhO.LJIILIIL(th2);
            try {
                this.LIZ.onFailure(this.LIZIZ, th2);
            } catch (Throwable th3) {
                C65138PhO.LJIILIIL(th3);
            }
        }
    }
}
