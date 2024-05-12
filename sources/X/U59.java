package X;

import Y.IDAListenerS145S0200000_13;
import android.view.View;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U59 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, View view2, InterfaceC65784Pro end) {
        o.LJIIIZ(end, "end");
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setAnimationListener(new IDAListenerS145S0200000_13(view, end, 1));
        translateAnimation.setInterpolator(new InterpolatorC77120UOm(0.65f, 0.0f, 0.35f, 1.0f));
        translateAnimation.setDuration(300L);
        view.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300L);
        translateAnimation2.setInterpolator(new InterpolatorC77120UOm(0.65f, 0.0f, 0.35f, 1.0f));
        view2.startAnimation(translateAnimation2);
    }

    public static void LIZIZ(View view, View view2, InterfaceC65784Pro end) {
        o.LJIIIZ(end, "end");
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setAnimationListener(new IDAListenerS145S0200000_13(view, end, 2));
        translateAnimation.setInterpolator(new InterpolatorC77120UOm(0.65f, 0.0f, 0.35f, 1.0f));
        translateAnimation.setDuration(300L);
        view.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300L);
        translateAnimation2.setInterpolator(new InterpolatorC77120UOm(0.65f, 0.0f, 0.35f, 1.0f));
        view2.startAnimation(translateAnimation2);
    }
}
