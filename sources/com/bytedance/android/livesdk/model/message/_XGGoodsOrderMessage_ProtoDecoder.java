package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _XGGoodsOrderMessage_ProtoDecoder implements InterfaceC31105CIr<XGGoodsOrderMessage> {
    @Override // X.InterfaceC31105CIr
    public final XGGoodsOrderMessage LIZ(Q9H q9h) {
        XGGoodsOrderMessage xGGoodsOrderMessage = new XGGoodsOrderMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            xGGoodsOrderMessage.goodsOrder = _XGGoodsOrderMessage_GoodsOrder_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        xGGoodsOrderMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    xGGoodsOrderMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return xGGoodsOrderMessage;
            }
        }
    }
}
