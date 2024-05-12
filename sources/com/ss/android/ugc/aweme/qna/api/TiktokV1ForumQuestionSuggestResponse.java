package com.ss.android.ugc.aweme.qna.api;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokV1ForumQuestionSuggestResponse {

    @InterfaceC65349Pkn("mix_question_collection")
    public final MixedQuestionCollection mixedQuestionCollection;

    @InterfaceC65349Pkn("msg")
    public final String msg;

    @InterfaceC65349Pkn("question_collection")
    public final List<QuestionCollection> questionCollection;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ForumQuestionSuggestResponse)) {
            return false;
        }
        TiktokV1ForumQuestionSuggestResponse tiktokV1ForumQuestionSuggestResponse = (TiktokV1ForumQuestionSuggestResponse) obj;
        return this.statusCode == tiktokV1ForumQuestionSuggestResponse.statusCode && o.LJ(this.msg, tiktokV1ForumQuestionSuggestResponse.msg) && o.LJ(this.questionCollection, tiktokV1ForumQuestionSuggestResponse.questionCollection) && o.LJ(this.mixedQuestionCollection, tiktokV1ForumQuestionSuggestResponse.mixedQuestionCollection);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokV1ForumQuestionSuggestResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", questionCollection=");
        LIZ.append(this.questionCollection);
        LIZ.append(", mixedQuestionCollection=");
        LIZ.append(this.mixedQuestionCollection);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.msg, this.statusCode * 31, 31);
        List<QuestionCollection> list = this.questionCollection;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        MixedQuestionCollection mixedQuestionCollection = this.mixedQuestionCollection;
        if (mixedQuestionCollection != null) {
            i = mixedQuestionCollection.hashCode();
        }
        return i2 + i;
    }

    public TiktokV1ForumQuestionSuggestResponse(int i, String msg, List<QuestionCollection> list, MixedQuestionCollection mixedQuestionCollection) {
        o.LJIIIZ(msg, "msg");
        this.statusCode = i;
        this.msg = msg;
        this.questionCollection = list;
        this.mixedQuestionCollection = mixedQuestionCollection;
    }
}
