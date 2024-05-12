package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageDisplayInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HI0 implements Parcelable.Creator<ImageDisplayInfo> {
    @Override // android.os.Parcelable.Creator
    public final ImageDisplayInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ImageDisplayInfo(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ImageDisplayInfo[] newArray(int i) {
        return new ImageDisplayInfo[i];
    }
}
