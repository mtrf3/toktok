package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PortalMessage;

/* loaded from: classes17.dex */
public final class _PortalMessage_PortalInvite_ProtoDecoder implements InterfaceC31105CIr<PortalMessage.PortalInvite> {
    public static PortalMessage.PortalInvite LIZIZ(Q9H q9h) {
        PortalMessage.PortalInvite portalInvite = new PortalMessage.PortalInvite();
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
                                    portalInvite.cover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                portalInvite.anchor = _User_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            portalInvite.sugarDaddy = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        portalInvite.rewardCountDown = q9h.LJIIJJI();
                    }
                } else {
                    portalInvite.inviteCountDown = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return portalInvite;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PortalMessage.PortalInvite LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
