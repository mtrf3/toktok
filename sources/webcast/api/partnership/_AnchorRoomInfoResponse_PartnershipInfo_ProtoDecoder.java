package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorRoomInfoResponse_PartnershipInfo_ProtoDecoder implements InterfaceC31105CIr<AnchorRoomInfoResponse.PartnershipInfo> {
    public static AnchorRoomInfoResponse.PartnershipInfo LIZIZ(Q9H q9h) {
        AnchorRoomInfoResponse.PartnershipInfo partnershipInfo = new AnchorRoomInfoResponse.PartnershipInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        partnershipInfo.hasSign = Q9J.LIZ(q9h);
                    }
                } else {
                    partnershipInfo.showPartnership = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorRoomInfoResponse.PartnershipInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
