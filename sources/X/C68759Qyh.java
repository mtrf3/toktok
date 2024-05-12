package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: X.Qyh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68759Qyh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        CommonWalletObject commonWalletObject = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    commonWalletObject = (CommonWalletObject) C67315QbP.LJI(parcel, readInt, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 7:
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\t':
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new GiftCardWalletObject(commonWalletObject, str, str2, str3, j, str4, j2, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }
}
