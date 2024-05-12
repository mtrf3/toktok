package com.ss.android.ugc.aweme.qna.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.E8L;
import X.ECY;
import X.InterfaceC195787mI;
import X.InterfaceC64986Pew;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.question.model.CreateQuestionResponse;

/* loaded from: classes13.dex */
public interface QnaApiV2 {
    public static final ECY LIZ = ECY.LIZ;

    @E4T("/tiktok/v1/forum/question/collect/")
    Object collectQuestion(@InterfaceC64986Pew("question_id") long j, @InterfaceC64986Pew("action") int i, InterfaceC67352kd<? super TiktokV1ForumQuestionCollectResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/forum/question/invite/delete/")
    Object deleteInviteQuestion(@InterfaceC64987Pex("question_id") long j, InterfaceC67352kd<? super TiktokV1ForumInviteQuestionDeleteResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/forum/question/delete/")
    AbstractC73672Svk<TiktokV1ForumQuestionDeleteResponse> deleteQuestion(@InterfaceC64987Pex("question_id") long j);

    @E8L("/tiktok/v1/forum/profile/answers/")
    AbstractC73672Svk<TiktokV1ForumProfileAnswersResponse> getAnswersTabData(@InterfaceC64986Pew("user_id") Long l, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("cursor") int i2, @InterfaceC64986Pew("sec_user_id") String str);

    @E8L("/tiktok/v1/forum/profile/banner/")
    AbstractC73672Svk<TiktokV1ForumProfileBannerResponse> getBannerData(@InterfaceC64986Pew("user_id") Long l, @InterfaceC64986Pew("sec_user_id") String str);

    @E8L("/tiktok/v1/forum/category/suggest/")
    AbstractC73672Svk<TiktokV1ForumCategorySuggestResponse> getQuestionCreateCategory(@InterfaceC64986Pew("user_id") Long l, @InterfaceC64986Pew("question_text") String str, @InterfaceC64986Pew("question_language") String str2);

    @E8L("/tiktok/v1/forum/profile/questions/")
    AbstractC73672Svk<TiktokV1ForumProfileQuestionsResponse> getQuestionsTabData(@InterfaceC64986Pew("user_id") Long l, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("cursor") int i2, @InterfaceC64986Pew("sec_user_id") String str);

    @E8L("/tiktok/v1/forum/question/suggest/")
    Object getSuggestedTabData(@InterfaceC64986Pew("user_id") Long l, @InterfaceC64986Pew("requests") String str, InterfaceC67352kd<? super TiktokV1ForumQuestionSuggestResponse> interfaceC67352kd);

    @E8L("/tiktok/v1/forum/question/suggest/mix")
    Object getSuggestedTabMixedData(@InterfaceC64986Pew("requests") String str, InterfaceC67352kd<? super TiktokV1ForumQuestionSuggestResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/forum/question/create/")
    AbstractC73672Svk<CreateQuestionResponse> postQuestion(@InterfaceC64987Pex("user_id") Long l, @InterfaceC64987Pex("question_content") String str, @InterfaceC64987Pex("invited_users") String str2, @InterfaceC64987Pex("question_from") Integer num, @InterfaceC64987Pex("user_selected_categories") String str3);
}
