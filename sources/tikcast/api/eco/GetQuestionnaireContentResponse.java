package tikcast.api.eco;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetQuestionnaireContentResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("questions")
        public List<Question> questions = new ArrayList();

        /* loaded from: classes17.dex */
        public static final class Question {

            @InterfaceC65349Pkn("question_id")
            public long questionId;

            @InterfaceC65349Pkn("question_type")
            public int questionType;

            @InterfaceC65349Pkn("required")
            public boolean required;

            @InterfaceC65349Pkn("question_content")
            public String questionContent = "";

            @InterfaceC65349Pkn("answers")
            public List<String> answers = new ArrayList();
        }
    }
}
