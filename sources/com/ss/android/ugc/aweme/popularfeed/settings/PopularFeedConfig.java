package com.ss.android.ugc.aweme.popularfeed.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularFeedConfig {

    @InterfaceC65349Pkn("bkgd_video")
    public UrlStruct bkgdVideo;

    @InterfaceC65349Pkn("bkgd_video_cover")
    public UrlStruct bkgdVideoCover;

    @InterfaceC65349Pkn("welcome_popup")
    public WelcomePopup welcomePopup;

    /* JADX WARN: Multi-variable type inference failed */
    public PopularFeedConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopularFeedConfig)) {
            return false;
        }
        PopularFeedConfig popularFeedConfig = (PopularFeedConfig) obj;
        return o.LJ(this.welcomePopup, popularFeedConfig.welcomePopup) && o.LJ(this.bkgdVideo, popularFeedConfig.bkgdVideo) && o.LJ(this.bkgdVideoCover, popularFeedConfig.bkgdVideoCover);
    }

    public final int hashCode() {
        int hashCode = this.welcomePopup.hashCode() * 31;
        UrlStruct urlStruct = this.bkgdVideo;
        int hashCode2 = (hashCode + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
        UrlStruct urlStruct2 = this.bkgdVideoCover;
        return hashCode2 + (urlStruct2 != null ? urlStruct2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopularFeedConfig(welcomePopup=");
        LIZ.append(this.welcomePopup);
        LIZ.append(", bkgdVideo=");
        LIZ.append(this.bkgdVideo);
        LIZ.append(", bkgdVideoCover=");
        LIZ.append(this.bkgdVideoCover);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PopularFeedConfig(WelcomePopup welcomePopup, UrlStruct urlStruct, UrlStruct urlStruct2) {
        o.LJIIIZ(welcomePopup, "welcomePopup");
        this.welcomePopup = welcomePopup;
        this.bkgdVideo = urlStruct;
        this.bkgdVideoCover = urlStruct2;
    }

    public /* synthetic */ PopularFeedConfig(WelcomePopup welcomePopup, UrlStruct urlStruct, UrlStruct urlStruct2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WelcomePopup(null, null, null, 7, null) : welcomePopup, (i & 2) != 0 ? null : urlStruct, (i & 4) != 0 ? null : urlStruct2);
    }
}
