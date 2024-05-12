package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.DateValidatorPointForward;

/* renamed from: X.Vjh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80569Vjh implements Parcelable.Creator<DateValidatorPointForward> {
    @Override // android.os.Parcelable.Creator
    public final DateValidatorPointForward createFromParcel(Parcel parcel) {
        return new DateValidatorPointForward(parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final DateValidatorPointForward[] newArray(int i) {
        return new DateValidatorPointForward[i];
    }
}
