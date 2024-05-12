package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _OuterActivityInfo_ProtoDecoder implements InterfaceC31105CIr<OuterActivityInfo> {
    public static OuterActivityInfo LIZIZ(Q9H q9h) {
        OuterActivityInfo outerActivityInfo = new OuterActivityInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        outerActivityInfo.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        outerActivityInfo.name = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        outerActivityInfo.type = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        outerActivityInfo.seq = q9h.LJIIJ();
                        break;
                    case 5:
                        outerActivityInfo.resource = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        outerActivityInfo.resourceThemeColor = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        outerActivityInfo.linkType = q9h.LJIIJ();
                        break;
                    case 8:
                        outerActivityInfo.link = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        outerActivityInfo.introduction = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        outerActivityInfo.startTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        outerActivityInfo.endTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return outerActivityInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OuterActivityInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
