package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* renamed from: X.R0e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68844R0e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) C67315QbP.LJI(parcel, readInt, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) C67315QbP.LJI(parcel, readInt, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = C67315QbP.LIZJ(parcel, readInt);
                    break;
                case 5:
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d = C67315QbP.LJIIZILJ(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case '\b':
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) C67315QbP.LJI(parcel, readInt, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case '\t':
                    num = C67315QbP.LJIL(parcel, readInt);
                    break;
                case '\n':
                    tokenBinding = (TokenBinding) C67315QbP.LJI(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\f':
                    authenticationExtensions = (AuthenticationExtensions) C67315QbP.LJI(parcel, readInt, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d, arrayList2, authenticatorSelectionCriteria, num, tokenBinding, str, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}
