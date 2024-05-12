package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment;

/* renamed from: X.Lnz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55355Lnz implements InterfaceC54167LNr {
    public final /* synthetic */ MallRacunFragment LIZ;

    @Override // X.InterfaceC54167LNr
    public final int getValue() {
        VWB vwb = this.LIZ.LJLJI;
        if (vwb != null) {
            return vwb.getCurrentItem();
        }
        return 0;
    }

    public C55355Lnz(MallRacunFragment mallRacunFragment) {
        this.LIZ = mallRacunFragment;
    }

    @Override // X.InterfaceC54167LNr
    public final void LIZ(int i) {
        VWB vwb = this.LIZ.LJLJI;
        if (vwb == null) {
            return;
        }
        vwb.setCurrentItem(i);
    }

    @Override // X.InterfaceC54167LNr
    public final void LIZIZ(int i, boolean z) {
        VWB vwb = this.LIZ.LJLJI;
        if (vwb != null) {
            vwb.setCurrentItem(i, z);
        }
    }
}
