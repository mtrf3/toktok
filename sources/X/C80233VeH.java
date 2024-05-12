package X;

import android.view.View;

/* renamed from: X.VeH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80233VeH implements InterfaceC16710l9 {
    public final /* synthetic */ C80232VeG LIZ;

    public C80233VeH(C80232VeG c80232VeG) {
        this.LIZ = c80232VeG;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        if (this.LIZ.getVisibility() == 8) {
            this.LIZ.LJLIL = null;
            return c16800lI;
        }
        if (!new C16800lI(c16800lI).equals(this.LIZ.LJLIL)) {
            this.LIZ.LJLIL = new C16800lI(c16800lI);
            C80232VeG c80232VeG = this.LIZ;
            c80232VeG.post(c80232VeG.LJLJJI);
        }
        return new C16800lI(c16800lI).LJIIIIZZ(c16800lI.LIZJ(), c16800lI.LJ(), c16800lI.LIZLLL(), 0);
    }
}
