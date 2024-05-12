package X;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.YLr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87239YLr implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public C87239YLr(View view, float f) {
        this.LJLIL = view;
        this.LJLILLLLZI = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.setTranslationY(it.getAnimatedFraction() * this.LJLILLLLZI);
    }
}
