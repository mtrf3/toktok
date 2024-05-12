package com.ss.android.ugc.aweme.question.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.question.ForumStruct;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class QuestionDetailResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("question")
    public ForumStruct question;

    public final ForumStruct getQuestion() {
        return this.question;
    }

    public final void setQuestion(ForumStruct forumStruct) {
        this.question = forumStruct;
    }
}
