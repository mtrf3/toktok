package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.Vrw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81080Vrw extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ C81078Vru LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        this.LJLIL.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (this.LJLILLLLZI) {
            C81078Vru c81078Vru = this.LJLJI;
            c81078Vru.LJLJJL = 0.0f;
            c81078Vru.LJLJL = 0.0f;
            InterfaceC81086Vs2 interfaceC81086Vs2 = c81078Vru.LJLL;
            if (interfaceC81086Vs2 != null) {
                interfaceC81086Vs2.LIZ(1.0f);
            }
            this.LJLJI.invalidate();
            C81078Vru c81078Vru2 = this.LJLJI;
            c81078Vru2.LJLLI.reset();
            c81078Vru2.LIZIZ();
            c81078Vru2.LJLLILLLL = 0;
            c81078Vru2.LJLLL.set(0.0f, 0.0f);
            c81078Vru2.LJLLLL.set(0.0f, 0.0f);
            c81078Vru2.LJLLLLLL = 0.0f;
            c81078Vru2.LIZ();
            c81078Vru2.invalidate();
        }
        this.LJLILLLLZI = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLILLLLZI = true;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        if (this.LJLILLLLZI) {
            C81078Vru c81078Vru = this.LJLJI;
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c81078Vru.LJLJJL = ((Float) animatedValue).floatValue();
            C81078Vru c81078Vru2 = this.LJLJI;
            c81078Vru2.LJLJJLL = c81078Vru2.LJLJJL;
        }
    }

    public C81080Vrw(C81078Vru c81078Vru, float f) {
        this.LJLJI = c81078Vru;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(start, end)");
        this.LJLIL = ofFloat;
        ofFloat.addListener(this);
        ofFloat.addUpdateListener(this);
    }
}
