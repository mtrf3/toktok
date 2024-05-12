package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: X.Vgh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80383Vgh {
    /* JADX WARN: Multi-variable type inference failed */
    public static Animator LIZ(InterfaceC80386Vgk interfaceC80386Vgk, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC80386Vgk, C80388Vgm.LIZ, C80389Vgn.LIZIZ, new C80391Vgp(f, f2, f3));
        C80391Vgp revealInfo = interfaceC80386Vgk.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC80386Vgk, (int) f, (int) f2, revealInfo.LIZJ, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
