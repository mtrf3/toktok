package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: X.4Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105624Co {
    public static void LIZ(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
        AnimatorSet LIZ = C1DD.LIZ(700L);
        LIZ.setInterpolator(new Interpolator() { // from class: X.4Cr
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (float) ((Math.sin(((f - (0.4f / 4)) * 6.283185307179586d) / 0.4f) * Math.pow(2.0d, (-10) * f)) + 1);
            }
        });
        LIZ.playTogether(ofFloat, ofFloat2);
        LIZ.start();
    }
}
