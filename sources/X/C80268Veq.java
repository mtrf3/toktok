package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeDrawable;

/* renamed from: X.Veq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80268Veq implements Parcelable.Creator<BadgeDrawable.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final BadgeDrawable.SavedState createFromParcel(Parcel parcel) {
        return new BadgeDrawable.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final BadgeDrawable.SavedState[] newArray(int i) {
        return new BadgeDrawable.SavedState[i];
    }
}
