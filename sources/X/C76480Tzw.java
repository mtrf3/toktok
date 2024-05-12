package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76480Tzw {
    public static Animator LIZ;

    public static void LIZ(View view) {
        o.LJIIIZ(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(260L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ofFloat.addListener(new C76499U0p());
        ofFloat.start();
        LIZ = ofFloat;
    }
}
