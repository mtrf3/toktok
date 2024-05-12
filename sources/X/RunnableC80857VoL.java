package X;

import android.view.View;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
import o3.h0;

/* renamed from: X.VoL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80857VoL implements Runnable {
    public final View LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ BottomSheetBehavior LJLJI;

    public final void LIZ() {
        C80856VoK c80856VoK = this.LJLJI.LJI;
        if (c80856VoK != null) {
            if (c80856VoK.LIZ == 2) {
                boolean computeScrollOffset = c80856VoK.LJIILL.computeScrollOffset();
                int currX = c80856VoK.LJIILL.getCurrX();
                int currY = c80856VoK.LJIILL.getCurrY();
                int left = currX - c80856VoK.LJIIZILJ.getLeft();
                int top = currY - c80856VoK.LJIIZILJ.getTop();
                if (left != 0) {
                    h0.LJIIJJI(left, c80856VoK.LJIIZILJ);
                }
                if (top != 0) {
                    h0.LJIIL(top, c80856VoK.LJIIZILJ);
                }
                if (left != 0 || top != 0) {
                    ((C80858VoM) c80856VoK.LJIILLIIL).LIZ.dispatchOnSlide(currY);
                }
                if (computeScrollOffset) {
                    if (currX == c80856VoK.LJIILL.getFinalX() && currY == c80856VoK.LJIILL.getFinalY()) {
                        c80856VoK.LJIILL.abortAnimation();
                    }
                }
                c80856VoK.LJIJI.post(c80856VoK.LJIJJ);
            }
            if (c80856VoK.LIZ == 2) {
                C16300kU.LJIIL(this.LJLIL, this);
                return;
            }
        }
        this.LJLJI.setStateInternal(this.LJLILLLLZI);
        BottomSheetBehavior bottomSheetBehavior = this.LJLJI;
        C60576Nq0 c60576Nq0 = bottomSheetBehavior.LJIILIIL;
        if (c60576Nq0 == null || bottomSheetBehavior.LJJIII) {
            return;
        }
        if (bottomSheetBehavior.LIZIZ == bottomSheetBehavior.LJIJJLI) {
            c60576Nq0.onEvent("enterFullScreen");
        } else {
            c60576Nq0.onEvent("enterHalfScreen");
        }
        this.LJLJI.LJJIII = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80857VoL(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.LJLJI = bottomSheetBehavior;
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
