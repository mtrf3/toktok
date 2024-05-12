package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubGoal_ProtoDecoder implements InterfaceC31105CIr<SubGoal> {
    public static SubGoal LIZIZ(Q9H q9h) {
        SubGoal subGoal = new SubGoal();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subGoal.goalCount = q9h.LJIIJJI();
                    }
                } else {
                    subGoal.reachCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return subGoal;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubGoal LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
