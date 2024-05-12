package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: X.Qyt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68771Qyt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    iBinder = C67315QbP.LJIJJ(parcel, readInt);
                    break;
                case 6:
                    f = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 7:
                    f2 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case '\b':
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\t':
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\n':
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    f3 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case '\f':
                    f4 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    f5 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 14:
                    f6 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 15:
                    f7 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
