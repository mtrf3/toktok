package X;

import Y.IDTListenerS68S0000000_1;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;

/* renamed from: X.3xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101073xv {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static void LIZIZ(View view) {
        view.setOnTouchListener(new IDTListenerS68S0000000_1(1));
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
