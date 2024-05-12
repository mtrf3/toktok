package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.Month;

/* renamed from: X.VjU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80556VjU implements Parcelable.Creator<Month> {
    @Override // android.os.Parcelable.Creator
    public final Month createFromParcel(Parcel parcel) {
        return Month.LJ(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Month[] newArray(int i) {
        return new Month[i];
    }
}
