package X;

import android.view.View;

/* renamed from: X.VeJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80235VeJ implements InterfaceC16710l9 {
    public final /* synthetic */ C80234VeI LIZ;

    public C80235VeJ(C80234VeI c80234VeI) {
        this.LIZ = c80234VeI;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        if (this.LIZ.getVisibility() == 8) {
            this.LIZ.LJLIL = null;
            return c16800lI;
        }
        if (!new C16800lI(c16800lI).equals(this.LIZ.LJLIL)) {
            this.LIZ.LJLIL = new C16800lI(c16800lI);
            C80234VeI c80234VeI = this.LIZ;
            c80234VeI.post(c80234VeI.LJLJJI);
        }
        return new C16800lI(c16800lI).LJIIIIZZ(c16800lI.LIZJ(), 0, c16800lI.LIZLLL(), c16800lI.LIZIZ());
    }
}
