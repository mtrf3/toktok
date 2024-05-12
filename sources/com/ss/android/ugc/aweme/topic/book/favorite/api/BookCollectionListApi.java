package com.ss.android.ugc.aweme.topic.book.favorite.api;

import X.C7I8;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes4.dex */
public interface BookCollectionListApi {
    public static final C7I8 LIZ = C7I8.LIZ;

    @E8L("/tiktok/topic/book/collections/v1/")
    Object getBookCollectionList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, InterfaceC67352kd<? super BookCollectionListResponse> interfaceC67352kd);
}
