package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.status.StatusCreateVideoData;
import kotlin.jvm.internal.o;

/* renamed from: X.H8e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43572H8e implements Parcelable.Creator<StatusCreateVideoData> {
    @Override // android.os.Parcelable.Creator
    public final StatusCreateVideoData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new StatusCreateVideoData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final StatusCreateVideoData[] newArray(int i) {
        return new StatusCreateVideoData[i];
    }
}
