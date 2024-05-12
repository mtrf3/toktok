package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseBooleanArray;

/* loaded from: classes11.dex */
public class OOF implements Parcelable.Creator<ParcelableSparseBooleanArray> {
    @Override // android.os.Parcelable.Creator
    public final ParcelableSparseBooleanArray createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(readInt);
        int[] iArr = new int[readInt];
        boolean[] zArr = new boolean[readInt];
        parcel.readIntArray(iArr);
        parcel.readBooleanArray(zArr);
        for (int i = 0; i < readInt; i++) {
            parcelableSparseBooleanArray.put(iArr[i], zArr[i]);
        }
        return parcelableSparseBooleanArray;
    }

    @Override // android.os.Parcelable.Creator
    public final ParcelableSparseBooleanArray[] newArray(int i) {
        return new ParcelableSparseBooleanArray[i];
    }
}
