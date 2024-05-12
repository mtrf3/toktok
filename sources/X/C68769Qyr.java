package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* renamed from: X.Qyr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68769Qyr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 5) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        timeInterval = (TimeInterval) C67315QbP.LJI(parcel, readInt, TimeInterval.CREATOR);
                    }
                } else {
                    loyaltyPointsBalance = (LoyaltyPointsBalance) C67315QbP.LJI(parcel, readInt, LoyaltyPointsBalance.CREATOR);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
