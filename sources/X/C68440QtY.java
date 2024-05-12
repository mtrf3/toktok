package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzn;

/* renamed from: X.QtY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68440QtY implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final zzn createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                                z3 = C67315QbP.LJIILIIL(parcel, readInt);
                            }
                        } else {
                            iBinder = C67315QbP.LJIJJ(parcel, readInt);
                        }
                    } else {
                        z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    }
                } else {
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzn(str, z, z2, iBinder, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn[] newArray(int i) {
        return new zzn[i];
    }
}
