package com.ss.android.ugc.aweme.qna.api;

import X.C16880lQ;
import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AnswerStruct {

    @InterfaceC65349Pkn("answer_creator")
    public final User answerCreator;

    @InterfaceC65349Pkn("answers")
    public final List<Aweme> answers;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("question_creator")
    public final User questionCreator;

    @InterfaceC65349Pkn("question_id")
    public final long questionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerStruct)) {
            return false;
        }
        AnswerStruct answerStruct = (AnswerStruct) obj;
        return this.questionId == answerStruct.questionId && o.LJ(this.content, answerStruct.content) && o.LJ(this.questionCreator, answerStruct.questionCreator) && o.LJ(this.answerCreator, answerStruct.answerCreator) && o.LJ(this.answers, answerStruct.answers);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.content, C16880lQ.LLJIJIL(this.questionId) * 31, 31);
        User user = this.questionCreator;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        User user2 = this.answerCreator;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return this.answers.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnswerStruct(questionId=");
        LIZ.append(this.questionId);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", questionCreator=");
        LIZ.append(this.questionCreator);
        LIZ.append(", answerCreator=");
        LIZ.append(this.answerCreator);
        LIZ.append(", answers=");
        return C1NE.LIZIZ(LIZ, this.answers, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnswerStruct(long j, String content, User user, User user2, List<? extends Aweme> answers) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(answers, "answers");
        this.questionId = j;
        this.content = content;
        this.questionCreator = user;
        this.answerCreator = user2;
        this.answers = answers;
    }
}
