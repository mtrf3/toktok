package Y;

import X.JBQ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ALAdapterS0S0220000_8 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
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
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0220000_8 aLAdapterS0S0220000_8, Animator animation) {
        SmartImageView smartImageView;
        o.LJIIIZ(animation, "animation");
        View view = (View) aLAdapterS0S0220000_8.l0;
        if (view != null) {
            view.setVisibility(8);
        }
        if (!aLAdapterS0S0220000_8.z2 || aLAdapterS0S0220000_8.z3 || (smartImageView = ((JBQ) aLAdapterS0S0220000_8.l1).LJLJI) == null) {
            return;
        }
        smartImageView.setVisibility(8);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0220000_8 aLAdapterS0S0220000_8, Animator animation) {
        SmartImageView smartImageView;
        o.LJIIIZ(animation, "animation");
        View view = (View) aLAdapterS0S0220000_8.l0;
        if (view != null) {
            view.setVisibility(0);
        }
        if (!aLAdapterS0S0220000_8.z2 || !aLAdapterS0S0220000_8.z3 || (smartImageView = ((JBQ) aLAdapterS0S0220000_8.l1).LJLJI) == null) {
            return;
        }
        smartImageView.setVisibility(0);
    }

    public ALAdapterS0S0220000_8(View view, boolean z, boolean z2, JBQ jbq, int i) {
        this.$t = i;
        this.l0 = view;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = jbq;
    }
}
