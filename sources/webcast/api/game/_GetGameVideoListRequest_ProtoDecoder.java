package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetGameVideoListRequest_ProtoDecoder implements InterfaceC31105CIr<GetGameVideoListRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetGameVideoListRequest LIZ(Q9H q9h) {
        GetGameVideoListRequest getGameVideoListRequest = new GetGameVideoListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    getGameVideoListRequest.pullType = q9h.LJIIJ();
                                }
                            } else {
                                getGameVideoListRequest.scene = q9h.LJIIJ();
                            }
                        } else {
                            getGameVideoListRequest.gameTagId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        getGameVideoListRequest.authorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    getGameVideoListRequest.videoId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getGameVideoListRequest;
            }
        }
    }
}
