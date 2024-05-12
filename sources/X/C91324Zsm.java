package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.Zsm, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91324Zsm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C91325Zsn LJLIL;
    public final /* synthetic */ C91476ZvE LJLILLLLZI;

    public C91324Zsm(C91325Zsn c91325Zsn, C91476ZvE c91476ZvE) {
        this.LJLIL = c91325Zsn;
        this.LJLILLLLZI = c91476ZvE;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.LIZLLL = it.getAnimatedFraction();
        this.LJLILLLLZI.invalidate();
    }
}
