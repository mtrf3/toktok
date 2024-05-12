package X;

import android.animation.Animator;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;

/* loaded from: classes15.dex */
public final class VQY extends VQX {
    public final /* synthetic */ LynxUI LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ float LJLJJLL;
    public final /* synthetic */ C79708VQa LJLJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.LJLJL.LJ = false;
    }

    @Override // X.VQX, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.LJLJJI.setVisibilityForView(this.LJLJJL);
        this.LJLJJI.mView.setAlpha(this.LJLJJLL);
        this.LJLJL.LJII.remove(128);
    }

    @Override // X.VQX, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.LJLJJI.mView.setVisibility(0);
        this.LJLJL.LJ = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VQY(C79708VQa c79708VQa, LynxBaseUI lynxBaseUI, int i, LynxUI lynxUI, int i2, float f) {
        super(lynxBaseUI, i);
        this.LJLJL = c79708VQa;
        this.LJLJJI = lynxUI;
        this.LJLJJL = i2;
        this.LJLJJLL = f;
    }
}
