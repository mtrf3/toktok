package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _IntroConflictInfo_ProtoDecoder implements InterfaceC31105CIr<IntroConflictInfo> {
    public static IntroConflictInfo LIZIZ(Q9H q9h) {
        IntroConflictInfo introConflictInfo = new IntroConflictInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    introConflictInfo.content = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return introConflictInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final IntroConflictInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}