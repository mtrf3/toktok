package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AnchorInfoResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorInfoResponse LIZ(Q9H q9h) {
        AnchorInfoResponse anchorInfoResponse = new AnchorInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorInfoResponse.data = _AnchorInfoResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorInfoResponse;
            }
        }
    }
}
