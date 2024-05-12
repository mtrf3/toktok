package X;

import android.animation.ValueAnimator;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;

/* renamed from: X.VQk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79718VQk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ C79716VQi LJLILLLLZI;
    public final /* synthetic */ LynxUI LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ float LJLJJLL;
    public final /* synthetic */ float LJLJL;
    public final /* synthetic */ float LJLJLJ;
    public final /* synthetic */ float LJLJLLL;
    public final /* synthetic */ float LJLL;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.LJLJI.mView.setTranslationX(C06420Na.LIZIZ(this.LJLILLLLZI.LJFF(), this.LJLIL, animatedFraction, this.LJLIL));
        this.LJLJI.mView.setTranslationY(C06420Na.LIZIZ(this.LJLILLLLZI.LJI(), this.LJLJJI, animatedFraction, this.LJLJJI));
        this.LJLJI.mView.setTranslationZ(C06420Na.LIZIZ(this.LJLILLLLZI.LJII(), this.LJLJJL, animatedFraction, this.LJLJJL));
        this.LJLJI.mView.setRotation(C06420Na.LIZIZ(this.LJLILLLLZI.LIZ(), this.LJLJJLL, animatedFraction, this.LJLJJLL));
        this.LJLJI.mView.setRotationX(C06420Na.LIZIZ(this.LJLILLLLZI.LIZIZ(), this.LJLJL, animatedFraction, this.LJLJL));
        this.LJLJI.mView.setRotationY(C06420Na.LIZIZ(this.LJLILLLLZI.LIZJ(), this.LJLJLJ, animatedFraction, this.LJLJLJ));
        this.LJLJI.mView.setScaleX(C06420Na.LIZIZ(this.LJLILLLLZI.LIZLLL(), this.LJLJLLL, animatedFraction, this.LJLJLLL));
        this.LJLJI.mView.setScaleY(C06420Na.LIZIZ(this.LJLILLLLZI.LJ(), this.LJLL, animatedFraction, this.LJLL));
        VPH vph = this.LJLJI.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxBaseUI) vph).invalidate();
        }
    }

    public C79718VQk(float f, C79716VQi c79716VQi, LynxUI lynxUI, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.LJLIL = f;
        this.LJLILLLLZI = c79716VQi;
        this.LJLJI = lynxUI;
        this.LJLJJI = f2;
        this.LJLJJL = f3;
        this.LJLJJLL = f4;
        this.LJLJL = f5;
        this.LJLJLJ = f6;
        this.LJLJLLL = f7;
        this.LJLL = f8;
    }
}
