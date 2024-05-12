package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HHC implements Parcelable.Creator<DiyPropVideo> {
    @Override // android.os.Parcelable.Creator
    public final DiyPropVideo createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new DiyPropVideo(in.readString(), in.readLong(), in.readLong(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DiyPropVideo[] newArray(int i) {
        return new DiyPropVideo[i];
    }
}
