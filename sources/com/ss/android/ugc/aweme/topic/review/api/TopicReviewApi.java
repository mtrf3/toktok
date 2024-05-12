package com.ss.android.ugc.aweme.topic.review.api;

import X.C186207Sm;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.review.model.TopicReviewListResp;
import com.ss.android.ugc.aweme.topic.review.model.TopicReviewPublishResp;

/* loaded from: classes4.dex */
public interface TopicReviewApi {
    public static final C186207Sm LIZ = C186207Sm.LIZ;

    @E8M("/tiktok/topic/review/delete/v1/")
    Object deleteReview(@InterfaceC64986Pew("topic_id") String str, @InterfaceC64986Pew("topic_type") int i, @InterfaceC64986Pew("review_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8M("/tiktok/topic/review/digg/v1/")
    Object diggReview(@InterfaceC64986Pew("topic_id") String str, @InterfaceC64986Pew("topic_type") int i, @InterfaceC64986Pew("review_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/topic/review/list/v1/")
    Object getReviewList(@InterfaceC64986Pew("topic_id") String str, @InterfaceC64986Pew("topic_type") int i, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i2, InterfaceC67352kd<? super TopicReviewListResp> interfaceC67352kd);

    @E8M("/tiktok/topic/review/publish/v1/")
    @InterfaceC195757mF
    Object publishReview(@InterfaceC64986Pew("topic_id") String str, @InterfaceC64986Pew("topic_type") int i, @InterfaceC64985Pev("topic_rating") int i2, @InterfaceC64985Pev("text") String str2, InterfaceC67352kd<? super TopicReviewPublishResp> interfaceC67352kd);

    @E8M("/tiktok/topic/review/undigg/v1/")
    Object undiggReview(@InterfaceC64986Pew("topic_id") String str, @InterfaceC64986Pew("topic_type") int i, @InterfaceC64986Pew("review_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8M("/tiktok/topic/review/update/v1/")
    @InterfaceC195757mF
    Object updateReview(@InterfaceC64986Pew("topic_id") String str, @InterfaceC64986Pew("topic_type") int i, @InterfaceC64986Pew("review_id") String str2, @InterfaceC64985Pev("topic_rating") int i2, @InterfaceC64985Pev("text") String str3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
