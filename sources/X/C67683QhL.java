package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* renamed from: X.QhL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67683QhL implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        android.net.Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        PublicKeyCredential publicKeyCredential = null;
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
                    uri = (android.net.Uri) C67315QbP.LJI(parcel, readInt, android.net.Uri.CREATOR);
                    break;
                case 6:
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    str6 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    str7 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    publicKeyCredential = (PublicKeyCredential) C67315QbP.LJI(parcel, readInt, PublicKeyCredential.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6, str7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInCredential[i];
    }
}
