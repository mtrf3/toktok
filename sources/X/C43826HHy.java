package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageSourceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.HHy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43826HHy implements Parcelable.Creator<ImageSourceInfo> {
    @Override // android.os.Parcelable.Creator
    public final ImageSourceInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ImageSourceInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final ImageSourceInfo[] newArray(int i) {
        return new ImageSourceInfo[i];
    }
}
