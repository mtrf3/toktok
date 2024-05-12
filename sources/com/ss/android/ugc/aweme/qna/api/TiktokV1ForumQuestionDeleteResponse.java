package com.ss.android.ugc.aweme.qna.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TiktokV1ForumQuestionDeleteResponse extends F9E {

    @InterfaceC65349Pkn("msg")
    public final String msg;

    @InterfaceC65349Pkn("questions_count")
    public final long questionsCount;

    @InterfaceC65349Pkn("questions_tab_title")
    public final String questionsTabTitle;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.msg, this.questionsTabTitle, Long.valueOf(this.questionsCount)};
    }

    public TiktokV1ForumQuestionDeleteResponse(int i, String msg, String questionsTabTitle, long j) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(questionsTabTitle, "questionsTabTitle");
        this.statusCode = i;
        this.msg = msg;
        this.questionsTabTitle = questionsTabTitle;
        this.questionsCount = j;
    }
}
