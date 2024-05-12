package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _QuitFansClubRequest_ProtoDecoder implements InterfaceC31105CIr<QuitFansClubRequest> {
    @Override // X.InterfaceC31105CIr
    public final QuitFansClubRequest LIZ(Q9H q9h) {
        QuitFansClubRequest quitFansClubRequest = new QuitFansClubRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    quitFansClubRequest.secAnchorId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return quitFansClubRequest;
            }
        }
    }
}
