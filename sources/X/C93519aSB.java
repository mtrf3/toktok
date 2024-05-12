package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.aSB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93519aSB implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    public C93519aSB(ViewGroup viewGroup, float f, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = f;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        ViewGroup viewGroup = this.LJLIL;
        o.LJIIIIZZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            viewGroup.setScaleX(1.0f - (((Float) animatedValue).floatValue() * (1.0f - this.LJLILLLLZI)));
            ViewGroup viewGroup2 = this.LJLIL;
            Object animatedValue2 = it.getAnimatedValue();
            if (animatedValue2 != null) {
                viewGroup2.setScaleY(1.0f - (((Float) animatedValue2).floatValue() * (1.0f - this.LJLILLLLZI)));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
