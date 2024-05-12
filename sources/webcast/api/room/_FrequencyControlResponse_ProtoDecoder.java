package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _FrequencyControlResponse_ProtoDecoder implements InterfaceC31105CIr<FrequencyControlResponse> {
    @Override // X.InterfaceC31105CIr
    public final FrequencyControlResponse LIZ(Q9H q9h) {
        FrequencyControlResponse frequencyControlResponse = new FrequencyControlResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        frequencyControlResponse.data = _FrequencyControlData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    frequencyControlResponse.extra = _FrequencyControlExtra_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return frequencyControlResponse;
            }
        }
    }
}
