package X;

import Y.IDAListenerS228S0100000;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.0U2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U2 {
    public static final void LIZ(View view) {
        o.LJIIIZ(view, "<this>");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(350L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setAnimationListener(new IDAListenerS228S0100000(view, 2));
        view.startAnimation(alphaAnimation);
    }
}
