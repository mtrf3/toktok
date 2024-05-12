package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.button.MaterialButton$SavedState;

/* renamed from: X.Vh5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80407Vh5 implements Parcelable.ClassLoaderCreator<MaterialButton$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new MaterialButton$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MaterialButton$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final MaterialButton$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new MaterialButton$SavedState(parcel, classLoader);
    }
}
