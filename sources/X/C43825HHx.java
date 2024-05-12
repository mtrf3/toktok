package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageEncodeInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.HHx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43825HHx implements Parcelable.Creator<ImageEncodeInfo> {
    @Override // android.os.Parcelable.Creator
    public final ImageEncodeInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ImageEncodeInfo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final ImageEncodeInfo[] newArray(int i) {
        return new ImageEncodeInfo[i];
    }
}
