package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.ArrayList;

/* renamed from: X.QpK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68178QpK implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList<Integer> arrayList2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = C67315QbP.LJ(parcel, readInt);
                    break;
                case 3:
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
                case 4:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = C67315QbP.LJ(parcel, readInt);
                    break;
                case 7:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\b':
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
