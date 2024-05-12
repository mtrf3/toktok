package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public class YPE implements Parcelable.Creator<CompositeDateValidator> {
    @Override // android.os.Parcelable.Creator
    public final CompositeDateValidator createFromParcel(Parcel parcel) {
        YPH yph;
        ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt == 2) {
            yph = CompositeDateValidator.ALL_OPERATOR;
        } else if (readInt == 1) {
            yph = CompositeDateValidator.ANY_OPERATOR;
        } else {
            yph = CompositeDateValidator.ALL_OPERATOR;
        }
        readArrayList.getClass();
        return new CompositeDateValidator(readArrayList, yph);
    }

    @Override // android.os.Parcelable.Creator
    public final CompositeDateValidator[] newArray(int i) {
        return new CompositeDateValidator[i];
    }
}
