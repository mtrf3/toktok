package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.PopularCardMessage;

/* loaded from: classes6.dex */
public final class _PopularCardMessage_PopularCardInfo_ProtoDecoder implements InterfaceC31105CIr<PopularCardMessage.PopularCardInfo> {
    public static PopularCardMessage.PopularCardInfo LIZIZ(Q9H q9h) {
        PopularCardMessage.PopularCardInfo popularCardInfo = new PopularCardMessage.PopularCardInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            Q9J.LIZJ(q9h);
                        } else {
                            popularCardInfo.enterNumber = q9h.LJIIJ();
                        }
                    } else {
                        popularCardInfo.endTime = q9h.LJIIJJI();
                    }
                } else {
                    popularCardInfo.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return popularCardInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PopularCardMessage.PopularCardInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
