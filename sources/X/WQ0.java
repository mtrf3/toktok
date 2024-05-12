package X;

import Y.ACListenerS34S0100000_14;
import android.view.View;

/* loaded from: classes15.dex */
public final class WQ0 implements WQ5 {
    public View.OnClickListener LIZ;
    public boolean LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;

    @Override // X.WQ5
    public final boolean LIZIZ() {
        View view = this.LIZJ;
        if (view != null) {
            return view.isSelected();
        }
        return false;
    }

    @Override // X.WQ5
    public final void LIZ(boolean z) {
        View view;
        if (this.LIZIZ && (view = this.LIZJ) != null) {
            view.setSelected(z);
        }
    }

    @Override // X.WQ5
    public final void LIZJ(ACListenerS34S0100000_14 aCListenerS34S0100000_14) {
        this.LIZ = aCListenerS34S0100000_14;
        if (this.LIZIZ) {
            View view = this.LIZJ;
            if (view != null) {
                C16880lQ.LJIIJ(aCListenerS34S0100000_14, view);
                return;
            }
            return;
        }
        View view2 = this.LIZJ;
        if (view2 == null) {
            return;
        }
        C16880lQ.LJIIJ(null, view2);
    }

    @Override // X.WQ5
    public final void setEnable(boolean z) {
        int i;
        this.LIZIZ = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.LIZJ;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            view2.setVisibility(i);
        }
        if (this.LIZIZ) {
            View view3 = this.LIZJ;
            if (view3 != null) {
                C16880lQ.LJIIJ(this.LIZ, view3);
                return;
            }
            return;
        }
        View view4 = this.LIZJ;
        if (view4 == null) {
            return;
        }
        C16880lQ.LJIIJ(null, view4);
    }

    public WQ0(View view, View view2) {
        this.LIZJ = view;
        this.LIZLLL = view2;
        if (view != null) {
            view.setSelected(false);
        }
        int i = this.LIZIZ ? 0 : 8;
        if (view != null) {
            view.setVisibility(i);
        }
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }
}
