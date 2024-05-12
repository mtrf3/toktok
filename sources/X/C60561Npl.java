package X;

import android.animation.Animator;
import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import kotlin.jvm.internal.AqS157S0200000_10;

/* renamed from: X.Npl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60561Npl implements Animator.AnimatorListener {
    public boolean LJLIL;
    public final /* synthetic */ BulletPopUpFragment LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public final void LIZIZ() {
        if (!this.LJLIL) {
            try {
                this.LJLJI.invoke();
            } catch (Exception e) {
                BulletPopUpFragment bulletPopUpFragment = this.LJLILLLLZI;
                bulletPopUpFragment.LLFF = e;
                StringBuilder LIZ = X1D.LIZ();
                C39973FmT.LIZIZ(bulletPopUpFragment, KMP.LJFF(LIZ, "dismiss failed on onAnimationEnd with: ", e, LIZ), null, "popup", 2);
            }
            this.LJLIL = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        LIZIZ();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LIZIZ();
    }

    public C60561Npl(BulletPopUpFragment bulletPopUpFragment, AqS157S0200000_10 aqS157S0200000_10) {
        this.LJLILLLLZI = bulletPopUpFragment;
        this.LJLJI = aqS157S0200000_10;
    }
}
