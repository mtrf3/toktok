package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: X.Qfs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67592Qfs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    l = C67315QbP.LJJI(parcel, readInt);
                    break;
                case 4:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 5:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 6:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 7:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
