package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.SingleDateSelector;

/* renamed from: X.Vjc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80564Vjc implements Parcelable.Creator<SingleDateSelector> {
    @Override // android.os.Parcelable.Creator
    public final SingleDateSelector createFromParcel(Parcel parcel) {
        SingleDateSelector singleDateSelector = new SingleDateSelector();
        singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
        return singleDateSelector;
    }

    @Override // android.os.Parcelable.Creator
    public final SingleDateSelector[] newArray(int i) {
        return new SingleDateSelector[i];
    }
}
