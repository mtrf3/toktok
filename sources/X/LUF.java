package X;

import Y.ALAdapterS7S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a1;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LUF {
    public final ViewGroup LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C62846OlW LIZLLL;
    public int LJ;
    public int LJFF;
    public ObjectAnimator LJI;
    public AnimatorSet LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;

    public final boolean LIZLLL() {
        if (this.LJ == 2) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        ObjectAnimator objectAnimator = this.LJI;
        if (objectAnimator != null) {
            C16880lQ.LJLJJLL(objectAnimator);
        }
        ObjectAnimator objectAnimator2 = this.LJI;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
        }
        ObjectAnimator objectAnimator3 = this.LJI;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        this.LJI = null;
    }

    public static ObjectAnimator LIZIZ(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(view, scaleX, scaleY)");
        ofPropertyValuesHolder.setInterpolator(new SJI());
        ofPropertyValuesHolder.setDuration(400L);
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator LIZJ(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(view, scaleX, scaleY)");
        ofPropertyValuesHolder.setInterpolator(new SJI());
        ofPropertyValuesHolder.setDuration(400L);
        return ofPropertyValuesHolder;
    }

    public final void LIZ(boolean z) {
        if (this.LJ == 0) {
            return;
        }
        AnimatorSet animatorSet = this.LJII;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJII;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LJII = null;
        LJI();
        if (z) {
            View view = this.LJIIIZ;
            C62846OlW c62846OlW = this.LIZLLL;
            if (view != null) {
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
            }
            if (c62846OlW != null) {
                c62846OlW.setScaleX(1.0f);
                c62846OlW.setScaleY(1.0f);
            }
            View view2 = this.LJIIIZ;
            C62846OlW c62846OlW2 = this.LIZLLL;
            if (view2 == null || c62846OlW2 == null) {
                return;
            }
            ObjectAnimator LIZJ = LIZJ(view2);
            ObjectAnimator LIZIZ = LIZIZ(c62846OlW2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(LIZJ).with(LIZIZ);
            animatorSet3.start();
            return;
        }
        View view3 = this.LJIIIZ;
        if (view3 == null) {
            return;
        }
        view3.post(new ARunnableS45S0100000_9(this, 237));
    }

    public final void LJFF(boolean z) {
        AnimatorSet animatorSet;
        C62846OlW c62846OlW = this.LIZLLL;
        View view = this.LJIIIZ;
        if (c62846OlW != null) {
            c62846OlW.setScaleX(0.0f);
            c62846OlW.setScaleY(0.0f);
        }
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (z) {
            View view2 = this.LJIIIZ;
            if (view2 == null) {
                animatorSet = null;
            } else {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.2f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.2f));
                o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(view, scaleX, scaleY)");
                ofPropertyValuesHolder.setInterpolator(new SJI());
                ofPropertyValuesHolder.setDuration(150L);
                animatorSet = new AnimatorSet();
                animatorSet.play(ofPropertyValuesHolder);
            }
            this.LJII = animatorSet;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS7S0100000_9(this, 18));
            }
            AnimatorSet animatorSet2 = this.LJII;
            if (animatorSet2 != null) {
                animatorSet2.start();
                return;
            }
            return;
        }
        View view3 = this.LJIIIZ;
        if (view3 == null) {
            return;
        }
        view3.post(new ARunnableS45S0100000_9(this, 239));
    }

    public LUF(Context context, C54113LLp c54113LLp) {
        o.LJIIIZ(context, "context");
        this.LIZ = c54113LLp;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(C16880lQ.LLLLL(context)).toString());
        String str = File.separator;
        String LJFF = JBR.LJFF(LIZ, str, "superentrance", LIZ);
        this.LIZIZ = LJFF;
        this.LIZJ = a1.LJ(LJFF, str, "plusicon.png");
        C62846OlW c62846OlW = new C62846OlW(c54113LLp.getContext());
        this.LIZLLL = c62846OlW;
        c62846OlW.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c62846OlW.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C17N.LJIILL(45.0d), C17N.LJIILL(45.0d));
        layoutParams.gravity = 17;
        c62846OlW.setLayoutParams(layoutParams);
        c54113LLp.addView(c62846OlW);
    }

    public final void LJ(boolean z, boolean z2) {
        AnimatorSet animatorSet;
        C62846OlW c62846OlW = this.LIZLLL;
        View view = this.LJIIIZ;
        if (c62846OlW != null) {
            c62846OlW.setScaleX(0.0f);
            c62846OlW.setScaleY(0.0f);
        }
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        C62846OlW c62846OlW2 = this.LIZLLL;
        if (c62846OlW2 != null) {
            c62846OlW2.setVisibility(0);
        }
        C62846OlW c62846OlW3 = this.LIZLLL;
        View view2 = this.LJIIIZ;
        if (c62846OlW3 == null || view2 == null) {
            animatorSet = null;
        } else {
            ObjectAnimator LIZJ = LIZJ(c62846OlW3);
            ObjectAnimator LIZIZ = LIZIZ(view2);
            animatorSet = new AnimatorSet();
            animatorSet.play(LIZJ).with(LIZIZ);
        }
        this.LJII = animatorSet;
        if (animatorSet != null) {
            animatorSet.addListener(new LUH(z2, this, z));
        }
        AnimatorSet animatorSet2 = this.LJII;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }
}
