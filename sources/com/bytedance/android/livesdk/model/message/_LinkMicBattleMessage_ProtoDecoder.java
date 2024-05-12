package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle._BattleDisplayConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserInfoWrapper_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._SupportedActionsWrapper_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._UserArmiesWrapper_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTestSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._TeamMatchCampaign_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _LinkMicBattleMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicBattleMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicBattleMessage LIZ(Q9H q9h) {
        LinkMicBattleMessage linkMicBattleMessage = new LinkMicBattleMessage();
        linkMicBattleMessage.armies = new ArrayList();
        linkMicBattleMessage.teamArmies = new ArrayList();
        linkMicBattleMessage.teamUsers = new ArrayList();
        linkMicBattleMessage.inviteeGiftPermissionTypes = new ArrayList();
        linkMicBattleMessage.teamBattleResult = new ArrayList();
        linkMicBattleMessage.abtestSettings = new ArrayList();
        linkMicBattleMessage.battleCombos = new HashMap();
        linkMicBattleMessage.anchorInfo = new ArrayList();
        linkMicBattleMessage.battleResult = new HashMap();
        linkMicBattleMessage.supportedActions = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                switch (LJI) {
                    case 1:
                        linkMicBattleMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkMicBattleMessage.battleId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkMicBattleMessage.battleSetting = _BattleSetting_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        linkMicBattleMessage.action = q9h.LJIIJ();
                        break;
                    case 5:
                        long LIZJ2 = q9h.LIZJ();
                        BattleResult battleResult = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        battleResult = _BattleResult_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (battleResult != null) {
                                        linkMicBattleMessage.battleResult.put(l, battleResult);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 6:
                        linkMicBattleMessage.mBattleDisplayConfig = _BattleDisplayConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 8:
                        linkMicBattleMessage.inviteeGiftPermissionType = q9h.LJIIJ();
                        break;
                    case 9:
                        linkMicBattleMessage.armies.add(_UserArmiesWrapper_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 10:
                        linkMicBattleMessage.anchorInfo.add(_BattleUserInfoWrapper_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        linkMicBattleMessage.bubbleText = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        linkMicBattleMessage.supportedActions.add(_SupportedActionsWrapper_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        long LIZJ3 = q9h.LIZJ();
                        BattleComboInfo battleComboInfo = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        battleComboInfo = _BattleComboInfo_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (l != null) {
                                    if (battleComboInfo != null) {
                                        linkMicBattleMessage.battleCombos.put(l, battleComboInfo);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 14:
                        linkMicBattleMessage.teamUsers.add(_TeamUsersInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 15:
                        linkMicBattleMessage.inviteeGiftPermissionTypes.add(_BattleInviteeGiftPermission_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        linkMicBattleMessage.actionByUserId = q9h.LJIIJJI();
                        break;
                    case 17:
                        linkMicBattleMessage.teamBattleResult.add(_BattleTeamResult_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 18:
                        linkMicBattleMessage.teamArmies.add(_BattleTeamUserArmies_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 19:
                        linkMicBattleMessage.abtestSettings.add(_BattleABTestSetting_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 20:
                        linkMicBattleMessage.teamMatchCampaign = _TeamMatchCampaign_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicBattleMessage;
            }
        }
    }
}
