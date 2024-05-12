package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationView$SavedState;

/* renamed from: X.Vf6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80284Vf6 implements Parcelable.ClassLoaderCreator<BottomNavigationView$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BottomNavigationView$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BottomNavigationView$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final BottomNavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomNavigationView$SavedState(parcel, classLoader);
    }
}
