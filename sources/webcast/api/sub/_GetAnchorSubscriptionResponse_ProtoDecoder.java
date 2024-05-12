package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetAnchorSubscriptionResponse_ProtoDecoder implements InterfaceC31105CIr<GetAnchorSubscriptionResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetAnchorSubscriptionResponse LIZ(Q9H q9h) {
        GetAnchorSubscriptionResponse getAnchorSubscriptionResponse = new GetAnchorSubscriptionResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getAnchorSubscriptionResponse.data = _GetAnchorSubscriptionResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getAnchorSubscriptionResponse;
            }
        }
    }
}
