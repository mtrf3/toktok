package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.RangeDateSelector;

/* renamed from: X.Vjb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80563Vjb implements Parcelable.Creator<RangeDateSelector> {
    @Override // android.os.Parcelable.Creator
    public final RangeDateSelector createFromParcel(Parcel parcel) {
        RangeDateSelector rangeDateSelector = new RangeDateSelector();
        rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
        rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
        return rangeDateSelector;
    }

    @Override // android.os.Parcelable.Creator
    public final RangeDateSelector[] newArray(int i) {
        return new RangeDateSelector[i];
    }
}
