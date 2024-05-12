package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetTimerSubscriberListRequest_ProtoDecoder implements InterfaceC31105CIr<GetTimerSubscriberListRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetTimerSubscriberListRequest LIZ(Q9H q9h) {
        GetTimerSubscriberListRequest getTimerSubscriberListRequest = new GetTimerSubscriberListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    getTimerSubscriberListRequest.size = q9h.LJIIJJI();
                                }
                            } else {
                                getTimerSubscriberListRequest.cursor = q9h.LJIIJJI();
                            }
                        } else {
                            getTimerSubscriberListRequest.timerId = q9h.LJIIJJI();
                        }
                    } else {
                        getTimerSubscriberListRequest.secAnchorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    getTimerSubscriberListRequest.forAnchor = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getTimerSubscriberListRequest;
            }
        }
    }
}
