package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.2I6, reason: invalid class name */
/* loaded from: classes.dex */
public class C2I6 extends C2F7 {
    public static final C16800lI LJIILLIIL = C16800lI.LJIIJ(null, WindowInsets.CONSUMED);

    @Override // X.C1V3, X.C16770lF
    public final void LIZLLL(View view) {
    }

    @Override // X.C1V3, X.C16770lF
    public C07310Ql LJI(int i) {
        return C07310Ql.LIZJ(this.LIZJ.getInsets(C16790lH.LIZ(i)));
    }

    @Override // X.C1V3, X.C16770lF
    public boolean LJIILL(int i) {
        return this.LIZJ.isVisible(C16790lH.LIZ(i));
    }

    public C2I6(C16800lI c16800lI, C2I6 c2i6) {
        super(c16800lI, c2i6);
    }

    public C2I6(C16800lI c16800lI, WindowInsets windowInsets) {
        super(c16800lI, windowInsets);
    }
}
