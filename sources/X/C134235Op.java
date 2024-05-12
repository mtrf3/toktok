package X;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: X.5Op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134235Op {
    public static void LIZIZ(final View view, final float f) {
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.5Oq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                View view3 = view;
                float f2 = f;
                if (motionEvent.getAction() == 0) {
                    C134235Op.LIZ(1.0f, f2, view3);
                    return false;
                }
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return false;
                }
                C134235Op.LIZ(f2, 1.0f, view3);
                return false;
            }
        });
    }

    public static void LIZ(float f, float f2, View view) {
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
