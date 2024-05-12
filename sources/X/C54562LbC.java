package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility;
import com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestBaseAssem;

/* renamed from: X.LbC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54562LbC implements InterfaceC54674Ld0 {
    public final /* synthetic */ NearbyLocationPermissionRequestBaseAssem LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        INearbyCategoryTabAbility iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL((ActivityC45651qj) this.LIZIZ, null), INearbyCategoryTabAbility.class, null);
        if (iNearbyCategoryTabAbility != null) {
            TokenCert with = TokenCert.Companion.with("bpea-nearby_request_location_unnecessary_v3");
            with.auth("svfi");
            iNearbyCategoryTabAbility.Mn0(with, (ActivityC45651qj) this.LIZIZ);
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDeny type: ");
        LIZ.append(i);
        L8O.LIZ(X1D.LIZIZ(LIZ));
        if (i != 3) {
            this.LIZ.H3();
        }
    }

    public C54562LbC(NearbyLocationPermissionRequestBaseAssem nearbyLocationPermissionRequestBaseAssem, Context context) {
        this.LIZ = nearbyLocationPermissionRequestBaseAssem;
        this.LIZIZ = context;
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
            this.LIZ.H3();
        }
    }
}
