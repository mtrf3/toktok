package X;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.T4m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74052T4m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C74051T4l LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    public C74052T4m(C74051T4l c74051T4l, View view, View view2) {
        this.LJLIL = c74051T4l;
        this.LJLILLLLZI = view;
        this.LJLJI = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        this.LJLIL.LIZIZ(this.LJLILLLLZI, this.LJLJI, valueAnimator.getAnimatedFraction());
    }
}
