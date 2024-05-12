package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.VeX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80249VeX implements InterfaceC16710l9 {
    public final /* synthetic */ C80248VeW LIZ;

    public C80249VeX(C80248VeW c80248VeW) {
        this.LIZ = c80248VeW;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        C80248VeW c80248VeW = this.LIZ;
        if (c80248VeW.LJLILLLLZI == null) {
            c80248VeW.LJLILLLLZI = new Rect();
        }
        this.LIZ.LJLILLLLZI.set(c16800lI.LIZJ(), c16800lI.LJ(), c16800lI.LIZLLL(), c16800lI.LIZIZ());
        this.LIZ.LIZ(c16800lI);
        C80248VeW c80248VeW2 = this.LIZ;
        boolean z = true;
        if ((!c16800lI.LIZ.LJIIJ().equals(C07310Ql.LJ)) && this.LIZ.LJLIL != null) {
            z = false;
        }
        c80248VeW2.setWillNotDraw(z);
        C16300kU.LJIIJ(this.LIZ);
        return c16800lI.LIZ.LIZJ();
    }
}
