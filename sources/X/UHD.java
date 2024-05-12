package X;

import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.comp.impl.game.ui.GameShortVideoAdDetailPageDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes14.dex */
public final class UHD implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ GameShortVideoAdDetailPageDialogFragment LJLIL;

    public UHD(GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment) {
        this.LJLIL = gameShortVideoAdDetailPageDialogFragment;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i;
        BottomSheetBehavior<?> bottomSheetBehavior;
        VUI vui = this.LJLIL.LJLJLLL;
        if (vui != null) {
            i = vui.getScrollY();
        } else {
            i = 0;
        }
        C012403c.LJ("scrollY  ", i, "GameShortVideoAdDetailFragment");
        if (i > 1 || (bottomSheetBehavior = this.LJLIL.LJLJJI) == null) {
            return;
        }
        bottomSheetBehavior.setDraggable(true);
    }
}
