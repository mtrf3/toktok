package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;

/* loaded from: classes16.dex */
public final class YP5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        CreditCardExpirationDate creditCardExpirationDate = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    creditCardExpirationDate = (CreditCardExpirationDate) C67315QbP.LJI(parcel, readInt, CreditCardExpirationDate.CREATOR);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PaymentCardRecognitionResult(str, creditCardExpirationDate);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentCardRecognitionResult[i];
    }
}
