package com.ss.android.ugc.aweme.ad.feed.dialog;

import X.AbstractC73672Svk;
import X.C42997Gu9;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes8.dex */
public interface DislikeReasonApi {
    public static final C42997Gu9 LIZ = C42997Gu9.LIZ;

    @E8M("/tiktok/v1/ad/experience/dislike/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> submitReason(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("ad_id") String str2, @InterfaceC64985Pev("creative_id") String str3, @InterfaceC64985Pev("dislike_reasons") String str4, @InterfaceC64985Pev("log_extra") String str5, @InterfaceC64985Pev("room_id") String str6);
}
