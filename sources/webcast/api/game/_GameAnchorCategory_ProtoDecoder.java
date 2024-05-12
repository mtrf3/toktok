package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameAnchorCategory_ProtoDecoder implements InterfaceC31105CIr<GameAnchorCategory> {
    public static GameAnchorCategory LIZIZ(Q9H q9h) {
        GameAnchorCategory gameAnchorCategory = new GameAnchorCategory();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        gameAnchorCategory.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    gameAnchorCategory.id = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameAnchorCategory;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameAnchorCategory LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
