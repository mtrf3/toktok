package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkMicBattlePunishFinishMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicBattlePunishFinishMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicBattlePunishFinishMessage LIZ(Q9H q9h) {
        LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage = new LinkMicBattlePunishFinishMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkMicBattlePunishFinishMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkMicBattlePunishFinishMessage.channelId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkMicBattlePunishFinishMessage.opUid = q9h.LJIIJJI();
                        break;
                    case 4:
                        linkMicBattlePunishFinishMessage.reason = q9h.LJIIJ();
                        break;
                    case 5:
                        linkMicBattlePunishFinishMessage.battleId = q9h.LJIIJJI();
                        break;
                    case 6:
                        linkMicBattlePunishFinishMessage.battleSettings = _BattleSetting_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicBattlePunishFinishMessage;
            }
        }
    }
}
