package com.bytedance.android.livesdk.gift.assets;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VideoResource {

    @InterfaceC65349Pkn("video_md5")
    public String videoMd5;

    @InterfaceC65349Pkn("video_type_name")
    public String videoTypeName;

    @InterfaceC65349Pkn("video_url")
    public ResourceModel videoUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoResource() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoResource copy$default(VideoResource videoResource, String str, ResourceModel resourceModel, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoResource.videoTypeName;
        }
        if ((i & 2) != 0) {
            resourceModel = videoResource.videoUrl;
        }
        if ((i & 4) != 0) {
            str2 = videoResource.videoMd5;
        }
        return videoResource.copy(str, resourceModel, str2);
    }

    public final String component1() {
        return this.videoTypeName;
    }

    public final ResourceModel component2() {
        return this.videoUrl;
    }

    public final String component3() {
        return this.videoMd5;
    }

    public final VideoResource copy(String videoTypeName, ResourceModel videoUrl, String videoMd5) {
        o.LJIIIZ(videoTypeName, "videoTypeName");
        o.LJIIIZ(videoUrl, "videoUrl");
        o.LJIIIZ(videoMd5, "videoMd5");
        return new VideoResource(videoTypeName, videoUrl, videoMd5);
    }

    public int hashCode() {
        return this.videoMd5.hashCode() + ((this.videoUrl.hashCode() + (this.videoTypeName.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoResource(videoTypeName=");
        LIZ.append(this.videoTypeName);
        LIZ.append(", videoUrl=");
        LIZ.append(this.videoUrl);
        LIZ.append(", videoMd5=");
        return JBR.LJFF(LIZ, this.videoMd5, ")", LIZ);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof VideoResource)) {
            return false;
        }
        VideoResource videoResource = (VideoResource) obj;
        if ((!o.LJ(this.videoMd5, videoResource.videoMd5)) || (!o.LJ(this.videoTypeName, videoResource.videoTypeName))) {
            return false;
        }
        return true;
    }

    public VideoResource(String videoTypeName, ResourceModel videoUrl, String videoMd5) {
        o.LJIIIZ(videoTypeName, "videoTypeName");
        o.LJIIIZ(videoUrl, "videoUrl");
        o.LJIIIZ(videoMd5, "videoMd5");
        this.videoTypeName = videoTypeName;
        this.videoUrl = videoUrl;
        this.videoMd5 = videoMd5;
    }

    public /* synthetic */ VideoResource(String str, ResourceModel resourceModel, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ResourceModel(null, null, 3, null) : resourceModel, (i & 4) != 0 ? "" : str2);
    }
}
