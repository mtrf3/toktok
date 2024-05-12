package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.linkmic.common._PositionConfig_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _InitConfig_ProtoDecoder implements InterfaceC31105CIr<InitConfig> {
    public static InitConfig LIZIZ(Q9H q9h) {
        InitConfig initConfig = new InitConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    initConfig.posConfig = _PositionConfig_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return initConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InitConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
