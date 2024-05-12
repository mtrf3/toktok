package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.textfield.TextInputLayout$SavedState;

/* renamed from: X.Vft, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80333Vft implements Parcelable.ClassLoaderCreator<TextInputLayout$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new TextInputLayout$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TextInputLayout$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final TextInputLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new TextInputLayout$SavedState(parcel, classLoader);
    }
}
