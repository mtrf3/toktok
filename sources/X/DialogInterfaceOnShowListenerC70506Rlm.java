package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rlm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnShowListenerC70506Rlm implements DialogInterface.OnShowListener {
    public final /* synthetic */ SkuPanelFragment LJLIL;

    public DialogInterfaceOnShowListenerC70506Rlm(SkuPanelFragment skuPanelFragment) {
        this.LJLIL = skuPanelFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        o.LJII(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((C18Z) dialogInterface).findViewById(R.id.c8m);
        if (findViewById != null) {
            SkuPanelFragment skuPanelFragment = this.LJLIL;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(findViewById);
            from.setSkipCollapsed(true);
            skuPanelFragment.LJLLILLLL = from;
            SkuPanelFragment skuPanelFragment2 = this.LJLIL;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = skuPanelFragment2.LJLLILLLL;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setBottomSheetCallback(new C70509Rlp(skuPanelFragment2));
            }
        }
    }
}
