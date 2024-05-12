package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PayPalBindInfo_ProtoDecoder implements InterfaceC31105CIr<PayPalBindInfo> {
    public static PayPalBindInfo LIZIZ(Q9H q9h) {
        PayPalBindInfo payPalBindInfo = new PayPalBindInfo();
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
                                    payPalBindInfo.bindOptStr = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                payPalBindInfo.bindNotice = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            payPalBindInfo.payPalAccount = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        payPalBindInfo.payPayBounded = Q9J.LIZ(q9h);
                    }
                } else {
                    payPalBindInfo.needBindPayPal = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return payPalBindInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PayPalBindInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
