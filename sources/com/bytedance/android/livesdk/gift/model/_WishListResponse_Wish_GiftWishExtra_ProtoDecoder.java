package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.WishListResponse;

/* loaded from: classes17.dex */
public final class _WishListResponse_Wish_GiftWishExtra_ProtoDecoder implements InterfaceC31105CIr<WishListResponse.Wish.GiftWishExtra> {
    public static WishListResponse.Wish.GiftWishExtra LIZIZ(Q9H q9h) {
        WishListResponse.Wish.GiftWishExtra giftWishExtra = new WishListResponse.Wish.GiftWishExtra();
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
                                giftWishExtra.giftType = q9h.LJIIJ();
                            }
                        } else {
                            giftWishExtra.giftDiamondCount = (int) q9h.LJIIJJI();
                        }
                    } else {
                        giftWishExtra.giftIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    giftWishExtra.giftName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftWishExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WishListResponse.Wish.GiftWishExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
