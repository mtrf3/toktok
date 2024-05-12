package X;

import Y.ARunnableS46S0100000_10;
import com.lynx.tasm.LynxViewClient;

/* loaded from: classes11.dex */
public final class O6L extends LynxViewClient {
    public final /* synthetic */ VNS LIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        FRW.LIZ("discovery_favorite_sounds_lynx_first_list_screen");
        this.LIZ.removeLynxViewClient(this);
        VNS vns = this.LIZ;
        vns.post(new ARunnableS46S0100000_10(vns, 147));
    }

    public O6L(VNS vns) {
        this.LIZ = vns;
    }
}
