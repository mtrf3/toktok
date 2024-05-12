package com.ss.android.ugc.aweme.feed.model.survey;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ReplaceInfo implements Serializable {

    @InterfaceC65349Pkn("question")
    public Question question;

    public ReplaceInfo() {
    }

    public static /* synthetic */ ReplaceInfo copy$default(ReplaceInfo replaceInfo, Question question, int i, Object obj) {
        if ((i & 1) != 0) {
            question = replaceInfo.question;
        }
        return replaceInfo.copy(question);
    }

    public final ReplaceInfo copy(Question question) {
        return new ReplaceInfo(question);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReplaceInfo) && o.LJ(this.question, ((ReplaceInfo) obj).question);
    }

    public int hashCode() {
        Question question = this.question;
        if (question == null) {
            return 0;
        }
        return question.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplaceInfo(question=");
        LIZ.append(this.question);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Question getQuestion() {
        return this.question;
    }

    public ReplaceInfo(Question question) {
        this.question = question;
    }

    public final void setQuestion(Question question) {
        this.question = question;
    }
}
