package com.ss.android.ugc.aweme.utils;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes7.dex */
public interface GoogleColdStartApi {
    @E8L("/tiktok/ug/landing/ads/dest/get/v1")
    AbstractC73672Svk<AttributionInfoResponse> getGoogleAttributionInfo(@InterfaceC64986Pew("gaid") String str);
}
