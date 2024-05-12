package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.zza;
import com.google.android.gms.wallet.zzaj;

/* renamed from: X.Qy7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68723Qy7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        zzaj zzajVar = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    zzajVar = (zzaj) C67315QbP.LJI(parcel, readInt, zzaj.CREATOR);
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
                    strArr = C67315QbP.LJIIIIZZ(parcel, readInt);
                    break;
                case '\t':
                    userAddress = (UserAddress) C67315QbP.LJI(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\n':
                    userAddress2 = (UserAddress) C67315QbP.LJI(parcel, readInt, UserAddress.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    instrumentInfoArr = (InstrumentInfo[]) C67315QbP.LJIIJ(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                case '\f':
                    paymentMethodToken = (PaymentMethodToken) C67315QbP.LJI(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new FullWallet(str, str2, zzajVar, str3, zzaVar, zzaVar2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FullWallet[i];
    }
}
