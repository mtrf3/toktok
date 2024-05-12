package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftNotice_ProtoDecoder implements InterfaceC31105CIr<GiftNotice> {
    public static GiftNotice LIZIZ(Q9H q9h) {
        GiftNotice giftNotice = new GiftNotice();
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
                                    giftNotice.periodId = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                giftNotice.bizType = q9h.LJIIJ();
                            }
                        } else {
                            giftNotice.effect = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        giftNotice.giftId = q9h.LJIIJJI();
                    }
                } else {
                    giftNotice.noticeType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return giftNotice;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftNotice LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
