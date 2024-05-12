package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import java.util.ArrayList;

/* renamed from: X.QbU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67320QbU implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzs(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
