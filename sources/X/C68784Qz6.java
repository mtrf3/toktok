package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.Qz6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68784Qz6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    latLng2 = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
