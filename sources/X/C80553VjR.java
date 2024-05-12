package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;

/* renamed from: X.VjR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80553VjR implements Parcelable.Creator<CalendarConstraints> {
    @Override // android.os.Parcelable.Creator
    public final CalendarConstraints createFromParcel(Parcel parcel) {
        return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (CalendarConstraints.DateValidator) parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final CalendarConstraints[] newArray(int i) {
        return new CalendarConstraints[i];
    }
}
