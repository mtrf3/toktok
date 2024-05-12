package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseIntArray;

/* renamed from: X.VoT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80865VoT implements Parcelable.Creator<ParcelableSparseIntArray> {
    @Override // android.os.Parcelable.Creator
    public final ParcelableSparseIntArray createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(readInt);
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        parcel.readIntArray(iArr);
        parcel.readIntArray(iArr2);
        for (int i = 0; i < readInt; i++) {
            parcelableSparseIntArray.put(iArr[i], iArr2[i]);
        }
        return parcelableSparseIntArray;
    }

    @Override // android.os.Parcelable.Creator
    public final ParcelableSparseIntArray[] newArray(int i) {
        return new ParcelableSparseIntArray[i];
    }
}
