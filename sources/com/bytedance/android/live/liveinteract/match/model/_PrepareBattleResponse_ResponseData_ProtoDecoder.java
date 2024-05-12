package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTestList_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftMode_ProtoDecoder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _PrepareBattleResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PrepareBattleResponse.ResponseData> {
    public static PrepareBattleResponse.ResponseData LIZIZ(Q9H q9h) {
        PrepareBattleResponse.ResponseData responseData = new PrepareBattleResponse.ResponseData();
        responseData.giftMode = new ArrayList();
        responseData.abtestSetting = new HashMap();
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
                                responseData.giftEventDesc = _Text_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            responseData.ruleGuideUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        responseData.giftMode.add(_GiftMode_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    Long l = null;
                    BattleABTestList battleABTestList = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                battleABTestList = _BattleABTestList_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (l != null) {
                        if (battleABTestList != null) {
                            responseData.abtestSetting.put(l, battleABTestList);
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
    public final PrepareBattleResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
