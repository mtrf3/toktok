package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CapsuleBizParamsRandomGift_ProtoDecoder implements InterfaceC31105CIr<CapsuleBizParamsRandomGift> {
    public static CapsuleBizParamsRandomGift LIZIZ(Q9H q9h) {
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift = new CapsuleBizParamsRandomGift();
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
                                    capsuleBizParamsRandomGift.filterHost = Q9J.LIZ(q9h);
                                }
                            } else {
                                capsuleBizParamsRandomGift.type = q9h.LJIIJJI();
                            }
                        } else {
                            capsuleBizParamsRandomGift.gift = _Gift_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        capsuleBizParamsRandomGift.effectNameKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    capsuleBizParamsRandomGift.round = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return capsuleBizParamsRandomGift;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CapsuleBizParamsRandomGift LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
