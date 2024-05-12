package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.Qyv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68773Qyv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    iBinder = C67315QbP.LJIJJ(parcel, readInt);
                    break;
                case 3:
                    latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 5:
                    f2 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C67315QbP.LJI(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case '\b':
                    f4 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case '\t':
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\n':
                    f5 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    f6 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case '\f':
                    f7 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
