package X;

import Y.ARunnableS19S0110000_13;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.o;

/* renamed from: X.UlL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78123UlL extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimatorSet LJLIL;
    public final /* synthetic */ C47121t6 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        long startDelay = this.LJLIL.getStartDelay();
        C47121t6 c47121t6 = this.LJLILLLLZI;
        c47121t6.postDelayed(new ARunnableS19S0110000_13(c47121t6, this.LJLJI, 3), startDelay);
    }

    public C78123UlL(AnimatorSet animatorSet, C47121t6 c47121t6, boolean z) {
        this.LJLIL = animatorSet;
        this.LJLILLLLZI = c47121t6;
        this.LJLJI = z;
    }
}
