package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;

/* renamed from: X.Qij, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67769Qij implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final zav createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
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
                            if (c != 5) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                z2 = C67315QbP.LJIILIIL(parcel, readInt);
                            }
                        } else {
                            z = C67315QbP.LJIILIIL(parcel, readInt);
                        }
                    } else {
                        connectionResult = (ConnectionResult) C67315QbP.LJI(parcel, readInt, ConnectionResult.CREATOR);
                    }
                } else {
                    iBinder = C67315QbP.LJIJJ(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i) {
        return new zav[i];
    }
}
