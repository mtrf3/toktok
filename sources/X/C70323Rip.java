package X;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Rip, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70323Rip extends AbstractC26257ASf {
    public final /* synthetic */ MiniPdpPanelFragment LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public C70323Rip(MiniPdpPanelFragment miniPdpPanelFragment) {
        this.LIZ = miniPdpPanelFragment;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i != 1 || (bottomSheetBehavior = this.LIZ.LJLLILLLL) == null) {
            return;
        }
        bottomSheetBehavior.setState(3);
    }
}
