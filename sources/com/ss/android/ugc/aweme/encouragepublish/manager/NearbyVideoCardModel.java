package com.ss.android.ugc.aweme.encouragepublish.manager;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Video;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyVideoCardModel {

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("poi_info")
    public final NearbyVideoCardPoiInfo poiInfo;

    @InterfaceC65349Pkn("video")
    public final Video video;

    @InterfaceC65349Pkn("video_start_time")
    public final Float videoStartTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyVideoCardModel)) {
            return false;
        }
        NearbyVideoCardModel nearbyVideoCardModel = (NearbyVideoCardModel) obj;
        return o.LJ(this.video, nearbyVideoCardModel.video) && o.LJ(this.poiInfo, nearbyVideoCardModel.poiInfo) && o.LJ(this.videoStartTime, nearbyVideoCardModel.videoStartTime) && o.LJ(this.groupId, nearbyVideoCardModel.groupId);
    }

    public final int hashCode() {
        Video video = this.video;
        int hashCode = (video == null ? 0 : video.hashCode()) * 31;
        NearbyVideoCardPoiInfo nearbyVideoCardPoiInfo = this.poiInfo;
        int hashCode2 = (hashCode + (nearbyVideoCardPoiInfo == null ? 0 : nearbyVideoCardPoiInfo.hashCode())) * 31;
        Float f = this.videoStartTime;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.groupId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyVideoCardModel(video=");
        LIZ.append(this.video);
        LIZ.append(", poiInfo=");
        LIZ.append(this.poiInfo);
        LIZ.append(", videoStartTime=");
        LIZ.append(this.videoStartTime);
        LIZ.append(", groupId=");
        return q.LIZIZ(LIZ, this.groupId, ')', LIZ);
    }

    public NearbyVideoCardModel(Video video, NearbyVideoCardPoiInfo nearbyVideoCardPoiInfo, Float f, String str) {
        this.video = video;
        this.poiInfo = nearbyVideoCardPoiInfo;
        this.videoStartTime = f;
        this.groupId = str;
    }
}
