package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;

/* renamed from: X.QbW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67322QbW implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            z2 = C67315QbP.LJIILIIL(parcel, readInt);
                        }
                    } else {
                        j = C67315QbP.LJJ(parcel, readInt);
                    }
                } else {
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new DeviceMetaData(i, z, j, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }
}
