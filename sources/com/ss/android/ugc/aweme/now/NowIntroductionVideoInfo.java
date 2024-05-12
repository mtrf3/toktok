package com.ss.android.ugc.aweme.now;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowIntroductionVideoInfo {

    @InterfaceC65349Pkn("poster_url")
    public final String posterUrl;

    @InterfaceC65349Pkn("video_duration")
    public final Float videoDuration;

    @InterfaceC65349Pkn("video_id")
    public final String videoId;

    @InterfaceC65349Pkn("video_model_item")
    public final List<NowIntroductionVideoReplica> videoModels;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowIntroductionVideoInfo)) {
            return false;
        }
        NowIntroductionVideoInfo nowIntroductionVideoInfo = (NowIntroductionVideoInfo) obj;
        return o.LJ(this.videoId, nowIntroductionVideoInfo.videoId) && o.LJ(this.videoDuration, nowIntroductionVideoInfo.videoDuration) && o.LJ(this.posterUrl, nowIntroductionVideoInfo.posterUrl) && o.LJ(this.videoModels, nowIntroductionVideoInfo.videoModels);
    }

    public final int hashCode() {
        String str = this.videoId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.videoDuration;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.posterUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NowIntroductionVideoReplica> list = this.videoModels;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowIntroductionVideoInfo(videoId=");
        LIZ.append(this.videoId);
        LIZ.append(", videoDuration=");
        LIZ.append(this.videoDuration);
        LIZ.append(", posterUrl=");
        LIZ.append(this.posterUrl);
        LIZ.append(", videoModels=");
        return C1NE.LIZIZ(LIZ, this.videoModels, ')', LIZ);
    }

    public NowIntroductionVideoInfo(String str, Float f, String str2, List<NowIntroductionVideoReplica> list) {
        this.videoId = str;
        this.videoDuration = f;
        this.posterUrl = str2;
        this.videoModels = list;
    }

    public /* synthetic */ NowIntroductionVideoInfo(String str, Float f, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str2, list);
    }
}
