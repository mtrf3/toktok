package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.callback.CallbackOutput;

/* renamed from: X.QbC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67302QbC implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        byte[] bArr = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            str = C67315QbP.LJII(parcel, readInt);
                        }
                    } else {
                        bArr = C67315QbP.LIZJ(parcel, readInt);
                    }
                } else {
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CallbackOutput(str, i, i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallbackOutput[i];
    }
}