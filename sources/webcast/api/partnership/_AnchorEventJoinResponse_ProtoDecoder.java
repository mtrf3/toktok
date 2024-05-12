package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AnchorEventJoinResponse;

/* loaded from: classes14.dex */
public final class _AnchorEventJoinResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorEventJoinResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorEventJoinResponse LIZ(Q9H q9h) {
        AnchorEventJoinResponse anchorEventJoinResponse = new AnchorEventJoinResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    AnchorEventJoinResponse.ResponseData responseData = new AnchorEventJoinResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    anchorEventJoinResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorEventJoinResponse;
            }
        }
    }
}
