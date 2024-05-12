package com.ss.android.ugc.aweme.topicfeed.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedConfig {

    @InterfaceC65349Pkn("bkgd_video")
    public final UrlStruct bkgdVideo;

    @InterfaceC65349Pkn("bkgd_video_cover")
    public final UrlStruct bkgdVideoCover;

    /* JADX WARN: Multi-variable type inference failed */
    public TopicFeedConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicFeedConfig)) {
            return false;
        }
        TopicFeedConfig topicFeedConfig = (TopicFeedConfig) obj;
        return o.LJ(this.bkgdVideo, topicFeedConfig.bkgdVideo) && o.LJ(this.bkgdVideoCover, topicFeedConfig.bkgdVideoCover);
    }

    public final int hashCode() {
        UrlStruct urlStruct = this.bkgdVideo;
        int hashCode = (urlStruct == null ? 0 : urlStruct.hashCode()) * 31;
        UrlStruct urlStruct2 = this.bkgdVideoCover;
        return hashCode + (urlStruct2 != null ? urlStruct2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicFeedConfig(bkgdVideo=");
        LIZ.append(this.bkgdVideo);
        LIZ.append(", bkgdVideoCover=");
        LIZ.append(this.bkgdVideoCover);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public TopicFeedConfig(UrlStruct urlStruct, UrlStruct urlStruct2) {
        this.bkgdVideo = urlStruct;
        this.bkgdVideoCover = urlStruct2;
    }

    public /* synthetic */ TopicFeedConfig(UrlStruct urlStruct, UrlStruct urlStruct2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlStruct, (i & 2) != 0 ? null : urlStruct2);
    }
}
