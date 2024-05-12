package X;

import Y.ARunnableS39S0100000_3;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.80h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043580h implements ValueAnimator.AnimatorUpdateListener, InterfaceC57255MdX {
    public final View LJLIL;
    public float LJLILLLLZI = -1.0f;

    @Override // X.InterfaceC57255MdX
    public final int LIZ() {
        return 4;
    }

    public C2043580h(ConstraintLayout constraintLayout) {
        this.LJLIL = constraintLayout;
    }

    @Override // X.InterfaceC57255MdX
    public final void LIZIZ(int i) {
        float f = this.LJLILLLLZI;
        if (f < 0.0f) {
            return;
        }
        if (i == 0) {
            View view = this.LJLIL;
            if (view != null) {
                view.setScaleX(f);
            }
            View view2 = this.LJLIL;
            if (view2 == null) {
                return;
            }
            view2.setScaleY(this.LJLILLLLZI);
            return;
        }
        C1DH.LJJIJIIJIL(i, new ARunnableS39S0100000_3(this, 145));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLILLLLZI = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
    }
}
