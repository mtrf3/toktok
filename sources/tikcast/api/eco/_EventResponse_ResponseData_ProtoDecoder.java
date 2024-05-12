package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.EventResponse;

/* loaded from: classes14.dex */
public final class _EventResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<EventResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final EventResponse.ResponseData LIZ(Q9H q9h) {
        EventResponse.ResponseData responseData = new EventResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
