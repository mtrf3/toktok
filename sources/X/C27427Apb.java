package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictData;
import kotlin.jvm.internal.o;

/* renamed from: X.Apb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27427Apb implements Parcelable.Creator<LocateDistrictData> {
    @Override // android.os.Parcelable.Creator
    public final LocateDistrictData createFromParcel(Parcel parcel) {
        District createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = District.CREATOR.createFromParcel(parcel);
        }
        return new LocateDistrictData(createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final LocateDistrictData[] newArray(int i) {
        return new LocateDistrictData[i];
    }
}
