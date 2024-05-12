package com.ss.android.ugc.aweme.topic.book.detail.api;

import X.C199417s9;
import X.E4T;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface BookDetailApi {
    public static final C199417s9 LIZ = C199417s9.LIZ;

    @E4T("/tiktok/topic/book/collect/v1/")
    Object collectBook(@InterfaceC64986Pew("book_id") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/topic/book/detail/v1/")
    Object getBookDetail(@InterfaceC64986Pew("book_id") String str, InterfaceC67352kd<? super BookDetailResp> interfaceC67352kd);

    @E8L("/tiktok/topic/book/itemlist/v1/")
    Object getBookVideos(@InterfaceC64986Pew("book_id") String str, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("page_extra") String str2, InterfaceC67352kd<? super BookVideosResp> interfaceC67352kd);

    @E4T("/tiktok/topic/book/uncollect/v1/")
    Object unCollectBook(@InterfaceC64986Pew("book_id") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
