package X;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.4Bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105434Bv {
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
