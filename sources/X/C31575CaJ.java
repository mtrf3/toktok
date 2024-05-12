package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.CaJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31575CaJ extends AnimatorListenerAdapter {
    public final /* synthetic */ C31576CaK LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJLJJLL = this.LJLILLLLZI;
    }

    public C31575CaJ(C31576CaK c31576CaK, float f) {
        this.LJLIL = c31576CaK;
        this.LJLILLLLZI = f;
    }
}
