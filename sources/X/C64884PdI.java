package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PdI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64884PdI implements InterfaceC65108Pgu {
    public final long LIZ = 30000;
    public final long LIZIZ = 30000;
    public final long LIZJ = 30000;
    public final long LIZLLL = 90000;

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        C64697PaH c64697PaH;
        if (!o.LJ(c64907Pdf.LIZIZ.LJFF.LIZ(), "/aweme/v1/upload/hashcontacts/")) {
            return;
        }
        Object obj = c64907Pdf.LJII;
        if (obj == null) {
            obj = new C48153Iv7();
            c64907Pdf.LJII = obj;
        }
        if ((obj instanceof C64697PaH) && (c64697PaH = (C64697PaH) obj) != null) {
            c64697PaH.LJFF = this.LIZ;
            c64697PaH.LJII = this.LIZIZ;
            c64697PaH.LJI = this.LIZJ;
            c64697PaH.LJIIIIZZ = this.LIZLLL;
        }
    }
}
