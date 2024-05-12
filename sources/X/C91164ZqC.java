package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.ZqC, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91164ZqC extends AnimatorListenerAdapter {
    public final /* synthetic */ C91165ZqD LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLIL.setMSelectedPosition(this.LJLILLLLZI);
        this.LJLIL.setMSelectionOffset(0.0f);
    }

    public C91164ZqC(C91165ZqD c91165ZqD, int i) {
        this.LJLIL = c91165ZqD;
        this.LJLILLLLZI = i;
    }
}
