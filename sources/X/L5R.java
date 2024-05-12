package X;

import Y.IDAListenerS40S0200000_9;
import android.animation.Animator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class L5R<T> implements InterfaceC04760Gq {
    public final /* synthetic */ L5P LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C26308AUe LIZJ;

    public L5R(L5P l5p, int i, C26308AUe c26308AUe) {
        this.LIZ = l5p;
        this.LIZIZ = i;
        this.LIZJ = c26308AUe;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        Animator.AnimatorListener animatorListener;
        C53478Kyo uiData;
        C26308AUe c26308AUe;
        C0GY c0gy = (C0GY) obj;
        L5Y LJI = this.LIZ.LJI();
        if (LJI != null) {
            L5P l5p = this.LIZ;
            int i = this.LIZIZ;
            C26308AUe c26308AUe2 = this.LIZJ;
            if (!l5p.LIZLLL.get()) {
                L5Y LJI2 = l5p.LJI();
                if (LJI2 != null && (uiData = LJI2.getUiData()) != null && (c26308AUe = uiData.LJI) != null) {
                    animatorListener = c26308AUe.LIZLLL;
                } else {
                    animatorListener = null;
                }
                L5Y LJI3 = l5p.LJI();
                if (LJI3 != null) {
                    LJI3.addAnimatorListener(new IDAListenerS40S0200000_9(animatorListener, l5p, 2));
                }
                l5p.LIZLLL = new AtomicBoolean(true);
            }
            LJI.setComposition(c0gy);
            LJI.setRepeatCount(i);
            L5Y LJI4 = l5p.LJI();
            if (LJI4 != null && !LJI4.isAnimating()) {
                LJI.playAnimation();
            }
            LJI.setProgress(c26308AUe2.LIZJ);
        }
    }
}
