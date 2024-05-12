package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9L implements Parcelable.Creator<MusicShareStoryInputData> {
    @Override // android.os.Parcelable.Creator
    public final MusicShareStoryInputData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new MusicShareStoryInputData((UrlModel) parcel.readSerializable(), (MusicModel) parcel.readSerializable(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicShareStoryInputData[] newArray(int i) {
        return new MusicShareStoryInputData[i];
    }
}
