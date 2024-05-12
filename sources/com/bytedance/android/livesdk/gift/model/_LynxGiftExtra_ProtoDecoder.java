package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _LynxGiftExtra_ProtoDecoder implements InterfaceC31105CIr<LynxGiftExtra> {
    public static LynxGiftExtra LIZIZ(Q9H q9h) {
        LynxGiftExtra lynxGiftExtra = new LynxGiftExtra();
        lynxGiftExtra.params = new ArrayList();
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
                                    lynxGiftExtra.extra = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                lynxGiftExtra.params.add(Q9J.LIZIZ(q9h));
                            }
                        } else {
                            lynxGiftExtra.type = q9h.LJIIJJI();
                        }
                    } else {
                        lynxGiftExtra.code = q9h.LJIIJJI();
                    }
                } else {
                    lynxGiftExtra.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return lynxGiftExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LynxGiftExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
