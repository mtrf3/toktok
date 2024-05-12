package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageResizeInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.HHz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43827HHz implements Parcelable.Creator<ImageResizeInfo> {
    @Override // android.os.Parcelable.Creator
    public final ImageResizeInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ImageResizeInfo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ImageResizeInfo[] newArray(int i) {
        return new ImageResizeInfo[i];
    }
}
