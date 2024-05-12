package X;

import com.ss.android.ugc.aweme.poi.search.PoiSearchCellV1;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.XeC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85324XeC extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final int LJFF = 100;
    public final C85320Xe8 LJI;

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

    public C85324XeC(PoiSearchCellV1 poiSearchCellV1) {
        this.LJ = new AqS165S0100000_15(poiSearchCellV1, 549);
        this.LJI = new C85320Xe8(poiSearchCellV1);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
