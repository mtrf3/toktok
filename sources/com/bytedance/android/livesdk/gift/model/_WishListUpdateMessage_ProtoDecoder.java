package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _WishListUpdateMessage_ProtoDecoder implements InterfaceC31105CIr<WishListUpdateMessage> {
    @Override // X.InterfaceC31105CIr
    public final WishListUpdateMessage LIZ(Q9H q9h) {
        WishListUpdateMessage wishListUpdateMessage = new WishListUpdateMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        wishListUpdateMessage.list = _WishListResponse_WishList_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    wishListUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return wishListUpdateMessage;
            }
        }
    }
}