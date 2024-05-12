package X;

import com.ss.android.ugc.aweme.poi.search.PoiSearchCellV2;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.XeD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85325XeD extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final int LJFF = 100;
    public final C85318Xe6 LJI;

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

    public C85325XeD(PoiSearchCellV2 poiSearchCellV2) {
        this.LJ = new AqS165S0100000_15(poiSearchCellV2, 550);
        this.LJI = new C85318Xe6(poiSearchCellV2);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
