package X;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.aQx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93443aQx {
    public static ObjectAnimator LIZ(View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = view.getHeight();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = view.getHeight();
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
        ofFloat.setDuration(350L);
        ofFloat.setInterpolator(C94010aa6.LIZ());
        return ofFloat;
    }
}
