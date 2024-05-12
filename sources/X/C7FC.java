package X;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7FC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7FC {
    public static void LIZIZ(View view) {
        LIZJ(view, 0.5f);
    }

    public static void LIZJ(View view, final float f) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.7FD
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        C7FC.LIZ(f, view2, false);
                    }
                } else {
                    C7FC.LIZ(f, view2, true);
                }
                return false;
            }
        });
    }

    public static void LIZ(float f, View view, boolean z) {
        float f2;
        float[] fArr = new float[2];
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        fArr[0] = f2;
        if (!z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }
}
