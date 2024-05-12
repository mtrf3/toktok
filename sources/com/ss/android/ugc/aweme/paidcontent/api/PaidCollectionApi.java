package com.ss.android.ugc.aweme.paidcontent.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;

/* loaded from: classes5.dex */
public final class PaidCollectionApi {
    public static GetPaidCollectionListApi LIZ;
    public static GetPaidCollectionDetailApi LIZIZ;
    public static PostPaidContentVideoProgressApi LIZJ;

    /* loaded from: classes2.dex */
    public interface GetPaidCollectionDetailApi {
        @E4Q("/tiktok/v1/paid_content/collection/detail")
        AbstractC73672Svk<PaidCollectionDetailResponse> getPaidCollectionDetail(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("source") int i);
    }

    /* loaded from: classes2.dex */
    public interface GetPaidCollectionListApi {
        @E4Q("/tiktok/v1/paid_content/collection/list")
        AbstractC73672Svk<PaidCollectionListResponse> getPaidCollectionList(@InterfaceC64986Pew("creator_uid") long j, @InterfaceC64986Pew("list_source") int i, @InterfaceC64986Pew("cursor") long j2, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("room_id") Long l);
    }

    /* loaded from: classes5.dex */
    public interface PostPaidContentVideoProgressApi {
        @E4T("/tiktok/v1/paid_content/video_progress")
        AbstractC73672Svk<BaseResponse> postPaidContentVideoProgress(@InterfaceC64986Pew("paid_video_id") long j, @InterfaceC64986Pew("user_id") long j2, @InterfaceC64986Pew("start_timestamp") int i, @InterfaceC64986Pew("end_timestamp") int i2, @InterfaceC64986Pew("trigger") int i3);
    }
}
