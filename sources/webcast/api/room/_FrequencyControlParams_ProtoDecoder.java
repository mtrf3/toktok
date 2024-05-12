package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _FrequencyControlParams_ProtoDecoder implements InterfaceC31105CIr<FrequencyControlParams> {
    @Override // X.InterfaceC31105CIr
    public final FrequencyControlParams LIZ(Q9H q9h) {
        FrequencyControlParams frequencyControlParams = new FrequencyControlParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        frequencyControlParams.roomId = q9h.LJIIJJI();
                    }
                } else {
                    frequencyControlParams.fcType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return frequencyControlParams;
            }
        }
    }
}
