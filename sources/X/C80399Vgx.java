package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: X.Vgx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80399Vgx implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ParcelableSparseArray(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSparseArray[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ParcelableSparseArray(parcel, classLoader);
    }
}