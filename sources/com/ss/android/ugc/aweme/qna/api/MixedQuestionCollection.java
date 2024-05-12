package com.ss.android.ugc.aweme.qna.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.question.ForumStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MixedQuestionCollection extends F9E {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    @InterfaceC65349Pkn("question_list")
    public final List<ForumStruct> questionList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.nextPageToken, this.questionList, Boolean.valueOf(this.hasMore)};
    }

    public MixedQuestionCollection(String nextPageToken, List<ForumStruct> questionList, boolean z) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        o.LJIIIZ(questionList, "questionList");
        this.nextPageToken = nextPageToken;
        this.questionList = questionList;
        this.hasMore = z;
    }
}
