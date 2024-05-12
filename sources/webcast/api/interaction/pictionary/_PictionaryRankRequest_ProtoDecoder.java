package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PictionaryRankRequest_ProtoDecoder implements InterfaceC31105CIr<PictionaryRankRequest> {
    @Override // X.InterfaceC31105CIr
    public final PictionaryRankRequest LIZ(Q9H q9h) {
        PictionaryRankRequest pictionaryRankRequest = new PictionaryRankRequest();
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
                                pictionaryRankRequest.pageSize = q9h.LJIIJJI();
                            }
                        } else {
                            pictionaryRankRequest.pageOffset = q9h.LJIIJJI();
                        }
                    } else {
                        pictionaryRankRequest.pictionaryId = q9h.LJIIJJI();
                    }
                } else {
                    pictionaryRankRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pictionaryRankRequest;
            }
        }
    }
}
