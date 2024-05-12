package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.QzB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68789QzB implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    b = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case 3:
                    b2 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case 4:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C67315QbP.LJI(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case 7:
                    b4 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case '\b':
                    b5 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case '\t':
                    b6 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case '\n':
                    b7 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    b8 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case '\f':
                    b9 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
                case 14:
                    b10 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case 15:
                    b11 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    f = C67315QbP.LJIJI(parcel, readInt);
                    break;
                case 17:
                    f2 = C67315QbP.LJIJI(parcel, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C67315QbP.LJI(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = C67315QbP.LJIILL(parcel, readInt);
                    break;
                case 20:
                    num = C67315QbP.LJIL(parcel, readInt);
                    break;
                case 21:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
