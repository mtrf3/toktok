package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;

/* renamed from: X.QpR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68185QpR implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                userAddress = (UserAddress) C67315QbP.LJI(parcel, readInt, UserAddress.CREATOR);
                            }
                        } else {
                            i = C67315QbP.LJIJJLI(parcel, readInt);
                        }
                    } else {
                        str3 = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    str2 = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CardInfo(str, str2, str3, i, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}
