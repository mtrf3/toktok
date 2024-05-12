package X;

import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.Mmx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57839Mmx extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final C57840Mmy LJFF;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    public C57839Mmx(BasePowerCell<ITEM> basePowerCell) {
        this.LJ = new AqS159S0100000_9((BasePowerCell) basePowerCell, 572);
        this.LJFF = new C57840Mmy(basePowerCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
