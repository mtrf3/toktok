package X;

import android.animation.Animator;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public final class VQV extends VQX {
    public final /* synthetic */ LynxBaseUI LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C79708VQa LJLJJLL;

    @Override // X.VQX, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.LJLJJI.mLynxBackground.LJ(this.LJLJJL);
        this.LJLJJI.invalidate();
        this.LJLJJLL.LJII.remove(64);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VQV(C79708VQa c79708VQa, LynxBaseUI lynxBaseUI, int i, LynxBaseUI lynxBaseUI2, int i2) {
        super(lynxBaseUI, i);
        this.LJLJJLL = c79708VQa;
        this.LJLJJI = lynxBaseUI2;
        this.LJLJJL = i2;
    }
}
