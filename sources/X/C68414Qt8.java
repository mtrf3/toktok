package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.StoreBytesData;

/* renamed from: X.Qt8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68414Qt8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
        boolean z = false;
        byte[] bArr = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        str = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                }
            } else {
                bArr = C67315QbP.LIZJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new StoreBytesData(str, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StoreBytesData[i];
    }
}
