package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility;
import com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestBaseAssem;
import kotlin.jvm.internal.AqS156S0200000_9;

/* renamed from: X.LbB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54561LbB implements InterfaceC54674Ld0 {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ NearbyLocationPermissionRequestBaseAssem LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ ActivityC45651qj LIZLLL;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        this.LIZ.invoke();
        INearbyCategoryTabAbility iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(this.LIZLLL, null), INearbyCategoryTabAbility.class, null);
        if (iNearbyCategoryTabAbility != null) {
            TokenCert with = TokenCert.Companion.with("bpea-nearby_request_location_unnecessary_by_popup_manager_v3");
            with.auth("svfi");
            iNearbyCategoryTabAbility.Mn0(with, this.LIZLLL);
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
        this.LIZ.invoke();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDeny:");
        LIZ.append(System.currentTimeMillis() - this.LIZJ);
        LIZ.append(", type: ");
        LIZ.append(i);
        L8O.LIZ(X1D.LIZIZ(LIZ));
        if (i == 3) {
            this.LIZIZ.I3();
        } else {
            this.LIZIZ.H3();
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
        this.LIZ.invoke();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancel:");
        LIZ.append(str);
        L8O.LIZ(X1D.LIZIZ(LIZ));
        if (i == 1) {
            this.LIZIZ.H3();
        } else {
            if (System.currentTimeMillis() - this.LIZJ >= 50 || i == 2) {
                return;
            }
            this.LIZIZ.I3();
        }
    }

    public C54561LbB(AqS156S0200000_9 aqS156S0200000_9, NearbyLocationPermissionRequestBaseAssem nearbyLocationPermissionRequestBaseAssem, long j, ActivityC45651qj activityC45651qj) {
        this.LIZ = aqS156S0200000_9;
        this.LIZIZ = nearbyLocationPermissionRequestBaseAssem;
        this.LIZJ = j;
        this.LIZLLL = activityC45651qj;
    }
}
