package X;

import java.util.List;

/* renamed from: X.3QT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QT extends AbstractC65781Prl implements InterfaceC65784Pro<C3QU> {
    public static final C3QT LJLIL = new C3QT();

    public C3QT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C3QU invoke() {
        boolean z;
        C3QU c3qu = new C3QU();
        boolean z2 = false;
        List LJJIJIL = C47261Igj.LJJIJIL(0, 1);
        int intValue = ((Number) C3QY.LIZ.getValue()).intValue();
        if (intValue == 0 || intValue == 1 || C3P4.LIZ()) {
            LJJIJIL.add(2);
        }
        if (C83403Pc.LIZ()) {
            LJJIJIL.add(3);
        }
        int[] LLJ = ORZ.LLJ(LJJIJIL);
        c3qu.LIZ = LLJ;
        c3qu.LIZIZ = LLJ;
        c3qu.LIZJ = C3JT.LIZ.preLoadCount;
        c3qu.LIZLLL = ((Boolean) C83643Qa.LIZ.getValue()).booleanValue();
        if (((Boolean) C33763DMx.LIZ.getValue()).booleanValue() || C3UM.LIZ() == 1 || C3UM.LIZ() == 4) {
            z = true;
        } else {
            z = false;
        }
        c3qu.LJ = z;
        c3qu.LJFF = true;
        c3qu.LJI = ((Boolean) EIH.LIZJ.getValue()).booleanValue();
        c3qu.LJII = ((Boolean) C88109Yi1.LIZJ.getValue()).booleanValue();
        c3qu.LJIIIIZZ = new C61576OEq();
        c3qu.LJIIJ = C115204fc.LIZ();
        c3qu.LJIIJJI = new C3QV(C3QW.LIZ().previewPullCount, C3QW.LIZ().resetIsFilteredAfterTransfer, C83403Pc.LIZ());
        if (C4T4.LIZ() >= 1) {
            z2 = true;
        }
        c3qu.LJIIL = z2;
        c3qu.LJIIIZ = 5000;
        c3qu.LJIILIIL = C81363Hg.LIZ();
        return c3qu;
    }
}
