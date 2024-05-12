package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LiveFragmentClipEditResponse_ProtoDecoder implements InterfaceC31105CIr<LiveFragmentClipEditResponse> {
    @Override // X.InterfaceC31105CIr
    public final LiveFragmentClipEditResponse LIZ(Q9H q9h) {
        LiveFragmentClipEditResponse liveFragmentClipEditResponse = new LiveFragmentClipEditResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    liveFragmentClipEditResponse.data = _LiveFragmentClipEditResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveFragmentClipEditResponse;
            }
        }
    }
}
