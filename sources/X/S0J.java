package X;

import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;

/* loaded from: classes13.dex */
public final class S0J extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ AnchorPanelAdapter LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ SHA LJFF;
    public final /* synthetic */ ShopWindowAnchorModel LJI;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        AnchorPanelAdapter.LLFII(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, false, Boolean.valueOf(this.LIZIZ));
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        AnchorPanelAdapter.LLFII(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, true, Boolean.valueOf(this.LIZIZ));
    }

    public S0J(int i, SHA sha, AnchorPanelAdapter anchorPanelAdapter, ShopWindowAnchorModel shopWindowAnchorModel, String str, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = anchorPanelAdapter;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = sha;
        this.LJI = shopWindowAnchorModel;
    }
}
