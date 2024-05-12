package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FansConfigRequest_ProtoDecoder implements InterfaceC31105CIr<FansConfigRequest> {
    @Override // X.InterfaceC31105CIr
    public final FansConfigRequest LIZ(Q9H q9h) {
        FansConfigRequest fansConfigRequest = new FansConfigRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return fansConfigRequest;
    }
}
