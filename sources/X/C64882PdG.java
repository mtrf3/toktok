package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PdG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64882PdG implements InterfaceC65108Pgu {
    public static final C64882PdG LIZ = new C64882PdG();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        String str;
        String LIZLLL;
        C40515FvD LIZJ = C40515FvD.LIZJ();
        LIZJ.getClass();
        if (C40515FvD.LJ()) {
            str = c64907Pdf.LIZIZ.LJFF.LIZ();
            try {
                C40515FvD.LJII(str, false);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } else {
            str = null;
        }
        C22660uk c22660uk = c64907Pdf.LIZIZ.LJI;
        o.LJIIIIZZ(c22660uk, "request.mutableUrl.query");
        String[] NAMED_IDS = C40515FvD.LIZJ;
        o.LJIIIIZZ(NAMED_IDS, "NAMED_IDS");
        for (String namedId : NAMED_IDS) {
            o.LJIIIIZZ(namedId, "namedId");
            String LIZJ2 = c22660uk.LIZJ(namedId);
            if (LIZJ2 != null && !ujb.o.LJJJJJL(LIZJ2)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sec_");
                LIZ2.append(namedId);
                if (!C78685UuP.LJJJZ(c22660uk.LIZJ(X1D.LIZIZ(LIZ2))) && (LIZLLL = LIZJ.LIZLLL(LIZJ2)) != null && !ujb.o.LJJJJJL(LIZLLL)) {
                    if (str == null) {
                        str = c64907Pdf.LIZIZ.LJFF.LIZ();
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("sec_");
                    LIZ3.append(namedId);
                    c22660uk.LJ(X1D.LIZIZ(LIZ3), LIZLLL);
                }
            }
        }
    }
}
