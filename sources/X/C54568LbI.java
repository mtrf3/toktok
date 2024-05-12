package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem;

/* renamed from: X.LbI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54568LbI implements InterfaceC54674Ld0 {
    public final /* synthetic */ NearbySkylightBaseAssem LIZ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGranted, isShowing: ");
        LIZ.append(this.LIZ.LJLJLLL);
        L8O.LIZ(X1D.LIZIZ(LIZ));
        TokenCert with = TokenCert.Companion.with("bpea-nearby_request_location_unnecessary_two");
        with.auth("svfi");
        C51733KSb.LIZ("poi", "nearby", with, null, new C54582LbW(), 32);
    }

    public C54568LbI(NearbySkylightBaseAssem nearbySkylightBaseAssem) {
        this.LIZ = nearbySkylightBaseAssem;
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDeny type: ");
        LIZ.append(i);
        L8O.LIZ(X1D.LIZIZ(LIZ));
        if (i != 3) {
            this.LIZ.M3();
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancel: type: ");
        LIZ.append(i);
        LIZ.append(", msg: ");
        LIZ.append(str);
        L8O.LIZ(X1D.LIZIZ(LIZ));
        if (i == 1) {
            this.LIZ.M3();
        }
    }
}
