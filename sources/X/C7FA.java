package X;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7FA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7FA {
    public static void LIZIZ(View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.7FB
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        C7FA.LIZ(view2, false);
                    }
                } else {
                    C7FA.LIZ(view2, true);
                }
                return false;
            }
        });
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
}
