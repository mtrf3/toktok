package Y;

import X.C93463aRH;
import X.C93635aU3;
import X.C93782aWQ;
import X.C93788aWW;
import X.C93882aY2;
import X.C94152acO;
import X.C94855anj;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment$initAction$1;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDUListenerS265S0100000_42 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public IDUListenerS265S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator valueAnimator) {
        ((BehaviourEditFragment$initAction$1) iDUListenerS265S0100000_42.l0).LJLIL.Ml();
    }

    public static final void onAnimationUpdate$1(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        C93463aRH c93463aRH = (C93463aRH) iDUListenerS265S0100000_42.l0;
        o.LJIIIIZZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            c93463aRH.LJLJJI = ((Float) animatedValue).floatValue();
            ((C93463aRH) iDUListenerS265S0100000_42.l0).invalidate();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    public static final void onAnimationUpdate$10(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator animator) {
        double d;
        o.LJIIIZ(animator, "animator");
        try {
            int parseInt = CastIntegerProtector.parseInt(animator.getAnimatedValue().toString());
            float f = parseInt % 1000;
            if (parseInt > 5000) {
                d = 1 - (f / LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                if (parseInt == 5500) {
                    ((C93882aY2) iDUListenerS265S0100000_42.l0).LIZ();
                }
            } else {
                d = f < 300 ? ((f / r1) * 0.7d) + 0.3d : 1 - (((f - r1) / 700) * 0.7d);
            }
            View view = ((C93882aY2) iDUListenerS265S0100000_42.l0).LIZIZ;
            if (view != null) {
                view.setAlpha((float) d);
            } else {
                o.LJIJI("flAnimContainer");
                throw null;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static final void onAnimationUpdate$2(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        ViewGroup.LayoutParams layoutParams = ((C94152acO) iDUListenerS265S0100000_42.l0).LJLLILLLL.LIZ().getLayoutParams();
        o.LJIIIIZZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            layoutParams.height = ((Integer) animatedValue).intValue();
            ((C94152acO) iDUListenerS265S0100000_42.l0).requestLayout();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public static final void onAnimationUpdate$3(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) iDUListenerS265S0100000_42.l0).getLayoutParams();
        o.LJIIIIZZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            layoutParams.height = ((Integer) animatedValue).intValue();
            ((LinearLayout) iDUListenerS265S0100000_42.l0).requestLayout();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public static final void onAnimationUpdate$4(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator valueAnimator) {
        ((C93635aU3) iDUListenerS265S0100000_42.l0).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$5(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        C93782aWQ c93782aWQ = (C93782aWQ) iDUListenerS265S0100000_42.l0;
        o.LJIIIIZZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            c93782aWQ.LJLJI = ((Float) animatedValue).floatValue();
            ((C93782aWQ) iDUListenerS265S0100000_42.l0).invalidate();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    public static final void onAnimationUpdate$6(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        Drawable drawable = ((C93788aWW) iDUListenerS265S0100000_42.l0).LJLJI;
        if (drawable != null) {
            o.LJIIIIZZ(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue != null) {
                drawable.setAlpha(((Integer) animatedValue).intValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public static final void onAnimationUpdate$7(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        Drawable drawable = ((C93788aWW) iDUListenerS265S0100000_42.l0).LJLJI;
        if (drawable != null) {
            o.LJIIIIZZ(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue != null) {
                drawable.setAlpha(((Integer) animatedValue).intValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public static final void onAnimationUpdate$8(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        ViewGroup.LayoutParams layoutParams;
        RecyclerView recyclerView = ((C94855anj) iDUListenerS265S0100000_42.l0).LJZL().get();
        if (recyclerView != null && (layoutParams = recyclerView.getLayoutParams()) != null) {
            o.LJIIIIZZ(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.width = ((Integer) animatedValue).intValue();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        RecyclerView recyclerView2 = ((C94855anj) iDUListenerS265S0100000_42.l0).LJZL().get();
        if (recyclerView2 != null) {
            recyclerView2.requestLayout();
        }
    }

    public static final void onAnimationUpdate$9(IDUListenerS265S0100000_42 iDUListenerS265S0100000_42, ValueAnimator it) {
        ViewGroup.LayoutParams layoutParams;
        RecyclerView recyclerView = ((C94855anj) iDUListenerS265S0100000_42.l0).LJZL().get();
        if (recyclerView != null && (layoutParams = recyclerView.getLayoutParams()) != null) {
            o.LJIIIIZZ(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.width = ((Integer) animatedValue).intValue();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        RecyclerView recyclerView2 = ((C94855anj) iDUListenerS265S0100000_42.l0).LJZL().get();
        if (recyclerView2 != null) {
            recyclerView2.requestLayout();
        }
    }
}
