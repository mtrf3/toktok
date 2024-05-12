package com.ss.android.ugc.aweme.ad.network;

import X.AbstractC73672Svk;
import X.C35986EAk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public interface ScoreApi {
    public static final C35986EAk LIZ = C35986EAk.LIZ;

    @E8M("/tiktok/v1/ad/experience/ad/history/rating/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> sendScoreOption(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("advertiser_id") String str2, @InterfaceC64985Pev("ad_id") String str3, @InterfaceC64985Pev("creative_id") String str4, @InterfaceC64985Pev("send_notice_time") int i, @InterfaceC64985Pev("rating") int i2, @InterfaceC64985Pev("ad_experience_type") int i3);
}
