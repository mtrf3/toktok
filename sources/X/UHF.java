package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.game.ui.GameShortVideoAdDetailPageDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes14.dex */
public final class UHF implements View.OnScrollChangeListener {
    public final /* synthetic */ GameShortVideoAdDetailPageDialogFragment LIZ;

    public UHF(GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment) {
        this.LIZ = gameShortVideoAdDetailPageDialogFragment;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        BottomSheetBehavior<?> bottomSheetBehavior;
        C012403c.LJ("scrollY  ", i2, "GameShortVideoAdDetailFragment");
        if (i2 > 1 || (bottomSheetBehavior = this.LIZ.LJLJJI) == null) {
            return;
        }
        bottomSheetBehavior.setDraggable(true);
    }
}
