package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;

/* loaded from: classes16.dex */
public final class YK2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PaymentCardRecognitionIntentRequest(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentCardRecognitionIntentRequest[i];
    }
}
