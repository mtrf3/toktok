package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0Bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03520Bw {
    public static Animator LIZ(View view, C03860De c03860De, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, AbstractC03490Bt abstractC03490Bt) {
        float f5 = f;
        float f6 = f2;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) c03860De.LIZIZ.getTag(R.id.ljx)) != null) {
            f5 = (r1[0] - i) + translationX;
            f6 = (r1[1] - i2) + translationY;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        C1CU c1cu = new C1CU(view, c03860De.LIZIZ, round, round2, translationX, translationY);
        abstractC03490Bt.LIZ(c1cu);
        ofPropertyValuesHolder.addListener(c1cu);
        ofPropertyValuesHolder.addPauseListener(c1cu);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
