package X;

import Y.AfS36S0101000_5;
import Y.AfS37S0000000_5;

/* renamed from: X.C3i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30706C3i implements InterfaceC30497By1 {
    public final /* synthetic */ C30698C3a LIZ;

    public C30706C3i(C30698C3a c30698C3a) {
        this.LIZ = c30698C3a;
    }

    @Override // X.InterfaceC30497By1
    public final void onError(int i, int i2) {
        StringBuilder LIZJ = C06460Ne.LIZJ("mCameraCapture onError = ", i, " ", i2, " ");
        C31811Ce7.LJ(LIZJ, null, LIZJ, "LinkVideo2View");
    }

    @Override // X.InterfaceC30497By1
    public final void onInfo(int i, int i2, int i3, String str) {
        if (i == 1) {
            C30698C3a c30698C3a = this.LIZ;
            if (!c30698C3a.LJLJLLL) {
                c30698C3a.LJLL = (C73411SrX) AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(1, this, 21), new AfS37S0000000_5(1));
            }
        }
    }
}
