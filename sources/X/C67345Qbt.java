package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;

/* renamed from: X.Qbt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67345Qbt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 3:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 6:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new AccountChangeEvent(i, i2, i3, j, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
