package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: X.QzC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68790QzC implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C67315QbP.LJI(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    num = C67315QbP.LJIL(parcel, readInt);
                    break;
                case 6:
                    b = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case 7:
                    b2 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case '\b':
                    b3 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case '\t':
                    b4 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case '\n':
                    b5 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    streetViewSource = (StreetViewSource) C67315QbP.LJI(parcel, readInt, StreetViewSource.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, streetViewSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
