package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _AnchorLiveFragmentListResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveFragmentListResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorLiveFragmentListResponse LIZ(Q9H q9h) {
        AnchorLiveFragmentListResponse anchorLiveFragmentListResponse = new AnchorLiveFragmentListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorLiveFragmentListResponse.data = _AnchorLiveFragmentListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLiveFragmentListResponse;
            }
        }
    }
}
