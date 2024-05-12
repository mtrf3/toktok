package X;

import com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView;

/* renamed from: X.SIk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71866SIk implements VCA {
    public final /* synthetic */ ECLynxLiveView LIZ;

    public C71866SIk(ECLynxLiveView eCLynxLiveView) {
        this.LIZ = eCLynxLiveView;
    }

    @Override // X.VCA
    public final void LIZ(boolean z) {
        this.LIZ.LJJ("switchresolution", C113554cx.LJJLIIIIJ(new OSZ("success", Boolean.valueOf(z))));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchResolution: ");
        LIZ.append(z);
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
    }
}
