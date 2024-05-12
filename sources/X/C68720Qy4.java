package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wallet.zzi;

/* renamed from: X.Qy4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68720Qy4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                bArr = C67315QbP.LIZJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzi(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
