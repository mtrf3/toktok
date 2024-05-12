package com.ss.android.ugc.aweme.share;

import X.AbstractC73635Sv9;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.share.model.SharerInfoChecksum;
import com.ss.android.ugc.aweme.share.model.ShortenModel;

/* loaded from: classes11.dex */
public final class ShortenUrlApi {
    public static final RetrofitApi LIZ = (RetrofitApi) RetrofitFactory.LIZLLL().create("https://api-va.tiktokv.com/").create(RetrofitApi.class);

    /* loaded from: classes11.dex */
    public interface RetrofitApi {
        @E4Q("/shorten/")
        AbstractC73635Sv9<ShortenModel> fetchShortenUrl(@InterfaceC64989Pez("target") String str, @InterfaceC64989Pez("belong") String str2, @InterfaceC64989Pez("persist") String str3);

        @InterfaceC195787mI
        @E4T("/tiktok/v1/sharer/info/sign/")
        AbstractC73635Sv9<SharerInfoChecksum> getSharerInfoChecksum(@InterfaceC64987Pex("link_id") String str, @InterfaceC64987Pex("item_id") String str2, @InterfaceC64987Pex("invitation_scene") String str3);
    }

    public static AbstractC73635Sv9<SharerInfoChecksum> LIZ(String str, String str2, String str3) {
        return LIZ.getSharerInfoChecksum(str, str2, str3);
    }
}
