package X;

import Y.ARunnableS45S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LUH extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ LUF LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        LUF luf;
        C62846OlW c62846OlW;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (this.LJLIL) {
            LUF luf2 = this.LJLILLLLZI;
            C62846OlW c62846OlW2 = luf2.LIZLLL;
            if (c62846OlW2 == null) {
                luf2.getClass();
            } else {
                luf2.LJI();
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c62846OlW2, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.9f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.9f, 1.0f));
                luf2.LJI = ofPropertyValuesHolder;
                if (ofPropertyValuesHolder != null) {
                    ofPropertyValuesHolder.setInterpolator(new SJI());
                }
                ObjectAnimator objectAnimator = luf2.LJI;
                if (objectAnimator != null) {
                    objectAnimator.setDuration(2000L);
                }
                ObjectAnimator objectAnimator2 = luf2.LJI;
                if (objectAnimator2 != null) {
                    objectAnimator2.setRepeatCount(2);
                }
                ObjectAnimator objectAnimator3 = luf2.LJI;
                if (objectAnimator3 != null) {
                    objectAnimator3.setRepeatMode(1);
                }
                ObjectAnimator objectAnimator4 = luf2.LJI;
                if (objectAnimator4 != null) {
                    objectAnimator4.start();
                }
            }
        }
        if (this.LJLJI && (c62846OlW = (luf = this.LJLILLLLZI).LIZLLL) != null) {
            c62846OlW.postDelayed(new ARunnableS45S0100000_9(luf, 238), 5000L);
        }
    }

    public LUH(boolean z, LUF luf, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = luf;
        this.LJLJI = z2;
    }
}
