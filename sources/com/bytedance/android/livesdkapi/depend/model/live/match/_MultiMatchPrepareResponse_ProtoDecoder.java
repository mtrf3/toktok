package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _MultiMatchPrepareResponse_ProtoDecoder implements InterfaceC31105CIr<MultiMatchPrepareResponse> {
    @Override // X.InterfaceC31105CIr
    public final MultiMatchPrepareResponse LIZ(Q9H q9h) {
        MultiMatchPrepareResponse multiMatchPrepareResponse = new MultiMatchPrepareResponse();
        multiMatchPrepareResponse.anchorsPermission = new HashMap();
        multiMatchPrepareResponse.giftMode = new ArrayList();
        multiMatchPrepareResponse.abTestSettings = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                switch (LJI) {
                    case 1:
                        long LIZJ2 = q9h.LIZJ();
                        Integer num = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        num = Integer.valueOf(q9h.LJIIJ());
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (num != null) {
                                        multiMatchPrepareResponse.anchorsPermission.put(l, num);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 2:
                        multiMatchPrepareResponse.recommendTeamMate = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        long LIZJ3 = q9h.LIZJ();
                        BattleABTestList battleABTestList = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        battleABTestList = _BattleABTestList_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (l != null) {
                                    if (battleABTestList != null) {
                                        multiMatchPrepareResponse.abTestSettings.put(l, battleABTestList);
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
                        multiMatchPrepareResponse.giftMode.add(_GiftMode_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        multiMatchPrepareResponse.ruleGuideUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        multiMatchPrepareResponse.bestTeammateId = q9h.LJIIJJI();
                        break;
                    case 7:
                        multiMatchPrepareResponse.giftEventDesc = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return multiMatchPrepareResponse;
            }
        }
    }
}
