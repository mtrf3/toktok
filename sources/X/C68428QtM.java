package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;

/* renamed from: X.QtM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68428QtM implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        byte[] bArr = null;
        String str = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                bArr = C67315QbP.LIZJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new RetrieveBytesResponse.BlockstoreData(bArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RetrieveBytesResponse.BlockstoreData[i];
    }
}
