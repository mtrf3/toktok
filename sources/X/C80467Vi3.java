package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;

/* renamed from: X.Vi3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80467Vi3 implements Parcelable.ClassLoaderCreator<BottomAppBar$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BottomAppBar$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BottomAppBar$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final BottomAppBar$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomAppBar$SavedState(parcel, classLoader);
    }
}
