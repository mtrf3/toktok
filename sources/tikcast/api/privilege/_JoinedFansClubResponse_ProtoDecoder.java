package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _JoinedFansClubResponse_ProtoDecoder implements InterfaceC31105CIr<JoinedFansClubResponse> {
    @Override // X.InterfaceC31105CIr
    public final JoinedFansClubResponse LIZ(Q9H q9h) {
        JoinedFansClubResponse joinedFansClubResponse = new JoinedFansClubResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    joinedFansClubResponse.data = _JoinedFansClubResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinedFansClubResponse;
            }
        }
    }
}