package com.ss.android.ugc.aweme.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoInfoFromURLResponse implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("valid_info")
    public final ValidInfo validInfo;

    @InterfaceC65349Pkn("video_info")
    public final VideoRelatedInfo videoInfo;

    public static /* synthetic */ VideoInfoFromURLResponse copy$default(VideoInfoFromURLResponse videoInfoFromURLResponse, int i, VideoRelatedInfo videoRelatedInfo, ValidInfo validInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoInfoFromURLResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            videoRelatedInfo = videoInfoFromURLResponse.videoInfo;
        }
        if ((i2 & 4) != 0) {
            validInfo = videoInfoFromURLResponse.validInfo;
        }
        return videoInfoFromURLResponse.copy(i, videoRelatedInfo, validInfo);
    }

    public final VideoInfoFromURLResponse copy(int i, VideoRelatedInfo videoRelatedInfo, ValidInfo validInfo) {
        return new VideoInfoFromURLResponse(i, videoRelatedInfo, validInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoFromURLResponse)) {
            return false;
        }
        VideoInfoFromURLResponse videoInfoFromURLResponse = (VideoInfoFromURLResponse) obj;
        return this.statusCode == videoInfoFromURLResponse.statusCode && o.LJ(this.videoInfo, videoInfoFromURLResponse.videoInfo) && o.LJ(this.validInfo, videoInfoFromURLResponse.validInfo);
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        VideoRelatedInfo videoRelatedInfo = this.videoInfo;
        int hashCode = (i + (videoRelatedInfo == null ? 0 : videoRelatedInfo.hashCode())) * 31;
        ValidInfo validInfo = this.validInfo;
        return hashCode + (validInfo != null ? validInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoInfoFromURLResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", videoInfo=");
        LIZ.append(this.videoInfo);
        LIZ.append(", validInfo=");
        LIZ.append(this.validInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final ValidInfo getValidInfo() {
        return this.validInfo;
    }

    public final VideoRelatedInfo getVideoInfo() {
        return this.videoInfo;
    }

    public VideoInfoFromURLResponse(int i, VideoRelatedInfo videoRelatedInfo, ValidInfo validInfo) {
        this.statusCode = i;
        this.videoInfo = videoRelatedInfo;
        this.validInfo = validInfo;
    }
}
