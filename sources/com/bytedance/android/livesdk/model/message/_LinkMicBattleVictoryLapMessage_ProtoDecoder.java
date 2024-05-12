package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareOptOutNotice_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTips_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTriggerGuideV2_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTriggerGuide_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkMicBattleVictoryLapMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicBattleVictoryLapMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicBattleVictoryLapMessage LIZ(Q9H q9h) {
        LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage = new LinkMicBattleVictoryLapMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 10) {
                    if (LJI != 11) {
                        switch (LJI) {
                            case 1:
                                linkMicBattleVictoryLapMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 2:
                                linkMicBattleVictoryLapMessage.playType = q9h.LJIIJ();
                                break;
                            case 3:
                                linkMicBattleVictoryLapMessage.battleTruthOrDareTriggerGuide = _BattleTruthOrDareTriggerGuide_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 4:
                                linkMicBattleVictoryLapMessage.playTips = _BattleTruthOrDareTips_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 5:
                                linkMicBattleVictoryLapMessage.truthOrDareCloseNotice = _BattleTruthOrDareOptOutNotice_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 6:
                                linkMicBattleVictoryLapMessage.triggerGuideV2 = _BattleTruthOrDareTriggerGuideV2_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                    } else {
                        linkMicBattleVictoryLapMessage.battleId = q9h.LJIIJJI();
                    }
                } else {
                    linkMicBattleVictoryLapMessage.anchorRegion = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicBattleVictoryLapMessage;
            }
        }
    }
}
