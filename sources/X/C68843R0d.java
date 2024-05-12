package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* renamed from: X.R0d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68843R0d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long l = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    bArr = C67315QbP.LIZJ(parcel, readInt);
                    break;
                case 3:
                    d = C67315QbP.LJIIZILJ(parcel, readInt);
                    break;
                case 4:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    num = C67315QbP.LJIL(parcel, readInt);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) C67315QbP.LJI(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case '\b':
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    authenticationExtensions = (AuthenticationExtensions) C67315QbP.LJI(parcel, readInt, AuthenticationExtensions.CREATOR);
                    break;
                case '\n':
                    l = C67315QbP.LJJI(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PublicKeyCredentialRequestOptions(bArr, d, str, arrayList, num, tokenBinding, str2, authenticationExtensions, l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}
