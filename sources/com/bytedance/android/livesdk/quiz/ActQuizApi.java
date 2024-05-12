package com.bytedance.android.livesdk.quiz;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import webcast.api.activity_quiz.QueryUserIdentityResponse;

/* loaded from: classes6.dex */
public interface ActQuizApi {
    @E8L("/webcast/activity/trivia/answer/query_user_identity")
    AbstractC73672Svk<C28467BFf<QueryUserIdentityResponse>> queryUserIdentity(@InterfaceC64986Pew("room_id") String str);
}
