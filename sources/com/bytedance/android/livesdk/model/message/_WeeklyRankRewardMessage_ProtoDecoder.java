package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _WeeklyRankRewardMessage_ProtoDecoder implements InterfaceC31105CIr<WeeklyRankRewardMessage> {
    @Override // X.InterfaceC31105CIr
    public final WeeklyRankRewardMessage LIZ(Q9H q9h) {
        WeeklyRankRewardMessage weeklyRankRewardMessage = new WeeklyRankRewardMessage();
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
                                weeklyRankRewardMessage.notifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            weeklyRankRewardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        weeklyRankRewardMessage.borderInfo = _BorderInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    weeklyRankRewardMessage.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return weeklyRankRewardMessage;
            }
        }
    }
}
