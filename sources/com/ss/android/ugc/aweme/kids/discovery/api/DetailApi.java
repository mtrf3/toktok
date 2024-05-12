package com.ss.android.ugc.aweme.kids.discovery.api;

import X.AFI;
import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.kids.discovery.model.KDisocverDetailList;

/* loaded from: classes16.dex */
public final class DetailApi {
    public static final RetrofitApi LIZ = (RetrofitApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(RetrofitApi.class);

    /* loaded from: classes16.dex */
    public interface RetrofitApi {
        @E8L("/tiktok/v1/kids/category/videos/")
        AbstractC73672Svk<KDisocverDetailList> getDetailList(@InterfaceC64986Pew("ch_id") String str, @InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2);
    }
}
