package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Question extends F9E implements Serializable {

    @InterfaceC65349Pkn("answers")
    public List<String> answers;

    @InterfaceC65349Pkn("question_content")
    public String questionContent;

    @InterfaceC65349Pkn("question_id")
    public long questionId;

    @InterfaceC65349Pkn("question_type")
    public int questionType;

    @InterfaceC65349Pkn("required")
    public boolean required;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Question copy$default(Question question, long j, int i, String str, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = question.questionId;
        }
        if ((i2 & 2) != 0) {
            i = question.questionType;
        }
        if ((i2 & 4) != 0) {
            str = question.questionContent;
        }
        if ((i2 & 8) != 0) {
            list = question.answers;
        }
        if ((i2 & 16) != 0) {
            z = question.required;
        }
        return question.copy(j, i, str, list, z);
    }

    public final Question copy(long j, int i, String questionContent, List<String> answers, boolean z) {
        o.LJIIIZ(questionContent, "questionContent");
        o.LJIIIZ(answers, "answers");
        return new Question(j, i, questionContent, answers, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.questionId), Integer.valueOf(this.questionType), this.questionContent, this.answers, Boolean.valueOf(this.required)};
    }

    public final List<String> getAnswers() {
        return this.answers;
    }

    public final String getQuestionContent() {
        return this.questionContent;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final int getQuestionType() {
        return this.questionType;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final void setAnswers(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.answers = list;
    }

    public final void setQuestionContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.questionContent = str;
    }

    public final void setQuestionId(long j) {
        this.questionId = j;
    }

    public final void setQuestionType(int i) {
        this.questionType = i;
    }

    public final void setRequired(boolean z) {
        this.required = z;
    }

    public Question(long j, int i, String questionContent, List<String> answers, boolean z) {
        o.LJIIIZ(questionContent, "questionContent");
        o.LJIIIZ(answers, "answers");
        this.questionId = j;
        this.questionType = i;
        this.questionContent = questionContent;
        this.answers = answers;
        this.required = z;
    }

    public /* synthetic */ Question(long j, int i, String str, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, list, (i2 & 16) != 0 ? true : z);
    }
}
