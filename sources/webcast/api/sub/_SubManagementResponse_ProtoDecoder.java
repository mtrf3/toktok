package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubManagementResponse_ProtoDecoder implements InterfaceC31105CIr<SubManagementResponse> {
    @Override // X.InterfaceC31105CIr
    public final SubManagementResponse LIZ(Q9H q9h) {
        SubManagementResponse subManagementResponse = new SubManagementResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subManagementResponse.data = _SubManagementResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subManagementResponse;
            }
        }
    }
}