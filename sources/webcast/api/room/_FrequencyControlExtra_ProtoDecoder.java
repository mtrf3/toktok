package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _FrequencyControlExtra_ProtoDecoder implements InterfaceC31105CIr<FrequencyControlExtra> {
    public static FrequencyControlExtra LIZIZ(Q9H q9h) {
        FrequencyControlExtra frequencyControlExtra = new FrequencyControlExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    frequencyControlExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return frequencyControlExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FrequencyControlExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
