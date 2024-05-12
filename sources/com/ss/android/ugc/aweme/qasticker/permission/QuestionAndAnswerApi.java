package com.ss.android.ugc.aweme.qasticker.permission;

import X.C10K;
import X.E4Q;

/* loaded from: classes3.dex */
public interface QuestionAndAnswerApi {
    @E4Q("/tiktok/v1/forum/user/visibility/")
    C10K<AllowUserToQuestionResponse> getAllowUserToQuestion();
}
