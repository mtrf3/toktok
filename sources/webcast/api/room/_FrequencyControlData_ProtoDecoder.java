package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _FrequencyControlData_ProtoDecoder implements InterfaceC31105CIr<FrequencyControlData> {
    public static FrequencyControlData LIZIZ(Q9H q9h) {
        FrequencyControlData frequencyControlData = new FrequencyControlData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        frequencyControlData.avoidReason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    frequencyControlData.result = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return frequencyControlData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FrequencyControlData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
