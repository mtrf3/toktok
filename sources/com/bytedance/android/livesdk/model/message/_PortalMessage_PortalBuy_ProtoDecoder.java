package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PortalMessage;

/* loaded from: classes17.dex */
public final class _PortalMessage_PortalBuy_ProtoDecoder implements InterfaceC31105CIr<PortalMessage.PortalBuy> {
    public static PortalMessage.PortalBuy LIZIZ(Q9H q9h) {
        PortalMessage.PortalBuy portalBuy = new PortalMessage.PortalBuy();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    portalBuy.sugarDaddy = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return portalBuy;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PortalMessage.PortalBuy LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
