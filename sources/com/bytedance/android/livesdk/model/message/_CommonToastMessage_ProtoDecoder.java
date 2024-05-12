package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _CommonToastMessage_ProtoDecoder implements InterfaceC31105CIr<CommonToastMessage> {
    @Override // X.InterfaceC31105CIr
    public final CommonToastMessage LIZ(Q9H q9h) {
        CommonToastMessage commonToastMessage = new CommonToastMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        commonToastMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        commonToastMessage.discardable = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        commonToastMessage.immediate = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        commonToastMessage.duration = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        commonToastMessage.textColor = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        commonToastMessage.backgroundColorStart = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        commonToastMessage.backgroundColorEnd = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        commonToastMessage.position = (int) q9h.LJIIJJI();
                        break;
                    case 9:
                        commonToastMessage.topImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        commonToastMessage.imageWidth = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        commonToastMessage.imageHeight = (int) q9h.LJIIJJI();
                        break;
                    case 12:
                        commonToastMessage.showMongoliaLayer = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return commonToastMessage;
            }
        }
    }
}
