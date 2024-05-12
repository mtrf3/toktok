package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle._BattleDisplayConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _BattleInfoResponse_ProtoDecoder implements InterfaceC31105CIr<BattleInfoResponse> {
    public static BattleInfoResponse LIZIZ(Q9H q9h) {
        BattleInfoResponse battleInfoResponse = new BattleInfoResponse();
        battleInfoResponse.armies = new HashMap();
        battleInfoResponse.teamArmies = new HashMap();
        battleInfoResponse.battleItemCards = new HashMap();
        battleInfoResponse.teamBattleResult = new HashMap();
        battleInfoResponse.userInfoMap = new HashMap();
        battleInfoResponse.battleCombos = new HashMap();
        battleInfoResponse.resultMap = new HashMap();
        battleInfoResponse.supportedActions = new HashMap();
        battleInfoResponse.teamBattleItemCards = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                switch (LJI) {
                    case 1:
                        battleInfoResponse.channelId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        battleInfoResponse.battleId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        battleInfoResponse.setting = _BattleSetting_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        long LIZJ2 = q9h.LIZJ();
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
                                        battleInfoResponse.armies.put(l, battleUserArmies);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 5:
                        long LIZJ3 = q9h.LIZJ();
                        BattleResult battleResult = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        battleResult = _BattleResult_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (l != null) {
                                    if (battleResult != null) {
                                        battleInfoResponse.resultMap.put(l, battleResult);
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
                        long LIZJ4 = q9h.LIZJ();
                        BattleUserInfo battleUserInfo = null;
                        while (true) {
                            int LJI4 = q9h.LJI();
                            if (LJI4 != -1) {
                                if (LJI4 != 1) {
                                    if (LJI4 == 2) {
                                        battleUserInfo = _BattleUserInfo_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ4);
                                if (l != null) {
                                    if (battleUserInfo != null) {
                                        battleInfoResponse.userInfoMap.put(l, battleUserInfo);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 7:
                        battleInfoResponse.bubbleText = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        long LIZJ5 = q9h.LIZJ();
                        Boolean bool = null;
                        while (true) {
                            int LJI5 = q9h.LJI();
                            if (LJI5 != -1) {
                                if (LJI5 != 1) {
                                    if (LJI5 == 2) {
                                        bool = Boolean.valueOf(Q9J.LIZ(q9h));
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ5);
                                if (l != null) {
                                    if (bool != null) {
                                        battleInfoResponse.supportedActions.put(l, bool);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 9:
                        battleInfoResponse.mBattleDisplayConfig = _BattleDisplayConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        long LIZJ6 = q9h.LIZJ();
                        BattleComboInfo battleComboInfo = null;
                        while (true) {
                            int LJI6 = q9h.LJI();
                            if (LJI6 != -1) {
                                if (LJI6 != 1) {
                                    if (LJI6 == 2) {
                                        battleComboInfo = _BattleComboInfo_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ6);
                                if (l != null) {
                                    if (battleComboInfo != null) {
                                        battleInfoResponse.battleCombos.put(l, battleComboInfo);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 12:
                        battleInfoResponse.battleTask = _BattleTask_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        long LIZJ7 = q9h.LIZJ();
                        BattleTeamUserArmies battleTeamUserArmies = null;
                        while (true) {
                            int LJI7 = q9h.LJI();
                            if (LJI7 != -1) {
                                if (LJI7 != 1) {
                                    if (LJI7 == 2) {
                                        battleTeamUserArmies = _BattleTeamUserArmies_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ7);
                                if (l != null) {
                                    if (battleTeamUserArmies != null) {
                                        battleInfoResponse.teamArmies.put(l, battleTeamUserArmies);
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
                        long LIZJ8 = q9h.LIZJ();
                        BattleTeamResult battleTeamResult = null;
                        while (true) {
                            int LJI8 = q9h.LJI();
                            if (LJI8 != -1) {
                                if (LJI8 != 1) {
                                    if (LJI8 == 2) {
                                        battleTeamResult = _BattleTeamResult_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ8);
                                if (l != null) {
                                    if (battleTeamResult != null) {
                                        battleInfoResponse.teamBattleResult.put(l, battleTeamResult);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 15:
                        battleInfoResponse.battleTruthOrDare = _BattleTruthOrDare_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        battleInfoResponse.teamMatchCampaign = _TeamMatchCampaign_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 17:
                        long LIZJ9 = q9h.LIZJ();
                        EffectingCard effectingCard = null;
                        while (true) {
                            int LJI9 = q9h.LJI();
                            if (LJI9 != -1) {
                                if (LJI9 != 1) {
                                    if (LJI9 == 2) {
                                        effectingCard = _EffectingCard_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ9);
                                if (l != null) {
                                    if (effectingCard != null) {
                                        battleInfoResponse.battleItemCards.put(l, effectingCard);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 18:
                        long LIZJ10 = q9h.LIZJ();
                        EffectingCard effectingCard2 = null;
                        while (true) {
                            int LJI10 = q9h.LJI();
                            if (LJI10 != -1) {
                                if (LJI10 != 1) {
                                    if (LJI10 == 2) {
                                        effectingCard2 = _EffectingCard_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ10);
                                if (l != null) {
                                    if (effectingCard2 != null) {
                                        battleInfoResponse.teamBattleItemCards.put(l, effectingCard2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return battleInfoResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleInfoResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
