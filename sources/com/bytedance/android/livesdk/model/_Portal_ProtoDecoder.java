package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _Portal_ProtoDecoder implements InterfaceC31105CIr<Portal> {
    public static Portal LIZIZ(Q9H q9h) {
        Portal portal = new Portal();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        portal.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        portal.enterCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        portal.sugarDaddy = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        portal.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        portal.anchor = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        portal.portalId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        portal.userType = q9h.LJIIJ();
                        break;
                    case 8:
                        portal.inviteeCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        portal.status = q9h.LJIIJ();
                        break;
                    case 10:
                        portal.waitDuration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        portal.rewardDuration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 12:
                        portal.totalAmount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        portal.cover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return portal;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Portal LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
