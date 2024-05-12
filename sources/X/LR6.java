package X;

import android.widget.PopupWindow;

/* loaded from: classes10.dex */
public final class LR6 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ LR0 LJLIL;

    public LR6(LR0 lr0) {
        this.LJLIL = lr0;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.LJLIL.getClass();
        if (LR0.LJIILJJIL()) {
            this.LJLIL.LJJIJLIJ = true;
        }
        LR0 lr0 = this.LJLIL;
        lr0.getClass();
        C221018lt.LJFF("NCTBPManager", "onBubbleDismiss");
        lr0.LJIILLIIL = true;
        lr0.LJIIZILJ = false;
        lr0.LJIILL = false;
        lr0.LIZJ.onPopupDismiss();
        lr0.LJIJJLI(null);
    }
}
