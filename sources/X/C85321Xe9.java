package X;

import com.ss.android.ugc.aweme.poi.search.PoiSearchCell;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.Xe9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85321Xe9 extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final int LJFF = 100;
    public final C85319Xe7 LJI;

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

    public C85321Xe9(PoiSearchCell poiSearchCell) {
        this.LJ = new AqS165S0100000_15(poiSearchCell, 548);
        this.LJI = new C85319Xe7(poiSearchCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
