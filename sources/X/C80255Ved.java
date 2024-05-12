package X;

import android.view.View;

/* renamed from: X.Ved, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80255Ved implements InterfaceC80252Vea {
    @Override // X.InterfaceC80252Vea
    public final C16800lI LIZ(View view, C16800lI c16800lI, C80254Vec c80254Vec) {
        int i;
        c80254Vec.LIZLLL = c16800lI.LIZIZ() + c80254Vec.LIZLLL;
        boolean z = true;
        if (C16310kV.LIZLLL(view) != 1) {
            z = false;
        }
        int LIZJ = c16800lI.LIZJ();
        int LIZLLL = c16800lI.LIZLLL();
        int i2 = c80254Vec.LIZ;
        if (z) {
            i = LIZLLL;
        } else {
            i = LIZJ;
        }
        int i3 = i2 + i;
        c80254Vec.LIZ = i3;
        int i4 = c80254Vec.LIZJ;
        if (!z) {
            LIZJ = LIZLLL;
        }
        int i5 = i4 + LIZJ;
        c80254Vec.LIZJ = i5;
        C16310kV.LJIIJ(view, i3, c80254Vec.LIZIZ, i5, c80254Vec.LIZLLL);
        return c16800lI;
    }
}
