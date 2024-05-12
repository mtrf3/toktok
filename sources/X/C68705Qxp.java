package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.ArrayList;

/* renamed from: X.Qxp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68705Qxp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList<Integer> arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        Bundle bundle = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 2:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) C67315QbP.LJI(parcel, readInt, CardRequirements.CREATOR);
                    break;
                case 4:
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) C67315QbP.LJI(parcel, readInt, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = C67315QbP.LJ(parcel, readInt);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) C67315QbP.LJI(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case '\b':
                    transactionInfo = (TransactionInfo) C67315QbP.LJI(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                case '\t':
                    z4 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\n':
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    bundle = C67315QbP.LIZIZ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PaymentDataRequest(z, z2, cardRequirements, z3, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z4, str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}
