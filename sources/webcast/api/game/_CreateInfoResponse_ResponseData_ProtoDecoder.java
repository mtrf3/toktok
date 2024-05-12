package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.CreateInfoResponse;

/* loaded from: classes6.dex */
public final class _CreateInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CreateInfoResponse.ResponseData> {
    public static CreateInfoResponse.ResponseData LIZIZ(Q9H q9h) {
        CreateInfoResponse.ResponseData responseData = new CreateInfoResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.tnsReportIntervalMs = q9h.LJIIJJI();
                        break;
                    case 2:
                        responseData.cliTnsCollectIntervalMs = q9h.LJIIJJI();
                        break;
                    case 3:
                        responseData.openLsNotify = _OpenLsNotifyInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        responseData.serverTimestamp = q9h.LJIIJJI();
                        break;
                    case 5:
                        responseData.hasLiveStudioLogin = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        responseData.haveMutilGuestPermission = Q9J.LIZ(q9h);
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
    public final CreateInfoResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
