package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.KTo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51772KTo extends Visibility {
    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        o.LJIIIZ(sceneRoot, "sceneRoot");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(startValues, "startValues");
        o.LJIIIZ(endValues, "endValues");
        return null;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        o.LJIIIZ(sceneRoot, "sceneRoot");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(startValues, "startValues");
        o.LJIIIZ(endValues, "endValues");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", C17N.LJIILL(20.0d), 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
