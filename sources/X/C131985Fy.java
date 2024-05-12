package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: X.5Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131985Fy {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public Animator.AnimatorListener LJFF;
    public float LJI = 80.0f;

    public final void LIZ(boolean z) {
        float f;
        float f2;
        float f3;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        AnimatorSet animatorSet = new AnimatorSet();
        float f4 = 1.0f;
        if (z) {
            f = 0.0f;
            f2 = this.LJI;
            f3 = 0.0f;
        } else {
            f = 1.0f;
            f4 = 0.0f;
            f2 = 0.0f;
            f3 = this.LJI;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZ, "alpha", f, f4);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.LIZ.setTranslationY(0.0f);
        this.LIZ.setAlpha(f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LIZLLL, "alpha", f, f4);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.LIZLLL.setTranslationY(0.0f);
        this.LIZLLL.setAlpha(f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LIZIZ, "translationY", f2, f3);
        ofFloat3.setDuration(250L);
        ofFloat3.setInterpolator(new SJI());
        this.LIZIZ.setTranslationY(f2);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", f, f4);
        ofFloat4.setDuration(250L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        this.LIZIZ.setAlpha(f);
        View view = this.LJ;
        if (view != null) {
            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", f2, f3);
            objectAnimator.setInterpolator(new SJI());
            objectAnimator.setDuration(250L);
            view.setTranslationY(f2);
        } else {
            objectAnimator = null;
        }
        View view2 = this.LJ;
        if (view2 != null) {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, "alpha", f, f4);
            objectAnimator2.setInterpolator(new LinearInterpolator());
            objectAnimator2.setDuration(250L);
            view2.setAlpha(f);
        } else {
            objectAnimator2 = null;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LIZJ, "translationY", f2, f3);
        ofFloat5.setDuration(250L);
        ofFloat5.setInterpolator(new SJI());
        this.LIZJ.setTranslationY(f2);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LIZJ, "alpha", f, f4);
        ofFloat6.setDuration(250L);
        ofFloat6.setInterpolator(new LinearInterpolator());
        this.LIZJ.setAlpha(f);
        AnimatorSet.Builder with = animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat5).with(ofFloat6).with(ofFloat3).with(ofFloat4);
        if (this.LJ != null) {
            with.with(objectAnimator);
            with.with(objectAnimator2);
        }
        Animator.AnimatorListener animatorListener = this.LJFF;
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
    }

    public C131985Fy(View view, View view2, View view3, View view4, View view5) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        this.LIZLLL = view4;
        this.LJ = view5;
    }
}
