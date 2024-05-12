package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _WishListResponse_WishList_ProtoDecoder implements InterfaceC31105CIr<WishListResponse.WishList> {
    public static WishListResponse.WishList LIZIZ(Q9H q9h) {
        WishListResponse.WishList wishList = new WishListResponse.WishList();
        wishList.wishes = new ArrayList();
        wishList.contributors = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        wishList.status = q9h.LJIIJ();
                        break;
                    case 2:
                        wishList.wishes.add(_WishListResponse_Wish_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        wishList.contributors.add(_WishListResponse_WishContributor_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        wishList.contributorsLength = q9h.LJIIJ();
                        break;
                    case 5:
                        wishList.description = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        wishList.auditStatus = Integer.valueOf(q9h.LJIIJ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return wishList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WishListResponse.WishList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
