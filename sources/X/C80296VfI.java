package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.navigation.NavigationView$SavedState;

/* renamed from: X.VfI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80296VfI implements Parcelable.ClassLoaderCreator<NavigationView$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new NavigationView$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NavigationView$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final NavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new NavigationView$SavedState(parcel, classLoader);
    }
}
