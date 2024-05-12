package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.LocationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.PSi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64480PSi implements Parcelable.Creator<LocationInfo> {
    @Override // android.os.Parcelable.Creator
    public final LocationInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LocationInfo(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LocationInfo[] newArray(int i) {
        return new LocationInfo[i];
    }
}
