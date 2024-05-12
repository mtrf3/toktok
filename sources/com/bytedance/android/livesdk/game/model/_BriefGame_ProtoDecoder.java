package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _BriefGame_ProtoDecoder implements InterfaceC31105CIr<BriefGame> {
    public static BriefGame LIZIZ(Q9H q9h) {
        BriefGame briefGame = new BriefGame();
        briefGame.labels = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        briefGame.id = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        briefGame.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        briefGame.name = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        briefGame.icon = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        briefGame.labels.add(Q9J.LIZIZ(q9h));
                        break;
                    case 6:
                        briefGame.androidPackage = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        briefGame.iosBundleId = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        briefGame.openGll = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return briefGame;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BriefGame LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
