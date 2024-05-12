package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.timepicker.TimeModel;

/* renamed from: X.Vis, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80518Vis implements Parcelable.Creator<TimeModel> {
    @Override // android.os.Parcelable.Creator
    public final TimeModel createFromParcel(Parcel parcel) {
        return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final TimeModel[] newArray(int i) {
        return new TimeModel[i];
    }
}
