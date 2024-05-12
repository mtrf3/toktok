package X;

import com.ss.android.ugc.aweme.following.ui.assem.RelationSearchCell;
import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.MmQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57806MmQ extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final C57805MmP LJFF;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    public C57806MmQ(RelationSearchCell<ITEM> relationSearchCell) {
        this.LJ = new AqS159S0100000_9((RelationSearchCell) relationSearchCell, 235);
        this.LJFF = new C57805MmP(relationSearchCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
