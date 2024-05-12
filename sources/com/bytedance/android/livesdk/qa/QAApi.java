package com.bytedance.android.livesdk.qa;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;

/* loaded from: classes6.dex */
public interface QAApi {
    @E8M("/webcast/interaction/question/delete/")
    AbstractC73672Svk<C28467BFf> deleteQuestion(@InterfaceC64986Pew("question_id") long j);

    @E8M("/webcast/interaction/question/answer/end/")
    AbstractC73672Svk<C28467BFf> endAnswer(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("question_id") long j2);

    @E8M("/webcast/interaction/question/recommend/")
    AbstractC73672Svk<C28467BFf<QuestionList>> getRecommendQuestion(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("page_num") int i, @InterfaceC64986Pew("from") int i2);

    @E8M("/webcast/interaction/question/recommend/")
    AbstractC73672Svk<C28467BFf<QuestionList>> getTryModeRecommendQuestion(@InterfaceC64986Pew("mock_room_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("page_num") int i, @InterfaceC64986Pew("from") int i2);

    @E8M("/webcast/interaction/question/like/")
    AbstractC73672Svk<C28467BFf> likeQuestion(@InterfaceC64986Pew("question_id") long j, @InterfaceC64986Pew("like") int i, @InterfaceC64986Pew("from") int i2);

    @E8M("/webcast/interaction/question/current/")
    AbstractC73672Svk<C28467BFf<CurrentQuestionResponse>> queryCurrentQuestion(@InterfaceC64986Pew("room_id") long j);

    @E8M("/webcast/interaction/question/list/")
    AbstractC73672Svk<C28467BFf<QuestionListResponse>> queryQuestion(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("unanswered_list_page_num") long j2, @InterfaceC64986Pew("answered_list_page_num") long j3, @InterfaceC64986Pew("invited_list_page_num") long j4, @InterfaceC64986Pew("from") int i);

    @E8M("/webcast/interaction/question/answer/start/")
    AbstractC73672Svk<C28467BFf<StartAnswerResponse>> startAnswer(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("question_id") long j2, @InterfaceC64986Pew("from") int i);

    @E8M("/webcast/interaction/question/submit/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<QuestionResponse>> submitQuestion(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("content") String str, @InterfaceC64985Pev("from") int i, @InterfaceC64985Pev("post_anyway") int i2, @InterfaceC64985Pev("ref_question_id") long j2);

    @E8M("/webcast/interaction/question/switch/")
    AbstractC73672Svk<C28467BFf> switchOn(@InterfaceC64986Pew("turn_on") long j);
}
