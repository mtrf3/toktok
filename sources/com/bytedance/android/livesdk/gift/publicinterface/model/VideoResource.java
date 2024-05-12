package com.bytedance.android.livesdk.gift.publicinterface.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VideoResource {
    public final String videoMd5;
    public final String videoTypeName;
    public final List<String> videoUrl;

    public VideoResource() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoResource copy$default(VideoResource videoResource, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoResource.videoTypeName;
        }
        if ((i & 2) != 0) {
            list = videoResource.videoUrl;
        }
        if ((i & 4) != 0) {
            str2 = videoResource.videoMd5;
        }
        return videoResource.copy(str, list, str2);
    }

    public final VideoResource copy(String videoTypeName, List<String> videoUrl, String videoMd5) {
        o.LJIIIZ(videoTypeName, "videoTypeName");
        o.LJIIIZ(videoUrl, "videoUrl");
        o.LJIIIZ(videoMd5, "videoMd5");
        return new VideoResource(videoTypeName, videoUrl, videoMd5);
    }

    public int hashCode() {
        return this.videoMd5.hashCode() + AnonymousClass391.LIZIZ(this.videoUrl, this.videoTypeName.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoResource(videoTypeName=");
        LIZ.append(this.videoTypeName);
        LIZ.append(", videoUrl=");
        LIZ.append(this.videoUrl);
        LIZ.append(", videoMd5=");
        return q.LIZIZ(LIZ, this.videoMd5, ')', LIZ);
    }

    public final String getVideoMd5() {
        return this.videoMd5;
    }

    public final String getVideoTypeName() {
        return this.videoTypeName;
    }

    public final List<String> getVideoUrl() {
        return this.videoUrl;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof VideoResource)) {
            return false;
        }
        VideoResource videoResource = (VideoResource) obj;
        if (!o.LJ(this.videoMd5, videoResource.videoMd5) || !o.LJ(this.videoTypeName, videoResource.videoTypeName)) {
            return false;
        }
        return true;
    }

    public VideoResource(String videoTypeName, List<String> videoUrl, String videoMd5) {
        o.LJIIIZ(videoTypeName, "videoTypeName");
        o.LJIIIZ(videoUrl, "videoUrl");
        o.LJIIIZ(videoMd5, "videoMd5");
        this.videoTypeName = videoTypeName;
        this.videoUrl = videoUrl;
        this.videoMd5 = videoMd5;
    }

    public VideoResource(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? "" : str2);
    }
}
