package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import kotlin.jvm.internal.o;

/* renamed from: X.Alv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27199Alv implements Parcelable.Creator<Region> {
    @Override // android.os.Parcelable.Creator
    public final Region createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Region(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Region[] newArray(int i) {
        return new Region[i];
    }
}
