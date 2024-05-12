package X;

/* renamed from: X.NNz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59271NNz extends NNJ {
    @Override // X.NNJ
    public final boolean LIZ() {
        boolean z;
        if (LIZLLL().LIZIZ.LIZ.length() == 0 || LIZLLL().LIZIZ.LJIJ != 1) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isNine ");
        if (C52471KiZ.LIZ() && LIZLLL().LIZIZ.LJIJJLI == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(" time ");
        LIZ.append(System.currentTimeMillis());
        X1D.LIZIZ(LIZ);
        if (C52471KiZ.LIZ() && LIZLLL().LIZIZ.LJIJJLI == 1) {
            return false;
        }
        return C40680Fxs.LIZIZ(LIZLLL().LIZIZ.LIZ);
    }

    @Override // X.NNJ
    public final boolean LIZIZ() {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LIZJ());
        if (LJJIFFI == null) {
            return false;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        C59230NMk c59230NMk = LIZLLL().LJ;
        c59230NMk.getClass();
        c59230NMk.LJ = LIZ;
        C58909NAb.LIZ.getClass();
        InterfaceC59440NUm LIZ2 = NH3.LIZ();
        if (LIZ2 != null) {
            ((NTF) LIZ2).LJJI(LJJIFFI, LIZLLL().LIZIZ.LIZ, LIZLLL().LIZIZ.LIZIZ, LIZLLL().LIZIZ.LJJIIZI, LIZ, LIZLLL().LIZIZ.LJIIL, LIZLLL().LJ.LIZIZ, LIZLLL().LIZIZ.LJJIJIIJIL);
            return true;
        }
        return true;
    }
}
