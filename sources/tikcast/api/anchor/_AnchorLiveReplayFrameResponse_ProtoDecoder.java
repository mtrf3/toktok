package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _AnchorLiveReplayFrameResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveReplayFrameResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorLiveReplayFrameResponse LIZ(Q9H q9h) {
        AnchorLiveReplayFrameResponse anchorLiveReplayFrameResponse = new AnchorLiveReplayFrameResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorLiveReplayFrameResponse.data = _AnchorLiveReplayFrameResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLiveReplayFrameResponse;
            }
        }
    }
}
