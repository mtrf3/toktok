package X;

import com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.Xex, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85371Xex extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final int LJFF = 100;
    public final C85356Xei LJI;

    @Override // X.AbstractC13940gg
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC19530ph LJ() {
        return this.LJI;
    }

    public C85371Xex(PoiPublishRcmdListCell poiPublishRcmdListCell) {
        this.LJ = new AqS165S0100000_15(poiPublishRcmdListCell, 568);
        this.LJI = new C85356Xei(poiPublishRcmdListCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
