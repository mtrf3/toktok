package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _LinkMicBattleArmiesMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicBattleArmiesMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicBattleArmiesMessage LIZ(Q9H q9h) {
        LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = new LinkMicBattleArmiesMessage();
        linkMicBattleArmiesMessage.armies = new HashMap();
        linkMicBattleArmiesMessage.teamArmies = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkMicBattleArmiesMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkMicBattleArmiesMessage.battleId = q9h.LJIIJJI();
                        break;
                    case 3:
                        long LIZJ2 = q9h.LIZJ();
                        Long l = null;
                        BattleUserArmies battleUserArmies = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        battleUserArmies = _BattleUserArmies_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (battleUserArmies != null) {
                                        linkMicBattleArmiesMessage.armies.put(l, battleUserArmies);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 4:
                        linkMicBattleArmiesMessage.channelId = q9h.LJIIJJI();
                        break;
                    case 5:
                        linkMicBattleArmiesMessage.giftSentTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        linkMicBattleArmiesMessage.scoreUpdateTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        linkMicBattleArmiesMessage.triggerReason = q9h.LJIIJ();
                        break;
                    case 8:
                        linkMicBattleArmiesMessage.fromUserId = q9h.LJIIJJI();
                        break;
                    case 9:
                        linkMicBattleArmiesMessage.giftId = q9h.LJIIJJI();
                        break;
                    case 10:
                        linkMicBattleArmiesMessage.giftCount = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        linkMicBattleArmiesMessage.gifIconImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        linkMicBattleArmiesMessage.totalDiamondCount = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        linkMicBattleArmiesMessage.repeatCount = (int) q9h.LJIIJJI();
                        break;
                    case 14:
                        linkMicBattleArmiesMessage.teamArmies.add(_BattleTeamUserArmies_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 15:
                        linkMicBattleArmiesMessage.triggerCriticalStrike = Q9J.LIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        linkMicBattleArmiesMessage.hasTeamMatchMvpSfx = Q9J.LIZ(q9h);
                        break;
                    case 17:
                        linkMicBattleArmiesMessage.logId = Q9J.LIZIZ(q9h);
                        break;
                    case 18:
                        linkMicBattleArmiesMessage.battleSettings = _BattleSetting_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicBattleArmiesMessage;
            }
        }
    }
}
