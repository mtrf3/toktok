package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.QzD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68791QzD implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            f3 = C67315QbP.LJIJ(parcel, readInt);
                        }
                    } else {
                        f2 = C67315QbP.LJIJ(parcel, readInt);
                    }
                } else {
                    f = C67315QbP.LJIJ(parcel, readInt);
                }
            } else {
                latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CameraPosition(latLng, f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
