package com.bytedance.android.livesdk.subscribe.model.paypal;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PaypalBindingUrl_ProtoDecoder implements InterfaceC31105CIr<PaypalBindingUrl> {
    @Override // X.InterfaceC31105CIr
    public final PaypalBindingUrl LIZ(Q9H q9h) {
        PaypalBindingUrl paypalBindingUrl = new PaypalBindingUrl();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    paypalBindingUrl.paypalBindingUrl = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return paypalBindingUrl;
            }
        }
    }
}