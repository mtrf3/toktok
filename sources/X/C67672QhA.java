package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;

/* renamed from: X.QhA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67672QhA implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 5:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 7:
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(str, str2, str3, arrayList, z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
