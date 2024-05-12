package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.subscribe.model._SubscriberInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.sub.GetTimerSubscriberListResponse;

/* loaded from: classes17.dex */
public final class _GetTimerSubscriberListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetTimerSubscriberListResponse.Data> {
    public static GetTimerSubscriberListResponse.Data LIZIZ(Q9H q9h) {
        GetTimerSubscriberListResponse.Data data = new GetTimerSubscriberListResponse.Data();
        data.subscribers = new ArrayList();
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
                                data.subscriberCount = q9h.LJIIJJI();
                            }
                        } else {
                            data.hasNext = Q9J.LIZ(q9h);
                        }
                    } else {
                        data.nextCursor = q9h.LJIIJJI();
                    }
                } else {
                    data.subscribers.add(_SubscriberInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetTimerSubscriberListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
