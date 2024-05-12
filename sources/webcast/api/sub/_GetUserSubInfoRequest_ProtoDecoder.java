package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetUserSubInfoRequest_ProtoDecoder implements InterfaceC31105CIr<GetUserSubInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetUserSubInfoRequest LIZ(Q9H q9h) {
        GetUserSubInfoRequest getUserSubInfoRequest = new GetUserSubInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getUserSubInfoRequest.anchorId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getUserSubInfoRequest;
            }
        }
    }
}
