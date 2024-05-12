package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbqq;

/* renamed from: X.YJz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87195YJz implements Parcelable.Creator<zzbqq> {
    @Override // android.os.Parcelable.Creator
    public final zzbqq createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    bArr = C67315QbP.LIZJ(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzbqq(i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbqq[] newArray(int i) {
        return new zzbqq[i];
    }
}
