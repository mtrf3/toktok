package com.ss.android.ugc.aweme.ad.feed.reminder;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;

/* loaded from: classes5.dex */
public interface NoticeUpdateApi {
    @E8M("/tiktok/v1/ad/notice/update/")
    AbstractC73672Svk<AdNoticeModel> postAdNotice(@InterfaceC64986Pew("biz") int i, @InterfaceC64986Pew("creative_id") String str, @InterfaceC64986Pew("enable_notice") Boolean bool, @InterfaceC64986Pew("log_id") String str2);
}
