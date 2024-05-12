package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _LevelTaskProcess_ProtoDecoder implements InterfaceC31105CIr<LevelTaskProcess> {
    @Override // X.InterfaceC31105CIr
    public final LevelTaskProcess LIZ(Q9H q9h) {
        LevelTaskProcess levelTaskProcess = new LevelTaskProcess();
        levelTaskProcess.componentTaskProcess = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            levelTaskProcess.isLevelFinished = Q9J.LIZ(q9h);
                        }
                    } else {
                        levelTaskProcess.componentTaskProcess.add(_ComponentTaskProcess_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    levelTaskProcess.level = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return levelTaskProcess;
            }
        }
    }
}
