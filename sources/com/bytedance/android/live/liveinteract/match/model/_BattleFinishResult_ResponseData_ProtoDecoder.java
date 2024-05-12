package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _BattleFinishResult_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BattleFinishResult.ResponseData> {
    public static BattleFinishResult.ResponseData LIZIZ(Q9H q9h) {
        BattleFinishResult.ResponseData responseData = new BattleFinishResult.ResponseData();
        responseData.armies = new HashMap();
        responseData.anchorsInfo = new HashMap();
        responseData.battleComboV2 = new HashMap();
        responseData.battleResult = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            if (LJI != 5) {
                                if (LJI != 6) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    responseData.battleSettings = _BattleSetting_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                long LIZJ2 = q9h.LIZJ();
                                BattleComboInfo battleComboInfo = null;
                                while (true) {
                                    int LJI2 = q9h.LJI();
                                    if (LJI2 == -1) {
                                        break;
                                    }
                                    if (LJI2 != 1) {
                                        if (LJI2 == 2) {
                                            battleComboInfo = _BattleComboInfo_ProtoDecoder.LIZIZ(q9h);
                                        }
                                    } else {
                                        l = Long.valueOf(q9h.LJIIJJI());
                                    }
                                }
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (battleComboInfo != null) {
                                        responseData.battleComboV2.put(l, battleComboInfo);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long LIZJ3 = q9h.LIZJ();
                            BattleUserInfo battleUserInfo = null;
                            while (true) {
                                int LJI3 = q9h.LJI();
                                if (LJI3 == -1) {
                                    break;
                                }
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        battleUserInfo = _BattleUserInfo_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            }
                            q9h.LJ(LIZJ3);
                            if (l != null) {
                                if (battleUserInfo != null) {
                                    responseData.anchorsInfo.put(l, battleUserInfo);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        long LIZJ4 = q9h.LIZJ();
                        BattleUserArmies battleUserArmies = null;
                        while (true) {
                            int LJI4 = q9h.LJI();
                            if (LJI4 == -1) {
                                break;
                            }
                            if (LJI4 != 1) {
                                if (LJI4 == 2) {
                                    battleUserArmies = _BattleUserArmies_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                l = Long.valueOf(q9h.LJIIJJI());
                            }
                        }
                        q9h.LJ(LIZJ4);
                        if (l != null) {
                            if (battleUserArmies != null) {
                                responseData.armies.put(l, battleUserArmies);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long LIZJ5 = q9h.LIZJ();
                    BattleResult battleResult = null;
                    while (true) {
                        int LJI5 = q9h.LJI();
                        if (LJI5 == -1) {
                            break;
                        }
                        if (LJI5 != 1) {
                            if (LJI5 == 2) {
                                battleResult = _BattleResult_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ5);
                    if (l != null) {
                        if (battleResult != null) {
                            responseData.battleResult.put(l, battleResult);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleFinishResult.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
