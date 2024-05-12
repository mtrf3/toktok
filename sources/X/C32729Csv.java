package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* renamed from: X.Csv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32729Csv {
    public static final /* synthetic */ int LIZ = 0;

    public static AnimatorSet LIZ(View view) {
        float LIZ2 = C15380j0.LIZ(16.0f);
        float LIZ3 = C15380j0.LIZ(8.0f);
        float f = -LIZ2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.4f, 0.64f, 0.74f, 1.0f));
        ofFloat.setDuration(250L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f, 0.0f);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.26f, 0.0f, 0.6f, 0.36f));
        ofFloat.setDuration(250L);
        float f2 = -LIZ3;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f2);
        ofFloat3.setInterpolator(C18950ol.LIZIZ(0.4f, 0.64f, 0.74f, 1.0f));
        ofFloat3.setDuration(200L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f2, 0.0f);
        ofFloat4.setInterpolator(C18950ol.LIZIZ(0.26f, 0.0f, 0.6f, 0.36f));
        ofFloat3.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        return animatorSet;
    }

    public static AnimatorSet LIZIZ(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
        ofFloat.setDuration(100L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat2, 100L);
        LIZLLL.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.08f);
        ofFloat3.setDuration(100L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.08f);
        AnimatorSet LIZLLL2 = JBR.LIZLLL(ofFloat4, 100L);
        LIZLLL2.playTogether(ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
        ofFloat5.setDuration(100L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
        AnimatorSet LIZLLL3 = JBR.LIZLLL(ofFloat6, 100L);
        LIZLLL3.playTogether(ofFloat5, ofFloat6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(LIZLLL, LIZLLL2, LIZLLL3);
        return animatorSet;
    }

    public static AnimatorSet LIZJ(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
        ofFloat.setDuration(1L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat2, 1L);
        LIZLLL.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.7f);
        ofFloat3.setDuration(100L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.7f);
        AnimatorSet LIZLLL2 = JBR.LIZLLL(ofFloat4, 100L);
        LIZLLL2.playTogether(ofFloat3, ofFloat4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(LIZLLL, LIZLLL2);
        return animatorSet;
    }
}
