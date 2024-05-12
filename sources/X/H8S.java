package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8S implements Parcelable.Creator<CreativeInfo> {
    @Override // android.os.Parcelable.Creator
    public final CreativeInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CreativeInfo(parcel.readString(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CreativeInfo[] newArray(int i) {
        return new CreativeInfo[i];
    }
}
