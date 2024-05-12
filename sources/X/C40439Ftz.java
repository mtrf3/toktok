package X;

/* renamed from: X.Ftz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40439Ftz extends AbstractC40446Fu6 {
    @Override // X.AbstractC40446Fu6
    public final void LIZ() {
        if (C40438Fty.LJI("system_launch_1_minute", null)) {
            C1DH.LIZJ(C40438Fty.LJIIIIZZ);
            if (((Boolean) C33862DQs.LJ.getValue()).booleanValue()) {
                C232469Ak.LJFF("SystemLaunch1Minute");
            }
        }
    }

    @Override // X.AbstractC40446Fu6
    public final void LIZIZ(boolean z) {
        if (z && C40438Fty.LIZLLL("system_launch_1_to_2_minute")) {
            C1DH.LJJIJIIJIL(60000L, C40438Fty.LJIIJ);
        }
    }
}
