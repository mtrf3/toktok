package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.LOb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54177LOb extends AnimatorListenerAdapter {
    public final /* synthetic */ LOT LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ LOS LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        this.LJLIL.setMSelectedPosition(this.LJLILLLLZI);
        this.LJLIL.setMSelectionOffset(0.0f);
        LOS los = this.LJLJI;
        los.setSelectedScrollX(los.getTabStripScrollX());
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.setMSelectedPosition(this.LJLILLLLZI);
    }

    public C54177LOb(LOT lot, int i, LOS los) {
        this.LJLIL = lot;
        this.LJLILLLLZI = i;
        this.LJLJI = los;
    }
}
