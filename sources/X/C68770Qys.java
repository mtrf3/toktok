package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;

/* renamed from: X.Qys, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68770Qys implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        long j = 0;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 3:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case 5:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 7:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new LoyaltyPointsBalance(i, str, d, str2, j, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
