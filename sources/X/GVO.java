package X;

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* loaded from: classes8.dex */
public final class GVO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C41634GVq LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public GVO(C41634GVq c41634GVq, int i, int i2, boolean z) {
        this.LJLIL = c41634GVq;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C41634GVq c41634GVq;
        WindowManager windowManager;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        C41634GVq c41634GVq2 = this.LJLIL;
        c41634GVq2.LJIIJ.y = (int) (((this.LJLJI - r2) * floatValue) + this.LJLILLLLZI);
        if (this.LJLJJI) {
            c41634GVq2.LIZIZ.setAlpha(floatValue);
        }
        if (this.LJLIL.LIZIZ.getParent() != null && (windowManager = (c41634GVq = this.LJLIL).LJIIJJI) != null) {
            windowManager.updateViewLayout(c41634GVq.LIZIZ, c41634GVq.LJIIJ);
        }
    }
}
