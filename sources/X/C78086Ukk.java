package X;

import android.animation.AnimatorSet;
import android.view.View;

/* renamed from: X.Ukk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78086Ukk implements InterfaceC78107Ul5 {
    public final /* synthetic */ C78093Ukr LIZ;

    @Override // X.InterfaceC78107Ul5
    public final void LIZ() {
    }

    @Override // X.InterfaceC78107Ul5
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC78107Ul5
    public final void LJFF() {
    }

    @Override // X.InterfaceC78107Ul5
    public final void LJI() {
    }

    @Override // X.InterfaceC78107Ul5
    public final void LIZIZ() {
        if (!C78062UkM.LIZJ(this.LIZ.getMGiftMsg()) && this.LIZ.getMCombLayoutView() != null) {
            View mCombLayoutView = this.LIZ.getMCombLayoutView();
            if (mCombLayoutView != null) {
                mCombLayoutView.setVisibility(0);
            }
            C78093Ukr c78093Ukr = this.LIZ;
            c78093Ukr.setCurrAnimator(C78079Ukd.LIZJ(c78093Ukr.getMCombCountTv(), this, this.LIZ.getMGiftMsg(), this.LIZ.getDataChannel()));
            AnimatorSet currAnimator = this.LIZ.getCurrAnimator();
            if (currAnimator != null) {
                currAnimator.start();
            }
        }
    }

    @Override // X.InterfaceC78107Ul5
    public final void LIZJ() {
        AbstractC78073UkX.LJIIIIZZ(this.LIZ);
    }

    public C78086Ukk(C78093Ukr c78093Ukr) {
        this.LIZ = c78093Ukr;
    }
}
