package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* renamed from: X.QzJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68797QzJ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
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
                                f2 = C67315QbP.LJIJ(parcel, readInt);
                            }
                        } else {
                            z2 = C67315QbP.LJIILIIL(parcel, readInt);
                        }
                    } else {
                        f = C67315QbP.LJIJ(parcel, readInt);
                    }
                } else {
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                }
            } else {
                iBinder = C67315QbP.LJIJJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
