package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* renamed from: X.Qjx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67845Qjx implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final zak createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        zavVar = (zav) C67315QbP.LJI(parcel, readInt, zav.CREATOR);
                    }
                } else {
                    connectionResult = (ConnectionResult) C67315QbP.LJI(parcel, readInt, ConnectionResult.CREATOR);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zak(i, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i) {
        return new zak[i];
    }
}
