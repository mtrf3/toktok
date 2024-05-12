package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: X.Vcm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80140Vcm implements Parcelable.Creator<FlexboxLayoutManager.LayoutParams> {
    @Override // android.os.Parcelable.Creator
    public final FlexboxLayoutManager.LayoutParams createFromParcel(Parcel parcel) {
        return new FlexboxLayoutManager.LayoutParams(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final FlexboxLayoutManager.LayoutParams[] newArray(int i) {
        return new FlexboxLayoutManager.LayoutParams[i];
    }
}
