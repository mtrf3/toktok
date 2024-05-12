package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Apc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27428Apc implements Parcelable.Creator<LocateDistrictRequest> {
    @Override // android.os.Parcelable.Creator
    public final LocateDistrictRequest createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LocateDistrictRequest(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LocateDistrictRequest[] newArray(int i) {
        return new LocateDistrictRequest[i];
    }
}
