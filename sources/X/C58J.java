package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.58J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58J {
    public final View LIZ;
    public final ViewPropertyAnimator LIZIZ;
    public float LIZJ;
    public final float LIZLLL;
    public float LJ;
    public float LJFF;
    public long LJI;
    public long LJII;
    public TimeInterpolator LJIIIIZZ;
    public Animator.AnimatorListener LJIIIZ;

    public final void LIZ() {
        this.LIZIZ.rotation(0.0f);
        this.LIZIZ.translationX(0.0f);
        this.LIZIZ.translationY(this.LIZJ);
        this.LIZIZ.scaleX(this.LIZLLL);
        this.LIZIZ.scaleY(this.LJ);
        this.LIZIZ.alpha(this.LJFF);
        this.LIZIZ.setStartDelay(this.LJII);
        long j = this.LJI;
        if (j != 0) {
            this.LIZIZ.setDuration(j);
        }
        TimeInterpolator timeInterpolator = this.LJIIIIZZ;
        if (timeInterpolator != null) {
            this.LIZIZ.setInterpolator(timeInterpolator);
        }
        Animator.AnimatorListener animatorListener = this.LJIIIZ;
        if (animatorListener != null) {
            this.LIZIZ.setListener(animatorListener);
        }
        this.LIZIZ.start();
    }

    public C58J(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = view.animate();
        this.LIZLLL = 1.0f;
        this.LJ = 1.0f;
        this.LJFF = 1.0f;
    }
}
