package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PdH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64883PdH implements InterfaceC65108Pgu {
    public static final C64883PdH LIZ = new C64883PdH();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        C22660uk c22660uk = c64907Pdf.LIZIZ.LJI;
        o.LJIIIIZZ(c22660uk, "request.mutableUrl.query");
        String LIZJ = c22660uk.LIZJ("device_id");
        if (LIZJ == null || ujb.o.LJJJJJL(LIZJ)) {
            ((java.util.Map) c22660uk.LIZJ).remove("device_id");
        }
    }
}
