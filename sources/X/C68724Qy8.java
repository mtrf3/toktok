package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.zza;

/* renamed from: X.Qy8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68724Qy8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    strArr = C67315QbP.LJIIIIZZ(parcel, readInt);
                    break;
                case 5:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    zzaVar = (zza) C67315QbP.LJI(parcel, readInt, zza.CREATOR);
                    break;
                case 7:
                    zzaVar2 = (zza) C67315QbP.LJI(parcel, readInt, zza.CREATOR);
                    break;
                case '\b':
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) C67315QbP.LJIIJ(parcel, readInt, LoyaltyWalletObject.CREATOR);
                    break;
                case '\t':
                    offerWalletObjectArr = (OfferWalletObject[]) C67315QbP.LJIIJ(parcel, readInt, OfferWalletObject.CREATOR);
                    break;
                case '\n':
                    userAddress = (UserAddress) C67315QbP.LJI(parcel, readInt, UserAddress.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    userAddress2 = (UserAddress) C67315QbP.LJI(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\f':
                    instrumentInfoArr = (InstrumentInfo[]) C67315QbP.LJIIJ(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MaskedWallet(str, str2, strArr, str3, zzaVar, zzaVar2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
