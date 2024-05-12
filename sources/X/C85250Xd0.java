package X;

import com.ss.android.ugc.aweme.poi.detail.discovery.category.CardItemCell;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.Xd0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85250Xd0 extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final C85251Xd1 LJFF;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    public C85250Xd0(CardItemCell cardItemCell) {
        this.LJ = new AqS165S0100000_15(cardItemCell, 530);
        this.LJFF = new C85251Xd1(cardItemCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
