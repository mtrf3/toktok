package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6DF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DF {
    public static final C139355dT LIZ = new C139355dT();

    public static void LIZ(View view) {
        o.LJIIIZ(view, "view");
        C139355dT c139355dT = LIZ;
        if (c139355dT.LIZ.getBoolean("read_text_guide_shown_v2", false)) {
            return;
        }
        c139355dT.LIZ.storeBoolean("read_text_guide_shown_v2", true);
        LIZIZ(view);
    }

    public static void LIZIZ(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
        o.LJIIIIZZ(duration, "ofFloat(view, View.ROTAT…       .setDuration(1000)");
        duration.setInterpolator(new TimeInterpolator() { // from class: X.6DI
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2;
                if ((0.0f <= f && f <= 0.18f) || (0.18f <= f && f <= 0.36f)) {
                    return f * 1.11f;
                }
                if (0.36f <= f && f <= 0.56f) {
                    f2 = 0.04f;
                } else {
                    if (0.56f > f || f > 0.8f) {
                        return f;
                    }
                    f *= 0.833f;
                    f2 = 0.1336f;
                }
                return f + f2;
            }
        });
        animatorSet.play(duration).after(duration.clone()).after(1500L);
        animatorSet.start();
    }
}
