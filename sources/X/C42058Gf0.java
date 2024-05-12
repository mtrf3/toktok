package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileCell;

/* renamed from: X.Gf0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42058Gf0 extends ViewOutlineProvider {
    public final /* synthetic */ AdProductTileCell LIZ;

    public C42058Gf0(AdProductTileCell adProductTileCell) {
        this.LIZ = adProductTileCell;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null) {
            AdProductTileCell adProductTileCell = this.LIZ;
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), KL2.LIZJ(adProductTileCell.itemView.getContext(), 4.0f));
            }
        }
    }
}
