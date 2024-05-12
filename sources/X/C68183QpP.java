package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;

/* renamed from: X.QpP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68183QpP implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 2:
                    cardInfo = (CardInfo) C67315QbP.LJI(parcel, readInt, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) C67315QbP.LJI(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) C67315QbP.LJI(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    bundle = C67315QbP.LIZIZ(parcel, readInt);
                    break;
                case 7:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    bundle2 = C67315QbP.LIZIZ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentData[i];
    }
}
