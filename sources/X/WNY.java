package X;

import Y.ALAdapterS11S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes15.dex */
public abstract class WNY implements Cloneable {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;

    public abstract void LIZIZ(boolean z);

    public abstract WNT LIZJ(boolean z);

    public final Object clone() {
        try {
            WNY wny = (WNY) super.clone();
            wny.LJLIL = null;
            wny.LJLILLLLZI = null;
            wny.LJLJI = null;
            return wny;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator LIZLLL(boolean z) {
        WNT LIZJ = LIZJ(z);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(LIZJ, 62));
        ofFloat.addListener(new ALAdapterS11S0100000_14(LIZJ, 58));
        return ofFloat;
    }

    public void LIZ(View view, View view2, View view3) {
        if (view3 != null) {
            this.LJLIL = view;
            this.LJLILLLLZI = view2;
            this.LJLJI = view3;
            return;
        }
        throw new IllegalArgumentException("animationView cant be null");
    }
}
