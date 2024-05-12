package X;

import Y.ARunnableS41S0100000_5;
import android.graphics.drawable.Animatable;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.Csu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32728Csu extends C31073CHl {
    public final /* synthetic */ C32727Cst LJLJL;

    @Override // X.C31073CHl
    public final void LJ(int i, int i2) {
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
    }

    public C32728Csu(C32727Cst c32727Cst) {
        this.LJLJL = c32727Cst;
    }

    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator withEndAction;
        o.LJIIIZ(anim, "anim");
        InterpolatorC22990vH interpolatorC22990vH = new InterpolatorC22990vH(0.4f, 0.8f, 0.74f, 1.0f);
        ImageView imageView = this.LJLJL.LLIIII;
        if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(240L)) != null && (interpolator = duration.setInterpolator(interpolatorC22990vH)) != null && (startDelay = interpolator.setStartDelay(1000L)) != null && (withEndAction = startDelay.withEndAction(new ARunnableS41S0100000_5(this.LJLJL, 212))) != null) {
            withEndAction.start();
        }
    }
}
