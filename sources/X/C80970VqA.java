package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.DateValidatorPointBackward;

/* renamed from: X.VqA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80970VqA implements Parcelable.Creator<DateValidatorPointBackward> {
    @Override // android.os.Parcelable.Creator
    public final DateValidatorPointBackward createFromParcel(Parcel parcel) {
        return new DateValidatorPointBackward(parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final DateValidatorPointBackward[] newArray(int i) {
        return new DateValidatorPointBackward[i];
    }
}
