package X;

import android.os.Parcelable;

/* renamed from: X.IbS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46934IbS extends C46742IWc {
    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new C46935IbT(this));
    }

    public C46934IbS(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    public final void LIZLLL(String str, boolean z) {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        Parcelable LJJIJLIJ = player.LJJIJLIJ();
        if (LJJIJLIJ instanceof InterfaceC46937IbV) {
            ((InterfaceC46937IbV) LJJIJLIJ).LIZLLL(str, z);
        }
    }
}
