package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _AnchorCheckAndJoinEventResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorCheckAndJoinEventResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorCheckAndJoinEventResponse LIZ(Q9H q9h) {
        AnchorCheckAndJoinEventResponse anchorCheckAndJoinEventResponse = new AnchorCheckAndJoinEventResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorCheckAndJoinEventResponse.data = _AnchorCheckAndJoinEventResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorCheckAndJoinEventResponse;
            }
        }
    }
}
