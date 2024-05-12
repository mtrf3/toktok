package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _DropsRewardsRequest_ProtoDecoder implements InterfaceC31105CIr<DropsRewardsRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsRewardsRequest LIZ(Q9H q9h) {
        DropsRewardsRequest dropsRewardsRequest = new DropsRewardsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            dropsRewardsRequest.limit = q9h.LJIIJJI();
                        }
                    } else {
                        dropsRewardsRequest.offset = q9h.LJIIJJI();
                    }
                } else {
                    dropsRewardsRequest.dropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsRewardsRequest;
            }
        }
    }
}
