package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AudienceRoomInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AudienceRoomInfoResponse.ResponseData> {
    public static AudienceRoomInfoResponse.ResponseData LIZIZ(Q9H q9h) {
        AudienceRoomInfoResponse.ResponseData responseData = new AudienceRoomInfoResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.esportsTournamentBriefInfo = _AudienceRoomInfoResponse_EsportsBriefTournamentInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.dropsInfo = _AudienceRoomInfoResponse_DropsInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.partnershipInfo = _AudienceRoomInfoResponse_PartnershipInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceRoomInfoResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}