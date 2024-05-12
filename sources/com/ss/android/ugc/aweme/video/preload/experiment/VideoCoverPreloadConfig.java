package com.ss.android.ugc.aweme.video.preload.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class VideoCoverPreloadConfig extends F9E {

    @InterfaceC65349Pkn("enable_preload")
    public final boolean enablePreload;

    @InterfaceC65349Pkn("preload_cover_cnt")
    public final int preloadCoverCnt;

    @InterfaceC65349Pkn("preload_when_download_complete")
    public final boolean preloadWhenDownloadComplete;

    @InterfaceC65349Pkn("preload_when_preload_next_video_done")
    public final boolean preloadWhenPreloadNextVideoDown;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCoverPreloadConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enablePreload), Boolean.valueOf(this.preloadWhenDownloadComplete), Boolean.valueOf(this.preloadWhenPreloadNextVideoDown), Integer.valueOf(this.preloadCoverCnt)};
    }

    public VideoCoverPreloadConfig(boolean z, boolean z2, boolean z3, int i) {
        this.enablePreload = z;
        this.preloadWhenDownloadComplete = z2;
        this.preloadWhenPreloadNextVideoDown = z3;
        this.preloadCoverCnt = i;
    }

    public /* synthetic */ VideoCoverPreloadConfig(boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0 : i);
    }
}
