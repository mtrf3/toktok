package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G1j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40847G1j extends AbstractC40941G4z {
    public final /* synthetic */ C40840G1c LIZ;

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

    public C40847G1j(C40840G1c c40840G1c) {
        this.LIZ = c40840G1c;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onSuccess(C62962OnO result) {
        o.LJIIIZ(result, "result");
        this.LIZ.LJIIIIZZ();
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onUnderage(C62962OnO result) {
        o.LJIIIZ(result, "result");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAgeGateVerifyUnderAge ");
        LIZ.append(result);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (result.LIZ == EnumC63002Oo2.US_FTC) {
            this.LIZ.LJIIIIZZ();
            return false;
        }
        return false;
    }
}
