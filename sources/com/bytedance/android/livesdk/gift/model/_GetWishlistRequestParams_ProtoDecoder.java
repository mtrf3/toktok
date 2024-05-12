package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetWishlistRequestParams_ProtoDecoder implements InterfaceC31105CIr<GetWishlistRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final GetWishlistRequestParams LIZ(Q9H q9h) {
        GetWishlistRequestParams getWishlistRequestParams = new GetWishlistRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getWishlistRequestParams.roomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    getWishlistRequestParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return getWishlistRequestParams;
            }
        }
    }
}
