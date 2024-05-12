package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetQuestionnaireContentResponse_ProtoDecoder implements InterfaceC31105CIr<GetQuestionnaireContentResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetQuestionnaireContentResponse LIZ(Q9H q9h) {
        GetQuestionnaireContentResponse getQuestionnaireContentResponse = new GetQuestionnaireContentResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getQuestionnaireContentResponse.data = _GetQuestionnaireContentResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getQuestionnaireContentResponse;
            }
        }
    }
}
