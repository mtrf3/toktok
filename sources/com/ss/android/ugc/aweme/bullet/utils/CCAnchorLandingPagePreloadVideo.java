package com.ss.android.ugc.aweme.bullet.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class CCAnchorLandingPagePreloadVideo {

    @InterfaceC65349Pkn("android_score")
    public final PreloadVideoConfigAndroidScore androidScore;

    @InterfaceC65349Pkn("preload_size")
    public final PreloadVideoConfigSize preloadSize;

    /* JADX WARN: Multi-variable type inference failed */
    public CCAnchorLandingPagePreloadVideo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CCAnchorLandingPagePreloadVideo)) {
            return false;
        }
        CCAnchorLandingPagePreloadVideo cCAnchorLandingPagePreloadVideo = (CCAnchorLandingPagePreloadVideo) obj;
        return o.LJ(this.androidScore, cCAnchorLandingPagePreloadVideo.androidScore) && o.LJ(this.preloadSize, cCAnchorLandingPagePreloadVideo.preloadSize);
    }

    public final int hashCode() {
        PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore = this.androidScore;
        int hashCode = (preloadVideoConfigAndroidScore == null ? 0 : preloadVideoConfigAndroidScore.hashCode()) * 31;
        PreloadVideoConfigSize preloadVideoConfigSize = this.preloadSize;
        return hashCode + (preloadVideoConfigSize != null ? preloadVideoConfigSize.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CCAnchorLandingPagePreloadVideo(androidScore=");
        LIZ.append(this.androidScore);
        LIZ.append(", preloadSize=");
        LIZ.append(this.preloadSize);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CCAnchorLandingPagePreloadVideo(PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore, PreloadVideoConfigSize preloadVideoConfigSize) {
        this.androidScore = preloadVideoConfigAndroidScore;
        this.preloadSize = preloadVideoConfigSize;
    }

    public /* synthetic */ CCAnchorLandingPagePreloadVideo(PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore, PreloadVideoConfigSize preloadVideoConfigSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : preloadVideoConfigAndroidScore, (i & 2) != 0 ? null : preloadVideoConfigSize);
    }
}
