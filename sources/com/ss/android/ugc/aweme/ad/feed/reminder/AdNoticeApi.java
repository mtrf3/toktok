package com.ss.android.ugc.aweme.ad.feed.reminder;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;

/* loaded from: classes5.dex */
public interface AdNoticeApi {
    @E8L("/tiktok/v1/ad/notice/subscription/status/")
    AbstractC73672Svk<AdNoticeModel> getAdNotice(@InterfaceC64986Pew("biz") int i, @InterfaceC64986Pew("creative_id") String str);
}
