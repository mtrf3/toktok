package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetNewAnchorGuideFeedbackConfigResponse_ProtoDecoder implements InterfaceC31105CIr<GetNewAnchorGuideFeedbackConfigResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetNewAnchorGuideFeedbackConfigResponse LIZ(Q9H q9h) {
        GetNewAnchorGuideFeedbackConfigResponse getNewAnchorGuideFeedbackConfigResponse = new GetNewAnchorGuideFeedbackConfigResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getNewAnchorGuideFeedbackConfigResponse.data = _GetNewAnchorGuideFeedbackConfigResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getNewAnchorGuideFeedbackConfigResponse;
            }
        }
    }
}
