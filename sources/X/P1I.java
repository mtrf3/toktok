package X;

import com.ss.android.ugc.aweme.relation.auth.widget.cell.AuthMaFPowerCell;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class P1I extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final P1F LJFF;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    public P1I(AuthMaFPowerCell<T> authMaFPowerCell) {
        this.LJ = new AqS160S0100000_10((AuthMaFPowerCell) authMaFPowerCell, 311);
        this.LJFF = new P1F(authMaFPowerCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
