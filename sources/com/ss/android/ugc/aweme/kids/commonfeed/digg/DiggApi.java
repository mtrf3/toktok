package com.ss.android.ugc.aweme.kids.commonfeed.digg;

import X.AFI;
import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes16.dex */
public final class DiggApi {
    public static final RetrofitApi LIZ = (RetrofitApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(RetrofitApi.class);

    /* loaded from: classes16.dex */
    public interface RetrofitApi {
        @E8M("/tiktok/v1/kids/commit/item/digg/")
        AbstractC73672Svk<BaseResponse> diggAweme(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("type") int i);
    }
}
