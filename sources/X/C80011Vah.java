package X;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vah, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80011Vah implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar LJLIL;

    public C80011Vah(BaseTransientBottomBar baseTransientBottomBar) {
        this.LJLIL = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LIZJ.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}