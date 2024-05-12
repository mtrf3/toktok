package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Vgt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80395Vgt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View LJLIL;

    public C80395Vgt(View view) {
        this.LJLIL = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.invalidate();
    }
}
