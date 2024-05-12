package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: X.Vcn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80141Vcn implements Parcelable.Creator<FlexboxLayoutManager.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final FlexboxLayoutManager.SavedState createFromParcel(Parcel parcel) {
        return new FlexboxLayoutManager.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final FlexboxLayoutManager.SavedState[] newArray(int i) {
        return new FlexboxLayoutManager.SavedState[i];
    }
}
