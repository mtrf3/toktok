package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.battle._BattleRewardSettle_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskSettle_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskStart_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskUpdate_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkMicBattleTaskMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicBattleTaskMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicBattleTaskMessage LIZ(Q9H q9h) {
        LinkMicBattleTaskMessage linkMicBattleTaskMessage = new LinkMicBattleTaskMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkMicBattleTaskMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkMicBattleTaskMessage.battleTaskMessageType = q9h.LJIIJ();
                        break;
                    case 3:
                        linkMicBattleTaskMessage.taskStart = _BattleTaskStart_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        linkMicBattleTaskMessage.taskUpdate = _BattleTaskUpdate_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        linkMicBattleTaskMessage.taskSettle = _BattleTaskSettle_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        linkMicBattleTaskMessage.rewardSettle = _BattleRewardSettle_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicBattleTaskMessage;
            }
        }
    }
}
