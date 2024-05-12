package com.bytedance.android.livesdk.goody_bag.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GoodyBagBaseInfo_ProtoDecoder implements InterfaceC31105CIr<GoodyBagBaseInfo> {
    public static GoodyBagBaseInfo LIZIZ(Q9H q9h) {
        GoodyBagBaseInfo goodyBagBaseInfo = new GoodyBagBaseInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    goodyBagBaseInfo.coinDetail = _GoodyBagCoinDetail_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                goodyBagBaseInfo.commonDetail = _GoodyBagCommonDetail_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            goodyBagBaseInfo.roomId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        goodyBagBaseInfo.biz = q9h.LJIIJ();
                    }
                } else {
                    goodyBagBaseInfo.goodyBagId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagBaseInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoodyBagBaseInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
