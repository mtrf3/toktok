package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public class Question {

    @InterfaceC65349Pkn("answer_from")
    public int answerFrom;

    @InterfaceC65349Pkn("answer_status")
    public int answerStatus;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("create_from")
    public int createFrom;

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("question_id")
    public long questionId;

    @InterfaceC65349Pkn("rec_req_id")
    public String recReqId = "";

    @InterfaceC65349Pkn("user")
    public User user;

    public Question() {
    }

    public Question(long j, String str, int i, long j2, User user) {
        this.questionId = j;
        this.content = str;
        this.answerStatus = i;
        this.createTime = j2;
        this.user = user;
    }
}
