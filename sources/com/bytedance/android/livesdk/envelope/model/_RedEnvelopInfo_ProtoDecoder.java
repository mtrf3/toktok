package com.bytedance.android.livesdk.envelope.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _RedEnvelopInfo_ProtoDecoder implements InterfaceC31105CIr<RedEnvelopInfo> {
    public static RedEnvelopInfo LIZIZ(Q9H q9h) {
        RedEnvelopInfo redEnvelopInfo = new RedEnvelopInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        redEnvelopInfo.envelopeId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        redEnvelopInfo.businessType = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 3:
                        redEnvelopInfo.envelopeIdc = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        redEnvelopInfo.sendUserName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        redEnvelopInfo.diamondCount = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        redEnvelopInfo.peopleCount = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 7:
                        redEnvelopInfo.unpackAt = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 8:
                        redEnvelopInfo.sendUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        redEnvelopInfo.sendUserAvatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        redEnvelopInfo.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        redEnvelopInfo.followShowStatus = q9h.LJIIJ();
                        break;
                    case 12:
                        redEnvelopInfo.skinId = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return redEnvelopInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RedEnvelopInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
