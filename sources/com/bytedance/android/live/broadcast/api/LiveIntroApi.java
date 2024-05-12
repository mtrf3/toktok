package com.bytedance.android.live.broadcast.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import tikcast.api.anchor.AboutMeResponse;

/* loaded from: classes.dex */
public interface LiveIntroApi {
    @E8L("/webcast/anchor/about_me/")
    AbstractC73672Svk<C28467BFf<AboutMeResponse.ResponseData>> getLiveIntroData();
}
