package X;

import android.animation.Animator;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;

/* loaded from: classes15.dex */
public final class VQW extends VQX {
    public final /* synthetic */ LynxUI LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ C79708VQa LJLJJLL;

    @Override // X.VQX, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.LJLJJI.mView.setAlpha(this.LJLJJL);
        VPH vph = this.LJLJJI.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxBaseUI) vph).invalidate();
        }
        this.LJLJJLL.LJII.remove(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VQW(C79708VQa c79708VQa, LynxUI lynxUI, int i, LynxUI lynxUI2, float f) {
        super(lynxUI, i);
        this.LJLJJLL = c79708VQa;
        this.LJLJJI = lynxUI2;
        this.LJLJJL = f;
    }
}
