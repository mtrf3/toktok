package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.WishListResponse;

/* loaded from: classes17.dex */
public final class _WishListResponse_Wish_ProtoDecoder implements InterfaceC31105CIr<WishListResponse.Wish> {
    public static WishListResponse.Wish LIZIZ(Q9H q9h) {
        WishListResponse.Wish wish = new WishListResponse.Wish();
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
                                    wish.giftWishExtra = _WishListResponse_Wish_GiftWishExtra_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                wish.target = (int) q9h.LJIIJJI();
                            }
                        } else {
                            wish.progress = (int) q9h.LJIIJJI();
                        }
                    } else {
                        wish.id = q9h.LJIIJJI();
                    }
                } else {
                    wish.wishType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return wish;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WishListResponse.Wish LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
