package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagBaseInfo_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagWinnerInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GoodyBagMessage_ProtoDecoder implements InterfaceC31105CIr<GoodyBagMessage> {
    @Override // X.InterfaceC31105CIr
    public final GoodyBagMessage LIZ(Q9H q9h) {
        GoodyBagMessage goodyBagMessage = new GoodyBagMessage();
        goodyBagMessage.winners = new ArrayList();
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
                                goodyBagMessage.type = q9h.LJIIJ();
                            }
                        } else {
                            goodyBagMessage.winners.add(_GoodyBagWinnerInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        goodyBagMessage.baseInfo = _GoodyBagBaseInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    goodyBagMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagMessage;
            }
        }
    }
}
