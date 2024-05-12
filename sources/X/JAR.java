package X;

import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.feed.platform.panel.midad.MidAdComponent;

/* loaded from: classes9.dex */
public final class JAR implements InterfaceC48810JDq {
    public final /* synthetic */ MidAdComponent LIZ;

    @Override // X.InterfaceC48810JDq
    public final void LIZ() {
        IMidAdCellAbility FT = this.LIZ.FT();
        if (FT != null) {
            FT.ue(false);
        }
    }

    @Override // X.InterfaceC48810JDq
    public final void LIZIZ() {
        IMidAdCellAbility FT = this.LIZ.FT();
        if (FT != null) {
            FT.ue(true);
        }
    }

    public JAR(MidAdComponent midAdComponent) {
        this.LIZ = midAdComponent;
    }
}
