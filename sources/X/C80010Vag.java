package X;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vag, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80010Vag implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar LJLIL;

    public C80010Vag(BaseTransientBottomBar baseTransientBottomBar) {
        this.LJLIL = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LIZJ.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
