package X;

import Y.ALAdapterS11S0200000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Vbl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80077Vbl {
    public static MotionEvent LIZIZ(float f, float f2, int i) {
        MotionEvent obtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), i, f, f2, 0);
        o.LJIIIIZZ(obtain, "obtain(System.currentTim…illis(), action, x, y, 0)");
        return obtain;
    }

    public static void LIZ(View targetView, OSZ osz, OSZ osz2, long j, SJI sji, AnimatorListenerAdapter animatorListenerAdapter) {
        o.LJIIIZ(targetView, "targetView");
        if (j <= 0) {
            targetView.dispatchTouchEvent(LIZIZ(((Number) osz.getFirst()).floatValue(), ((Number) osz.getSecond()).floatValue(), 0));
            targetView.dispatchTouchEvent(LIZIZ(((Number) osz2.getFirst()).floatValue(), ((Number) osz2.getSecond()).floatValue(), 2));
            targetView.dispatchTouchEvent(LIZIZ(((Number) osz2.getFirst()).floatValue(), ((Number) osz2.getSecond()).floatValue(), 1));
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(C30021BqL.LIZ, osz, osz2);
        if (sji != null) {
            ofObject.setInterpolator(sji);
        }
        ofObject.addUpdateListener(new AUListenerS101S0100000_14(targetView, 46));
        ofObject.addListener(new ALAdapterS11S0200000_14(targetView, osz2, 8));
        if (animatorListenerAdapter != null) {
            ofObject.addListener(animatorListenerAdapter);
        }
        targetView.dispatchTouchEvent(LIZIZ(((Number) osz.getFirst()).floatValue(), ((Number) osz.getSecond()).floatValue(), 0));
        ofObject.setDuration(j);
        ofObject.start();
    }
}
