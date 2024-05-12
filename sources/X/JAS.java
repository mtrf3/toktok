package X;

import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.feed.platform.panel.midad.MidAdComponent;

/* loaded from: classes9.dex */
public final class JAS implements InterfaceC54260LRg {
    public final /* synthetic */ MidAdComponent LIZ;

    @Override // X.InterfaceC54260LRg
    public final void LIZ() {
        IMidAdCellAbility FT = this.LIZ.FT();
        if (FT != null) {
            FT.O00(true);
        }
    }

    @Override // X.InterfaceC54260LRg
    public final void LIZIZ() {
        IMidAdCellAbility FT = this.LIZ.FT();
        if (FT != null) {
            FT.O00(false);
        }
    }

    public JAS(MidAdComponent midAdComponent) {
        this.LIZ = midAdComponent;
    }
}
