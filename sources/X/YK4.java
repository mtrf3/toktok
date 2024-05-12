package X;

import Y.ALAdapterS12S0200000_15;
import Y.AUListenerS104S0200000_15;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YK4 {
    public final C30020BqK LIZ;
    public final C30020BqK LIZIZ;
    public final ValueAnimator LIZJ;
    public final ValueAnimator LIZLLL;
    public final Animator LJ;
    public final Animator LJFF;
    public final Animator LJI;
    public final RectF LJII;
    public final RectF LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public Bitmap LJIILIIL;
    public final /* synthetic */ YK3 LJIILJJIL;

    public YK4(YK3 yk3) {
        AnimatorSet animatorSet;
        this.LJIILJJIL = yk3;
        C30020BqK c30020BqK = new C30020BqK();
        this.LIZ = c30020BqK;
        C30020BqK c30020BqK2 = new C30020BqK();
        this.LIZIZ = c30020BqK2;
        this.LJII = new RectF();
        this.LJIIIIZZ = new RectF();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setEvaluator(c30020BqK);
        valueAnimator.setDuration(2000L);
        valueAnimator.addUpdateListener(new AUListenerS104S0200000_15(yk3, this, 0));
        this.LIZJ = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setEvaluator(c30020BqK2);
        valueAnimator2.setDuration(2000L);
        valueAnimator2.addUpdateListener(new AUListenerS104S0200000_15(yk3, this, 1));
        this.LIZLLL = valueAnimator2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(valueAnimator, valueAnimator2);
        YK5 yk5 = new YK5(yk3);
        Keyframe ofFloat = Keyframe.ofFloat(0.6666667f, 1.15f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        Keyframe ofFloat2 = Keyframe.ofFloat(1.0f, 1.0f);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(yk5, Keyframe.ofFloat(0.0f, 0.0f), ofFloat, ofFloat2));
        AnimatorSet LIZLLL = JBR.LIZLLL(ofPropertyValuesHolder, 300L);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(new YK5(yk3), 1.0f, 0.0f), PropertyValuesHolder.ofInt(new YK7(yk3), 255, 0));
        ofPropertyValuesHolder2.setDuration(150L);
        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(new YK6(yk3), 0.0f, 1.0f), PropertyValuesHolder.ofInt(new YK8(yk3), 0, 255));
        ofPropertyValuesHolder3.setDuration(150L);
        ofPropertyValuesHolder3.setStartDelay(100L);
        LIZLLL.playTogether(ofPropertyValuesHolder2, ofPropertyValuesHolder3);
        this.LJ = LIZLLL;
        ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt(new YK8(yk3), 0, 255));
        ofPropertyValuesHolder4.setDuration(300L);
        ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt(new YK8(yk3), 255, 0));
        o.LJIIIIZZ(ofPropertyValuesHolder5, "ofPropertyValuesHolder(t…AlphaProperty(), 255, 0))");
        this.LJFF = ofPropertyValuesHolder5;
        if (yk3.LJLJJI != null) {
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofPropertyValuesHolder, LIZLLL, ofPropertyValuesHolder5, animatorSet2);
        } else {
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofPropertyValuesHolder4, ofPropertyValuesHolder5, animatorSet2);
        }
        this.LJI = animatorSet;
        animatorSet.addListener(new ALAdapterS12S0200000_15(yk3, this, 0));
    }
}
