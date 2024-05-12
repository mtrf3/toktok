package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.eco.GetQuestionnaireContentResponse;

/* loaded from: classes17.dex */
public final class _GetQuestionnaireContentResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetQuestionnaireContentResponse.ResponseData> {
    public static GetQuestionnaireContentResponse.ResponseData LIZIZ(Q9H q9h) {
        GetQuestionnaireContentResponse.ResponseData responseData = new GetQuestionnaireContentResponse.ResponseData();
        responseData.questions = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.questions.add(_GetQuestionnaireContentResponse_ResponseData_Question_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetQuestionnaireContentResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
