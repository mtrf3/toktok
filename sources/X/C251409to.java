package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.9to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251409to {
    public boolean LIZ;
    public final C250999t9 LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final int LJ;

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
        animatorSet.addListener(new C251319tf() { // from class: X.9tp
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                C251409to.this.LIZJ.setVisibility(8);
                C251409to.this.LIZIZ.setCanDrag(true);
            }
        });
        animatorSet.start();
    }

    public final void LIZIZ() {
        this.LIZIZ.setCanDrag(false);
        View view = this.LIZJ;
        view.setPivotX(0.0f);
        view.setPivotY(this.LIZLLL.getHeight() / 2.0f);
        view.setVisibility(0);
        this.LIZ = false;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZJ, "scaleX", 0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LIZJ, "scaleY", 0.0f, 1.0f);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LIZJ, "alpha", 0.0f, 1.0f);
        ofFloat3.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.addListener(new C251429tq(this));
        animatorSet.start();
    }

    public C251409to(C250999t9 c250999t9, View longBubbleLayout, View view, int i) {
        o.LJIIIZ(longBubbleLayout, "longBubbleLayout");
        this.LIZIZ = c250999t9;
        this.LIZJ = longBubbleLayout;
        this.LIZLLL = view;
        this.LJ = i;
        this.LIZ = true;
    }
}
