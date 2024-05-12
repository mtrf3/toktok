package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.aSA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93518aSA implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;

    public C93518aSA(ViewGroup viewGroup, float f, float f2, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        ViewGroup viewGroup = this.LJLIL;
        float f = this.LJLILLLLZI;
        o.LJIIIIZZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            viewGroup.setScaleX(f + (((Float) animatedValue).floatValue() * (1.0f - this.LJLILLLLZI)));
            ViewGroup viewGroup2 = this.LJLIL;
            float f2 = this.LJLJI;
            Object animatedValue2 = it.getAnimatedValue();
            if (animatedValue2 != null) {
                viewGroup2.setScaleY(f2 + (((Float) animatedValue2).floatValue() * (1.0f - this.LJLJI)));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
