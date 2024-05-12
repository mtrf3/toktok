package com.ss.android.ugc.aweme.creatortools.videogift;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;

/* loaded from: classes5.dex */
public final class VideoGiftApi {
    public static SetGiftSettingsApi LIZ;
    public static GetGiftEligibilityApi LIZIZ;

    /* loaded from: classes5.dex */
    public interface GetGiftEligibilityApi {
        @E4Q("/tiktok/v1/gift/eligibility/")
        AbstractC73672Svk<VideoGiftEligibilityResponse> getGiftEligibilityInfo();
    }

    /* loaded from: classes5.dex */
    public interface SetGiftSettingsApi {
        @InterfaceC195787mI
        @E8M("/tiktok/v1/gift/setting/")
        AbstractC73672Svk<VideoGiftSettingResponse> setGiftSettings(@InterfaceC64985Pev("accept_video_gift") int i);
    }
}
