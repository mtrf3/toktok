package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* renamed from: X.R0q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68856R0q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        android.net.Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        bArr = C67315QbP.LIZJ(parcel, readInt);
                    }
                } else {
                    uri = (android.net.Uri) C67315QbP.LJI(parcel, readInt, android.net.Uri.CREATOR);
                }
            } else {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) C67315QbP.LJI(parcel, readInt, PublicKeyCredentialCreationOptions.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialCreationOptions[i];
    }
}
