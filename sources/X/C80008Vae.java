package X;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vae, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80008Vae implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar LJLIL;

    public C80008Vae(BaseTransientBottomBar baseTransientBottomBar) {
        this.LJLIL = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.LJLIL.LIZJ.setScaleX(floatValue);
        this.LJLIL.LIZJ.setScaleY(floatValue);
    }
}
