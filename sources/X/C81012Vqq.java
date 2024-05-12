package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Vqq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81012Vqq extends WN5 {
    public final C81014Vqs LIZJ = new C81014Vqs();

    @Override // X.WMU
    public final void LIZJ(Class cls, Class cls2) {
    }

    @Override // X.WN5
    public final Animator LJFF(C82158WMg c82158WMg, C82158WMg c82158WMg2) {
        if (c82158WMg.LIZLLL) {
            return this.LIZJ.LJFF(c82158WMg, c82158WMg2);
        }
        View view = c82158WMg2.LIZIZ;
        View view2 = c82158WMg.LIZIZ;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150L);
        ofFloat.setStartDelay(50L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, view.getHeight() * 0.08f);
        ofFloat2.setInterpolator(new AccelerateInterpolator(2.0f));
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.7f, 1.0f);
        ofFloat3.setInterpolator(new C30911Jf());
        ofFloat3.setDuration(200L);
        List asList = Arrays.asList(ofFloat, ofFloat2, ofFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }

    @Override // X.WN5
    public final Animator LJI(C82158WMg c82158WMg, C82158WMg c82158WMg2) {
        if (c82158WMg2.LIZLLL) {
            return this.LIZJ.LJI(c82158WMg, c82158WMg2);
        }
        View view = c82158WMg.LIZIZ;
        View view2 = c82158WMg2.LIZIZ;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 1.0f);
        ofFloat.setInterpolator(new C30901Je());
        ofFloat.setDuration(120L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat2.setDuration(120L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, view2.getHeight() * 0.08f, 0.0f);
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.5f));
        ofFloat3.setDuration(200L);
        List asList = Arrays.asList(ofFloat, ofFloat2, ofFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }
}
