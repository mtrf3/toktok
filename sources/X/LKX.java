package X;

import Y.ARunnableS45S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LKX {
    public static final int LJIILJJIL = (int) g0.LJIJJ(37);
    public static final int LJIILL = (int) g0.LJIJJ(24);
    public static final float LJIILLIIL = g0.LJIJJ(37);
    public final FrameLayout LIZ;
    public final List<String> LIZIZ;
    public final C73318Sq2 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public ObjectAnimator LJI;
    public ObjectAnimator LJII;
    public ValueAnimator LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final List<OSZ<Integer, Integer>> LJIIL;
    public ARunnableS45S0100000_9 LJIILIIL;

    public final LinearLayout LIZ() {
        return (LinearLayout) this.LJ.getValue();
    }

    public static void LIZIZ(LinearLayout linearLayout) {
        if (linearLayout.getChildCount() > 0) {
            View childAt = linearLayout.getChildAt(0);
            C16880lQ.LLII(linearLayout, 0);
            linearLayout.addView(childAt, linearLayout.getChildCount());
            linearLayout.setTranslationY(linearLayout.getTranslationY() + LJIILLIIL);
        }
    }

    public LKX(FrameLayout frameLayout, List<String> textList) {
        o.LJIIIZ(textList, "textList");
        this.LIZ = frameLayout;
        this.LIZIZ = textList;
        this.LIZJ = new C73318Sq2();
        this.LIZLLL = C221108m2.LIZIZ(LKY.LJLIL);
        this.LJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 794));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 792));
        this.LJFF = LIZIZ;
        this.LJIIIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 791));
        this.LJIIJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 793));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 795));
        this.LJIIL = C47261Igj.LJJIJIL(new OSZ(0, 0), new OSZ(217, 255), new OSZ(255, 255));
        LinearLayout LIZ = LIZ();
        LIZ.setOrientation(1);
        float translationY = LIZ.getTranslationY();
        int i = LJIILJJIL;
        LIZ.setTranslationY(translationY + i);
        frameLayout.addView(LIZ);
        LinearLayout linearLayout = (LinearLayout) LIZIZ.getValue();
        linearLayout.setOrientation(1);
        linearLayout.setTranslationY(linearLayout.getTranslationY() + i);
        frameLayout.addView(linearLayout);
        for (String str : textList) {
            LinearLayout LIZ2 = LIZ();
            Context context = LIZ().getContext();
            o.LJIIIIZZ(context, "textContainerView.context");
            LinearLayout linearLayout2 = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, LJIILJJIL);
            layoutParams.gravity = 17;
            linearLayout2.setLayoutParams(layoutParams);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            int i2 = LJIILL;
            layoutParams2.setMarginStart(i2);
            layoutParams2.setMarginEnd(i2);
            tuxTextView.setLayoutParams(layoutParams2);
            tuxTextView.setGravity(17);
            tuxTextView.setTextColorRes(R.attr.go);
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(13);
            tuxTextView.setMaxLines(1);
            tuxTextView.setMinTextSize(g0.LJIJJ(1));
            linearLayout2.addView(tuxTextView);
            LIZ2.addView(linearLayout2);
        }
        LIZJ(0, 0, (View) this.LJIIIZ.getValue());
        LIZJ(217, 255, (View) this.LJIIJ.getValue());
        LIZJ(255, 255, (View) this.LJIIJJI.getValue());
        LinearLayout LIZ3 = LIZ();
        float translationY2 = LIZ().getTranslationY();
        float f = LJIILLIIL;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZ3, "translationY", LIZ().getTranslationY(), translationY2 - f);
        o.LJIIIIZZ(ofFloat, "ofFloat(textContainerVie…Y - TRANSLATION_DISTANCE)");
        this.LJI = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJFF.getValue(), "translationY", LIZ().getTranslationY(), LIZ().getTranslationY() - f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(gradientContaine…Y - TRANSLATION_DISTANCE)");
        this.LJII = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat3, "ofFloat(VALUE_ANIMATOR_START, VALUE_ANIMATOR_END)");
        this.LJIIIIZZ = ofFloat3;
        ofFloat3.addUpdateListener(new AUListenerS97S0100000_9(this, 18));
        AnimatorSet animatorSet = (AnimatorSet) this.LIZLLL.getValue();
        Animator[] animatorArr = new Animator[3];
        ObjectAnimator objectAnimator = this.LJI;
        if (objectAnimator != null) {
            animatorArr[0] = objectAnimator;
            ObjectAnimator objectAnimator2 = this.LJII;
            if (objectAnimator2 != null) {
                animatorArr[1] = objectAnimator2;
                ValueAnimator valueAnimator = this.LJIIIIZZ;
                if (valueAnimator != null) {
                    animatorArr[2] = valueAnimator;
                    animatorSet.playTogether(animatorArr);
                    ((AnimatorSet) this.LIZLLL.getValue()).setDuration(400L);
                    this.LJIILIIL = new ARunnableS45S0100000_9(this, 130);
                    return;
                }
                o.LJIJI("alphaGradientAnimator");
                throw null;
            }
            o.LJIJI("translationYGradientAnimator");
            throw null;
        }
        o.LJIJI("translationYTextAnimator");
        throw null;
    }

    public final void LIZJ(int i, int i2, View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-2, LJIILJJIL));
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(i, 255, 255, 255), Color.argb(i2, 255, 255, 255)}));
        ((ViewGroup) this.LJFF.getValue()).addView(view);
    }

    public final void LIZLLL(float f, int i, int i2, View view) {
        if (i >= this.LJIIL.size() || i2 >= this.LJIIL.size()) {
            return;
        }
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (((((Number) ((OSZ) ListProtector.get(this.LJIIL, i2)).getFirst()).intValue() - ((Number) ((OSZ) ListProtector.get(this.LJIIL, i)).getFirst()).intValue()) * f) + ((Number) ((OSZ) ListProtector.get(this.LJIIL, i)).getFirst()).floatValue()), 255, 255, 255), Color.argb((int) ((f * (((Number) ((OSZ) ListProtector.get(this.LJIIL, i2)).getSecond()).intValue() - ((Number) ((OSZ) ListProtector.get(this.LJIIL, i)).getSecond()).intValue())) + ((Number) ((OSZ) ListProtector.get(this.LJIIL, i)).getSecond()).floatValue()), 255, 255, 255)}));
    }
}
