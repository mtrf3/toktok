package com.bytedance.android.livesdk.model.message.redenvelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _MessageRedEnvelopInfo_ProtoDecoder implements InterfaceC31105CIr<MessageRedEnvelopInfo> {
    public static MessageRedEnvelopInfo LIZIZ(Q9H q9h) {
        MessageRedEnvelopInfo messageRedEnvelopInfo = new MessageRedEnvelopInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        messageRedEnvelopInfo.envelopeId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        messageRedEnvelopInfo.businessType = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 3:
                        messageRedEnvelopInfo.envelopeIdc = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        messageRedEnvelopInfo.sendUserName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        messageRedEnvelopInfo.diamondCount = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        messageRedEnvelopInfo.peopleCount = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 7:
                        messageRedEnvelopInfo.unpackAt = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 8:
                        messageRedEnvelopInfo.sendUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        messageRedEnvelopInfo.sendUserAvatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        messageRedEnvelopInfo.createTime = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 12:
                        messageRedEnvelopInfo.followStatusShow = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        messageRedEnvelopInfo.skinId = q9h.LJIIJ();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return messageRedEnvelopInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MessageRedEnvelopInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
