package Y;

import X.C74051T4l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ALAdapterS1S0101000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0101000_12 aLAdapterS1S0101000_12, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C74051T4l) aLAdapterS1S0101000_12.l0).setSelectedPosition(aLAdapterS1S0101000_12.i1);
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0101000_12 aLAdapterS1S0101000_12, Animator animation) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS1S0101000_12.i1 > 0) {
            ViewGroup.LayoutParams layoutParams = ((ViewGroup) aLAdapterS1S0101000_12.l0).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int i = aLAdapterS1S0101000_12.i1;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.leftMargin = i;
            }
            ((ViewGroup) aLAdapterS1S0101000_12.l0).requestLayout();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS1S0101000_12 aLAdapterS1S0101000_12, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C74051T4l) aLAdapterS1S0101000_12.l0).setSelectedPosition(aLAdapterS1S0101000_12.i1);
    }

    public static final void onAnimationStart$1(ALAdapterS1S0101000_12 aLAdapterS1S0101000_12, Animator animation) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS1S0101000_12.i1 > 0) {
            ViewGroup.LayoutParams layoutParams = ((ViewGroup) aLAdapterS1S0101000_12.l0).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.leftMargin = 0;
            }
            ((ViewGroup) aLAdapterS1S0101000_12.l0).requestLayout();
        }
    }

    public ALAdapterS1S0101000_12(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
