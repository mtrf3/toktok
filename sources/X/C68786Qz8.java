package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* renamed from: X.Qz8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68786Qz8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        str = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                }
            } else {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C67315QbP.LJIIJ(parcel, readInt, StreetViewPanoramaLink.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
