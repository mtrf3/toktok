package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: X.Vdx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80213Vdx implements Parcelable.ClassLoaderCreator<AppBarLayout$BaseBehavior.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new AppBarLayout$BaseBehavior.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppBarLayout$BaseBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final AppBarLayout$BaseBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout$BaseBehavior.SavedState(parcel, classLoader);
    }
}
