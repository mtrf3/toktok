package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

/* loaded from: classes12.dex */
public final class R0X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        str2 = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PointOfInterest(latLng, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
