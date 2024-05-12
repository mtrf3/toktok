package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _BlockRecommendUserRequestParams_ProtoDecoder implements InterfaceC31105CIr<BlockRecommendUserRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final BlockRecommendUserRequestParams LIZ(Q9H q9h) {
        BlockRecommendUserRequestParams blockRecommendUserRequestParams = new BlockRecommendUserRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    blockRecommendUserRequestParams.blockedUserId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return blockRecommendUserRequestParams;
            }
        }
    }
}
