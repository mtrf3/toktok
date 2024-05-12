package com.ss.android.ugc.aweme.creative.model.trending;

import X.GHF;
import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TrendingUploadModel implements Parcelable {
    public static final Parcelable.Creator<TrendingUploadModel> CREATOR = new GHF();

    @InterfaceC65349Pkn("post_trends_id")
    public String postTrendsId;

    @InterfaceC65349Pkn("post_trends_type")
    public String postTrendsType;

    @GPV
    public VideoTrendingTopic trendingTopic;

    @GPV
    public int trendingTopicStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingUploadModel() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.postTrendsId);
        out.writeString(this.postTrendsType);
        out.writeInt(this.trendingTopicStatus);
        out.writeSerializable(this.trendingTopic);
    }

    public TrendingUploadModel(String postTrendsId, String postTrendsType, int i, VideoTrendingTopic videoTrendingTopic) {
        o.LJIIIZ(postTrendsId, "postTrendsId");
        o.LJIIIZ(postTrendsType, "postTrendsType");
        this.postTrendsId = postTrendsId;
        this.postTrendsType = postTrendsType;
        this.trendingTopicStatus = i;
        this.trendingTopic = videoTrendingTopic;
    }

    public /* synthetic */ TrendingUploadModel(String str, String str2, int i, VideoTrendingTopic videoTrendingTopic, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : videoTrendingTopic);
    }
}
