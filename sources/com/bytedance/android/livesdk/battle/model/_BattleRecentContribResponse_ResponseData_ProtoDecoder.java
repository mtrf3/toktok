package com.bytedance.android.livesdk.battle.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.battle.model.BattleRecentContribResponse;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamResult_ProtoDecoder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _BattleRecentContribResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BattleRecentContribResponse.ResponseData> {
    public static BattleRecentContribResponse.ResponseData LIZIZ(Q9H q9h) {
        BattleRecentContribResponse.ResponseData responseData = new BattleRecentContribResponse.ResponseData();
        responseData.teamBattleScore = new HashMap();
        responseData.giftLogIds = new ArrayList();
        responseData.supportedActions = new HashMap();
        responseData.battleScore = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Long l = null;
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                long LIZJ2 = q9h.LIZJ();
                                BattleTeamResult battleTeamResult = null;
                                while (true) {
                                    int LJI2 = q9h.LJI();
                                    if (LJI2 == -1) {
                                        break;
                                    }
                                    if (LJI2 != 1) {
                                        if (LJI2 == 2) {
                                            battleTeamResult = _BattleTeamResult_ProtoDecoder.LIZIZ(q9h);
                                        }
                                    } else {
                                        l = Long.valueOf(q9h.LJIIJJI());
                                    }
                                }
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (battleTeamResult != null) {
                                        responseData.teamBattleScore.put(l, battleTeamResult);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long LIZJ3 = q9h.LIZJ();
                            BattleResult battleResult = null;
                            while (true) {
                                int LJI3 = q9h.LJI();
                                if (LJI3 == -1) {
                                    break;
                                }
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        battleResult = _BattleResult_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            }
                            q9h.LJ(LIZJ3);
                            if (l != null) {
                                if (battleResult != null) {
                                    responseData.battleScore.put(l, battleResult);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        long LIZJ4 = q9h.LIZJ();
                        Boolean bool = null;
                        while (true) {
                            int LJI4 = q9h.LJI();
                            if (LJI4 == -1) {
                                break;
                            }
                            if (LJI4 != 1) {
                                if (LJI4 == 2) {
                                    bool = Boolean.valueOf(Q9J.LIZ(q9h));
                                }
                            } else {
                                l = Long.valueOf(q9h.LJIIJJI());
                            }
                        }
                        q9h.LJ(LIZJ4);
                        if (l != null) {
                            if (bool != null) {
                                responseData.supportedActions.put(l, bool);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    responseData.giftLogIds.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleRecentContribResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
