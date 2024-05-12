package X;

import android.view.ViewPropertyAnimator;

/* renamed from: X.NvO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60910NvO extends AbstractC60931Nvj {
    public final /* synthetic */ boolean LJLIL;

    public C60910NvO(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.AbstractC60931Nvj
    public final void LIZIZ(ViewPropertyAnimator viewPropertyAnimator) {
        if (C15380j0.LJIILLIIL()) {
            if (!this.LJLIL) {
                viewPropertyAnimator.setStartDelay(100L);
            }
            viewPropertyAnimator.setDuration(300L);
            viewPropertyAnimator.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
            return;
        }
        viewPropertyAnimator.setDuration(250L);
    }

    @Override // X.AbstractC60931Nvj
    public final void LIZJ(ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.setDuration(300L);
        if (C15380j0.LJIILLIIL()) {
            viewPropertyAnimator.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        }
    }
}
