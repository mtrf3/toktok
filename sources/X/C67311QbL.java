package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zac;

/* renamed from: X.QbL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67311QbL implements Parcelable.Creator<zac> {
    @Override // android.os.Parcelable.Creator
    public final zac createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zac(i, str, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zac[] newArray(int i) {
        return new zac[i];
    }
}
