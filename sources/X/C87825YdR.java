package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.YdR, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87825YdR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C87819YdL LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C87825YdR(C87819YdL c87819YdL, int i, boolean z) {
        this.LJLIL = c87819YdL;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        int i;
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = this.LJLIL.LJIILL;
        if (viewGroup != null) {
            AbstractC87817YdJ.LJIIIIZZ(viewGroup, this.LJLILLLLZI);
            C87819YdL c87819YdL = this.LJLIL;
            TextView textView = c87819YdL.LJIJI;
            if (textView != null) {
                if (this.LJLJI) {
                    i = c87819YdL.LJJ;
                } else {
                    i = c87819YdL.LIZIZ.LJII;
                }
                int i2 = c87819YdL.LIZIZ.LJII;
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setTextColor(AbstractC87817YdJ.LIZIZ(((Float) animatedValue).floatValue(), i, i2));
                return;
            }
            o.LJIJI("numText2");
            throw null;
        }
        o.LJIJI("numContainer");
        throw null;
    }
}
