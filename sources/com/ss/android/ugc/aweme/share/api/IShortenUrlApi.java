package com.ss.android.ugc.aweme.share.api;

import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.share.model.ShortenModel;

/* loaded from: classes11.dex */
public interface IShortenUrlApi {
    @InterfaceC195787mI
    @E4T("/tiktok/share/link/shorten/v1/")
    Object getShareLinkShortenUrl(@InterfaceC64987Pex("scene") int i, @InterfaceC64987Pex("platform_id") String str, @InterfaceC64987Pex("share_url") String str2, InterfaceC67352kd<? super ShortenModel> interfaceC67352kd);
}
