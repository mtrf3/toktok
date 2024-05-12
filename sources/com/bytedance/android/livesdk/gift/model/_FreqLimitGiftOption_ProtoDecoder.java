package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FreqLimitGiftOption_ProtoDecoder implements InterfaceC31105CIr<FreqLimitGiftOption> {
    public static FreqLimitGiftOption LIZIZ(Q9H q9h) {
        FreqLimitGiftOption freqLimitGiftOption = new FreqLimitGiftOption();
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
                                    freqLimitGiftOption.frequencyLimit = q9h.LJIIJ();
                                }
                            } else {
                                freqLimitGiftOption.workSingleAnchor = Q9J.LIZ(q9h);
                            }
                        } else {
                            freqLimitGiftOption.closeGiftPanel = Q9J.LIZ(q9h);
                        }
                    } else {
                        freqLimitGiftOption.refreshTimeStamp = q9h.LJIIJJI();
                    }
                } else {
                    freqLimitGiftOption.giftId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return freqLimitGiftOption;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FreqLimitGiftOption LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
