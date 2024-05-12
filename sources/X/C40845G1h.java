package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G1h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40845G1h extends AbstractC40941G4z {
    public final /* synthetic */ C40842G1e LIZ;

    @Override // X.AbstractC40941G4z
    public final boolean onCancel() {
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onDeviceBlocked() {
        return false;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onError(PNSErrorModel error) {
        o.LJIIIZ(error, "error");
        return false;
    }

    public C40845G1h(C40842G1e c40842G1e) {
        this.LIZ = c40842G1e;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onSuccess(C62962OnO result) {
        o.LJIIIZ(result, "result");
        EOP.LIZ.LIZJ();
        this.LIZ.LIZLLL();
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onUnderage(C62962OnO result) {
        o.LJIIIZ(result, "result");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAgeGateVerifyUnderAge ");
        LIZ.append(result.LIZ);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (result.LIZ == EnumC63002Oo2.US_FTC) {
            EOP.LIZ.LIZJ();
            this.LIZ.LIZLLL();
            return false;
        }
        return false;
    }
}
