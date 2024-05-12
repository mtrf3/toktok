package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzai;

/* renamed from: X.Qg8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67608Qg8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        while (true) {
            byte[][] bArr = null;
            while (parcel.dataPosition() < LJJIII) {
                int readInt = parcel.readInt();
                if (((char) readInt) != 1) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    int LJJIFFI = C67315QbP.LJJIFFI(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (LJJIFFI == 0) {
                        break;
                    }
                    int readInt2 = parcel.readInt();
                    bArr = new byte[readInt2];
                    for (int i = 0; i < readInt2; i++) {
                        bArr[i] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(dataPosition + LJJIFFI);
                }
            }
            C67315QbP.LJIIL(parcel, LJJIII);
            return new zzai(bArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
