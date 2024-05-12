package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;

/* renamed from: X.NyC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61084NyC extends ViewOutlineProvider {
    public final /* synthetic */ PdpBulletBottomSheetFragment LIZ;

    public C61084NyC(PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment) {
        this.LIZ = pdpBulletBottomSheetFragment;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null) {
            float LIZJ = KL2.LIZJ(this.LIZ.LJLIL, 8.0f);
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) LIZJ), LIZJ);
            }
        }
    }
}
