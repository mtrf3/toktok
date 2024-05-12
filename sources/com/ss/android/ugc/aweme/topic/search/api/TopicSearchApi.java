package com.ss.android.ugc.aweme.topic.search.api;

import X.C185597Qd;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;

/* loaded from: classes4.dex */
public interface TopicSearchApi {
    public static final C185597Qd LIZ = C185597Qd.LIZ;

    @E4Q("/tiktok/topic/recommend/list/v1/")
    Object recommendTopic(@InterfaceC64989Pez("topic_id") String str, @InterfaceC64989Pez("topic_type") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("page_extra") String str2, InterfaceC67352kd<? super RecommendTopicResponse> interfaceC67352kd);

    @E4Q("/tiktok/topic/search/v1/")
    Object searchTopic(@InterfaceC64989Pez("keyword") String str, @InterfaceC64989Pez("source") String str2, @InterfaceC64989Pez("from_business") String str3, InterfaceC67352kd<? super SearchTopicResponse> interfaceC67352kd);

    @E4Q("/tiktok/topic/book/list/v1/")
    Object suggestBook(@InterfaceC64989Pez("cursor") Long l, @InterfaceC64989Pez("count") int i, InterfaceC67352kd<? super SuggestTopicResponse> interfaceC67352kd);

    @E4Q("/tiktok/topic/movie/list/v1/")
    Object suggestMovie(@InterfaceC64989Pez("cursor") Long l, @InterfaceC64989Pez("count") int i, InterfaceC67352kd<? super SuggestTopicResponse> interfaceC67352kd);
}
