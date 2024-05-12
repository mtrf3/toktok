package com.ss.android.ugc.aweme.comment.gift.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;

/* loaded from: classes4.dex */
public final class GiftListApi {
    public static FetchGiftListApi LIZ;

    /* loaded from: classes4.dex */
    public interface FetchGiftListApi {
        @E8L("/tiktok/v1/gift/list/")
        AbstractC73672Svk<GiftResponse> getGiftList(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("creator_uid") String str2, @InterfaceC64986Pew("gift_list_type") Integer num);
    }
}
