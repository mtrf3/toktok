package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import o3.h0;

/* renamed from: X.Vmj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80757Vmj implements Runnable {
    public final View LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ AdPopUpWebBottomSheetBehavior LJLJI;

    public final void LIZ() {
        C80756Vmi c80756Vmi = this.LJLJI.LJIIIZ;
        if (c80756Vmi != null) {
            if (c80756Vmi.LIZ == 2) {
                if (c80756Vmi.LJIIZILJ != null) {
                    boolean computeScrollOffset = c80756Vmi.LJIILL.computeScrollOffset();
                    int currX = c80756Vmi.LJIILL.getCurrX();
                    int currY = c80756Vmi.LJIILL.getCurrY();
                    int left = currX - c80756Vmi.LJIIZILJ.getLeft();
                    int top = currY - c80756Vmi.LJIIZILJ.getTop();
                    if (left != 0) {
                        h0.LJIIJJI(left, c80756Vmi.LJIIZILJ);
                    }
                    if (top != 0) {
                        h0.LJIIL(top, c80756Vmi.LJIIZILJ);
                    }
                    if (left != 0 || top != 0) {
                        ((C80758Vmk) c80756Vmi.LJIILLIIL).LIZ.dispatchOnSlide(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == c80756Vmi.LJIILL.getFinalX() && currY == c80756Vmi.LJIILL.getFinalY()) {
                            c80756Vmi.LJIILL.abortAnimation();
                        }
                    }
                    c80756Vmi.LJIJI.post(c80756Vmi.LJIJJ);
                }
            }
            if (c80756Vmi.LIZ == 2) {
                C16300kU.LJIIL(this.LJLIL, this);
                return;
            }
        }
        this.LJLJI.setStateInternal(this.LJLILLLLZI);
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

    public RunnableC80757Vmj(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, View view, int i) {
        this.LJLJI = adPopUpWebBottomSheetBehavior;
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
