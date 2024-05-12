package com.bytedance.android.live.broadcast.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SubmitSurveyAnswerRequest extends F9E {

    @InterfaceC65349Pkn("answers")
    public final List<SurveyAnswer> answers;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("survey_target")
    public final String survey_target;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.survey_target, this.answers, this.extra};
    }

    public SubmitSurveyAnswerRequest(String survey_target, List<SurveyAnswer> answers, Map<String, String> extra) {
        o.LJIIIZ(survey_target, "survey_target");
        o.LJIIIZ(answers, "answers");
        o.LJIIIZ(extra, "extra");
        this.survey_target = survey_target;
        this.answers = answers;
        this.extra = extra;
    }
}
