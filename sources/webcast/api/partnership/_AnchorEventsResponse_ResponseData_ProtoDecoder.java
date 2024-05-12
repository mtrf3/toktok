package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._PartnershipGameEvent_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.AnchorEventsResponse;

/* loaded from: classes6.dex */
public final class _AnchorEventsResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorEventsResponse.ResponseData> {
    public static AnchorEventsResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorEventsResponse.ResponseData responseData = new AnchorEventsResponse.ResponseData();
        responseData.eventInfoList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.eventInfoList.add(_PartnershipGameEvent_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorEventsResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
