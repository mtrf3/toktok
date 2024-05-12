package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.zzbq;

/* renamed from: X.ZWb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90057ZWb implements Parcelable.Creator<zzbq> {
    @Override // android.os.Parcelable.Creator
    public final zzbq createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzbq(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbq[] newArray(int i) {
        return new zzbq[i];
    }
}
