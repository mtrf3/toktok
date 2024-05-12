package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BAD implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator LJLIL;
    public final /* synthetic */ List<View> LJLILLLLZI;
    public final /* synthetic */ List<View> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public BAD(ValueAnimator valueAnimator, List<? extends View> list, List<? extends View> list2) {
        this.LJLIL = valueAnimator;
        this.LJLILLLLZI = list;
        this.LJLJI = list2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        Float f;
        Float f2;
        Float f3;
        o.LJIIIZ(it, "it");
        Object animatedValue = this.LJLIL.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            for (View view : this.LJLILLLLZI) {
                if (view != null) {
                    f3 = Float.valueOf(view.getAlpha());
                } else {
                    f3 = null;
                }
                if (!o.LIZJ(f3, 1.0f) && view != null) {
                    view.setAlpha(floatValue);
                }
            }
            for (View view2 : this.LJLJI) {
                if (view2 != null) {
                    f2 = Float.valueOf(view2.getAlpha());
                } else {
                    f2 = null;
                }
                if (!o.LIZJ(f2, 0.0f) || C29306Beo.LJJIIJ(view2)) {
                    if (view2 != null) {
                        view2.setAlpha(1 - floatValue);
                    }
                }
            }
        }
    }
}
