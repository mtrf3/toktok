package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UpdateDualCamStatusExtra_ProtoDecoder implements InterfaceC31105CIr<UpdateDualCamStatusExtra> {
    public static UpdateDualCamStatusExtra LIZIZ(Q9H q9h) {
        UpdateDualCamStatusExtra updateDualCamStatusExtra = new UpdateDualCamStatusExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    updateDualCamStatusExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return updateDualCamStatusExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateDualCamStatusExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
