package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: X.6zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178596zf {
    public static void LIZ(float f, float f2, View view) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    public static void LIZIZ(View view, float f, float f2, long j) {
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
