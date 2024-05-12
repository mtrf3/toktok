package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _FansPrivilegeDetailRequest_ProtoDecoder implements InterfaceC31105CIr<FansPrivilegeDetailRequest> {
    @Override // X.InterfaceC31105CIr
    public final FansPrivilegeDetailRequest LIZ(Q9H q9h) {
        FansPrivilegeDetailRequest fansPrivilegeDetailRequest = new FansPrivilegeDetailRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    fansPrivilegeDetailRequest.anchorid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansPrivilegeDetailRequest;
            }
        }
    }
}
