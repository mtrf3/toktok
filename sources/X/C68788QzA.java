package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: X.QzA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68788QzA implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                latLngBounds = (LatLngBounds) C67315QbP.LJI(parcel, readInt, LatLngBounds.CREATOR);
                            }
                        } else {
                            latLng4 = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                        }
                    } else {
                        latLng3 = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                    }
                } else {
                    latLng2 = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
