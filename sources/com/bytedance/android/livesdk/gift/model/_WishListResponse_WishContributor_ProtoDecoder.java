package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.WishListResponse;

/* loaded from: classes17.dex */
public final class _WishListResponse_WishContributor_ProtoDecoder implements InterfaceC31105CIr<WishListResponse.WishContributor> {
    public static WishListResponse.WishContributor LIZIZ(Q9H q9h) {
        WishListResponse.WishContributor wishContributor = new WishListResponse.WishContributor();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        wishContributor.userId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        wishContributor.secUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        wishContributor.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        wishContributor.displayId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        wishContributor.score = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        wishContributor.userIdStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return wishContributor;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WishListResponse.WishContributor LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
