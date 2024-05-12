package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetTimerSubscriberListResponse_ProtoDecoder implements InterfaceC31105CIr<GetTimerSubscriberListResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetTimerSubscriberListResponse LIZ(Q9H q9h) {
        GetTimerSubscriberListResponse getTimerSubscriberListResponse = new GetTimerSubscriberListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getTimerSubscriberListResponse.data = _GetTimerSubscriberListResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getTimerSubscriberListResponse;
            }
        }
    }
}
