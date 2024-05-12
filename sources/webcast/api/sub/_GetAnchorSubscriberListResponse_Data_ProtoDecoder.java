package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.sub.GetAnchorSubscriberListResponse;

/* loaded from: classes17.dex */
public final class _GetAnchorSubscriberListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetAnchorSubscriberListResponse.Data> {
    public static GetAnchorSubscriberListResponse.Data LIZIZ(Q9H q9h) {
        GetAnchorSubscriberListResponse.Data data = new GetAnchorSubscriberListResponse.Data();
        data.subscriberMsg = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                data.totalSubCount = q9h.LJIIJJI();
                            }
                        } else {
                            data.goalCount = q9h.LJIIJJI();
                        }
                    } else {
                        data.reachCount = q9h.LJIIJJI();
                    }
                } else {
                    data.subscriberMsg.add(_SubscriberMsg_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetAnchorSubscriberListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
