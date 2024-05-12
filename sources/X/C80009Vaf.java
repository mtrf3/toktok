package X;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vaf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80009Vaf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar LJLIL;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LIZJ.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public C80009Vaf(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.LJLIL = baseTransientBottomBar;
    }
}
