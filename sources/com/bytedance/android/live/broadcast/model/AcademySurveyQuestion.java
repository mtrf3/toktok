package com.bytedance.android.live.broadcast.model;

import X.AnonymousClass391;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class AcademySurveyQuestion {

    @InterfaceC65349Pkn("options")
    public final List<SurveyQuestionOption> options;

    @InterfaceC65349Pkn("question_id")
    public final String questionId;

    @InterfaceC65349Pkn("question_type")
    public final int questionType;

    @InterfaceC65349Pkn("question_sub_title")
    public final String subTitle;

    @InterfaceC65349Pkn("question_title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcademySurveyQuestion)) {
            return false;
        }
        AcademySurveyQuestion academySurveyQuestion = (AcademySurveyQuestion) obj;
        return o.LJ(this.questionId, academySurveyQuestion.questionId) && this.questionType == academySurveyQuestion.questionType && o.LJ(this.title, academySurveyQuestion.title) && o.LJ(this.options, academySurveyQuestion.options) && o.LJ(this.subTitle, academySurveyQuestion.subTitle);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.options, C79062V1e.LJ(this.title, ((this.questionId.hashCode() * 31) + this.questionType) * 31, 31), 31);
        String str = this.subTitle;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AcademySurveyQuestion(questionId=");
        LIZ.append(this.questionId);
        LIZ.append(", questionType=");
        LIZ.append(this.questionType);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", options=");
        LIZ.append(this.options);
        LIZ.append(", subTitle=");
        return q.LIZIZ(LIZ, this.subTitle, ')', LIZ);
    }

    public AcademySurveyQuestion(String questionId, int i, String title, List<SurveyQuestionOption> options, String str) {
        o.LJIIIZ(questionId, "questionId");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(options, "options");
        this.questionId = questionId;
        this.questionType = i;
        this.title = title;
        this.options = options;
        this.subTitle = str;
    }

    public /* synthetic */ AcademySurveyQuestion(String str, int i, String str2, List list, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, list, (i2 & 16) != 0 ? null : str3);
    }
}
