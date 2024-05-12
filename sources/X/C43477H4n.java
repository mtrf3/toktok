package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.H4n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43477H4n implements Parcelable.Creator<UploadSpeedInfo> {
    @Override // android.os.Parcelable.Creator
    public final UploadSpeedInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new UploadSpeedInfo(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final UploadSpeedInfo[] newArray(int i) {
        return new UploadSpeedInfo[i];
    }
}
