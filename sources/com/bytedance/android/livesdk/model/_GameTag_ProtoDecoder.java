package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GameTag_ProtoDecoder implements InterfaceC31105CIr<GameTag> {
    public static GameTag LIZIZ(Q9H q9h) {
        GameTag gameTag = new GameTag();
        gameTag.hashtagList = new ArrayList();
        gameTag.gameCategory = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gameTag.id = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        gameTag.showName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        gameTag.shortName = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        gameTag.fullName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 6:
                        gameTag.hashtagList.add(_Hashtag_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        gameTag.gameCategory.add(_GameTagCategory_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        gameTag.landscape = (int) q9h.LJIIJJI();
                        break;
                    case 9:
                        gameTag.packageName = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        gameTag.bundleId = Q9J.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gameTag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameTag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
