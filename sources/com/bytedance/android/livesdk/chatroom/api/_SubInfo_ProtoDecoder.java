package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _SubInfo_ProtoDecoder implements InterfaceC31105CIr<SubInfo> {
    public static SubInfo LIZIZ(Q9H q9h) {
        SubInfo subInfo = new SubInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 16) {
                    switch (LJI) {
                        case 1:
                            subInfo.userId = Q9J.LIZIZ(q9h);
                            break;
                        case 2:
                            subInfo.anchorId = Q9J.LIZIZ(q9h);
                            break;
                        case 3:
                            subInfo.subStartTime = Long.valueOf(q9h.LJIIJJI());
                            break;
                        case 4:
                            subInfo.subEndTime = Long.valueOf(q9h.LJIIJJI());
                            break;
                        case 5:
                            subInfo.nextRenewTime = Long.valueOf(q9h.LJIIJJI());
                            break;
                        case 6:
                            subInfo.subscribedMonth = Integer.valueOf(q9h.LJIIJ());
                            break;
                        case 7:
                            subInfo.isSubscribing = Boolean.valueOf(Q9J.LIZ(q9h));
                            break;
                        case 8:
                            subInfo.subLevel = _SubLevel_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 9:
                            subInfo.status = q9h.LJIIJ();
                            break;
                        case 10:
                            subInfo.subInfoNotFound = Boolean.valueOf(Q9J.LIZ(q9h));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            subInfo.skuName = Q9J.LIZIZ(q9h);
                            break;
                        case 12:
                            subInfo.payChannel = q9h.LJIIJ();
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            subInfo.graceInfo = _GraceInfo_ProtoDecoder.LIZIZ(q9h);
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    subInfo.priceChangeInfo = _PriceChangeInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
