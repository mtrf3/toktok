package X;

import android.animation.Animator;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;

/* renamed from: X.VQj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79717VQj extends VQX {
    public final /* synthetic */ LynxUI LJLJJI;
    public final /* synthetic */ C79716VQi LJLJJL;
    public final /* synthetic */ C79708VQa LJLJJLL;

    @Override // X.VQX, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.LJLJJI.mView.setTranslationX(this.LJLJJL.LJFF());
        this.LJLJJI.mView.setTranslationY(this.LJLJJL.LJI());
        this.LJLJJI.mView.setTranslationZ(this.LJLJJL.LJII());
        VPH vph = this.LJLJJI.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxBaseUI) vph).invalidate();
        }
        this.LJLJJI.mView.setRotation(this.LJLJJL.LIZ());
        this.LJLJJI.mView.setRotationX(this.LJLJJL.LIZIZ());
        this.LJLJJI.mView.setRotationY(this.LJLJJL.LIZJ());
        this.LJLJJI.mView.setScaleX(this.LJLJJL.LIZLLL());
        this.LJLJJI.mView.setScaleY(this.LJLJJL.LJ());
        this.LJLJJLL.LJII.remove(4096);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79717VQj(C79708VQa c79708VQa, LynxUI lynxUI, int i, LynxUI lynxUI2, C79716VQi c79716VQi) {
        super(lynxUI, i);
        this.LJLJJLL = c79708VQa;
        this.LJLJJI = lynxUI2;
        this.LJLJJL = c79716VQi;
    }
}
