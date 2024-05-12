package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;

/* renamed from: X.Qyi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68760Qyi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            i = C67315QbP.LJIJJLI(parcel, readInt);
                        }
                    } else {
                        giftCardWalletObject = (GiftCardWalletObject) C67315QbP.LJI(parcel, readInt, GiftCardWalletObject.CREATOR);
                    }
                } else {
                    offerWalletObject = (OfferWalletObject) C67315QbP.LJI(parcel, readInt, OfferWalletObject.CREATOR);
                }
            } else {
                loyaltyWalletObject = (LoyaltyWalletObject) C67315QbP.LJI(parcel, readInt, LoyaltyWalletObject.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }
}
