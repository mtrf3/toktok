package X;

import android.os.Parcel;
import android.os.Parcelable;
import dmt.viewpager.DmtViewPager$SavedState;

/* renamed from: X.Vmg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80754Vmg implements Parcelable.ClassLoaderCreator<DmtViewPager$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DmtViewPager$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DmtViewPager$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final DmtViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new DmtViewPager$SavedState(parcel, classLoader);
    }
}
