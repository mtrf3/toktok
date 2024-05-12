package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RecommendSensitiveWordReq_ProtoDecoder implements InterfaceC31105CIr<RecommendSensitiveWordReq> {
    @Override // X.InterfaceC31105CIr
    public final RecommendSensitiveWordReq LIZ(Q9H q9h) {
        RecommendSensitiveWordReq recommendSensitiveWordReq = new RecommendSensitiveWordReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                recommendSensitiveWordReq.action = q9h.LJIIJJI();
                            }
                        } else {
                            recommendSensitiveWordReq.secAnchorId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        recommendSensitiveWordReq.content = Q9J.LIZIZ(q9h);
                    }
                } else {
                    recommendSensitiveWordReq.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return recommendSensitiveWordReq;
            }
        }
    }
}
