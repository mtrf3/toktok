package com.ss.android.ugc.aweme.ad.network;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.NM1;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes11.dex */
public interface VoteApi {
    public static final NM1 LIZ = NM1.LIZ;

    @E8M("/tiktok/v1/ad/experience/vote/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> sendVoteOption(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("creative_id") String str2, @InterfaceC64985Pev("ad_id") String str3, @InterfaceC64985Pev("vote_result") int i);
}
