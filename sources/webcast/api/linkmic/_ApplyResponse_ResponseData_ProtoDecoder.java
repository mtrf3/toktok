package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import webcast.api.linkmic.ApplyResponse;

/* loaded from: classes14.dex */
public final class _ApplyResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ApplyResponse.ResponseData> {
    public static ApplyResponse.ResponseData LIZIZ(Q9H q9h) {
        ApplyResponse.ResponseData responseData = new ApplyResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.actionId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        responseData.channelId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        responseData.linkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        responseData.rivalsLinkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        responseData.rtcExtInfo = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        responseData.perceptionStatus = q9h.LJIIJ();
                        break;
                    case 7:
                        responseData.perceptionMessage = _PerceptionMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        responseData.extra = _ApplyResponse_ApplyExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ApplyResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
