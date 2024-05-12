package com.ss.android.ugc.aweme.dsp.experiment;

import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class FirstFrameOpt {

    @InterfaceC65349Pkn("enable_api_preload")
    public final boolean enableApiPreload = true;

    @InterfaceC65349Pkn("enable_video_preload")
    public final boolean enableVideoPreload = true;

    @InterfaceC65349Pkn("preload_ttl")
    public final int preloadTtl = 21600000;

    @InterfaceC65349Pkn("video_preload_delay_time")
    public final int videoPreloadDelayTime = 3000;

    @InterfaceC65349Pkn("enable_mobile_api_preload")
    public final boolean enableMobileApiPreload = true;

    @InterfaceC65349Pkn("enable_mobile_video_preload")
    public final boolean enableMobileVideoPreload = true;

    @InterfaceC65349Pkn("enable_local_cache")
    public final boolean enableLocalCache = true;

    @InterfaceC65349Pkn("enable_repeat_preload_local_media")
    public final boolean enableRepeatPreloadLocalMedia = true;

    public final boolean getEnableApiPreload() {
        return this.enableApiPreload;
    }

    public final boolean getEnableLocalCache() {
        return this.enableLocalCache;
    }

    public final boolean getEnableMobileApiPreload() {
        return this.enableMobileApiPreload;
    }

    public final boolean getEnableMobileVideoPreload() {
        return this.enableMobileVideoPreload;
    }

    public final boolean getEnableRepeatPreloadLocalMedia() {
        return this.enableRepeatPreloadLocalMedia;
    }

    public final boolean getEnableVideoPreload() {
        return this.enableVideoPreload;
    }

    public final int getPreloadTtl() {
        return this.preloadTtl;
    }

    public final int getVideoPreloadDelayTime() {
        return this.videoPreloadDelayTime;
    }
}
