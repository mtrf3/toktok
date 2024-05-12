package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem;
import kotlin.jvm.internal.AqS156S0200000_9;

/* renamed from: X.LbJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54569LbJ implements InterfaceC54674Ld0 {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ NearbySkylightBaseAssem LIZIZ;
    public final /* synthetic */ long LIZJ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        this.LIZ.invoke();
        TokenCert with = TokenCert.Companion.with("bpea-nearby_request_location_unnecessary_by_popup_manager_two");
        with.auth("svfi");
        C51733KSb.LIZ("poi", "nearby", with, null, new C54583LbX(), 32);
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
            this.LIZIZ.Q3();
        } else {
            this.LIZIZ.M3();
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
            this.LIZIZ.M3();
        } else {
            if (System.currentTimeMillis() - this.LIZJ >= 50 || i == 2) {
                return;
            }
            this.LIZIZ.Q3();
        }
    }

    public C54569LbJ(AqS156S0200000_9 aqS156S0200000_9, NearbySkylightBaseAssem nearbySkylightBaseAssem, long j) {
        this.LIZ = aqS156S0200000_9;
        this.LIZIZ = nearbySkylightBaseAssem;
        this.LIZJ = j;
    }
}
