package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PositionConfig_ProtoDecoder implements InterfaceC31105CIr<PositionConfig> {
    public static PositionConfig LIZIZ(Q9H q9h) {
        PositionConfig positionConfig = new PositionConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    positionConfig.maxPosition = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return positionConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PositionConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
