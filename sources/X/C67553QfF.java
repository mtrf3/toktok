package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.MapStyleOptions;

/* renamed from: X.QfF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67553QfF implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MapStyleOptions(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MapStyleOptions[i];
    }
}