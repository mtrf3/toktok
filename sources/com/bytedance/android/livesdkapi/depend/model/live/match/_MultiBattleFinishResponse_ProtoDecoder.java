package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _MultiBattleFinishResponse_ProtoDecoder implements InterfaceC31105CIr<MultiBattleFinishResponse> {
    @Override // X.InterfaceC31105CIr
    public final MultiBattleFinishResponse LIZ(Q9H q9h) {
        MultiBattleFinishResponse multiBattleFinishResponse = new MultiBattleFinishResponse();
        multiBattleFinishResponse.teamBattleResult = new HashMap();
        multiBattleFinishResponse.teamArmies = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                multiBattleFinishResponse.hasTeamMatchMvpSfx = Q9J.LIZ(q9h);
                            }
                        } else {
                            multiBattleFinishResponse.battleSettings = _BattleSetting_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        long LIZJ2 = q9h.LIZJ();
                        BattleTeamUserArmies battleTeamUserArmies = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 == -1) {
                                break;
                            }
                            if (LJI2 != 1) {
                                if (LJI2 == 2) {
                                    battleTeamUserArmies = _BattleTeamUserArmies_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                l = Long.valueOf(q9h.LJIIJJI());
                            }
                        }
                        q9h.LJ(LIZJ2);
                        if (l != null) {
                            if (battleTeamUserArmies != null) {
                                multiBattleFinishResponse.teamArmies.put(l, battleTeamUserArmies);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long LIZJ3 = q9h.LIZJ();
                    BattleTeamResult battleTeamResult = null;
                    while (true) {
                        int LJI3 = q9h.LJI();
                        if (LJI3 == -1) {
                            break;
                        }
                        if (LJI3 != 1) {
                            if (LJI3 == 2) {
                                battleTeamResult = _BattleTeamResult_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ3);
                    if (l != null) {
                        if (battleTeamResult != null) {
                            multiBattleFinishResponse.teamBattleResult.put(l, battleTeamResult);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return multiBattleFinishResponse;
            }
        }
    }
}
