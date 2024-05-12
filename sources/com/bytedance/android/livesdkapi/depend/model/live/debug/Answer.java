package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Answer extends F9E implements Serializable {

    @InterfaceC65349Pkn("answers")
    public HashSet<String> answers;

    @InterfaceC65349Pkn("question_id")
    public long questionId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Answer copy$default(Answer answer, long j, HashSet hashSet, int i, Object obj) {
        if ((i & 1) != 0) {
            j = answer.questionId;
        }
        if ((i & 2) != 0) {
            hashSet = answer.answers;
        }
        return answer.copy(j, hashSet);
    }

    public final Answer copy(long j, HashSet<String> answers) {
        o.LJIIIZ(answers, "answers");
        return new Answer(j, answers);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.questionId), this.answers};
    }

    public final HashSet<String> getAnswers() {
        return this.answers;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final void setAnswers(HashSet<String> hashSet) {
        o.LJIIIZ(hashSet, "<set-?>");
        this.answers = hashSet;
    }

    public final void setQuestionId(long j) {
        this.questionId = j;
    }

    public Answer(long j, HashSet<String> answers) {
        o.LJIIIZ(answers, "answers");
        this.questionId = j;
        this.answers = answers;
    }

    public /* synthetic */ Answer(long j, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, hashSet);
    }
}
