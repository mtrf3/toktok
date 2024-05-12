package X;

import Y.IDTListenerS70S0000000_14;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Wdc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82740Wdc {
    public static void LIZIZ(View view) {
        view.setOnTouchListener(new IDTListenerS70S0000000_14(0));
    }

    public static void LIZJ(View view) {
        view.setOnTouchListener(new IDTListenerS70S0000000_14(1));
    }

    public static void LIZ(View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.5f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }

    public static void LIZLLL(View view, boolean z) {
        float f;
        ViewPropertyAnimator animate = view.animate();
        float f2 = 1.2f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f);
        if (!z) {
            f2 = 1.0f;
        }
        scaleX.scaleY(f2).setDuration(100L).start();
    }
}
