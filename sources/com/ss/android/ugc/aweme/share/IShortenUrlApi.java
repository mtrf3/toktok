package com.ss.android.ugc.aweme.share;

import X.AbstractC73635Sv9;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.share.model.ShortenModel;

/* loaded from: classes11.dex */
public interface IShortenUrlApi {
    @InterfaceC195787mI
    @E4T("/tiktok/share/link/shorten/v1/")
    AbstractC73635Sv9<ShortenModel> getShareLinkShortenUel(@InterfaceC64987Pex("scene") int i, @InterfaceC64987Pex("platform_id") String str, @InterfaceC64987Pex("share_url") String str2);
}
