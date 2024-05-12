package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _JoinedFansClubRequest_ProtoDecoder implements InterfaceC31105CIr<JoinedFansClubRequest> {
    @Override // X.InterfaceC31105CIr
    public final JoinedFansClubRequest LIZ(Q9H q9h) {
        JoinedFansClubRequest joinedFansClubRequest = new JoinedFansClubRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                joinedFansClubRequest.count = q9h.LJIIJJI();
                            }
                        } else {
                            joinedFansClubRequest.offset = q9h.LJIIJJI();
                        }
                    } else {
                        joinedFansClubRequest.secAnchorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    joinedFansClubRequest.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinedFansClubRequest;
            }
        }
    }
}
