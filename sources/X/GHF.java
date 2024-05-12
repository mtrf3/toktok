package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GHF implements Parcelable.Creator<TrendingUploadModel> {
    @Override // android.os.Parcelable.Creator
    public final TrendingUploadModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TrendingUploadModel(parcel.readString(), parcel.readString(), parcel.readInt(), (VideoTrendingTopic) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final TrendingUploadModel[] newArray(int i) {
        return new TrendingUploadModel[i];
    }
}
