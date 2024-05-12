package X;

import Y.AUListenerS102S0100000_15;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.YLs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87240YLs extends WN5 {
    @Override // X.WMU
    public final void LIZJ(Class cls, Class cls2) {
    }

    @Override // X.WN5
    public final Animator LJFF(C82158WMg c82158WMg, C82158WMg c82158WMg2) {
        View view = c82158WMg.LIZIZ;
        View view2 = c82158WMg2.LIZIZ;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, view.getWidth());
        ofInt.addUpdateListener(new AUListenerS102S0100000_15(view, 25));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(-view2.getWidth(), 0);
        ofInt2.addUpdateListener(new AUListenerS102S0100000_15(view2, 26));
        List asList = Arrays.asList(ofInt, ofInt2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }

    @Override // X.WN5
    public final Animator LJI(C82158WMg c82158WMg, C82158WMg c82158WMg2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, -c82158WMg.LIZIZ.getWidth());
        ofInt.addUpdateListener(new AUListenerS102S0100000_15(c82158WMg, 23));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(c82158WMg2.LIZIZ.getWidth(), 0);
        ofInt2.addUpdateListener(new AUListenerS102S0100000_15(c82158WMg2, 24));
        List asList = Arrays.asList(ofInt, ofInt2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }
}
