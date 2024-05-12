package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _AnchorTagListResult_ProtoDecoder implements InterfaceC31105CIr<AnchorTagListResult> {
    public static AnchorTagListResult LIZIZ(Q9H q9h) {
        AnchorTagListResult anchorTagListResult = new AnchorTagListResult();
        anchorTagListResult.genres = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorTagListResult.gameName = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        anchorTagListResult.gameId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        anchorTagListResult.gameTagId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        anchorTagListResult.index = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        anchorTagListResult.iconUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        anchorTagListResult.iconUri = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        anchorTagListResult.genres.add(_GameAnchorCategory_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorTagListResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorTagListResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
