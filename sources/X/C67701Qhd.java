package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: X.Qhd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67701Qhd implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInOptions createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C67315QbP.LJI(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 5:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 6:
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 7:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new GoogleSignInOptions(i, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.LJJLIIIIJ(arrayList), str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
