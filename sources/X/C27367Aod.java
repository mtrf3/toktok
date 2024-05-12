package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Aod, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27367Aod implements Parcelable.Creator<SearchDistrictRequest> {
    @Override // android.os.Parcelable.Creator
    public final SearchDistrictRequest createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new SearchDistrictRequest(valueOf, parcel.createStringArrayList(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SearchDistrictRequest[] newArray(int i) {
        return new SearchDistrictRequest[i];
    }
}
