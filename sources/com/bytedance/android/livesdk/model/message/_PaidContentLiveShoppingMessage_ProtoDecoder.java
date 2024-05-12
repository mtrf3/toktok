package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _PaidContentLiveShoppingMessage_ProtoDecoder implements InterfaceC31105CIr<PaidContentLiveShoppingMessage> {
    @Override // X.InterfaceC31105CIr
    public final PaidContentLiveShoppingMessage LIZ(Q9H q9h) {
        PaidContentLiveShoppingMessage paidContentLiveShoppingMessage = new PaidContentLiveShoppingMessage();
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
                                    paidContentLiveShoppingMessage.timeTag = _TimeTag_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                paidContentLiveShoppingMessage.popSeries = _PopSeries_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            paidContentLiveShoppingMessage.liveSeriesNumber = q9h.LJIIJ();
                        }
                    } else {
                        paidContentLiveShoppingMessage.actionType = q9h.LJIIJ();
                    }
                } else {
                    paidContentLiveShoppingMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return paidContentLiveShoppingMessage;
            }
        }
    }
}
