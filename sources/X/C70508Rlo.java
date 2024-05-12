package X;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Rlo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70508Rlo extends AbstractC26257ASf {
    public final /* synthetic */ MiniPdpPanelFragment LIZ;

    public C70508Rlo(MiniPdpPanelFragment miniPdpPanelFragment) {
        this.LIZ = miniPdpPanelFragment;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LIZ.LJLLILLLL;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setState(3);
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
