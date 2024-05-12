package X;

import Y.ARunnableS5S0301000_4;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.9gU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243149gU {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C243139gT.INSTANCE);
    public static Runnable LIZIZ;

    public static Handler LIZ() {
        return (Handler) LIZ.getValue();
    }

    public static Rect LIZIZ(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
        return rect;
    }

    public static void LIZJ(ConstraintLayout constraintLayout, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ARunnableS5S0301000_4 aRunnableS5S0301000_4 = new ARunnableS5S0301000_4(1, constraintLayout, animatorUpdateListener, animatorListener, 1);
        LIZIZ = aRunnableS5S0301000_4;
        LIZ().removeCallbacksAndMessages(null);
        LIZ().postDelayed(aRunnableS5S0301000_4, 0L);
    }
}
