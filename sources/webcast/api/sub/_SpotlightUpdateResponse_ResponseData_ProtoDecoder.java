package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._SpotlightInfo_ProtoDecoder;
import webcast.api.sub.SpotlightUpdateResponse;

/* loaded from: classes14.dex */
public final class _SpotlightUpdateResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SpotlightUpdateResponse.ResponseData> {
    public static SpotlightUpdateResponse.ResponseData LIZIZ(Q9H q9h) {
        SpotlightUpdateResponse.ResponseData responseData = new SpotlightUpdateResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.spotlightInfo = _SpotlightInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SpotlightUpdateResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
