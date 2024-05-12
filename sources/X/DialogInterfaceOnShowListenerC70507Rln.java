package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rln, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnShowListenerC70507Rln implements DialogInterface.OnShowListener {
    public final /* synthetic */ MiniPdpPanelFragment LJLIL;

    public DialogInterfaceOnShowListenerC70507Rln(MiniPdpPanelFragment miniPdpPanelFragment) {
        this.LJLIL = miniPdpPanelFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        o.LJII(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((C18Z) dialogInterface).findViewById(R.id.c8m);
        if (findViewById != null) {
            this.LJLIL.LJLLILLLL = BottomSheetBehavior.from(findViewById);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLIL.LJLLILLLL;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setDraggable(false);
            }
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.LJLIL.LJLLILLLL;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setSkipCollapsed(true);
            }
            MiniPdpPanelFragment miniPdpPanelFragment = this.LJLIL;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior3 = miniPdpPanelFragment.LJLLILLLL;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.setBottomSheetCallback(new C70508Rlo(miniPdpPanelFragment));
            }
        }
    }
}
