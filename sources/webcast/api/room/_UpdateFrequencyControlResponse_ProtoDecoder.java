package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UpdateFrequencyControlResponse_ProtoDecoder implements InterfaceC31105CIr<UpdateFrequencyControlResponse> {
    @Override // X.InterfaceC31105CIr
    public final UpdateFrequencyControlResponse LIZ(Q9H q9h) {
        UpdateFrequencyControlResponse updateFrequencyControlResponse = new UpdateFrequencyControlResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        UpdateFrequencyControlData updateFrequencyControlData = new UpdateFrequencyControlData();
                        long LIZJ2 = q9h.LIZJ();
                        while (q9h.LJI() != -1) {
                            Q9J.LIZJ(q9h);
                        }
                        q9h.LJ(LIZJ2);
                        updateFrequencyControlResponse.data = updateFrequencyControlData;
                    }
                } else {
                    updateFrequencyControlResponse.extra = _UpdateFrequencyControlExtra_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return updateFrequencyControlResponse;
            }
        }
    }
}
