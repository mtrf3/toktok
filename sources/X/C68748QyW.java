package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzh;

/* renamed from: X.QyW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68748QyW implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        byte[] bArr = null;
        boolean z = false;
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
                z = C67315QbP.LJIILIIL(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzh(bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
