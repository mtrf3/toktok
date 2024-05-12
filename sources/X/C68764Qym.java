package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* renamed from: X.Qym, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68764Qym implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                uriData2 = (UriData) C67315QbP.LJI(parcel, readInt, UriData.CREATOR);
                            }
                        } else {
                            uriData = (UriData) C67315QbP.LJI(parcel, readInt, UriData.CREATOR);
                        }
                    } else {
                        timeInterval = (TimeInterval) C67315QbP.LJI(parcel, readInt, TimeInterval.CREATOR);
                    }
                } else {
                    str2 = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
