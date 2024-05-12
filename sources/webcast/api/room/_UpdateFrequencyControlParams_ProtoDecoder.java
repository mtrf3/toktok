package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateFrequencyControlParams_ProtoDecoder implements InterfaceC31105CIr<UpdateFrequencyControlParams> {
    @Override // X.InterfaceC31105CIr
    public final UpdateFrequencyControlParams LIZ(Q9H q9h) {
        UpdateFrequencyControlParams updateFrequencyControlParams = new UpdateFrequencyControlParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        updateFrequencyControlParams.roomId = q9h.LJIIJJI();
                    }
                } else {
                    updateFrequencyControlParams.fcType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return updateFrequencyControlParams;
            }
        }
    }
}
