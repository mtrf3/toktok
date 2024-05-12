package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UpdateFrequencyControlExtra_ProtoDecoder implements InterfaceC31105CIr<UpdateFrequencyControlExtra> {
    public static UpdateFrequencyControlExtra LIZIZ(Q9H q9h) {
        UpdateFrequencyControlExtra updateFrequencyControlExtra = new UpdateFrequencyControlExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    updateFrequencyControlExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return updateFrequencyControlExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateFrequencyControlExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
