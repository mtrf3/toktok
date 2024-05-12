package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JEH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ JEG LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public JEH(JEG jeg, int i, int i2, int i3, int i4, boolean z) {
        this.LJLIL = jeg;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
        this.LJLJJLL = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        WindowManager.LayoutParams layoutParams;
        o.LJIIIZ(it, "it");
        this.LJLIL.LIZJ(it);
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        JEG jeg = this.LJLIL;
        int i = (int) ((this.LJLJI * floatValue) + this.LJLILLLLZI);
        int i2 = (int) ((this.LJLJJL * floatValue) + this.LJLJJI);
        boolean z = this.LJLJJLL;
        JET jet = jeg.LJFF;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (jet != null) {
            layoutParams2 = jet.getLayoutParams();
        }
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || (layoutParams = (WindowManager.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        jeg.LJIIIIZZ(i, i2);
        int i3 = layoutParams.y;
        Rect rect = jeg.LIZLLL;
        layoutParams.y = C78609UtB.LJJIIZ(i3, rect.top, rect.bottom);
        if (z) {
            layoutParams.x = (jeg.LJIIJ - JEG.LJIJ) - i;
        }
        jeg.LIZIZ.updateViewLayout(jeg.LJFF, layoutParams);
        jeg.LJIIIIZZ.set(layoutParams.x, layoutParams.y);
        int i4 = jeg.LJIIJJI;
        int i5 = jeg.LJIIL;
        jeg.LJIILJJIL = (jeg.LJIIIIZZ.y - i5) / ((i4 - i5) - jeg.LJIILIIL);
    }
}
