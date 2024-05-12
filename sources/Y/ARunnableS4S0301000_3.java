package Y;

import X.C181407Aa;
import X.C201577vd;
import X.C32151Nz;
import X.C61447O9r;
import X.C79488VHo;
import X.InterfaceC65784Pro;
import X.InterpolatorC216808f6;
import X.T59;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS4S0301000_3 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        LinearInterpolator linearInterpolator;
        InterpolatorC216808f6 interpolatorC216808f6;
        ((View) this.l0).setVisibility(0);
        boolean LIZIZ = C79488VHo.LIZIZ();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((View) this.l0, (Property<View, Float>) View.ALPHA, 1.0f);
        C181407Aa c181407Aa = (C181407Aa) this.l1;
        if (LIZIZ) {
            linearInterpolator = (LinearInterpolator) c181407Aa.LIZJ.getValue();
        } else {
            linearInterpolator = new LinearInterpolator();
        }
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(100L);
        ofFloat.setStartDelay(200L);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.i3);
        C181407Aa c181407Aa2 = (C181407Aa) this.l1;
        View view = (View) this.l0;
        if (LIZIZ) {
            interpolatorC216808f6 = (InterpolatorC216808f6) c181407Aa2.LIZLLL.getValue();
        } else {
            interpolatorC216808f6 = new InterpolatorC216808f6(0.65f, 0.0f, 0.35f, 1.0f);
        }
        ofInt.setInterpolator(interpolatorC216808f6);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AUListenerS92S0100000_3(view, 40));
        C181407Aa c181407Aa3 = (C181407Aa) this.l1;
        AnimatorSet animatorSet = new AnimatorSet();
        final View view2 = (View) this.l0;
        final InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.l2;
        final int i = this.i3;
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.7Ab
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                o.LJIIIZ(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                o.LJIIIZ(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                o.LJIIIZ(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                o.LJIIIZ(animator, "animator");
                view2.setAlpha(1.0f);
                View view3 = view2;
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i;
                    view3.setLayoutParams(layoutParams);
                    InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
                    if (interfaceC65784Pro2 != null) {
                        interfaceC65784Pro2.invoke();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        });
        animatorSet.addListener(new IDAListenerS72S0100000_3(interfaceC65784Pro, 53));
        c181407Aa3.LIZ = animatorSet;
        AnimatorSet animatorSet2 = ((C181407Aa) this.l1).LIZ;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final void run$0(ARunnableS4S0301000_3 aRunnableS4S0301000_3) {
        boolean LIZ;
        try {
            ((C201577vd) aRunnableS4S0301000_3.l0).LJJIL((((TextExtraStruct) aRunnableS4S0301000_3.l1).getEnd() - 1) + aRunnableS4S0301000_3.i3, ((TextExtraStruct) aRunnableS4S0301000_3.l1).getEnd() + aRunnableS4S0301000_3.i3, (T59) aRunnableS4S0301000_3.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0301000_3 aRunnableS4S0301000_3) {
        int i = aRunnableS4S0301000_3.i3;
        View view = (View) aRunnableS4S0301000_3.l0;
        View view2 = (View) aRunnableS4S0301000_3.l1;
        View view3 = (View) aRunnableS4S0301000_3.l2;
        int LJIILLIIL = C32151Nz.LJIILLIIL(Integer.valueOf(C61447O9r.LJIIJJI));
        if (i == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.bottomMargin != LJIILLIIL) {
                layoutParams.bottomMargin = LJIILLIIL;
                view.setLayoutParams(layoutParams);
            }
        }
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2.height != LJIILLIIL) {
                layoutParams2.height = LJIILLIIL;
                view2.setLayoutParams(layoutParams2);
            }
        }
        if (view3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
            if (layoutParams3.height != LJIILLIIL) {
                layoutParams3.height = LJIILLIIL;
                layoutParams3.topMargin = -LJIILLIIL;
                view3.setLayoutParams(layoutParams3);
            }
        }
    }

    public static final void run$2(ARunnableS4S0301000_3 aRunnableS4S0301000_3) {
        boolean LIZ;
        try {
            aRunnableS4S0301000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S0301000_3(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
