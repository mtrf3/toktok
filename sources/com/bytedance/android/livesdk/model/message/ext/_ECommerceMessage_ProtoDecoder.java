package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._AtmosphereTagInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LivePermissionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ProductSnapShot_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _ECommerceMessage_ProtoDecoder implements InterfaceC31105CIr<ECommerceMessage> {
    @Override // X.InterfaceC31105CIr
    public final ECommerceMessage LIZ(Q9H q9h) {
        ECommerceMessage eCommerceMessage = new ECommerceMessage();
        eCommerceMessage.hotTags = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        eCommerceMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        eCommerceMessage.actionType = q9h.LJIIJ();
                        break;
                    case 3:
                        eCommerceMessage.liveProductNumber = q9h.LJIIJ();
                        break;
                    case 4:
                        eCommerceMessage.popProduct = _PopProduct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        eCommerceMessage.traceInfo = _TraceInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        eCommerceMessage.hotTags.add(_HotTag_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        eCommerceMessage.atmosphereTagInfo = _AtmosphereTagInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        eCommerceMessage.livePermissionInfo = _LivePermissionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        eCommerceMessage.productSnapShot = _ProductSnapShot_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        eCommerceMessage.pinCardDelayTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return eCommerceMessage;
            }
        }
    }
}
