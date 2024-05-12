package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.tux.icon.TuxIconView;

/* renamed from: X.6Lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158976Lt {
    public static final /* synthetic */ int LIZ = 0;

    public static AnimatorSet LIZ(TuxIconView tuxIconView) {
        if (tuxIconView == null) {
            return new AnimatorSet();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.0f, 0.8f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.0f, 0.8f);
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    public static AnimatorSet LIZIZ(TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        if (tuxIconView == null || tuxIconView2 == null) {
            return new AnimatorSet();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(0L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 0.0f, 1.0f);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(C18950ol.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(100L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.0f, 1.0f);
        ofFloat5.setDuration(0L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.0f, 1.0f);
        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat6, 0L);
        LIZLLL.play(ofFloat5).with(ofFloat6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat3).with(ofFloat2).with(ofFloat).with(ofFloat4).after(LIZLLL);
        return animatorSet;
    }

    public static AnimatorSet LIZJ(TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        if (tuxIconView == null || tuxIconView2 == null) {
            return new AnimatorSet();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 0.8f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 0.8f, 1.0f);
        ofFloat3.setDuration(200L);
        ofFloat3.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(100L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 0.8f, 1.0f);
        ofFloat5.setDuration(200L);
        ofFloat5.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 0.8f, 1.0f);
        ofFloat6.setDuration(200L);
        ofFloat6.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        return animatorSet;
    }
}
