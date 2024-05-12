package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;

/* renamed from: X.Ny9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61081Ny9 implements InterfaceC61087NyF {
    public final /* synthetic */ PdpBulletBottomSheetFragment LIZ;

    @Override // X.InterfaceC61087NyF
    public final void LIZIZ() {
        this.LIZ.LJZI = null;
    }

    public C61081Ny9(PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment) {
        this.LIZ = pdpBulletBottomSheetFragment;
    }

    @Override // X.InterfaceC61087NyF
    public final void LIZ(boolean z) {
        ViewGroup wl;
        boolean z2;
        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LIZ;
        View view = pdpBulletBottomSheetFragment.LJLLLL;
        if (view != null && (wl = pdpBulletBottomSheetFragment.wl()) != null) {
            if (z || (pdpBulletBottomSheetFragment.LJZ == 3 && view.getScrollY() != 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            wl.requestDisallowInterceptTouchEvent(z2);
        }
    }
}
