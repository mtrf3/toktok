package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DropsClaimRequest_ProtoDecoder implements InterfaceC31105CIr<DropsClaimRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsClaimRequest LIZ(Q9H q9h) {
        DropsClaimRequest dropsClaimRequest = new DropsClaimRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    dropsClaimRequest.anchorId = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                dropsClaimRequest.roomId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            dropsClaimRequest.taskId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        dropsClaimRequest.round = q9h.LJIIJ();
                    }
                } else {
                    dropsClaimRequest.dropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsClaimRequest;
            }
        }
    }
}
