package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.XGGoodsOrderMessage;

/* loaded from: classes6.dex */
public final class _XGGoodsOrderMessage_GoodsOrder_ProtoDecoder implements InterfaceC31105CIr<XGGoodsOrderMessage.GoodsOrder> {
    public static XGGoodsOrderMessage.GoodsOrder LIZIZ(Q9H q9h) {
        XGGoodsOrderMessage.GoodsOrder goodsOrder = new XGGoodsOrderMessage.GoodsOrder();
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
                                goodsOrder.orderId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            goodsOrder.orderMoney = q9h.LJIIJJI();
                        }
                    } else {
                        goodsOrder.orderNum = q9h.LJIIJJI();
                    }
                } else {
                    goodsOrder.goodsRoomOrder = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return goodsOrder;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final XGGoodsOrderMessage.GoodsOrder LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
