package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _Reward_ProtoDecoder implements InterfaceC31105CIr<Reward> {
    public static Reward LIZIZ(Q9H q9h) {
        Reward reward = new Reward();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    reward.cdkey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reward;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Reward LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
