package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetGameVideoListResponse_ProtoDecoder implements InterfaceC31105CIr<GetGameVideoListResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetGameVideoListResponse LIZ(Q9H q9h) {
        GetGameVideoListResponse getGameVideoListResponse = new GetGameVideoListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getGameVideoListResponse.extra = _FeedExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    getGameVideoListResponse.data = _GetGameVideoListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getGameVideoListResponse;
            }
        }
    }
}
