package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.9tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251389tm {
    public boolean LIZ;
    public boolean LIZIZ;
    public final C250999t9 LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;

    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJ, "scaleX", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJ, "scaleY", 1.0f, 0.0f);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJ, "alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.addListener(new C251319tf() { // from class: X.9tn
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                float f;
                o.LJIIIZ(animation, "animation");
                C251389tm.this.LJ.setVisibility(8);
                C251389tm c251389tm = C251389tm.this;
                View view = c251389tm.LIZLLL;
                Context context = view.getContext();
                float f2 = 0.0f;
                if (context != null) {
                    Resources resources = context.getResources();
                    o.LJIIIIZZ(resources, "context.resources");
                    f = (20.0f * resources.getDisplayMetrics().density) + 0.5f;
                } else {
                    f = 0.0f;
                }
                view.setPivotX(f);
                View view2 = c251389tm.LIZLLL;
                Context context2 = view2.getContext();
                if (context2 != null) {
                    Resources resources2 = context2.getResources();
                    o.LJIIIIZZ(resources2, "context.resources");
                    f2 = (25.0f * resources2.getDisplayMetrics().density) + 0.5f;
                }
                view2.setPivotY(f2);
                final AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(c251389tm.LIZLLL, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(c251389tm.LIZLLL, "scaleY", 1.3f, 1.0f));
                animatorSet2.setDuration(297L);
                animatorSet2.addListener(new C251449ts(c251389tm));
                animatorSet2.setTarget(c251389tm.LIZLLL);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c251389tm.LIZLLL, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(c251389tm.LIZLLL, "scaleY", 0.0f, 1.3f));
                animatorSet3.setDuration(528L);
                animatorSet3.addListener(new C251319tf() { // from class: X.9tu
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation2) {
                        o.LJIIIZ(animation2, "animation");
                        animatorSet2.start();
                    }
                });
                animatorSet3.setTarget(c251389tm.LIZLLL);
                c251389tm.LIZLLL.setVisibility(0);
                animatorSet3.start();
                c251389tm.LIZIZ = false;
            }
        });
        animatorSet.start();
    }

    public C251389tm(C250999t9 c250999t9, View view, View longBubbleLayout, View view2) {
        o.LJIIIZ(longBubbleLayout, "longBubbleLayout");
        this.LIZJ = c250999t9;
        this.LIZLLL = view;
        this.LJ = longBubbleLayout;
        this.LJFF = view2;
        this.LIZ = true;
        this.LIZIZ = true;
    }
}
