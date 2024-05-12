package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.CheckableImageButton$SavedState;

/* renamed from: X.VgP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80365VgP implements Parcelable.ClassLoaderCreator<CheckableImageButton$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new CheckableImageButton$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CheckableImageButton$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final CheckableImageButton$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CheckableImageButton$SavedState(parcel, classLoader);
    }
}
