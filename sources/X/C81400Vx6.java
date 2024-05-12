package X;

import Y.ALAdapterS11S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vx6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81400Vx6 implements Animator.AnimatorListener {
    public final ViewGroup LJLIL;
    public final EnumC81402Vx8 LJLILLLLZI;
    public final C29701Eo LJLJI;
    public ValueAnimator LJLJJI;
    public final long LJLJJL;
    public final float LJLJJLL;
    public final long LJLJL;
    public final long LJLJLJ;
    public final long LJLJLLL;
    public float LJLL;
    public InterfaceC88471Ynr<? super Float, ? super Float, C76800UCe> LJLLI;
    public InterfaceC65784Pro<C76800UCe> LJLLILLLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    public final void LIZIZ() {
        int i = C81401Vx7.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            VJH vjh = C81434Vxe.LIZ;
            if (vjh.LIZIZ == null) {
                vjh.LIZIZ = vjh.LIZ.edit();
            }
            vjh.LIZIZ.putBoolean("duet_layout_three_screen_drag_gesture_hint", false).apply();
            return;
        }
        VJH vjh2 = C81434Vxe.LIZ;
        if (vjh2.LIZIZ == null) {
            vjh2.LIZIZ = vjh2.LIZ.edit();
        }
        vjh2.LIZIZ.putBoolean("duet_layout_up_down_drag_gesture_hint", false).apply();
    }

    public final void LIZJ() {
        int i = C81401Vx7.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2 || !C81434Vxe.LIZ.LIZ.getBoolean("duet_layout_three_screen_drag_gesture_hint", true)) {
                return;
            } else {
                this.LJLL = (-this.LJLJJLL) / 3;
            }
        } else if (!C81434Vxe.LIZ.LIZ.getBoolean("duet_layout_up_down_drag_gesture_hint", true)) {
            return;
        } else {
            this.LJLL = (-this.LJLJJLL) / 4;
        }
        this.LJLJI.setTranslationY(this.LJLL);
        this.LJLJI.removeAllAnimatorListeners();
        this.LJLJI.addAnimatorListener(this);
        this.LJLJI.setAnimation("duet_layout_drag_lottie_mt.json");
        this.LJLJI.setRepeatCount(1);
        this.LJLJI.setRepeatMode(1);
        this.LJLJI.postDelayed(new ARunnableS50S0100000_14(this, 246), this.LJLJLLL);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, -this.LJLIL.getContext().getResources().getDimension(R.dimen.of)).setDuration(this.LJLJJL);
        duration.removeAllUpdateListeners();
        this.LJLJJI = duration;
        duration.addUpdateListener(new AUListenerS101S0100000_14(this, 57));
    }

    public final void LIZLLL() {
        ValueAnimator valueAnimator = this.LJLJJI;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.LJLJI.removeAllAnimatorListeners();
        this.LJLJI.cancelAnimation();
        this.LJLJI.setVisibility(8);
        LIZIZ();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(this.LJLJLJ);
        duration.removeAllUpdateListeners();
        duration.addUpdateListener(new AUListenerS101S0100000_14(this, 56));
        duration.addListener(new ALAdapterS11S0100000_14(this, 55));
        duration.start();
        LIZIZ();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLJI.pauseAnimation();
        this.LJLJI.postDelayed(new ARunnableS50S0100000_14(this, 245), this.LJLJLLL);
    }

    public C81400Vx6(ViewGroup viewGroup, EnumC81402Vx8 mLayoutMode) {
        o.LJIIIZ(mLayoutMode, "mLayoutMode");
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = mLayoutMode;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.crc, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        C29701Eo c29701Eo = (C29701Eo) LLLLIILL;
        this.LJLJI = c29701Eo;
        this.LJLJJL = 880L;
        this.LJLJL = 680L;
        this.LJLJLJ = 520L;
        this.LJLJLLL = 300L;
        viewGroup.addView(c29701Eo);
        this.LJLJJLL = AnonymousClass668.LIZIZ().LJFF();
    }
}
