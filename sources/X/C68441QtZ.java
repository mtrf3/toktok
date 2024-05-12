package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;

/* renamed from: X.QtZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68441QtZ implements Parcelable.Creator<zzq> {
    @Override // android.os.Parcelable.Creator
    public final zzq createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        i = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                z = C67315QbP.LJIILIIL(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzq(z, str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzq[] newArray(int i) {
        return new zzq[i];
    }
}
