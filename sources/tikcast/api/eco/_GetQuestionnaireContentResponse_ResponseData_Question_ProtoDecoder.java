package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.eco.GetQuestionnaireContentResponse;

/* loaded from: classes17.dex */
public final class _GetQuestionnaireContentResponse_ResponseData_Question_ProtoDecoder implements InterfaceC31105CIr<GetQuestionnaireContentResponse.ResponseData.Question> {
    public static GetQuestionnaireContentResponse.ResponseData.Question LIZIZ(Q9H q9h) {
        GetQuestionnaireContentResponse.ResponseData.Question question = new GetQuestionnaireContentResponse.ResponseData.Question();
        question.answers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    question.required = Q9J.LIZ(q9h);
                                }
                            } else {
                                question.answers.add(Q9J.LIZIZ(q9h));
                            }
                        } else {
                            question.questionContent = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        question.questionType = q9h.LJIIJ();
                    }
                } else {
                    question.questionId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return question;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetQuestionnaireContentResponse.ResponseData.Question LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
