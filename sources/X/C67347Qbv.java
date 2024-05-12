package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: X.Qbv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67347Qbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 2:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 6:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new GetSignInIntentRequest(str, str2, str3, str4, z, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSignInIntentRequest[i];
    }
}
