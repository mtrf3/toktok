package X;

import Y.ARunnableS45S0100000_9;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Mde, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57262Mde implements ValueAnimator.AnimatorUpdateListener, InterfaceC57255MdX {
    public final View LJLIL;
    public float LJLILLLLZI = -1.0f;

    @Override // X.InterfaceC57255MdX
    public final int LIZ() {
        return 4;
    }

    public C57262Mde(View view) {
        this.LJLIL = view;
    }

    @Override // X.InterfaceC57255MdX
    public final void LIZIZ(int i) {
        float f = this.LJLILLLLZI;
        if (f < 0.0f) {
            return;
        }
        if (i == 0) {
            View view = this.LJLIL;
            if (view == null) {
                return;
            }
            view.setRotation(f);
            return;
        }
        C1DH.LJJIJIIJIL(i, new ARunnableS45S0100000_9(this, 138));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLILLLLZI = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
    }
}
