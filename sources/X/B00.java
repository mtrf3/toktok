package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B00 implements Parcelable.Creator<FetchInfo> {
    @Override // android.os.Parcelable.Creator
    public final FetchInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new FetchInfo(valueOf, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final FetchInfo[] newArray(int i) {
        return new FetchInfo[i];
    }
}
