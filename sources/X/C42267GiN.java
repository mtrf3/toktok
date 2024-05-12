package X;

import android.os.Parcel;
import android.os.Parcelable;
import dmt.av.video.SingleImageCoverBitmapData;
import kotlin.jvm.internal.o;

/* renamed from: X.GiN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42267GiN implements Parcelable.Creator<SingleImageCoverBitmapData> {
    @Override // android.os.Parcelable.Creator
    public final SingleImageCoverBitmapData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SingleImageCoverBitmapData(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SingleImageCoverBitmapData[] newArray(int i) {
        return new SingleImageCoverBitmapData[i];
    }
}
