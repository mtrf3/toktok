package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _HourlyRankRewardMessage_ProtoDecoder implements InterfaceC31105CIr<HourlyRankRewardMessage> {
    @Override // X.InterfaceC31105CIr
    public final HourlyRankRewardMessage LIZ(Q9H q9h) {
        HourlyRankRewardMessage hourlyRankRewardMessage = new HourlyRankRewardMessage();
        hourlyRankRewardMessage.winners = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        hourlyRankRewardMessage.winners.add(_HourlyRankRewardInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    hourlyRankRewardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return hourlyRankRewardMessage;
            }
        }
    }
}
