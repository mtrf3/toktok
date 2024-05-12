package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.9ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251349ti {
    public boolean LIZ;
    public final C251009tA LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;

    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZJ, "scaleX", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LIZJ, "scaleY", 1.0f, 0.0f);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LIZJ, "alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.addListener(new C251319tf() { // from class: X.9tj
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                C251349ti.this.LIZJ.setVisibility(8);
                C251349ti.this.LIZIZ.setCanDrag(true);
            }
        });
        animatorSet.start();
    }

    public C251349ti(C251009tA c251009tA, View longBubbleLayout, View view) {
        o.LJIIIZ(longBubbleLayout, "longBubbleLayout");
        this.LIZIZ = c251009tA;
        this.LIZJ = longBubbleLayout;
        this.LIZLLL = view;
        this.LIZ = true;
    }
}
