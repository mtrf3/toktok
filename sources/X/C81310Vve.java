package X;

import Y.ALAdapterS11S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.AUListenerS101S0100000_14;
import Y.IDAListenerS81S0100000_14;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vve, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81310Vve {
    public final View LIZ;
    public boolean LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public Animator LJII;
    public final ALAdapterS11S0100000_14 LJIIIIZZ;
    public final C30901Je LJIIIZ;
    public final ValueAnimator LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final ARunnableS50S0100000_14 LJIILJJIL;
    public EnumC81311Vvf LJIILL;
    public final LinearInterpolator LJIILLIIL;

    public final void LIZ() {
        float f;
        if (this.LJIILL == EnumC81311Vvf.SHOWN) {
            this.LIZ.removeCallbacks(this.LJIILJJIL);
            Animator animator = this.LJII;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimator = (ValueAnimator) this.LJIILIIL.getValue();
            valueAnimator.setFloatValues(this.LJ, this.LJFF);
            float f2 = this.LIZJ;
            float f3 = this.LJ;
            float f4 = this.LJFF;
            if (f4 == f3) {
                f = 0.0f;
            } else {
                f = (f2 - f3) / (f4 - f3);
            }
            if (Build.VERSION.SDK_INT >= 22) {
                TimeInterpolator interpolator = valueAnimator.getInterpolator();
                valueAnimator.setInterpolator(this.LJIILLIIL);
                valueAnimator.setCurrentFraction(f);
                valueAnimator.setInterpolator(interpolator);
            }
            valueAnimator.start();
            this.LJII = valueAnimator;
        }
    }

    public C81310Vve(View target, boolean z) {
        o.LJIIIZ(target, "target");
        this.LIZ = target;
        this.LIZIZ = z;
        this.LIZLLL = 1.0f;
        this.LJFF = 0.5f;
        this.LJI = 1.0f;
        ALAdapterS11S0100000_14 aLAdapterS11S0100000_14 = new ALAdapterS11S0100000_14(this, 28);
        this.LJIIIIZZ = aLAdapterS11S0100000_14;
        C30901Je c30901Je = new C30901Je();
        this.LJIIIZ = c30901Je;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(c30901Je);
        ofFloat.addListener(aLAdapterS11S0100000_14);
        ofFloat.addListener(new IDAListenerS81S0100000_14(this, 9));
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 26));
        this.LJIIJ = ofFloat;
        this.LJIIJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 344));
        this.LJIIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 343));
        this.LJIILIIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 342));
        this.LJIILJJIL = new ARunnableS50S0100000_14(this, 182);
        this.LJIILL = EnumC81311Vvf.UNKNOWN;
        this.LJIILLIIL = new LinearInterpolator();
    }
}
