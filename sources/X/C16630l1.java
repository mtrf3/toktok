package X;

import android.view.ViewPropertyAnimator;

/* renamed from: X.0l1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16630l1 {
    public static ViewPropertyAnimator LIZIZ(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.withLayer();
    }

    public static ViewPropertyAnimator LIZ(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
        return viewPropertyAnimator.withEndAction(runnable);
    }

    public static ViewPropertyAnimator LIZJ(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
        return viewPropertyAnimator.withStartAction(runnable);
    }
}
