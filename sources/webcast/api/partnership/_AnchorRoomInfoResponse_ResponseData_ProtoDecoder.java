package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorRoomInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorRoomInfoResponse.ResponseData> {
    public static AnchorRoomInfoResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorRoomInfoResponse.ResponseData responseData = new AnchorRoomInfoResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.liveTakeDecouple = Q9J.LIZ(q9h);
                        }
                    } else {
                        responseData.dropsInfo = _AnchorRoomInfoResponse_DropsInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.partnershipInfo = _AnchorRoomInfoResponse_PartnershipInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorRoomInfoResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
