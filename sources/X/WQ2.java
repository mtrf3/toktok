package X;

import Y.ACListenerS34S0100000_14;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQ2 implements WQ9 {
    public View.OnClickListener LIZ;
    public boolean LIZIZ;
    public final View LIZJ;

    public WQ2(View applyToAllView) {
        int i;
        o.LJIIIZ(applyToAllView, "applyToAllView");
        this.LIZJ = applyToAllView;
        if (this.LIZIZ) {
            i = 0;
        } else {
            i = 8;
        }
        applyToAllView.setVisibility(i);
    }

    @Override // X.WQ9
    public final void LIZ(ACListenerS34S0100000_14 aCListenerS34S0100000_14) {
        this.LIZ = aCListenerS34S0100000_14;
        if (this.LIZIZ) {
            C16880lQ.LJIIJ(aCListenerS34S0100000_14, this.LIZJ);
        } else {
            C16880lQ.LJIIJ(null, this.LIZJ);
        }
    }

    @Override // X.WQ9
    public final void setEnable(boolean z) {
        int i;
        this.LIZIZ = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.LIZJ.setVisibility(i);
        if (this.LIZIZ) {
            C16880lQ.LJIIJ(this.LIZ, this.LIZJ);
        } else {
            C16880lQ.LJIIJ(null, this.LIZJ);
        }
    }
}
