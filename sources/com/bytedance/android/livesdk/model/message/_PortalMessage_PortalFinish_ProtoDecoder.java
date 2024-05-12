package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PortalMessage;

/* loaded from: classes6.dex */
public final class _PortalMessage_PortalFinish_ProtoDecoder implements InterfaceC31105CIr<PortalMessage.PortalFinish> {
    public static PortalMessage.PortalFinish LIZIZ(Q9H q9h) {
        PortalMessage.PortalFinish portalFinish = new PortalMessage.PortalFinish();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    portalFinish.luckyPerson = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return portalFinish;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PortalMessage.PortalFinish LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
