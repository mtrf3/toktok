package X;

import Y.ALAdapterS1S0210000_5;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.HyJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45803HyJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, boolean z) {
        TimeInterpolator c81271Vv1;
        float f;
        ViewPropertyAnimator duration = view.animate().setDuration(300L);
        if (z) {
            c81271Vv1 = new C81269Vuz();
        } else {
            c81271Vv1 = new C81271Vv1();
        }
        ViewPropertyAnimator interpolator = duration.setInterpolator(c81271Vv1);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        interpolator.alpha(f).setListener(new ALAdapterS1S0210000_5(null, view, z, 1)).start();
    }
}
