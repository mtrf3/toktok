package X;

import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.relieveaweme.RelieveAwemeApi;

/* renamed from: X.Mb0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57098Mb0 extends AbstractC57102Mb4 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C57101Mb3.LJLIL);

    @Override // X.AbstractC57102Mb4, X.InterfaceC57163Mc3
    public final void onCleared() {
        MXS.LIZIZ = false;
    }

    @Override // X.InterfaceC57163Mc3
    public final boolean LIZ(long j, long j2) {
        int i;
        int i2 = C55371LoF.LIZIZ().LJLILLLLZI;
        int i3 = C55371LoF.LIZIZ().LJLJI;
        if (i2 <= 0 || i3 <= 0) {
            return false;
        }
        C55371LoF LIZIZ = C55371LoF.LIZIZ();
        if (LIZIZ.LIZJ(j)) {
            i = LIZIZ.LJLJI;
        } else {
            i = LIZIZ.LJLILLLLZI;
        }
        long j3 = i * 1000;
        if (j3 <= 0 || j2 <= j3 || !((FWI) this.LIZ.getValue()).LIZ(j)) {
            return false;
        }
        ((FWI) this.LIZ.getValue()).LIZJ(j);
        ((RelieveAwemeApi.RealApi) RelieveAwemeApi.LIZ.getValue()).getTiktokRelieveAweme(!C55371LoF.LIZIZ().LIZJ(System.currentTimeMillis()) ? 1 : 0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C57097Maz.LJLIL, C57100Mb2.LJLIL);
        return true;
    }
}
