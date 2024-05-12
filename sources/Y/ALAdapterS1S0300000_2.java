package Y;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ALAdapterS1S0300000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

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
            case 1:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0300000_2 aLAdapterS1S0300000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0300000_2 aLAdapterS1S0300000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = (View) aLAdapterS1S0300000_2.l0;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = (View) aLAdapterS1S0300000_2.l1;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ((InterfaceC65784Pro) aLAdapterS1S0300000_2.l2).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0300000_2 aLAdapterS1S0300000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Drawable drawable = (Drawable) aLAdapterS1S0300000_2.l2;
        if (drawable != null) {
            ImageView imageView = (ImageView) aLAdapterS1S0300000_2.l0;
            imageView.setAlpha(1.0f);
            imageView.setBackground(drawable);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS1S0300000_2 aLAdapterS1S0300000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ImageView) aLAdapterS1S0300000_2.l0).setBackground((Drawable) aLAdapterS1S0300000_2.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS1S0300000_2(Object obj, View view, View view2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = view;
        this.l2 = view2;
    }
}
