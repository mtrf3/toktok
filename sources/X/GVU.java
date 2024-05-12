package X;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GVU implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C41634GVq LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public GVU(C41634GVq c41634GVq, int i, C76732zl c76732zl, int i2, int i3) {
        this.LJLIL = c41634GVq;
        this.LJLILLLLZI = i;
        this.LJLJI = c76732zl;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (this.LJLIL.LIZIZ.getParent() != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C41634GVq c41634GVq = this.LJLIL;
            WindowManager.LayoutParams layoutParams = c41634GVq.LJIIJ;
            layoutParams.x = (int) (((this.LJLJI.element - r2) * floatValue) + this.LJLILLLLZI);
            layoutParams.y = (int) (((this.LJLJJL - r2) * floatValue) + this.LJLJJI);
            WindowManager windowManager = c41634GVq.LJIIJJI;
            if (windowManager != null) {
                windowManager.updateViewLayout(c41634GVq.LIZIZ, layoutParams);
            }
        }
    }
}
