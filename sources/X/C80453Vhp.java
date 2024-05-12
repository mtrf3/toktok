package X;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Vhp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80453Vhp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior LJLIL;

    public C80453Vhp(BottomSheetBehavior bottomSheetBehavior) {
        this.LJLIL = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C80418VhG c80418VhG = this.LJLIL.materialShapeDrawable;
        if (c80418VhG != null) {
            c80418VhG.LJIIL(floatValue);
        }
    }
}
