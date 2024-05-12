package X;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.LTd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54309LTd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C54309LTd(int i, View view, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = view;
        this.LJLJI = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        float f;
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int i = this.LJLIL;
        int i2 = (int) (i - (i * animatedFraction));
        View view = this.LJLILLLLZI;
        if (this.LJLJI) {
            f = i2;
        } else {
            f = animatedFraction * (-i);
        }
        view.setTranslationY(f);
    }
}
