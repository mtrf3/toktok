package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.eco.GetViolationListResponse;

/* loaded from: classes17.dex */
public final class _GetViolationListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetViolationListResponse.ResponseData> {
    public static GetViolationListResponse.ResponseData LIZIZ(Q9H q9h) {
        GetViolationListResponse.ResponseData responseData = new GetViolationListResponse.ResponseData();
        responseData.records = new ArrayList();
        responseData.guideDetailList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.records.add(_ViolationRecord_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        responseData.hasMore = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        responseData.nextLastId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        responseData.feedback = _ViolationFeedback_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        responseData.activeCount = q9h.LJIIJ();
                        break;
                    case 6:
                        responseData.historyCount = q9h.LJIIJ();
                        break;
                    case 7:
                        responseData.guideDetailList.add(_GuideDetail_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        responseData.isEea = Q9J.LIZ(q9h);
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
    public final GetViolationListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
