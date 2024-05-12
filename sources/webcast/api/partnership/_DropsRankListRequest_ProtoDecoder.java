package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _DropsRankListRequest_ProtoDecoder implements InterfaceC31105CIr<DropsRankListRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsRankListRequest LIZ(Q9H q9h) {
        DropsRankListRequest dropsRankListRequest = new DropsRankListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            dropsRankListRequest.dropsId = q9h.LJIIJJI();
                        }
                    } else {
                        dropsRankListRequest.endRank = q9h.LJIIJ();
                    }
                } else {
                    dropsRankListRequest.startRank = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsRankListRequest;
            }
        }
    }
}
