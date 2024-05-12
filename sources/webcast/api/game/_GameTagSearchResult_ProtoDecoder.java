package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._GameTag_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GameTagSearchResult_ProtoDecoder implements InterfaceC31105CIr<GameTagSearchResult> {
    public static GameTagSearchResult LIZIZ(Q9H q9h) {
        GameTagSearchResult gameTagSearchResult = new GameTagSearchResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        gameTagSearchResult.searchAttachedInfo = Q9J.LIZIZ(q9h);
                    }
                } else {
                    gameTagSearchResult.tag = _GameTag_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameTagSearchResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameTagSearchResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
